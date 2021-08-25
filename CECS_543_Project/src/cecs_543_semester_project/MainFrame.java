/**
 * File: MainFrame.java
 * Author: Steven Phung
 * Class: CECS-543-01 - Advanced Software Engineering
 * 
 * Assignment: Semester Project v.1.0
 * Date last modified: 2/24/2021
 * 
 * Purpose: This is the class that creates the main window, menu, and all other frames.
 */
package cecs_543_semester_project;

import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class MainFrame extends javax.swing.JFrame {
    
    //Max projects allowed
    private final int MAX_PROJECTS = 5;
    //Max tabs allowed
    private final int MAX_TABS = 10;
    
    //Project name, product name, creator name, comments
    private String projectName, productName, creatorName, comments, fpName = null;
    private PanelOfTabs[] panelOfTabsArray;
    private int numberOfProjectPanels;
    //FunctionPointsPanel[] to hold each tab of function point pane
    private FunctionPointsPanel[] functionPointPanelArray;
    //Index how many tabs there are
    private int numberOfFunctionPointPanels;
    //Information to be saved
    private String[] saveInformation;
    
    private DefaultMutableTreeNode selectedNode;
    private DefaultTreeModel model;
    
    //Basic constructor
    public MainFrame() {
        initComponents();
        initMenu();
        initSplitPane();
        initTree();
        initFpPanels();
        panelOfTabs.setVisible(false);
        this.setVisible(true);
    }
    
    //Constructor to load data from a save file.
    public MainFrame(String[] savedInfo) {
        initComponents();
        initMenu();
        initSplitPane();
        initTree();
        initFpPanels();
        loadInfo(savedInfo);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane = new javax.swing.JSplitPane();
        panelOfTabs = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        jScrollPane = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        menuBar = new javax.swing.JMenuBar();
        menu_File = new javax.swing.JMenu();
        menuItem_NewProject = new javax.swing.JMenuItem();
        menuItem_OpenProject = new javax.swing.JMenuItem();
        menuItem_SaveProject = new javax.swing.JMenuItem();
        menuItem_Exit = new javax.swing.JMenuItem();
        menu_Edit = new javax.swing.JMenu();
        menuItem_PlaceHolder = new javax.swing.JMenuItem();
        menu_Preferences = new javax.swing.JMenu();
        menuItem_ChooseLanguage = new javax.swing.JMenuItem();
        menu_Metrics = new javax.swing.JMenu();
        subMenu_Metrics = new javax.swing.JMenu();
        menuItem_FunctionPoints = new javax.swing.JMenuItem();
        menu_Help = new javax.swing.JMenu();
        menuItem_PlaceHolder2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("mainFrame"); // NOI18N
        setSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jSplitPane.setMaximumSize(new java.awt.Dimension(1280, 720));
        jSplitPane.setMinimumSize(new java.awt.Dimension(1280, 720));
        jSplitPane.setPreferredSize(new java.awt.Dimension(1280, 720));

        panelOfTabs.setMaximumSize(new java.awt.Dimension(1060, 640));
        panelOfTabs.setMinimumSize(new java.awt.Dimension(1060, 640));
        panelOfTabs.setPreferredSize(new java.awt.Dimension(1060, 640));

        tabbedPane.setMaximumSize(new java.awt.Dimension(1060, 640));
        tabbedPane.setMinimumSize(new java.awt.Dimension(1060, 640));
        tabbedPane.setPreferredSize(new java.awt.Dimension(1060, 640));

        javax.swing.GroupLayout panelOfTabsLayout = new javax.swing.GroupLayout(panelOfTabs);
        panelOfTabs.setLayout(panelOfTabsLayout);
        panelOfTabsLayout.setHorizontalGroup(
            panelOfTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelOfTabsLayout.setVerticalGroup(
            panelOfTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(panelOfTabs);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane.setViewportView(jTree);

        jSplitPane.setLeftComponent(jScrollPane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1288, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        menu_File.setText("File");

        menuItem_NewProject.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuItem_NewProject.setText("New Project");
        menuItem_NewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_NewProjectActionPerformed(evt);
            }
        });
        menu_File.add(menuItem_NewProject);

        menuItem_OpenProject.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuItem_OpenProject.setText("Open Project");
        menuItem_OpenProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_OpenProjectActionPerformed(evt);
            }
        });
        menu_File.add(menuItem_OpenProject);

        menuItem_SaveProject.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItem_SaveProject.setText("Save Project");
        menuItem_SaveProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_SaveProjectActionPerformed(evt);
            }
        });
        menu_File.add(menuItem_SaveProject);

        menuItem_Exit.setText("Exit");
        menuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_ExitActionPerformed(evt);
            }
        });
        menu_File.add(menuItem_Exit);

        menuBar.add(menu_File);

        menu_Edit.setText("Edit");

        menuItem_PlaceHolder.setText("empty");
        menu_Edit.add(menuItem_PlaceHolder);

        menuBar.add(menu_Edit);

        menu_Preferences.setText("Preferences");

        menuItem_ChooseLanguage.setText("Language");
        menuItem_ChooseLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_ChooseLanguageActionPerformed(evt);
            }
        });
        menu_Preferences.add(menuItem_ChooseLanguage);

        menuBar.add(menu_Preferences);

        menu_Metrics.setText("Metrics");

        subMenu_Metrics.setText("Function Points");

        menuItem_FunctionPoints.setText("Enter FP Data");
        menuItem_FunctionPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_FunctionPointsActionPerformed(evt);
            }
        });
        subMenu_Metrics.add(menuItem_FunctionPoints);

        menu_Metrics.add(subMenu_Metrics);

        menuBar.add(menu_Metrics);

        menu_Help.setText("Help");

        menuItem_PlaceHolder2.setText("empty");
        menu_Help.add(menuItem_PlaceHolder2);

        menuBar.add(menu_Help);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_OpenProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_OpenProjectActionPerformed
        //Load dialog
        new Load();
    }//GEN-LAST:event_menuItem_OpenProjectActionPerformed

    private void menuItem_SaveProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_SaveProjectActionPerformed
        //Save information
        saveProgram();
    }//GEN-LAST:event_menuItem_SaveProjectActionPerformed

    private void menuItem_NewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_NewProjectActionPerformed
        //New project dialog
        if(numberOfProjectPanels < MAX_PROJECTS) {
            new NewProject(this);
            panelOfTabs.add(panelOfTabsArray[numberOfProjectPanels] = new PanelOfTabs());
        }
        
    }//GEN-LAST:event_menuItem_NewProjectActionPerformed

    private void menuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ExitActionPerformed
        //Exit program
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_menuItem_ExitActionPerformed

    private void menuItem_ChooseLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ChooseLanguageActionPerformed
        //Choose a language based on current tab / selected tab.
        functionPointPanelArray[tabbedPane.getSelectedIndex()].chooseLanguage();
    }//GEN-LAST:event_menuItem_ChooseLanguageActionPerformed

    private void menuItem_FunctionPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_FunctionPointsActionPerformed
        //Set to visible once created.
        panelOfTabs.setVisible(true);
        //Only add a Function Points tab if less than max tabs allowed
        if(numberOfFunctionPointPanels < MAX_TABS) {
            if(fpName == null) {
                fpName = JOptionPane.showInputDialog(this.getRootPane(), "Enter name for this FP: ");
            }
            if(fpName != null) {
                tabbedPane.addTab(fpName, functionPointPanelArray[numberOfFunctionPointPanels] = new FunctionPointsPanel(fpName, this));
                numberOfFunctionPointPanels++;
            }
            fpName = null;
        } else {
            menuItem_FunctionPoints.setEnabled(false);
        }
    }//GEN-LAST:event_menuItem_FunctionPointsActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Exit confirmation
        if(tabbedPane.getSelectedIndex() == -1) {
            this.dispose();
        } else {
            //ExitConfirmation ec = new ExitConfirmation(this);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    //loadInfo(String[])
    //Sets all fields, buttons, text fields, and radio buttons to specific
    //values given in saved data.
    private void loadInfo(String[] info) {
        //For every function pane
        for(int i = 0; i < info.length; i++) {
            //Get data split by delimiter
            String[] separatePanels = info[i].split(",");
            for(int j = 0; j < separatePanels.length; j++) {
                /**Indexes contain:
                 * 0. Project name
                 * 1. Product name
                 * 2. Creator name
                 * 3. Comments
                 * 4. Language
                 * 5. VAF values
                 * 6. Input values
                 * 7. Output values
                 * 8. Radio values
                 * 9. Function point value
                 */
                switch(j) {
                    //Cases 0-3 only need to be set once (at index i == 0)
                    case 0:
                        if(i == 0)
                            setProjectName(separatePanels[j]);
                        break;
                    case 1:
                        if(i == 0)
                            setProductName(separatePanels[j]);
                        break;
                    case 2:
                        if(i == 0)
                            setCreatorName(separatePanels[j]);
                        break;
                    case 3:
                        if(i == 0) {
                            setComments(separatePanels[j]);
                            enableMenu();
                        }
                        break;
                    case 4:
                        fpName = separatePanels[j];
                        menuItem_FunctionPoints.doClick();
                        break;
                    case 5:
                        //If no language was provided, set to None, else set language
                        if(separatePanels[j].equals("null")) {
                            functionPointPanelArray[i].setLanguage("None");
                        } else {
                            functionPointPanelArray[i].setLanguage(separatePanels[j]);
                        }
                        break;
                    case 6:
                        //Load VAF values
                        String[] vafValues = separatePanels[j].split("\\s+");
                        functionPointPanelArray[i].loadValueAdjustmentFactors(vafValues);
                        break;
                    case 7:
                        //Load input values
                        String[] inputValues = separatePanels[j].split("\\s+");
                        functionPointPanelArray[i].loadInputValues(inputValues);
                        break;
                    case 8:
                        //Load output values
                        String[] outputValues = separatePanels[j].split("\\s+");
                        functionPointPanelArray[i].loadOutputValues(outputValues);
                        break;
                    case 9:
                        //Load selected radio buttons
                        String[] radioValues = separatePanels[j].split("\\s+"); 
                        functionPointPanelArray[i].loadRadioValues(radioValues);
                        break;
                    case 10:
                        //Load function point and enable all buttons
                        functionPointPanelArray[i].setFunctionPoint(separatePanels[j]);
                        functionPointPanelArray[i].enableAllButtons();
                        break;
                    default:
                        break;
                }
            }
        }
    }
    
    //Method: saveProgram()
    //Convert all data from each function point panel into a string and store it in an array.
    //Then open save dialog and allow user option to save.
    public void saveProgram() {
        saveInformation = new String[numberOfFunctionPointPanels];
        for(int i = 0; i < numberOfFunctionPointPanels; i++) {
            saveInformation[i] = functionPointPanelArray[i].getString(projectName, productName, creatorName, comments);
        }
        new Save(this, saveInformation);
    }
    
    public DefaultMutableTreeNode getTreeNode() {
        return selectedNode;
    }
    
    public JTree getTree() {
        return jTree;
    }
    
    public DefaultTreeModel getModel() {
        return model;
    }
    
    public Object getRootNode() {
        return jTree.getModel().getRoot();
    }
    
    //Method: getProjectName()
    //Return project name.
    public String getProjectName() {
        return projectName;
    }
    
    //Method: saveProgram()
    //Set project name in data field and change title to match.
    public void setProjectName(String s) {
        projectName = s;
        this.setTitle("CECS 543 Metrics Suite - " + projectName);
    }
    
    //Method: setProductName()
    //Set product name.
    public void setProductName(String s) {
        productName = s;
    }
    
    //Method: setCreatorName()
    //Set creator name.
    public void setCreatorName(String s) {
        creatorName = s;
    }
    
    //Method: setComments()
    //Set comments.
    public void setComments(String s) {
        comments = s;
    }
    
    //Method: enableMenu()
    //Enable save, function point menu buttons.
    public void enableMenu() {
        menuItem_FunctionPoints.setEnabled(true);
        menuItem_SaveProject.setEnabled(true);
    }
    
    //Method: enableLanguageMenu()
    //Enable language menu buttons.
    public void enableLanguageMenu() {
        menuItem_ChooseLanguage.setEnabled(true);
    }
    
    //Method: initMenu()
    //Disable menu buttons for new projects.
    private void initMenu() {
        //For new projects, cannot choose language until FP panel is created.
        menuItem_ChooseLanguage.setEnabled(false);
        //Cannot create FP panel until project is created.
        menuItem_FunctionPoints.setEnabled(false);
        //Cannot save project until project is created.
        menuItem_SaveProject.setEnabled(false);
        
        this.setTitle("CECS 543 Metrics Suite");
    }
    
    //Method: initFpPanels()
    //Initialize fields
    private void initFpPanels() {
        functionPointPanelArray = new FunctionPointsPanel[MAX_TABS];
        numberOfFunctionPointPanels = 0;
        panelOfTabsArray = new PanelOfTabs[MAX_PROJECTS];
        numberOfProjectPanels = 0;
    }
    
    private void initSplitPane() {
        jSplitPane.setEnabled(false);
        jSplitPane.setDividerLocation(120);
    }
    
    private void initTree() {
        jTree.setRootVisible(false);
        model = (DefaultTreeModel) jTree.getModel();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItem_ChooseLanguage;
    private javax.swing.JMenuItem menuItem_Exit;
    private javax.swing.JMenuItem menuItem_FunctionPoints;
    private javax.swing.JMenuItem menuItem_NewProject;
    private javax.swing.JMenuItem menuItem_OpenProject;
    private javax.swing.JMenuItem menuItem_PlaceHolder;
    private javax.swing.JMenuItem menuItem_PlaceHolder2;
    private javax.swing.JMenuItem menuItem_SaveProject;
    private javax.swing.JMenu menu_Edit;
    private javax.swing.JMenu menu_File;
    private javax.swing.JMenu menu_Help;
    private javax.swing.JMenu menu_Metrics;
    private javax.swing.JMenu menu_Preferences;
    private javax.swing.JPanel panelOfTabs;
    private javax.swing.JMenu subMenu_Metrics;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
