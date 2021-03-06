/**
 * File: Load.java
 * Author: Steven Phung
 * Class: CECS-543-01 - Advanced Software Engineering
 * 
 * Assignment: Semester Project v.1.0
 * Date last modified: 2/24/2021
 * 
 * Purpose: This is the class that opens an .ms file and loads it into a new project window.
 */
package cecs_543_semester_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Load extends javax.swing.JFrame {

    //userSelection tracks whether user clicked open or cancel in dialog.
    private int userSelection;
    //Save data
    private String[] info;
    
    //Constructor: Load()
    //Initialize load screen.
    public Load() {
        initComponents();
        initDefaultFileToLoad();
        setDialog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        //User clicks open file
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try {
                //Get file using absolutePath
                File selectedFile = new File(jFileChooser1.getSelectedFile().getAbsolutePath());
                
                //Scan for number of lines in file
                Scanner scanlines = new Scanner(selectedFile);
                int numOfFpPanels = 0;
                while(scanlines.hasNextLine()) {
                    scanlines.nextLine();
                    numOfFpPanels++;
                }
                scanlines.close();
                
                //Dynamically initialize array size based on number of lines
                Scanner scanText = new Scanner(selectedFile);
                info = new String[numOfFpPanels];
                //Scan each row of text (which contains all data for one function point tab)
                for(int i = 0; scanText.hasNextLine(); i++) {
                    info[i] = scanText.nextLine();
                }
                scanText.close();
                
                //Create new window, pass in data to load saved data.
                new MainFrame(info);
            } catch(NullPointerException | FileNotFoundException e) {
                this.dispose();
            }
        }
        //User canceled
        if (userSelection == JFileChooser.CANCEL_OPTION) {
            System.out.println("canceled load.");
            this.dispose();
        }
        this.dispose();
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    //Method: setDialog()
    //Show "open" dialog for openning files and get userSelection.
    private void setDialog() {
        userSelection = jFileChooser1.showOpenDialog(this);
    }
    
    //Method: initDefaultFileToLoad()
    //Default dialog view options to certain files and home directory.
    private void initDefaultFileToLoad() {
        //Set default file extension to ".ms" files.
        jFileChooser1.setFileFilter(new FileNameExtensionFilter(".ms file","ms"));
        //Set default directory to home directory.
        jFileChooser1.setCurrentDirectory(new File(System.getProperty("user.home")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
