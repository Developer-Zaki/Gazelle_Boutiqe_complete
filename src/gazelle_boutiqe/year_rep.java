/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gazelle_boutiqe;
import com.mysql.jdbc.Connection;
import java.awt.print.PrinterException;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zaki_shah
 */
public class year_rep extends javax.swing.JFrame {

    /**
     * Creates new form year_rep
     */
    public year_rep() {
          initComponents();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         dark_mode.applyTheme(this);
         setLocationRelativeTo(null);
        resultArea.getTableHeader().setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 20));
        resultArea.setRowHeight(30);
        this.revalidate();
        this.repaint();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        jButton1 = new javax.swing.JButton();
        year = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        sum_item = new javax.swing.JButton();
        sumlable = new javax.swing.JTextField();
        itemlable = new javax.swing.JTextField();
        sell_sum = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setText("جستجو");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 7, 0, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        year.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 31, 0, 0);
        getContentPane().add(year, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("لطفا تاریخ سال مورد نظر را وارد کنید:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 56, 0, 12);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("گزارشات سالانه:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 12);
        getContentPane().add(jLabel2, gridBagConstraints);

        print.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        print.setText("پرنت");
        print.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 127;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(69, 361, 0, 0);
        getContentPane().add(print, gridBagConstraints);

        sum_item.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        sum_item.setText("مجموع فروش");
        sum_item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sum_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sum_itemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(69, 12, 0, 0);
        getContentPane().add(sum_item, gridBagConstraints);

        sumlable.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        sumlable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumlableActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(69, 18, 0, 0);
        getContentPane().add(sumlable, gridBagConstraints);

        itemlable.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 175;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(69, 12, 0, 0);
        getContentPane().add(itemlable, gridBagConstraints);

        sell_sum.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        sell_sum.setText("تعداد فروش");
        sell_sum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sell_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sell_sumActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(69, 154, 0, 0);
        getContentPane().add(sell_sum, gridBagConstraints);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gazelle_boutiqe/back.jpg"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = -19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 20, 0, 0);
        getContentPane().add(jButton4, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel11.setText("developed by Code-Crafters-Company    2024");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(74, 12, 15, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        resultArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resultArea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        resultArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "نام و تخلص", "شماره تماس", " تاریخ", " آیدی ", " جنس ", " قیمت اصلی", " تخفیف", "تعداد", "رسید"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultArea.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(resultArea);
        if (resultArea.getColumnModel().getColumnCount() > 0) {
            resultArea.getColumnModel().getColumn(0).setResizable(false);
            resultArea.getColumnModel().getColumn(1).setResizable(false);
            resultArea.getColumnModel().getColumn(2).setResizable(false);
            resultArea.getColumnModel().getColumn(3).setResizable(false);
            resultArea.getColumnModel().getColumn(4).setResizable(false);
            resultArea.getColumnModel().getColumn(5).setResizable(false);
            resultArea.getColumnModel().getColumn(6).setResizable(false);
            resultArea.getColumnModel().getColumn(7).setResizable(false);
            resultArea.getColumnModel().getColumn(8).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1741;
        gridBagConstraints.ipady = 336;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(30, 12, 0, 12);
        getContentPane().add(jScrollPane2, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton2.setText("حذف");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 473, 0, 0);
        getContentPane().add(jButton2, gridBagConstraints);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("حالت شب");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try{

            java.sql.Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/gezele","root","");
            Statement st=conn.createStatement();
            String sql="SELECT *FROM customer WHERE YEAR(date)=? ";
            String sql1="SELECT *FROM special_customer WHERE YEAR(order_date)=? ";            
            PreparedStatement ptst=conn.prepareStatement(sql);
            
            PreparedStatement ptst1=conn.prepareStatement(sql1);
            String y=year.getText();
            String y1=year.getText();
            
            ptst.setInt(1, Integer.parseInt(y));
            ptst1.setInt(1, Integer.parseInt(y1));
           

            ResultSet rs=ptst.executeQuery();
            ResultSet rs2=ptst1.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)resultArea.getModel();
            tm.setRowCount(0);

                        while(rs.next()){
                Object o[]={rs.getString("name_Lname"),rs.getString("phone"),
                            rs.getDate("date")        ,rs.getString("id"),       
                            rs.getString("pro_name")  ,rs.getInt("price"), 
                            rs.getInt("discount")     ,rs.getInt("num_item"),
                            rs.getString("recive")};
                            
                tm.addRow(o);
            }
            while(rs2.next()){
                Object o[]={rs2.getString("name_Lname"),rs2.getString("phone"),
                            rs2.getDate("order_date")  ,rs2.getString("id"), 
                            rs2.getString("pro_name")  ,rs2.getInt("price"),
                            rs2.getInt("discount")     ,rs2.getInt("num_item"),
                            rs2.getString("recive")};
                tm.addRow(o);
            }

        }catch( Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "پیدا  نشد!!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        try{
            boolean complete=resultArea.print();

            if(complete){
                JOptionPane.showMessageDialog(null,"done printing", "daily report",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "printing","printer",JOptionPane.ERROR_MESSAGE);
            }
        }catch(PrinterException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_printActionPerformed

    private void sum_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sum_itemActionPerformed
        // TODO add your handling code here:
        int price=0;
        int num_item=0;
        int disc=0;
        int value2;
        int value;
        int finalSum=0;
        int row=(int) resultArea.getRowCount();
        int row2=(int) resultArea.getRowCount();
        for(int i=0; i<row; i++){
            value=(int) resultArea.getValueAt(i, 5);
            price +=value;
        }
        for(int j=0; j<row2; j++){
            value2=(int) resultArea.getValueAt(j, 7);
            num_item +=value2;
        }
        for(int j=0; j<row2; j++){
            value2=(int) resultArea.getValueAt(j, 6);
            disc +=value2;
        }
        finalSum=(num_item*price)-disc;
        sumlable.setText(""+ finalSum);
    }//GEN-LAST:event_sum_itemActionPerformed

    private void sumlableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumlableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumlableActionPerformed

    private void sell_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sell_sumActionPerformed
        // TODO add your handling code here:
       int sum3=0;
        int row3=(int) resultArea.getRowCount();
        for(int i=0; i<row3; i++){
            int value3=(int) resultArea.getValueAt(i,7);
            sum3+=value3;
        }
        itemlable.setText(""+sum3);
    }//GEN-LAST:event_sell_sumActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        reports obj=new reports();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        dark_mode.switchDarkmode();
        for(JFrame frame : getAllOpenFrames()){
            dark_mode.applyTheme(frame);
            frame.repaint();
        } 
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            java.sql.Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/gezele","root","");
            Statement st=conn.createStatement();
            String sql="DELETE FROM customer WHERE YEAR(date)=? ";
            String sql1="DELETE FROM special_customer WHERE YEAR(order_date)=? ";            
            PreparedStatement ptst=conn.prepareStatement(sql);
            
            PreparedStatement ptst1=conn.prepareStatement(sql1);
            String y=year.getText();
            String y1=year.getText();
            
            ptst.setInt(1, Integer.parseInt(y));
            ptst1.setInt(1, Integer.parseInt(y1));
            ptst.executeUpdate();
            ptst1.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
     private java.util.List<JFrame> getAllOpenFrames(){
        java.util.List<JFrame> frames=new java.util.ArrayList<>();
        for(java.awt.Window window : java.awt.Window.getWindows()){
            if(window instanceof JFrame){
                frames.add((JFrame) window);
            }
        }
        return frames;
    }
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
            java.util.logging.Logger.getLogger(year_rep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(year_rep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(year_rep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(year_rep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new year_rep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField itemlable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton print;
    private javax.swing.JTable resultArea;
    private javax.swing.JButton sell_sum;
    private javax.swing.JButton sum_item;
    private javax.swing.JTextField sumlable;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
