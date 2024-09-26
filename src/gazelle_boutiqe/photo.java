/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gazelle_boutiqe;

import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Zaki_shah
 */
public class photo extends javax.swing.JFrame {

    /**
     * Creates new form photo
     */
    public photo() {
          initComponents();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         dark_mode.applyTheme(this);
         setLocationRelativeTo(null);
         this.revalidate();
        this.repaint();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        id.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        imagePanel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        size = new javax.swing.JTextField();
        feature = new javax.swing.JTextField();
        material = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        imageLable = new javax.swing.JLabel();
        tal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Photo");

        id.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("آیدی محصول:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("نام محصول:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("رنگ محصول:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setText("سایز محصول:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("ویژگی محصول:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setText("برند محصول:");

        jButton2.setBackground(java.awt.Color.blue);
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("انتخاب و ذخیره عکس");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setText("جنس محصول:");

        imagePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        jButton3.setBackground(java.awt.Color.blue);
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("نمایش محصولات");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(java.awt.Color.blue);
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gazelle_boutiqe/back.jpg"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });

        color.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                colorKeyPressed(evt);
            }
        });

        size.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        size.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sizeKeyPressed(evt);
            }
        });

        feature.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        feature.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                featureKeyPressed(evt);
            }
        });

        material.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        material.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                materialKeyPressed(evt);
            }
        });

        brand.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        brand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                brandKeyPressed(evt);
            }
        });

        tal.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        tal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                talKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setText("تل:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel12.setText("به بخش محصولات خوش آمدید");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(12, 12, 12)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(imagePanel))
            .addGroup(layout.createSequentialGroup()
                .addGap(1194, 1194, 1194)
                .addComponent(jLabel12))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(imageLable, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(504, 504, 504)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4)))
            .addGroup(layout.createSequentialGroup()
                .addGap(984, 984, 984)
                .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(984, 984, 984)
                .addComponent(feature, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(984, 984, 984)
                .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(imagePanel)
                .addGap(8, 8, 8)
                .addComponent(jLabel12)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLable, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feature, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(tal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel11))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this)== JFileChooser.APPROVE_OPTION){
            File selectFile= fileChooser.getSelectedFile();
            ImageIcon imageIcon=new ImageIcon(selectFile.getPath());
            JLabel image=new JLabel(imageIcon);
            imagePanel.removeAll();
            imagePanel.add(image);
            imagePanel.revalidate();
            imagePanel.repaint();

            try{
                FileInputStream fis=new FileInputStream(selectFile);
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/gezele", "root","");
                String sql="INSERT INTO product (photo, id, name, color, size, feature, material, brand,tal) values (?,?,?,?,?,?,?,?,?)";
                PreparedStatement ptst=conn.prepareStatement(sql);
                String id1=id.getText();
                //double id2=Double.parseDouble(id1);
                ////////////////////////////////
                String name1=name.getText();
                String color1=color.getText();
                ///////////////////////////////
                String size1=size.getText();
                double siz=Double.parseDouble(size1);
                ///////////////////////////////
                String features=feature.getText();
                String mat=material.getText();
                String brnd=brand.getText();
                String tl=tal.getText();
                //double t=Double.parseDouble(tl);

                ptst.setBinaryStream(1, fis, (int) selectFile.length());
                ptst.setString(2,id1);
                ptst.setString(3,name1);
                ptst.setString(4,color1);
                ptst.setString(5,size1);
                ptst.setString(6,features);
                ptst.setString(7,mat);
                ptst.setString(8,brnd);
                ptst.setString(9, tl);

                ptst.executeUpdate();

                ptst.close();
                fis.close();
                conn.close();

                JOptionPane.showMessageDialog(this, "saved successfully");
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "error saving image");
            }
        }else{
            JOptionPane.showMessageDialog(this, "no image selected");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        products obj = new products();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        home obj=new home();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        // TODO add your handling code here:
                       switch(evt.getKeyCode()){
            case 40: name.requestFocus();
               break;
            
        } 
    }//GEN-LAST:event_idKeyPressed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        // TODO add your handling code here:
                       switch(evt.getKeyCode()){
            case 40: color.requestFocus();
               break;
            case 38: id.requestFocus();
        } 
    }//GEN-LAST:event_nameKeyPressed

    private void colorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorKeyPressed
               switch(evt.getKeyCode()){
            case 40: size.requestFocus();
               break;
            case 38: name.requestFocus();
        } 
        // TODO add your handling code here:
    }//GEN-LAST:event_colorKeyPressed

    private void sizeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sizeKeyPressed
        // TODO add your handling code here:
                       switch(evt.getKeyCode()){
            case 40: feature.requestFocus();
               break;
            case 38: color.requestFocus();
        } 
    }//GEN-LAST:event_sizeKeyPressed

    private void featureKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_featureKeyPressed
        // TODO add your handling code here:
                       switch(evt.getKeyCode()){
            case 40: material.requestFocus();
               break;
            case 38: size.requestFocus();
        } 
    }//GEN-LAST:event_featureKeyPressed

    private void materialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_materialKeyPressed
        // TODO add your handling code here:
                       switch(evt.getKeyCode()){
            case 40: brand.requestFocus();
               break;
            case 38: feature.requestFocus();
        } 
    }//GEN-LAST:event_materialKeyPressed

    private void brandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brandKeyPressed
        // TODO add your handling code here:
                       switch(evt.getKeyCode()){
            case 40: tal.requestFocus();
               break;
            case 38: material.requestFocus();
        } 
    }//GEN-LAST:event_brandKeyPressed

    private void talKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_talKeyPressed
        // TODO add your handling code here:
                       switch(evt.getKeyCode()){
            case 40: id.requestFocus();
               break;
            case 38: brand.requestFocus();
        } 
    }//GEN-LAST:event_talKeyPressed

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
            java.util.logging.Logger.getLogger(photo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(photo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(photo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(photo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new photo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brand;
    private javax.swing.JTextField color;
    private javax.swing.JTextField feature;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imageLable;
    private javax.swing.JLabel imagePanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField material;
    private javax.swing.JTextField name;
    private javax.swing.JTextField size;
    private javax.swing.JTextField tal;
    // End of variables declaration//GEN-END:variables
}
