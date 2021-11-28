package com.mycompany.sgfc2.view;

import com.mycompany.sgfc2.controller.DAO.CaminhaoDAO;
import com.mycompany.sgfc2.model.Caminhao;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class CaminhaoConsulta extends javax.swing.JInternalFrame {

    private CaminhaoDAO camDao = new CaminhaoDAO();
    private Caminhao cam = new Caminhao();

    public CaminhaoConsulta() {
        initComponents();
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
        btnVerCaminhao = new javax.swing.JButton();
        btnExibirConsulta = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_consultar.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Caminhão"));

        lblAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAno.setText("Ano:");

        lblQuilometragem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuilometragem.setText("Quilometragem:");

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca.setText("Marca:");

        lblCapacidadeCarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCapacidadeCarga.setText("Capacidade de Carga:");

        tfMarca.setEditable(false);
        tfMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfQuilometragem.setEditable(false);
        tfQuilometragem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfCapacidadeCarga.setEditable(false);
        tfCapacidadeCarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        ftAno.setEditable(false);
        ftAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        ftAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ftRevisao.setEditable(false);
        ftRevisao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
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
        lblPesquisa.setText("Selecione o Caminhao a ser consultado:");

        javax.swing.GroupLayout pnlPesquisaLayout = new javax.swing.GroupLayout(pnlPesquisa);
        pnlPesquisa.setLayout(pnlPesquisaLayout);
        pnlPesquisaLayout.setHorizontalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblPesquisa)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisa)
                .addContainerGap(37, Short.MAX_VALUE))
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

        btnVerCaminhao.setText("ver");
        btnVerCaminhao.setEnabled(false);
        btnVerCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCaminhaoActionPerformed(evt);
            }
        });

        btnExibirConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExibirConsulta.setText("Exibir Consulta Visualmente");
        btnExibirConsulta.setEnabled(false);

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                                    .addComponent(btnSelecionarMot)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnVerCaminhao))
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
                        .addComponent(chbNão))
                    .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConteudoLayout.createSequentialGroup()
                        .addComponent(btnExibirConsulta)
                        .addGap(125, 125, 125)))
                .addGap(35, 35, 35))
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
                    .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSelecionarMot)
                        .addComponent(btnVerCaminhao)))
                .addGap(10, 10, 10)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisponivel)
                    .addComponent(chbSim)
                    .addComponent(chbNão))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnExibirConsulta)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            btnVerCaminhao.setEnabled(true);

            if (cam.isDisponivel()) {
                chbSim.setSelected(true);
            } else {
                chbNão.setSelected(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnVerCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCaminhaoActionPerformed
        verMotorista verMot = new verMotorista(null, true, cam.getMotorista());
        verMot.setVisible(true);
    }//GEN-LAST:event_btnVerCaminhaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgDisponivel;
    private javax.swing.JButton btnExibirConsulta;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSelecionarMot;
    private javax.swing.JButton btnVerCaminhao;
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
