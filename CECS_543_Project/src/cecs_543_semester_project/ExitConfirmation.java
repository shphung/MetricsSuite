package cecs_543_semester_project;

public class ExitConfirmation extends javax.swing.JFrame {

    private MainFrame mainFrame;
    
    public ExitConfirmation(MainFrame mainFrame) {
        initComponents();
        this.setTitle("Exit Confirmation");
        this.setResizable(false);
        this.setVisible(true);
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_ExitConfirmation = new javax.swing.JPanel();
        label_ProjectName = new javax.swing.JLabel();
        button_Yes = new javax.swing.JButton();
        button_No = new javax.swing.JButton();
        button_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        panel_ExitConfirmation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        label_ProjectName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_ProjectName.setText("Do you want to save changes to \"Project Name\"?");

        button_Yes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Yes.setText("Yes");
        button_Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_YesActionPerformed(evt);
            }
        });

        button_No.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_No.setText("No");
        button_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_NoActionPerformed(evt);
            }
        });

        button_Cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Cancel.setText("Cancel");
        button_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ExitConfirmationLayout = new javax.swing.GroupLayout(panel_ExitConfirmation);
        panel_ExitConfirmation.setLayout(panel_ExitConfirmationLayout);
        panel_ExitConfirmationLayout.setHorizontalGroup(
            panel_ExitConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ExitConfirmationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ExitConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ProjectName)
                    .addGroup(panel_ExitConfirmationLayout.createSequentialGroup()
                        .addComponent(button_Yes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_No, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Cancel)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_ExitConfirmationLayout.setVerticalGroup(
            panel_ExitConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ExitConfirmationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_ProjectName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ExitConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Yes)
                    .addComponent(button_No)
                    .addComponent(button_Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_ExitConfirmation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_ExitConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_YesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_YesActionPerformed

    private void button_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_NoActionPerformed
        this.dispose();
        mainFrame.dispose();
    }//GEN-LAST:event_button_NoActionPerformed

    private void button_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_button_CancelActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cancel;
    private javax.swing.JButton button_No;
    private javax.swing.JButton button_Yes;
    private javax.swing.JLabel label_ProjectName;
    private javax.swing.JPanel panel_ExitConfirmation;
    // End of variables declaration//GEN-END:variables
}