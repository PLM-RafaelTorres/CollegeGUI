/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group6bscs22;
import java.sql.*;
import java.util.Map;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Raffy
 */
public class MainFrame extends javax.swing.JFrame {
    private final String db = "jdbc:mysql://localhost/oop_activity";
    private final Map<String, String> env = System.getenv();
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    boolean isCollegesShown = true;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        postInit();
    }
    private void postInit(){
        this.setTitle("Colleges");
        conn = ConnectDB.connect(db, env.get("mysqluser"), env.get("mysqlpass"));
        tblCourse.setDefaultEditor(Object.class, null);
    }
    
    private void clearAllTexts(){
        txtCollegeCode.setText("");
        txtDescription.setText("");
        txtActive.setText("");
        txtDateOpened.setText("");
        txtDateClosed.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnToggleTables = new javax.swing.JButton();
        lblCollegeCode = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblActive = new javax.swing.JLabel();
        lblDateOpened = new javax.swing.JLabel();
        lblDateClosed = new javax.swing.JLabel();
        txtCollegeCode = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtActive = new javax.swing.JTextField();
        txtDateOpened = new javax.swing.JTextField();
        txtDateClosed = new javax.swing.JTextField();
        lblCurrentTable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCourse);

        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnToggleTables.setText("Show Subjects");
        btnToggleTables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToggleTablesMouseClicked(evt);
            }
        });

        lblCollegeCode.setText("College Code");

        lblDescription.setText("Description");

        lblActive.setText("Active");

        lblDateOpened.setText("Date Opened");

        lblDateClosed.setText("Date Closed");

        txtDateClosed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateClosedActionPerformed(evt);
            }
        });

        lblCurrentTable.setText("Colleges");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCollegeCode)
                                    .addComponent(lblDescription)
                                    .addComponent(lblActive)
                                    .addComponent(lblDateOpened)
                                    .addComponent(lblDateClosed))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDateClosed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(txtDateOpened, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtActive, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCollegeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(btnToggleTables))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(lblCurrentTable)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblCurrentTable)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCollegeCode)
                    .addComponent(txtCollegeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblActive)
                    .addComponent(txtActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateOpened)
                    .addComponent(txtDateOpened, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateClosed)
                    .addComponent(txtDateClosed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnToggleTables)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtDateClosedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateClosedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateClosedActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        String query = "SELECT * FROM COLLEGE";
        
        lblCollegeCode.setText("College Code");
        lblActive.setText("Active");
        lblDateOpened.setText("Date Opened");
        lblDateClosed.setText("Date Closed");
        
        if(!isCollegesShown){
            query = "SELECT * FROM SUBJECT";
            lblCollegeCode.setText("Subject Code");
            lblActive.setText("Units");
            lblDateOpened.setText("College Code");
            lblDateClosed.setText("Active");
        }
        
        try{
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            tblCourse.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnToggleTablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToggleTablesMouseClicked
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(null, "Do you really want to switch tables?");
        if(answer != 0){
            JOptionPane.showMessageDialog(null, "Aborted");
            return;
        }
            clearAllTexts();
            isCollegesShown = !isCollegesShown;
            if(!isCollegesShown){
                this.setTitle("Subjects");
                lblCurrentTable.setText("Subjects");
                btnToggleTables.setText("Show Colleges");
            }
            else{
                this.setTitle("Colleges");
                lblCurrentTable.setText("Colleges");
                btnToggleTables.setText("Show Subjects");
            }
                
    }//GEN-LAST:event_btnToggleTablesMouseClicked

   
    private void tblCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCourseMouseClicked
        // TODO add your handling code here:
        
        String table = "COLLEGE";
        if(!isCollegesShown){
            table = "SUBJECT";
        }
        int row = tblCourse.getSelectedRow();
        try{
            ps = conn.prepareStatement("SELECT * FROM " + table);
            rs = ps.executeQuery();
            while(rs.next()){
                txtCollegeCode.setText(tblCourse.getValueAt(row, 0).toString());
                txtDescription.setText(tblCourse.getValueAt(row, 1).toString());
                txtActive.setText(tblCourse.getValueAt(row, 2).toString());
                txtDateOpened.setText(tblCourse.getValueAt(row, 3).toString());
                txtDateClosed.setText(tblCourse.getValueAt(row, 4).toString());
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_tblCourseMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(null, "Do you really want to add?");
        if(answer != 0){
            JOptionPane.showMessageDialog(null, "Aborted insertion of record", "Abort",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try{
            if(isCollegesShown){
                ps = conn.prepareStatement("INSERT INTO COLLEGE VALUES(?, ?, ?, ?, ?)");
                ps.setString(3, txtActive.getText().toUpperCase());
                ps.setDate(4, Date.valueOf(txtDateOpened.getText()));
                ps.setDate(5, Date.valueOf(txtDateClosed.getText()));
            }
            else{
                ps = conn.prepareStatement("INSERT INTO SUBJECT VALUES (?, ?, ?, ?, ?)");
                ps.setInt(3, Integer.valueOf(txtActive.getText()));
                ps.setString(4, txtDateOpened.getText());
                ps.setString(5, txtDateClosed.getText().toUpperCase());
            }
            
            ps.setString(1, txtCollegeCode.getText());
            ps.setString(2, txtDescription.getText());
            
            ps.executeUpdate();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(null, "Do you really want to edit?");
        if(answer != 0){
            JOptionPane.showMessageDialog(null, "Aborted update of record", "Abort",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try{
            if(isCollegesShown){
                ps = conn.prepareStatement("UPDATE COLLEGE "
                                         + "SET DESCRIPTION = ?, ACTIVE = ?, DATE_OPENED = ?, DATE_CLOSED = ? "
                                         + "WHERE COLLEGE_CODE = ?");
                ps.setString(1, txtDescription.getText());
                ps.setString(2, txtActive.getText().toUpperCase());
                ps.setDate(3, Date.valueOf(txtDateOpened.getText()));
                ps.setDate(4, Date.valueOf(txtDateClosed.getText()));
                ps.setString(5, txtCollegeCode.getText());
            }
            else{
                ps = conn.prepareStatement("UPDATE SUBJECT "
                                          + "SET DESCRIPTION = ?, UNITS = ?, COLLEGE_CODE = ?, ACTIVE = ? "
                                          + "WHERE SUBJECT_CODE = ?");
                ps.setString(1, txtDescription.getText());
                ps.setInt(2, Integer.valueOf(txtActive.getText()));
                ps.setString(3, txtDateOpened.getText());
                ps.setString(4, txtDateClosed.getText().toUpperCase());
                ps.setString(5, txtCollegeCode.getText());
            }
            ps.executeUpdate();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        int answer = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        if(answer != 0){
            JOptionPane.showMessageDialog(null, "Aborted deletion of record", "Abort",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try{
            if(isCollegesShown)
                ps = conn.prepareStatement("DELETE FROM COLLEGE "
                                        + "WHERE COLLEGE_CODE = ?");
            else
                ps = conn.prepareStatement("DELETE FROM SUBJECT "
                                        + "WHERE SUBJECT_CODE = ?");
            ps.setString(1, txtCollegeCode.getText());
            ps.executeUpdate();
            clearAllTexts();
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnToggleTables;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActive;
    private javax.swing.JLabel lblCollegeCode;
    private javax.swing.JLabel lblCurrentTable;
    private javax.swing.JLabel lblDateClosed;
    private javax.swing.JLabel lblDateOpened;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTextField txtActive;
    private javax.swing.JTextField txtCollegeCode;
    private javax.swing.JTextField txtDateClosed;
    private javax.swing.JTextField txtDateOpened;
    private javax.swing.JTextField txtDescription;
    // End of variables declaration//GEN-END:variables
}
