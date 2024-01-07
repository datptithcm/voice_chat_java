/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.voice_chat_client.ui;

import com.ptithcm.voice_chat_client.models.Message;
import com.ptithcm.voice_chat_client.store.SocketStore;
import java.awt.Color;
import java.text.SimpleDateFormat;

/**
 *
 * @author minhd
 */
public class MessageUI extends javax.swing.JPanel {
    public static int width;
    public static int height;

    /**
     * Creates new form MessageUI
     */
    public MessageUI(Message message) {
        initComponents();
        
        this.width = (int) getPreferredSize().getWidth();
        this.height = (int) getPreferredSize().getHeight();
        
        if (SocketStore.tcpClientSocket.getClientInfo().getUuid().equals(message.getSender().getUuid())) {
            lblName.setText("Myself");
            lblName.setForeground(Color.red);
        } else {
            lblName.setText(message.getSender().getName());
        }
        
        lblTime.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(message.getSendingTime()));
        txtpContent.setText(message.getContent());
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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpContent = new javax.swing.JEditorPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 100));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 48));
        jPanel1.setLayout(new java.awt.CardLayout(10, 10));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_64x64/laptop.png"))); // NOI18N
        jPanel1.add(jLabel1, "card2");

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("192.168.1.2");
        jPanel2.add(lblName, java.awt.BorderLayout.CENTER);

        lblTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(51, 51, 51));
        lblTime.setText("16:00");
        jPanel2.add(lblTime, java.awt.BorderLayout.EAST);

        jPanel3.add(jPanel2, java.awt.BorderLayout.NORTH);

        jScrollPane1.setBorder(null);

        txtpContent.setEditable(false);
        txtpContent.setBackground(new java.awt.Color(255, 255, 255));
        txtpContent.setBorder(null);
        txtpContent.setText("Trong ví dụ trên, chúng ta tạo một JPanel mới với một FlowLayout và thiết lập alignment của nó là FlowLayout.RIGHT. Sau đó, chúng ta thêm hai JButton vào JPanel. Khi bạn chạy chương trình, bạn sẽ thấy rằng các nút sẽ được thêm vào từ phía phải của JPanel.  Trong ví dụ trên, chúng ta tạo một JPanel mới với một FlowLayout và thiết lập alignment của nó là FlowLayout.RIGHT. Sau đó, chúng ta thêm hai JButton vào JPanel. Khi bạn chạy chương trình, bạn sẽ thấy rằng các nút sẽ được thêm vào từ phía phải của JPanel.      Trong ví dụ trên, chúng ta tạo một JPanel mới với một FlowLayout và thiết lập alignment của nó là FlowLayout.RIGHT. Sau đó, chúng ta thêm hai JButton vào JPanel. Khi bạn chạy chương trình, bạn sẽ thấy rằng các nút sẽ được thêm vào từ phía phải của JPanel.          ");
        jScrollPane1.setViewportView(txtpContent);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTime;
    private javax.swing.JEditorPane txtpContent;
    // End of variables declaration//GEN-END:variables
}
