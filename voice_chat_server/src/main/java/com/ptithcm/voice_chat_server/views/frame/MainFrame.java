/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.voice_chat_server.views.frame;

import com.ptithcm.voice_chat_server.models.Checker;
import com.ptithcm.voice_chat_server.models.TCPServerSocket;
import com.ptithcm.voice_chat_server.store.SocketStore;
import com.ptithcm.voice_chat_server.store.ViewStore;
import com.ptithcm.voice_chat_server.validations.StartServerForm;
import com.ptithcm.voice_chat_server.views.ui.ServerHostUI;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author minhd
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Voice Chat Server");
        setIconImage(new ImageIcon(getClass().getResource("/icons/_512x512/cpu-tower.png")).getImage());
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(377, 170));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(377, 80));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.CardLayout(8, 8));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_64x64/dedicated-server.png"))); // NOI18N
        jPanel5.add(jLabel1, "card2");

        jPanel3.add(jPanel5, java.awt.BorderLayout.WEST);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.CardLayout(8, 8));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(131, 21, 245));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VOICE CHAT SERVER");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel2, "card2");

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel4.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PASSWORD:");
        jPanel4.add(jLabel4);

        txtPassword.setPreferredSize(new java.awt.Dimension(120, 32));
        jPanel4.add(txtPassword);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PORT:");
        jPanel4.add(jLabel3);

        txtPort.setPreferredSize(new java.awt.Dimension(100, 32));
        jPanel4.add(txtPort);

        jPanel7.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel8.setOpaque(false);

        btnStart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnStart.setForeground(new java.awt.Color(0, 204, 0));
        btnStart.setText("BẮT ĐẦU");
        btnStart.setPreferredSize(new java.awt.Dimension(100, 32));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel8.add(btnStart);

        jPanel7.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        ExecutorService executorService = Executors.newCachedThreadPool();
        try {
            btnStart.setEnabled(false);
            
            new StartServerForm(this).validate();
            
            String ip = null;
            if ((ip = Checker.connectNetwork()) == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng kết nối vào một mạng nội bộ trước khi bắt đầu", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int port = Integer.parseInt(txtPort.getText());
                TCPServerSocket serverSocket = new TCPServerSocket(port);
                serverSocket.setPassword(String.valueOf(txtPassword.getPassword()));
                SocketStore.tcpServerSocket = serverSocket;
                ManageFrame manageFrame = new ManageFrame();
                manageFrame.getPnlServerCard().add(new ServerHostUI(ip, port));
                manageFrame.setLocationRelativeTo(null);
                manageFrame.setVisible(true);
                ViewStore.manageFrame = manageFrame;
                dispose();
            }
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            btnStart.setEnabled(true);
        }

    }//GEN-LAST:event_btnStartActionPerformed

//    Getter and setter
    public JButton getBtnStart() {
        return btnStart;
    }

    public void setBtnStart(JButton btnStart) {
        this.btnStart = btnStart;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JTextField getTxtPort() {
        return txtPort;
    }

    public void setTxtPort(JTextField txtPort) {
        this.txtPort = txtPort;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables
}
