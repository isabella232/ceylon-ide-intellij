import com.intellij.openapi.application {
    Result
}
import com.intellij.openapi.command {
    WriteCommandAction
}
import com.intellij.openapi.editor {
    Editor
}
import com.intellij.psi {
    PsiElement,
    PsiFile,
    PsiNamedElement
}
import com.intellij.refactoring.rename.inplace {
    VariableInplaceRenameHandler,
    VariableInplaceRenamer
}

import org.intellij.plugins.ceylon.ide.ceylonCode.psi {
    CeylonFile
}
import org.intellij.plugins.ceylon.ide.ceylonCode.psi.impl {
    DeclarationPsiNameIdOwner,
    ParameterPsiIdOwner
}

shared class CeylonVariableRenameHandler()
        extends VariableInplaceRenameHandler() {

    shared actual VariableInplaceRenamer createRenamer(PsiElement elementToRename, Editor editor) {
        assert (is PsiNamedElement elementToRename);

        return object extends VariableInplaceRenamer(elementToRename, editor) {
            
            shared actual void finish(Boolean success) {
                super.finish(success);
                if (success, is CeylonFile file = elementToRename.containingFile) {
                    object extends WriteCommandAction<Nothing>(myProject, file) {
                        run(Result<Nothing> result) => file.forceReparse();
                    }.execute();
                }
            }
            
        };
    }

    shared actual Boolean isAvailable(PsiElement? element, Editor editor, PsiFile file) {
        if (!is DeclarationPsiNameIdOwner|ParameterPsiIdOwner element) {
            return false;
        }
        if (exists context = file.findElementAt(editor.caretModel.offset),
            context.containingFile != element.containingFile) {
            return false;
        }

        if (is CeylonFile file) {
            file.ensureTypechecked();
        }
        
        return true;
    }
}
