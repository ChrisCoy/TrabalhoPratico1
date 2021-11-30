package com.mycompany.sgfc2.view.caminhao;

import com.mycompany.sgfc2.controller.DAO.CaminhaoDAO;
import com.mycompany.sgfc2.model.Caminhao;
import com.mycompany.sgfc2.view.selecionar.SelecionarCaminhaoModal;
import com.mycompany.sgfc2.view.selecionar.SelecionarMotoristaModal;
import java.awt.Component;
import java.time.format.DateTimeFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CaminhaoRemover extends javax.swing.JInternalFrame {

    private CaminhaoDAO camDao = new CaminhaoDAO();
    private Caminhao cam = new Caminhao();

    public CaminhaoRemover() {
        initComponents();
    }

    private void resetaTela() {
        btgDisponivel.clearSelection();
        btnConfirmar.setEnabled(false);
        btnSelecionarMot.setText("Confirmar");
        btnSelecionarMot.setEnabled(false);
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
        pnlPesquisa = new javax.swing.JPanel();
        btnPesquisa = new javax.swing.JButton();
        lblPesquisa = new javax.swing.JLabel();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_remover.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Remover Caminhão"));

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
        btnConfirmar.setEnabled(false);
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
        tfMarca.setEnabled(false);

        tfQuilometragem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfQuilometragem.setEnabled(false);

        tfCapacidadeCarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCapacidadeCarga.setEnabled(false);

        lblUltimaRevisao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUltimaRevisao.setText("Ultima revisão:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblMotorista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMotorista.setText("Motorista:");

        lblDisponivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDisponivel.setText("Disponível:");

        btnSelecionarMot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSelecionarMot.setText("Selecionar");
        btnSelecionarMot.setEnabled(false);
        btnSelecionarMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarMotActionPerformed(evt);
            }
        });

        btgDisponivel.add(chbSim);
        chbSim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chbSim.setText("Sim");
        chbSim.setEnabled(false);

        btgDisponivel.add(chbNão);
        chbNão.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chbNão.setText("Não");
        chbNão.setEnabled(false);

        ftAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        ftAno.setEnabled(false);
        ftAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ftRevisao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftRevisao.setEnabled(false);
        ftRevisao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pnlPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Caminhão"));

        btnPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisa.setText("Selecione");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        lblPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPesquisa.setText("Selecione o Caminhao a ser removido:");

        javax.swing.GroupLayout pnlPesquisaLayout = new javax.swing.GroupLayout(pnlPesquisa);
        pnlPesquisa.setLayout(pnlPesquisaLayout);
        pnlPesquisaLayout.setHorizontalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblPesquisa)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisa)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlPesquisaLayout.setVerticalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisa)
                    .addComponent(lblPesquisa))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnConfirmar)
                .addGap(82, 82, 82)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConteudoLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca)
                            .addComponent(lblAno)
                            .addComponent(lblQuilometragem)
                            .addComponent(lblCapacidadeCarga)
                            .addComponent(lblUltimaRevisao)
                            .addComponent(lblMotorista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSelecionarMot, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfCapacidadeCarga, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfQuilometragem, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftAno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ftRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addComponent(lblDisponivel)
                        .addGap(36, 36, 36)
                        .addComponent(chbSim)
                        .addGap(41, 41, 41)
                        .addComponent(chbNão)))
                .addContainerGap())
        );
        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotorista)
                    .addComponent(btnSelecionarMot))
                .addGap(11, 11, 11)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisponivel)
                    .addComponent(chbSim)
                    .addComponent(chbNão))
                .addGap(27, 27, 27)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addComponent(pnlConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            camDao.apagar(cam.getId());
            resetaTela();
            JOptionPane.showMessageDialog(rootPane, "Caminhao removido com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
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

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        try {
            SelecionarCaminhaoModal slcTelaCaminhao = new SelecionarCaminhaoModal(null, true, cam, 2);
            slcTelaCaminhao.setVisible(true);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            tfMarca.setText(cam.getMarca());
            ftAno.setText(String.valueOf(cam.getAnoModelo()));
            tfQuilometragem.setText(Integer.toString(cam.getQuilometragem()));
            tfCapacidadeCarga.setText(Float.toString(cam.getCapacidadeCarga()));

            if (cam.getUltimaRevisao() != null) {
                ftRevisao.setText(cam.getUltimaRevisao().format(formatter));
            }

            btnSelecionarMot.setText("Alterar");

            if (cam.isDisponivel()) {
                chbSim.setSelected(true);
            } else {
                chbNão.setSelected(true);
            }

            btnConfirmar.setEnabled(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgDisponivel;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnPesquisa;
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
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblQuilometragem;
    private javax.swing.JLabel lblUltimaRevisao;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlPesquisa;
    private javax.swing.JTextField tfCapacidadeCarga;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfQuilometragem;
    // End of variables declaration//GEN-END:variables
}
