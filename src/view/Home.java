/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.HomeController;
import controller.LoginController;
import javax.swing.JOptionPane;

/**
 *
 * @author Isuru
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        exitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        room = new javax.swing.JMenu();
        addRoom = new javax.swing.JMenuItem();
        deleteRoom = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        checkIn = new javax.swing.JMenuItem();
        checkOut = new javax.swing.JMenuItem();
        Details = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1910, 1035));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1750, 900, 152, 53));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(java.awt.Color.green);
        jLabel2.setText("Home Page");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 2100, 1320));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(80, 70));

        room.setText("Room");
        room.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        addRoom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addRoom.setText("Add Room");
        addRoom.setPreferredSize(new java.awt.Dimension(130, 30));
        addRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomActionPerformed(evt);
            }
        });
        room.add(addRoom);

        deleteRoom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteRoom.setText("Delete Room");
        deleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomActionPerformed(evt);
            }
        });
        room.add(deleteRoom);

        jMenuBar1.add(room);

        jMenu2.setText("Customer");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        checkIn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkIn.setText("Customer Check In");
        checkIn.setPreferredSize(new java.awt.Dimension(230, 32));
        checkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInActionPerformed(evt);
            }
        });
        jMenu2.add(checkIn);

        checkOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkOut.setText("Customer Check Out");
        checkOut.setPreferredSize(new java.awt.Dimension(230, 32));
        checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutActionPerformed(evt);
            }
        });
        jMenu2.add(checkOut);

        Details.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Details.setText("Customer Details Bill");
        Details.setPreferredSize(new java.awt.Dimension(230, 32));
        Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsActionPerformed(evt);
            }
        });
        jMenu2.add(Details);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutActionPerformed
        // TODO add your handling code here:
        
        new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_checkOutActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        HomeController.ExitYesNo();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void addRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomActionPerformed
        // TODO add your handling code here:
        
        new AddRoom().setVisible(true);
    }//GEN-LAST:event_addRoomActionPerformed

    private void checkInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInActionPerformed
        // TODO add your handling code here:
        
        new CustomerCheckIn().setVisible(true);
    }//GEN-LAST:event_checkInActionPerformed

    private void DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsActionPerformed
        // TODO add your handling code here:
      
        new CustomerBillDetails().setVisible(true);
    }//GEN-LAST:event_DetailsActionPerformed

    private void deleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomActionPerformed
        // TODO add your handling code here:
        
        new DeleteRoom().setVisible(true);
    }//GEN-LAST:event_deleteRoomActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Details;
    private javax.swing.JMenuItem addRoom;
    private javax.swing.JMenuItem checkIn;
    private javax.swing.JMenuItem checkOut;
    private javax.swing.JMenuItem deleteRoom;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu room;
    // End of variables declaration//GEN-END:variables
}
