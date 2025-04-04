/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Panel.Grupal;

import Control.ControlGeneral;
import Interface.PanelNavegable;

/**
 *
 * @author skyro
 */
public class InicioSesion extends javax.swing.JPanel implements PanelNavegable {

    private ControlGeneral control;
    /**
     * Creates new form InicioSesion
     */
    public InicioSesion(ControlGeneral control) {
        this.control = control;
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
        jLabel1 = new javax.swing.JLabel();
        btnMesero = new javax.swing.JButton();
        btnAdministrador = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(207, 252, 255));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(207, 252, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setText("Inicio de Sesión");
        jPanel1.add(jLabel1);

        btnMesero.setBackground(new java.awt.Color(44, 44, 44));
        btnMesero.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btnMesero.setForeground(new java.awt.Color(255, 255, 255));
        btnMesero.setText("Mesero");
        btnMesero.setBorder(null);
        btnMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeseroActionPerformed(evt);
            }
        });

        btnAdministrador.setBackground(new java.awt.Color(44, 44, 44));
        btnAdministrador.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btnAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministrador.setText("Administrador");
        btnAdministrador.setBorder(null);
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(207, 252, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Iniciar sesión como:");
        jPanel2.add(jLabel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(btnMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(261, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMeseroActionPerformed

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        control.mostrarMenuPrincipalAdmin();
    }//GEN-LAST:event_btnAdministradorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnMesero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void nagevar(Object data) {
    }
}
