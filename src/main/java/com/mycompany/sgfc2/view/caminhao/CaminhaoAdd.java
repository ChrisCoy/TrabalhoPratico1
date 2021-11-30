package com.mycompany.sgfc2.view.caminhao;

import com.mycompany.sgfc2.controller.DAO.CaminhaoDAO;
import com.mycompany.sgfc2.model.Caminhao;
import com.mycompany.sgfc2.view.selecionar.SelecionarMotoristaModal;
import java.awt.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CaminhaoAdd extends javax.swing.JInternalFrame {

    private CaminhaoDAO camDao = new CaminhaoDAO();
    private Caminhao cam = new Caminhao();

    public CaminhaoAdd() {
        initComponents();
    }

    private void verificaCampos() throws Exception {
        for (Component c : pnlConteudo.getComponents()) {
            if (c instanceof JTextField || c instanceof JFormattedTextField) {
                if (((JTextField) c).getText().isBlank()) {
                    throw new Exception("Campo" + c.getName() +"vazio");
                }
            }
        }
    }

    private void resetaTela() {
        btgDisponivel.clearSelection();
        for (Component c : pnlConteudo.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            } else if (c instanceof JFormattedTextField) {
                ((JFormattedTextField) c).setText("");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgDisponivel = new javax.swing.ButtonGroup();
        pnlConteudo = new javax.swing.JPanel();
        lblAno = new javax.swing.JLabel();
        lblQuilometragem = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblCapacidadeCarga = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfMarca = new javax.swing.JTextField();
        tfQuilometragem = new javax.swing.JTextField();
        tfCapacidadeCarga = new javax.swing.JTextField();
        lblUltimaRevisao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMotorista = new javax.swing.JLabel();
        lblDisponivel = new javax.swing.JLabel();
        btnSelecionarMot = new javax.swing.JButton();
        chbSim = new javax.swing.JCheckBox();
        chbNão = new javax.swing.JCheckBox();
        ftAno = new javax.swing.JFormattedTextField();
        ftRevisao = new javax.swing.JFormattedTextField();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_adicionar.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Caminhão"));

        lblAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAno.setText("Ano:");

        lblQuilometragem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuilometragem.setText("Quilometragem:");

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca.setText("Marca:");

        lblCapacidadeCarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCapacidadeCarga.setText("Capacidade de Carga:");

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tfMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfMarca.setToolTipText("");
        tfMarca.setName("marca"); // NOI18N

        tfQuilometragem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfQuilometragem.setName("quilometragem"); // NOI18N

        tfCapacidadeCarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCapacidadeCarga.setName("capacidade de carga"); // NOI18N

        lblUltimaRevisao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUltimaRevisao.setText("Ultima revisão:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblMotorista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMotorista.setText("Motorista:");

        lblDisponivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDisponivel.setText("Disponível:");

        btnSelecionarMot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSelecionarMot.setText("Selecionar");
        btnSelecionarMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarMotActionPerformed(evt);
            }
        });

        btgDisponivel.add(chbSim);
        chbSim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chbSim.setText("Sim");

        btgDisponivel.add(chbNão);
        chbNão.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chbNão.setText("Não");

        ftAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        ftAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ftAno.setName("ano"); // NOI18N

        ftRevisao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftRevisao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ftRevisao.setName("ultima revisão"); // NOI18N

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca)
                            .addComponent(lblAno)
                            .addComponent(lblQuilometragem)
                            .addComponent(lblCapacidadeCarga)
                            .addComponent(jLabel6)
                            .addComponent(lblUltimaRevisao)
                            .addComponent(lblMotorista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSelecionarMot, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfCapacidadeCarga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(tfQuilometragem, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftAno, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(ftRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlConteudoLayout.createSequentialGroup()
                                .addComponent(lblDisponivel)
                                .addGap(36, 36, 36)
                                .addComponent(chbSim))
                            .addComponent(btnConfirmar))
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConteudoLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(btnCancelar))
                            .addGroup(pnlConteudoLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(chbNão)))))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(ftAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuilometragem)
                    .addComponent(tfQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapacidadeCarga)
                    .addComponent(tfCapacidadeCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUltimaRevisao)
                    .addComponent(ftRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotorista)
                    .addComponent(btnSelecionarMot))
                .addGap(11, 11, 11)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisponivel)
                    .addComponent(chbSim)
                    .addComponent(chbNão))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            verificaCampos();
            cam.setMarca(tfMarca.getText());
            cam.setAnoModelo(Integer.parseInt(ftAno.getText()));
            cam.setQuilometragem(Integer.parseInt(tfQuilometragem.getText()));
            cam.setCapacidadeCarga(Float.parseFloat(tfCapacidadeCarga.getText()));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ld = LocalDate.parse(ftRevisao.getText(), formatter);
            cam.setUltimaRevisao(ld);

            if (chbSim.isSelected()) {
                cam.setDisponivel(true);
            } else {
                cam.setDisponivel(false);
            }

            if (!cam.getMotorista().getCtps().isEmpty()) {
                camDao.incluir(cam);
                resetaTela();
                JOptionPane.showMessageDialog(rootPane, "Caminhao adicionado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSelecionarMotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarMotActionPerformed
        SelecionarMotoristaModal slcMot = new SelecionarMotoristaModal(null, true, cam.getMotorista());
        slcMot.setVisible(true);

        if (cam.getMotorista() != null) {
            btnSelecionarMot.setText("Alterar");
        }
    }//GEN-LAST:event_btnSelecionarMotActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgDisponivel;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSelecionarMot;
    private javax.swing.JCheckBox chbNão;
    private javax.swing.JCheckBox chbSim;
    private javax.swing.JFormattedTextField ftAno;
    private javax.swing.JFormattedTextField ftRevisao;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCapacidadeCarga;
    private javax.swing.JLabel lblDisponivel;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMotorista;
    private javax.swing.JLabel lblQuilometragem;
    private javax.swing.JLabel lblUltimaRevisao;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JTextField tfCapacidadeCarga;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfQuilometragem;
    // End of variables declaration//GEN-END:variables
}
