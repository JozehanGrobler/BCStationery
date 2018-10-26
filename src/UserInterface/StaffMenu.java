/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class StaffMenu extends javax.swing.JFrame {

    /**
     * Creates new form StaffMenu
     */
    public StaffMenu() {
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

        btnUpdateProfile = new javax.swing.JButton();
        btnViewMyRequests = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        btnBackLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(652, 459));
        setResizable(false);
        getContentPane().setLayout(null);

        btnUpdateProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnUpdateProfile.png"))); // NOI18N
        btnUpdateProfile.setToolTipText("View and update my profile");
        btnUpdateProfile.setBorderPainted(false);
        btnUpdateProfile.setContentAreaFilled(false);
        btnUpdateProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateProfile);
        btnUpdateProfile.setBounds(140, 180, 170, 50);

        btnViewMyRequests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnMyRequests.png"))); // NOI18N
        btnViewMyRequests.setToolTipText("View request history");
        btnViewMyRequests.setBorderPainted(false);
        btnViewMyRequests.setContentAreaFilled(false);
        btnViewMyRequests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewMyRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMyRequestsActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewMyRequests);
        btnViewMyRequests.setBounds(360, 180, 170, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnRequestView.png"))); // NOI18N
        jButton1.setToolTipText("View items and send item requests");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 240, 390, 50);

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        btnMinimize.setToolTipText("Minimize");
        btnMinimize.setBorder(null);
        btnMinimize.setBorderPainted(false);
        btnMinimize.setContentAreaFilled(false);
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(btnMinimize);
        btnMinimize.setBounds(550, 10, 30, 30);

        btnBackLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnBackLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnBackLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout1.png"))); // NOI18N
        btnBackLogout.setToolTipText("Logout");
        btnBackLogout.setBorder(null);
        btnBackLogout.setBorderPainted(false);
        btnBackLogout.setContentAreaFilled(false);
        btnBackLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackLogoutMouseClicked(evt);
            }
        });
        btnBackLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnBackLogout);
        btnBackLogout.setBounds(580, 10, 30, 30);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        btnExit.setToolTipText("Exit");
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(610, 10, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/staffMenu.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 650, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnBackLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackLogoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackLogoutMouseClicked

    private void btnBackLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackLogoutActionPerformed

        int selection = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Please Note", JOptionPane.INFORMATION_MESSAGE);
        if (selection == JOptionPane.YES_OPTION) {
            StaffLogin staffLogin = new StaffLogin();
            staffLogin.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnBackLogoutActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        int selection = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Please Note", JOptionPane.INFORMATION_MESSAGE);
        if (selection == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed
        UpdateUser updateUser = new UpdateUser();
        updateUser.setVisible(true);
       
    }//GEN-LAST:event_btnUpdateProfileActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StaffItems staffViewItems = new StaffItems();
        staffViewItems.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewMyRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMyRequestsActionPerformed
       StaffPastRequests requestHistory = new StaffPastRequests();
       requestHistory.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnViewMyRequestsActionPerformed

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackLogout;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JButton btnViewMyRequests;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
