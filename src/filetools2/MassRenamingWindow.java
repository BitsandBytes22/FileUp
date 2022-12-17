/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package filetools2;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.filechooser.FileFilter;
import filetools2.MASS_RENAMING_WINDOW;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *
 * @author darshanadask
 */
public class MassRenamingWindow extends javax.swing.JFrame {
    
    Path parentPath;
    Path childPath;
    int size;
    String[] pathArray;
    String[] rowName;
    String[] rowSize;
    String[] rowModifiedDate;
    String[] rowType;
    String[] coloumnNames={"Name","Modified Date","Type","Size"};
    public static File[] ChosenFiles;
    public static String folderPath;
    HomeWindow back=new HomeWindow();
   
    
    
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    /**
     * Creates new form MassRenamingWindow
     */
    public MassRenamingWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField2 = new java.awt.TextField();
        textField1 = new java.awt.TextField();
        txtPath = new javax.swing.JTextField();
        file1BrowseButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        folder1table = new javax.swing.JTable();
        UploadButton = new javax.swing.JButton();
        BUTTONmass_rename = new javax.swing.JButton();
        no_files = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        textField2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        textField2.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textField1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        textField1.setText("textField1");

        txtPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPathActionPerformed(evt);
            }
        });

        file1BrowseButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        file1BrowseButton.setText("Browse");
        file1BrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file1BrowseButtonActionPerformed(evt);
            }
        });

        folder1table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Last Modified Data", "Type", "Size"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(folder1table);
        if (folder1table.getColumnModel().getColumnCount() > 0) {
            folder1table.getColumnModel().getColumn(1).setPreferredWidth(15);
            folder1table.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        UploadButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        UploadButton.setText("Upload");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });

        BUTTONmass_rename.setText("MASS RENAME");
        BUTTONmass_rename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTONmass_renameActionPerformed(evt);
            }
        });

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BUTTONmass_rename, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(no_files, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(UploadButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(file1BrowseButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24)
                        .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(file1BrowseButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UploadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BUTTONmass_rename, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(no_files, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPathActionPerformed

    private void file1BrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file1BrowseButtonActionPerformed

        JFileChooser chooser = new JFileChooser();
        //  String choosertitle="hi";
        /*  chooser.showOpenDialog(null);
        Folder f1 = chooser.getSelectedFile();
        String filename1 = f1.getAbsolutePath();
        File1TextField.setText(filename1);*/
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("select folder");
        //  chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setMultiSelectionEnabled(true);
        chooser.showOpenDialog(null); 
        ChosenFiles= chooser.getSelectedFiles();
        chooser.setAcceptAllFileFilterUsed(true);
        
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { 
  //    System.out.println("getCurrentDirectory(): " 
   //      +  chooser.getCurrentDirectory());
   //   System.out.println("getSelectedFile() : " 
  //       +  chooser.getSelectedFile());
        
        childPath=Paths.get(chooser.getSelectedFile().getAbsolutePath());
        parentPath=childPath.getParent();
        folderPath=String.valueOf(parentPath);
        txtPath.setText(folderPath);
        
        }
        
        chooser.addChoosableFileFilter(new FileFilter(){
            
            
            
            @Override
            public boolean accept(File file){
                
                return file.getName().toUpperCase().equals(".TXT") || file.getName().toUpperCase().equals(".DOC") || file.getName().toUpperCase().equals(".JPG");
            }
            
            @Override
            public String getDescription(){
                return ".txt files or .doc files or .jpg files";
            }
        });
        
        
        
    
        //
        // disable the "All files" option.
        //
        
        //
        

        

    }//GEN-LAST:event_file1BrowseButtonActionPerformed

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed

        no_files.setText(ChosenFiles.length+" Selected");
        
        
        //tPath.setText(folderpath);
        
        try{
            
           
            for (File file : ChosenFiles) {

                if (file.isFile()) {
                    
                    System.out.println(file.getName());
      
                    
                    String name=file.getName();
                    String modifiedDate=sdf.format(file.lastModified());
                    String type=Files.probeContentType(file.toPath());
                    String sizeKB=Long.toString(file.length());
                    String[] data={name,modifiedDate,type,sizeKB};
                    
                    pathArray= new String[size];
                    

                    DefaultTableModel model = (DefaultTableModel)folder1table.getModel();
                    
                
                    for(int j=0;j<size;j++){
                        pathArray[j]= file.getAbsolutePath() ;
                    }
                    
                //adding a row which contains name,date,type,size of a file
                model.addRow(data);
               
                }
       
  
            }
           
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"File Not Found");

        }

    }//GEN-LAST:event_UploadButtonActionPerformed

    private void BUTTONmass_renameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTONmass_renameActionPerformed
        MASS_RENAMING_WINDOW w=new MASS_RENAMING_WINDOW();
        w.setVisible(true);
    }//GEN-LAST:event_BUTTONmass_renameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MassRenamingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MassRenamingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MassRenamingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MassRenamingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MassRenamingWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTTONmass_rename;
    private javax.swing.JButton UploadButton;
    private javax.swing.JButton file1BrowseButton;
    private javax.swing.JTable folder1table;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel no_files;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables
}
