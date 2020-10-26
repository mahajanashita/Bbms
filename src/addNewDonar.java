import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import project.connectionprovider;

/**
 *
 * @author ashit
 */
public class addNewDonar extends javax.swing.JFrame {

    /**
     * Creates new form addNewDonar
     */
    public addNewDonar() {
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

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        tfname = new javax.swing.JTextField();
        tmname = new javax.swing.JTextField();
        tmn = new javax.swing.JTextField();
        jgender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        jblood = new javax.swing.JComboBox<>();
        tcity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taddress = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labid = new javax.swing.JLabel();
        jdate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jLabel11.setText("Blood group");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 130));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel1.setText("Add New Donar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 10, 266, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("New Donar ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 116, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Full Name ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 102, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Father Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 116, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mother Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Date of Birth");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 98, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Mobile Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 69, -1));

        tname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 162, -1));

        tfname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 162, -1));

        tmname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 162, -1));

        tmn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 190, 30));

        jgender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female", "Others" }));
        jgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgenderActionPerformed(evt);
            }
        });
        getContentPane().add(jgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 160, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 147, 59, 17));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 79, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Blood Group");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("City");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 68, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Complete Address");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        temail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temailActionPerformed(evt);
            }
        });
        getContentPane().add(temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 213, -1));

        jblood.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        jblood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbloodActionPerformed(evt);
            }
        });
        getContentPane().add(jblood, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 130, -1));

        tcity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcityActionPerformed(evt);
            }
        });
        getContentPane().add(tcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 213, -1));

        taddress.setColumns(20);
        taddress.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        taddress.setRows(5);
        jScrollPane1.setViewportView(taddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 221, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 729, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 729, 10));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 101, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update details.png"))); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit application.png"))); // NOI18N
        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));

        labid.setBackground(new java.awt.Color(255, 255, 255));
        labid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labid.setForeground(new java.awt.Color(255, 51, 51));
        labid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(labid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, 20));
        getContentPane().add(jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 160, -1));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
        Connection con=connectionprovider.getCon();
        Statement st =con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,
                           ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=st.executeQuery("select max(donarid) from donar");
        if(rs.first())
        {
            int id=rs.getInt(1);
            id=id+1;
            String str=String.valueOf(id);
            labid.setText(str);
        }
        else
        {
            labid.setText("1");
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_formComponentShown

    private void temailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temailActionPerformed

    private void tcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcityActionPerformed

    private void jbloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbloodActionPerformed

    private void jgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jgenderActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
       new addNewDonar().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String donarid=labid.getText();
       String name=tname.getText();
       String fathername=tfname.getText();
       String mothername=tmname.getText();
       SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
       String dob=dFormat.format(jdate.getDate());
       String mobileNo=tmn.getText();
       String gender=(String)jgender.getSelectedItem();
       String email=temail.getText();
       String bloodGroup=(String)jblood.getSelectedItem();
       String city=tcity.getText();
       String address=taddress.getText();
       
       
       try{
           Connection con= connectionprovider.getCon();
           Statement st=con.createStatement();
           st.executeUpdate("insert into donar values('"+donarid+"','"+name+"','"+fathername+"','"+mothername+"','"+dob+"','"+mobileNo+"','"+gender+"','"+email+"','"+bloodGroup+"','"+city+"','"+address+"')");        
           JOptionPane.showMessageDialog(null,"Successfully Updated");
           setVisible(false);
           new addNewDonar().setVisible(true);
       }
       catch(Exception e )
       {
        JOptionPane.showMessageDialog(null,e);   
       }
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
            java.util.logging.Logger.getLogger(addNewDonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewDonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewDonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewDonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewDonar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jblood;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JComboBox<String> jgender;
    private javax.swing.JLabel labid;
    private javax.swing.JTextArea taddress;
    private javax.swing.JTextField tcity;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tmn;
    private javax.swing.JTextField tmname;
    private javax.swing.JTextField tname;
    // End of variables declaration//GEN-END:variables
}
