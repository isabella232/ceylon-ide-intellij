/********************************************************************************
 * Copyright (c) {date} Red Hat Inc. and/or its affiliates and others
 *
 * This program and the accompanying materials are made available under the 
 * terms of the Apache License, Version 2.0 which is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-License-Identifier: Apache-2.0 
 ********************************************************************************/
package org.eclipse.ceylon.ide.intellij.settings;

import com.intellij.openapi.options.BaseConfigurable;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import com.intellij.util.ui.UIUtil;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractModelUpdateConfigurable extends BaseConfigurable {
    protected JPanel myPanel;
    protected JLabel completionLink;
    protected JFormattedTextField modelUpdateDelay;
    protected JFormattedTextField modelUpdateTimeoutMinutes;
    protected JCheckBox decreaseThePriorityOfCheckBox;

    public AbstractModelUpdateConfigurable() {
//        setupLinks();
        UIUtil.configureNumericFormattedTextField(modelUpdateDelay);
        UIUtil.configureNumericFormattedTextField(modelUpdateTimeoutMinutes);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        myPanel = new JPanel();
        myPanel.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        final Spacer spacer1 = new Spacer();
        myPanel.add(spacer1, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(418, 14), null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(2, 3, new Insets(0, 0, 0, 0), -1, -1));
        myPanel.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel1.setBorder(BorderFactory.createTitledBorder("Model update timeouts"));
        final JLabel label1 = new JLabel();
        label1.setText("Update Ceylon model automatically");
        panel1.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        final JLabel label2 = new JLabel();
        label2.setText("seconds after any edit");
        panel1.add(label2, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        modelUpdateDelay = new JFormattedTextField();
        modelUpdateDelay.setColumns(0);
        modelUpdateDelay.setEnabled(true);
        panel1.add(modelUpdateDelay, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(30, -1), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Cancel slow model update after");
        panel1.add(label3, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        final JLabel label4 = new JLabel();
        label4.setText("minutes");
        panel1.add(label4, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        modelUpdateTimeoutMinutes = new JFormattedTextField();
        modelUpdateTimeoutMinutes.setColumns(0);
        modelUpdateTimeoutMinutes.setEnabled(true);
        panel1.add(modelUpdateTimeoutMinutes, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(30, -1), null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        myPanel.add(panel2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel2.setBorder(BorderFactory.createTitledBorder("Model update background priority"));
        decreaseThePriorityOfCheckBox = new JCheckBox();
        decreaseThePriorityOfCheckBox.setText("Lower priority model updates");
        panel2.add(decreaseThePriorityOfCheckBox, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return myPanel;
    }

//    private void setupLinks() {
//        JLabelLinkListener listener = new JLabelLinkListener() {
//            @Override
//            public void onLinkClicked(String href) {
//                selectConfigurable(href);
//            }
//        };
//
//        List<JLabel> links = Collections.singletonList(completionLink);
//
//        for (JLabel link : links) {
//            link.addMouseListener(listener);
//            link.addMouseMotionListener(listener);
//        }
//    }
}
