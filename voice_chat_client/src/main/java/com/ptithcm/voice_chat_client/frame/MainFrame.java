/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.voice_chat_client.frame;

import com.ptithcm.voice_chat_client.enums.ResponseStatus;
import com.ptithcm.voice_chat_client.exceptions.InvalidInputException;
import com.ptithcm.voice_chat_client.models.ClientInfo;
import com.ptithcm.voice_chat_client.models.Empty;
import com.ptithcm.voice_chat_client.models.Fetch;
import com.ptithcm.voice_chat_client.models.Packet;
import com.ptithcm.voice_chat_client.models.Request;
import com.ptithcm.voice_chat_client.models.Response;
import com.ptithcm.voice_chat_client.models.TCPClientSocket;
import com.ptithcm.voice_chat_client.store.SocketStore;
import com.ptithcm.voice_chat_client.store.ViewStore;
import com.ptithcm.voice_chat_client.validations.ConnectToServerForm;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author minhd
 */
public class MainFrame extends javax.swing.JFrame {
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (SocketStore.tcpClientSocket != null) {
                    SocketStore.tcpClientSocket.send(new Request(new Packet("disconnect", SocketStore.tcpClientSocket.getClientInfo().getUuid())));
                }
            }
        });
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
        txtHost = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnConnect = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Voice Chat Client");
        setIconImage(new ImageIcon(getClass().getResource("/icons/_512x512/voice-mail.png")).getImage());

        jLabel1.setText("Host:");

        jLabel2.setText("Port:");

        jLabel3.setText("Name:");

        btnConnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_24x24/arrow.png"))); // NOI18N
        btnConnect.setText("Connect");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        jLabel4.setText("Password:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/_64x64/chat.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPort, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHost, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(txtName)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
//        Validate form
        try {
            new ConnectToServerForm(this).validate();
        } catch (InvalidInputException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
//            Form pending
            txtHost.setEnabled(false);
            txtPort.setEnabled(false);
            txtPassword.setEnabled(false);
            btnConnect.setIcon(new ImageIcon(getClass().getResource("/icons/_24x24/loading.gif")));
            btnConnect.setText("Connecting...");
            
//            Establish a connection to the server
            if (SocketStore.tcpClientSocket == null) {
                TCPClientSocket tcpcs = new TCPClientSocket(new Socket(txtHost.getText(), Integer.parseInt(txtPort.getText())));
                SocketStore.tcpClientSocket = tcpcs;
                
//                Key exchange
                Response<String> tcpKeyExchangeResponse = new Fetch<String, String>(new Request(new Packet("TCP-Key-Exchange", Base64.getEncoder().encodeToString(SocketStore.tcpClientSocket.getRSAKeyPair().getPublic().getEncoded()))), String.class).await().getResponse();
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                SocketStore.tcpClientSocket.setCommunicationKey(keyFactory.generatePublic(new X509EncodedKeySpec(Base64.getDecoder().decode(tcpKeyExchangeResponse.getBody()))));
            
//                Update profile
                new Fetch<String, Empty>(new Request(new Packet("Update-Profile", txtName.getText())), Empty.class).await();
            }

//            Authentication
            Response<ClientInfo> authResponse = new Fetch<String, ClientInfo>(new Request(new Packet("Authentication", new String(txtPassword.getPassword()))), ClientInfo.class).await().getResponse();
            SocketStore.tcpClientSocket.setClientInfo(authResponse.getBody());
            if (authResponse.getStatusCode() == ResponseStatus.OK.getValue()) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        ChatFrame chatFrame = new ChatFrame();
                        ViewStore.chatFrame = chatFrame;
                        chatFrame.setLocationRelativeTo(null);
                        chatFrame.setVisible(true);
                    }
                });
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Connection failed", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
//            Form completed
            txtHost.setEnabled(true);
            txtPort.setEnabled(true);
            txtPassword.setEnabled(true);
            btnConnect.setIcon(new ImageIcon(getClass().getResource("/icons/_24x24/arrow.png")));
            btnConnect.setText("Connect");
        }
    }//GEN-LAST:event_btnConnectActionPerformed

//    Getters and setters
    public JTextField getTxtHost() {
        return txtHost;
    }

    public void setTxtHost(JTextField txtHost) {
        this.txtHost = txtHost;
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

    public JTextField getTxtName() {
        return txtName;
    }

    public void setTxtName(JTextField txtName) {
        this.txtName = txtName;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables
}
