/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gazelle_boutiqe;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SH Hussain
 */
public class reset extends javax.swing.JFrame {

    /**
     * Creates new form reset
     */
    public reset() {
        initComponents();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         dark_mode.applyTheme(this);
         setLocationRelativeTo(null);
         setResizable(false);
         pass.requestFocus();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        staff = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        newPass = new javax.swing.JPasswordField();
        staffPass = new javax.swing.JPasswordField();
        staffNew = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 786;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 12);
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("رمز فعلی");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 1, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("رمز جدید");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 1, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("رمز جدید");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = -11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 1, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setText("رمز فعلی");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = -11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 1, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setText("تغییر رمز کارمند");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = -11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 296, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setText("تغییر رمز مدیر");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = -11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 313, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        admin.setBackground(java.awt.Color.blue);
        admin.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        admin.setText("ذخیره");
        admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 387, 0, 0);
        getContentPane().add(admin, gridBagConstraints);

        staff.setBackground(java.awt.Color.blue);
        staff.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        staff.setText("ذخیره");
        staff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 384, 0, 0);
        getContentPane().add(staff, gridBagConstraints);

        pass.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 296, 0, 0);
        getContentPane().add(pass, gridBagConstraints);

        newPass.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        newPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassActionPerformed(evt);
            }
        });
        newPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newPassKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 296, 0, 0);
        getContentPane().add(newPass, gridBagConstraints);

        staffPass.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        staffPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffPassActionPerformed(evt);
            }
        });
        staffPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                staffPassKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = -7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 296, 0, 0);
        getContentPane().add(staffPass, gridBagConstraints);

        staffNew.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        staffNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffNewActionPerformed(evt);
            }
        });
        staffNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                staffNewKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 296, 0, 0);
        getContentPane().add(staffNew, gridBagConstraints);

        jButton3.setBackground(java.awt.Color.blue);
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gazelle_boutiqe/back.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -44;
        gridBagConstraints.ipady = -26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 11, 0, 0);
        getContentPane().add(jButton3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        String password=new String(pass.getPassword());
        String newAdmin=new String(newPass.getPassword());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection conn=(com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://localhost/gezele", "root","");
            String checkSql="SELECT *FROM admin WHERE password=?";
            PreparedStatement checkStmt=conn.prepareStatement(checkSql);
            checkStmt.setString(1, password);
            ResultSet rs=checkStmt.executeQuery();
            
            if(rs.next()){
                String updateSql="UPDATE admin SET password=? WHERE password=?";
                PreparedStatement updateStmt=conn.prepareStatement(updateSql);
                updateStmt.setString(1, newAdmin);
                updateStmt.setString(2, password);
                
                int rowsAffected=updateStmt.executeUpdate();
                
                if(rowsAffected>0){
                    JOptionPane.showMessageDialog(this, "updated");
                }else{
                    JOptionPane.showMessageDialog(this, "failed");

                }
            }else{
                    JOptionPane.showMessageDialog(this, "incorrect password");

            }
            
        }catch(Exception e){
            e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "database error"+e.getMessage());

        }
    }//GEN-LAST:event_adminActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        // TODO add your handling code here:
               String password=new String(staffPass.getPassword());
        String newAdmin=new String(staffNew.getPassword());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection conn=(com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://localhost/gezele", "root","");
            String checkSql="SELECT *FROM user WHERE password=?";
            PreparedStatement checkStmt=conn.prepareStatement(checkSql);
            checkStmt.setString(1, password);
            ResultSet rs=checkStmt.executeQuery();
            
            if(rs.next()){
                String updateSql="UPDATE user SET password=? WHERE password=?";
                PreparedStatement updateStmt=conn.prepareStatement(updateSql);
                updateStmt.setString(1, newAdmin);
                updateStmt.setString(2, password);
                
                int rowsAffected=updateStmt.executeUpdate();
                
                if(rowsAffected>0){
                    JOptionPane.showMessageDialog(this, "updated");
                }else{
                    JOptionPane.showMessageDialog(this, "failed");

                }
            }else{
                    JOptionPane.showMessageDialog(this, "incorrect password");

            }
            
        }catch(Exception e){
            e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "database error"+e.getMessage());

        }
    }//GEN-LAST:event_staffActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void newPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPassActionPerformed

    private void staffPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffPassActionPerformed

    private void staffNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffNewActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        login obj=new login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        // TODO add your handling code here:
                               switch(evt.getKeyCode()){
            case 40: newPass.requestFocus();
               break;
            case 38: staffNew.requestFocus();
        } 
    }//GEN-LAST:event_passKeyPressed

    private void newPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPassKeyPressed
        // TODO add your handling code here:
                               switch(evt.getKeyCode()){
            case 40: staffPass.requestFocus();
               break;
            case 38: pass.requestFocus();
        } 
    }//GEN-LAST:event_newPassKeyPressed

    private void staffPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffPassKeyPressed
        // TODO add your handling code here:
                               switch(evt.getKeyCode()){
            case 40: staffNew.requestFocus();
               break;
            case 38: newPass.requestFocus();
        } 
    }//GEN-LAST:event_staffPassKeyPressed

    private void staffNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffNewKeyPressed
        // TODO add your handling code here:
                               switch(evt.getKeyCode()){
            case 40: pass.requestFocus();
               break;
            case 38: staffPass.requestFocus();
        } 
    }//GEN-LAST:event_staffNewKeyPressed

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
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField newPass;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton staff;
    private javax.swing.JPasswordField staffNew;
    private javax.swing.JPasswordField staffPass;
    // End of variables declaration//GEN-END:variables
}
