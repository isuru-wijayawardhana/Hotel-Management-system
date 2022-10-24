/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DeleteRoomController;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.DBConnection;
import model.DBDeleteRoom;


/**
 *
 * @author Isuru
 */
public class DeleteRoom extends javax.swing.JFrame {

    /**
     * Creates new form DeleteRoom
     */
    public DeleteRoom() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        roomNumberTF = new javax.swing.JTextField();
        deleteRoomBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1750, 810));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Bed", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 104, 1100, 680));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Room Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 390, 140, -1));

        roomNumberTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(roomNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 390, 340, -1));

        deleteRoomBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteRoomBtn.setForeground(java.awt.Color.red);
        deleteRoomBtn.setText("Delete Room");
        deleteRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteRoomBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dele.png"))); // NOI18N
        jLabel2.setText("Delete Room Page");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 520, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cl.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 20, 80, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/riLo85baT.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs=new DBDeleteRoom().DisplayRoomTable();
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        try {
            Vector v;
            while(rs.next()){
                v = new Vector();
                v.add(rs.getString("roomNo"));
                v.add(rs.getString("roomType"));
                v.add(rs.getString("bed"));
                v.add(rs.getString("price"));
                v.add(rs.getString("status"));
                dtm.addRow(v);
            }
            DBConnection.closeCon();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formComponentShown

    private void deleteRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomBtnActionPerformed
        // TODO add your handling code here:
        String roomNumber=roomNumberTF.getText();
        try {
            ResultSet rs=new DBDeleteRoom().GetStatus(roomNumber);
            if(rs.next()){
            String statu=rs.getString(5);
            if("Not Booked".equals(statu)){
                DeleteRoomController.DeleteRoom();
                setVisible(false);
                new DeleteRoom().setVisible(true);
            }else{
                DeleteRoomController.DeleteErrorRoom();
                setVisible(false);
                new DeleteRoom().setVisible(true);
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new DBDeleteRoom().DeleteRoom(roomNumber);
         
    }//GEN-LAST:event_deleteRoomBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
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
            java.util.logging.Logger.getLogger(DeleteRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteRoomBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField roomNumberTF;
    // End of variables declaration//GEN-END:variables
}
