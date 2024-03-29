/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.voice_chat_server.views.ui;

/**
 *
 * @author minhd
 */
public class ServerHostUI extends javax.swing.JPanel {

    /**
     * Creates new form ServerHostUI
     */
    public ServerHostUI(String ip, int port) {
        initComponents();
        lbIp.setText(ip);
        lbPort.setText(String.valueOf(port));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbIp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbPort = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.CardLayout(8, 8));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_64x64/hosting.png"))); // NOI18N
        jPanel2.add(jLabel1, "card2");

        add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        lbIp.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lbIp.setForeground(new java.awt.Color(204, 0, 255));
        lbIp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIp.setText("192.168.1.1");
        lbIp.setPreferredSize(new java.awt.Dimension(57, 48));
        jPanel3.add(lbIp, java.awt.BorderLayout.NORTH);

        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("PORT:");
        jLabel3.setPreferredSize(new java.awt.Dimension(48, 26));
        jPanel1.add(jLabel3);

        lbPort.setFont(new java.awt.Font("Snap ITC", 1, 12)); // NOI18N
        lbPort.setForeground(new java.awt.Color(255, 0, 0));
        lbPort.setText("9999");
        jPanel1.add(lbPort);

        jPanel3.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbIp;
    private javax.swing.JLabel lbPort;
    // End of variables declaration//GEN-END:variables
}
