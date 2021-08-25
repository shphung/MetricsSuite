/**
 * File: LangSelector.java
 * Author: Steven Phung
 * Class: CECS-543-01 - Advanced Software Engineering
 * 
 * Assignment: Semester Project v.1.0
 * Date last modified: 2/24/2021
 * 
 * Purpose: This is the class that creates the panel to select a language from a given list.
 */
package cecs_543_semester_project;

import java.util.Enumeration;
import javax.swing.AbstractButton;

public class LangSelector extends javax.swing.JFrame {

    //Parent class
    private FunctionPointsPanel frame;
    
    //Constructor: FunctionPointsPanel(FunctionPointsPanel)
    //Create a dialog to select a language.
    public LangSelector(FunctionPointsPanel frame) {
        initComponents();
        initRadioButtons();
        this.setResizable(false);
        this.frame = frame;
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_LanguageSelect = new javax.swing.ButtonGroup();
        label_Lang = new javax.swing.JLabel();
        radioButton_Lang1 = new javax.swing.JRadioButton();
        radioButton_Lang2 = new javax.swing.JRadioButton();
        radioButton_Lang3 = new javax.swing.JRadioButton();
        radioButton_Lang4 = new javax.swing.JRadioButton();
        radioButton_Lang5 = new javax.swing.JRadioButton();
        radioButton_Lang6 = new javax.swing.JRadioButton();
        radioButton_Lang7 = new javax.swing.JRadioButton();
        radioButton_Lang8 = new javax.swing.JRadioButton();
        radioButton_Lang9 = new javax.swing.JRadioButton();
        radioButton_Lang10 = new javax.swing.JRadioButton();
        radioButton_Lang11 = new javax.swing.JRadioButton();
        radioButton_Lang12 = new javax.swing.JRadioButton();
        button_Done = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(200, 480));
        setMinimumSize(new java.awt.Dimension(200, 480));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        label_Lang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Lang.setText("Select one Language:");

        radioButton_Lang1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang1.setText("Assembler");

        radioButton_Lang2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang2.setText("Ada 95");

        radioButton_Lang3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang3.setText("C");

        radioButton_Lang4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang4.setText("C++");

        radioButton_Lang5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang5.setText("C#");

        radioButton_Lang6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang6.setText("COBOL");

        radioButton_Lang7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang7.setText("FORTRAN");

        radioButton_Lang8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang8.setText("HTML");

        radioButton_Lang9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang9.setText("Java");

        radioButton_Lang10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang10.setText("JavaScript");

        radioButton_Lang11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang11.setText("VB Script");

        radioButton_Lang12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButton_Lang12.setText("Visual Basic");

        button_Done.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Done.setText("Done");
        button_Done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_DoneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButton_Lang1)
                    .addComponent(label_Lang)
                    .addComponent(radioButton_Lang2)
                    .addComponent(radioButton_Lang3)
                    .addComponent(radioButton_Lang4)
                    .addComponent(radioButton_Lang5)
                    .addComponent(radioButton_Lang6)
                    .addComponent(radioButton_Lang7)
                    .addComponent(radioButton_Lang8)
                    .addComponent(radioButton_Lang9)
                    .addComponent(radioButton_Lang10)
                    .addComponent(radioButton_Lang11)
                    .addComponent(radioButton_Lang12)
                    .addComponent(button_Done))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Lang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButton_Lang12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(button_Done)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Method: mouseClicked event
    //Set language for the selected radio button
    private void button_DoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_DoneMouseClicked
        for (Enumeration<AbstractButton> buttons = buttonGroup_LanguageSelect.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                frame.setLanguage(button.getText());
                frame.enableVAFButton();
                frame.updateCodeSize();
                this.dispose();
            }
        }
    }//GEN-LAST:event_button_DoneMouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus
    
    //Method: initRadioButtons()
    //Add all radio buttons to one group.
    private void initRadioButtons() {
        buttonGroup_LanguageSelect.add(radioButton_Lang1);
        buttonGroup_LanguageSelect.add(radioButton_Lang2);
        buttonGroup_LanguageSelect.add(radioButton_Lang3);
        buttonGroup_LanguageSelect.add(radioButton_Lang4);
        buttonGroup_LanguageSelect.add(radioButton_Lang5);
        buttonGroup_LanguageSelect.add(radioButton_Lang6);
        buttonGroup_LanguageSelect.add(radioButton_Lang7);
        buttonGroup_LanguageSelect.add(radioButton_Lang8);
        buttonGroup_LanguageSelect.add(radioButton_Lang9);
        buttonGroup_LanguageSelect.add(radioButton_Lang10);
        buttonGroup_LanguageSelect.add(radioButton_Lang11);
        buttonGroup_LanguageSelect.add(radioButton_Lang12);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_LanguageSelect;
    private javax.swing.JButton button_Done;
    private javax.swing.JLabel label_Lang;
    private javax.swing.JRadioButton radioButton_Lang1;
    private javax.swing.JRadioButton radioButton_Lang10;
    private javax.swing.JRadioButton radioButton_Lang11;
    private javax.swing.JRadioButton radioButton_Lang12;
    private javax.swing.JRadioButton radioButton_Lang2;
    private javax.swing.JRadioButton radioButton_Lang3;
    private javax.swing.JRadioButton radioButton_Lang4;
    private javax.swing.JRadioButton radioButton_Lang5;
    private javax.swing.JRadioButton radioButton_Lang6;
    private javax.swing.JRadioButton radioButton_Lang7;
    private javax.swing.JRadioButton radioButton_Lang8;
    private javax.swing.JRadioButton radioButton_Lang9;
    // End of variables declaration//GEN-END:variables
}
