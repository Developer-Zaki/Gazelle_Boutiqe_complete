/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gazelle_boutiqe;

import com.mysql.jdbc.Connection;
import java.awt.print.PrinterException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zaki_shah
 */
public class staff_ext extends javax.swing.JFrame {

    /**
     * Creates new form staff_ext
     */
    public staff_ext() {
         initComponents();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         dark_mode.applyTheme(this);
         setLocationRelativeTo(null);
        // setResizable(false);
        resultArea.getTableHeader().setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 20));
        resultArea.setRowHeight(30);
        this.revalidate();
        this.repaint();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        date.requestFocus();
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        extra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gift = new javax.swing.JTextField();
        damage = new javax.swing.JTextField();
        other = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        company = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("مصارف اضافی کارمندان:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 16, 0, 71);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("اضافه کاری:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 12, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        extra.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        extra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                extraKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 193;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 48, 0, 0);
        getContentPane().add(extra, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("عیدی/ بخششی:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 12, 0, 71);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("خسارت:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 12, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setText("دیگر موارد:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 12, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        gift.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        gift.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                giftKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 193;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 48, 0, 0);
        getContentPane().add(gift, gridBagConstraints);

        damage.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        damage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                damageKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 193;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 48, 0, 0);
        getContentPane().add(damage, gridBagConstraints);

        other.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        other.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                otherKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 193;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 48, 0, 0);
        getContentPane().add(other, gridBagConstraints);

        company.setColumns(20);
        company.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        company.setRows(5);
        jScrollPane1.setViewportView(company);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 421;
        gridBagConstraints.ipady = 467;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(29, 40, 0, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton2.setText("پرنت");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 40, 0, 0);
        getContentPane().add(jButton2, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setText("ذخیره");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(69, 48, 0, 0);
        getContentPane().add(jButton1, gridBagConstraints);

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
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 0, 0);
        getContentPane().add(jButton4, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel11.setText("developed by Code-Crafters-Company    2024");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(115, 12, 13, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        date.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dateKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 193;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 48, 0, 0);
        getContentPane().add(date, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("تاریخ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 12, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        resultArea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        resultArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "تاریخ", "نام", "اضافه کاری", "بخششی", "خسارت", "دیگر موارد"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(resultArea);
        if (resultArea.getColumnModel().getColumnCount() > 0) {
            resultArea.getColumnModel().getColumn(0).setResizable(false);
            resultArea.getColumnModel().getColumn(1).setResizable(false);
            resultArea.getColumnModel().getColumn(2).setResizable(false);
            resultArea.getColumnModel().getColumn(3).setResizable(false);
            resultArea.getColumnModel().getColumn(4).setResizable(false);
            resultArea.getColumnModel().getColumn(5).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 758;
        gridBagConstraints.ipady = 463;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(29, 7, 0, 0);
        getContentPane().add(jScrollPane2, gridBagConstraints);

        jButton5.setBackground(java.awt.Color.blue);
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton5.setText("بررسی مصارف");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 301, 0, 0);
        getContentPane().add(jButton5, gridBagConstraints);

        name.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 193;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 48, 0, 0);
        getContentPane().add(name, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setText("نام کارمند:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 18, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            boolean complete=company.print();

            if(complete){
                JOptionPane.showMessageDialog(null,"done printing", "daily report",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "?????\n لغو پرنت","printer",JOptionPane.ERROR_MESSAGE);
            }

        }catch(PrinterException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            String dat=date.getText();
            String nam=name.getText();
            String pow=extra.getText();
            double pow1=Double.parseDouble(pow);
            String wat=gift.getText();
            double watr=Double.parseDouble(wat);
            String com=damage.getText();
            double cop=Double.parseDouble(com);
            String tx=other.getText();
            double t=Double.parseDouble(tx);
            double total=pow1+watr+cop+t;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/gezele", "root","");
            String sql="insert into staff_ext (staff_date,name,extras, gift, damage, other) values (?,?,?,?,?)" ;
            PreparedStatement ptst=conn.prepareStatement(sql);

           
            ptst.setString(1, dat);
            ptst.setString(2,nam);
            ptst.setString(3, pow);
            ptst.setString(4, wat);
            ptst.setString(5, com);          
            ptst.setString(6, tx);
            ptst.executeUpdate();

            JOptionPane.showMessageDialog(null, "ذخیره شد!!");
            ptst.close();
            conn.close();

        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "database Error"+ex.getMessage());
        }
         company.setText("\t مصارف شرکت\n********************************************* \n"
                + "\n تاریخ \t\t"+dat+"\n نام \t\t"+nam+"\n اضافه کاری\t "+ pow+"\n تحفه\t\t "+wat+"\n خسارت \t\t"+com
                + "\n موارد دیگر \t"+tx+
                "\n *********************************************\n"
                + "مجموع \t\t"+total);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        extras obj=new extras();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/gezele", "root","");
            String sql="SELECT *from staff_ext ";
            PreparedStatement ptst=conn.prepareStatement(sql);
            ResultSet rs=ptst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)resultArea.getModel();
            tm.setRowCount(0);

            while(rs.next()){
                Object o[]={rs.getDate("staff_date"),rs.getString("name"),rs.getInt("extras"),rs.getInt("gift"), rs.getInt("damage"), rs.getInt("other"),
                    };
                tm.addRow(o);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void dateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateKeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode()){
            case 40: name.requestFocus();
               break;
            case 38: other.requestFocus();
        }
    }//GEN-LAST:event_dateKeyPressed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode()){
            case 40: extra.requestFocus();
               break;
            case 38: date.requestFocus();
        }        
    }//GEN-LAST:event_nameKeyPressed

    private void extraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_extraKeyPressed
        // TODO add your handling code here
        switch(evt.getKeyCode()){
            case 40: gift.requestFocus();
               break;
            case 38: name.requestFocus();
        }        
    }//GEN-LAST:event_extraKeyPressed

    private void giftKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giftKeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode()){
            case 40: damage.requestFocus();
               break;
            case 38: extra.requestFocus();
        }        
    }//GEN-LAST:event_giftKeyPressed

    private void damageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_damageKeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode()){
            case 40: other.requestFocus();
               break;
            case 38: gift.requestFocus();
        }        
    }//GEN-LAST:event_damageKeyPressed

    private void otherKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otherKeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode()){
            case 40: date.requestFocus();
               break;
            case 38: damage.requestFocus();
        }
    }//GEN-LAST:event_otherKeyPressed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
                dark_mode.switchDarkmode();
        for(JFrame frame : getAllOpenFrames()){
            dark_mode.applyTheme(frame);
            frame.repaint();
        }       
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed
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
            java.util.logging.Logger.getLogger(staff_ext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staff_ext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staff_ext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staff_ext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staff_ext().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea company;
    private javax.swing.JTextField damage;
    private javax.swing.JTextField date;
    private javax.swing.JTextField extra;
    private javax.swing.JTextField gift;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField other;
    private javax.swing.JTable resultArea;
    // End of variables declaration//GEN-END:variables
}
