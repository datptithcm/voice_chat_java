/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.voice_chat_server.views.ui;

/**
 *
 * @author minhd
 */
public class ClientUI extends javax.swing.JPanel {
    public static int height;

    /**
     * Creates new form ClientHostUI
     */
    public ClientUI(String id, String ip) {
        initComponents();
        height = (int) getPreferredSize().getHeight();
        lbId.setText(id);
        lbIp.setText(ip);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbId = new javax.swing.JLabel();
        lbIp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(276, 60));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.CardLayout(9, 9));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_32x32/laptop.png"))); // NOI18N
        jPanel1.add(jLabel1, "card2");

        add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setLayout(new java.awt.BorderLayout());

        lbId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbId.setText("192.168.1.1");
        lbId.setPreferredSize(new java.awt.Dimension(73, 32));
        jPanel2.add(lbId, java.awt.BorderLayout.PAGE_START);

        lbIp.setForeground(new java.awt.Color(0, 204, 0));
        lbIp.setText("192.168.1.1");
        jPanel2.add(lbIp, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbIp;
    // End of variables declaration//GEN-END:variables
}
