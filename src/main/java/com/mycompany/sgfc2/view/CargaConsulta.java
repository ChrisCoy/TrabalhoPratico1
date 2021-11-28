package com.mycompany.sgfc2.view;

import com.mycompany.sgfc2.controller.DAO.CaminhaoDAO;
import com.mycompany.sgfc2.controller.DAO.CargaDAO;
import com.mycompany.sgfc2.model.Caminhao;
import com.mycompany.sgfc2.model.Carga;
import com.mycompany.sgfc2.model.NotaFiscal;
import com.mycompany.sgfc2.model.Produto;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class CargaConsulta extends javax.swing.JInternalFrame {

    private CargaDAO cargDao = new CargaDAO();
    private Carga cg = new Carga();
    private Caminhao c = new Caminhao();
    private CaminhaoDAO camDao = new CaminhaoDAO();

    public CargaConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConteudo = new javax.swing.JPanel();
        lblAutorizadoPor = new javax.swing.JLabel();
        lblConferidoPor = new javax.swing.JLabel();
        lblDataAutorizacao = new javax.swing.JLabel();
        lblDataConferencia = new javax.swing.JLabel();
        lblNotasFiscais = new javax.swing.JLabel();
        btnAddAutorizadoPor = new javax.swing.JButton();
        btnAddConferidoPor = new javax.swing.JButton();
        ftDataAut = new javax.swing.JFormattedTextField();
        ftDataConf = new javax.swing.JFormattedTextField();
        btnAddNotaFiscal = new javax.swing.JButton();
        lblCaminhao = new javax.swing.JLabel();
        btnAddCaminhao = new javax.swing.JButton();
        pnlPesquisa = new javax.swing.JPanel();
        btnPesquisa = new javax.swing.JButton();
        lblPesquisa = new javax.swing.JLabel();
        lblNotasFiscaisCount = new javax.swing.JLabel();
        btnVerAutorizado = new javax.swing.JButton();
        btnVerConferido = new javax.swing.JButton();
        btnVerCaminhao = new javax.swing.JButton();
        lblPesoTotal = new javax.swing.JLabel();
        tfPesoTotal = new javax.swing.JTextField();
        btnExibirConsulta = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_consultar.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Carga"));

        lblAutorizadoPor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAutorizadoPor.setText("Autorizado por:");

        lblConferidoPor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblConferidoPor.setText("Conferido por:");

        lblDataAutorizacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataAutorizacao.setText("Data da Autorização:");

        lblDataConferencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataConferencia.setText("Data de conferência:");

        lblNotasFiscais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNotasFiscais.setText("Notas Fiscais:");

        btnAddAutorizadoPor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddAutorizadoPor.setText("Selecionar");
        btnAddAutorizadoPor.setEnabled(false);
        btnAddAutorizadoPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAutorizadoPorActionPerformed(evt);
            }
        });

        btnAddConferidoPor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddConferidoPor.setText("Selecionar");
        btnAddConferidoPor.setEnabled(false);
        btnAddConferidoPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddConferidoPorActionPerformed(evt);
            }
        });

        ftDataAut.setEditable(false);
        ftDataAut.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftDataAut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ftDataConf.setEditable(false);
        ftDataConf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftDataConf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAddNotaFiscal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddNotaFiscal.setText("Adicionar");
        btnAddNotaFiscal.setEnabled(false);
        btnAddNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNotaFiscalActionPerformed(evt);
            }
        });

        lblCaminhao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCaminhao.setText("Caminhão:");

        btnAddCaminhao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddCaminhao.setText("Selecionar");
        btnAddCaminhao.setEnabled(false);
        btnAddCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCaminhaoActionPerformed(evt);
            }
        });

        pnlPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        btnPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisa.setText("Selecionar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        lblPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPesquisa.setText("Selecione a carga a ser consultada:");

        javax.swing.GroupLayout pnlPesquisaLayout = new javax.swing.GroupLayout(pnlPesquisa);
        pnlPesquisa.setLayout(pnlPesquisaLayout);
        pnlPesquisaLayout.setHorizontalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblPesquisa)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisa)
                .addContainerGap())
        );
        pnlPesquisaLayout.setVerticalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(btnPesquisa))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lblNotasFiscaisCount.setText("0 Notas Fiscais adicionadas");

        btnVerAutorizado.setText("Ver");
        btnVerAutorizado.setEnabled(false);
        btnVerAutorizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAutorizadoActionPerformed(evt);
            }
        });

        btnVerConferido.setText("Ver");
        btnVerConferido.setEnabled(false);
        btnVerConferido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerConferidoActionPerformed(evt);
            }
        });

        btnVerCaminhao.setText("Ver");
        btnVerCaminhao.setEnabled(false);
        btnVerCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCaminhaoActionPerformed(evt);
            }
        });

        lblPesoTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPesoTotal.setText("Peso total:");

        tfPesoTotal.setEditable(false);
        tfPesoTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnExibirConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExibirConsulta.setText("Exibir Consulta Visualmente");
        btnExibirConsulta.setEnabled(false);

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addComponent(pnlPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAutorizadoPor)
                            .addComponent(lblConferidoPor)
                            .addComponent(lblDataAutorizacao)
                            .addComponent(lblDataConferencia)
                            .addComponent(lblNotasFiscais)
                            .addComponent(lblCaminhao)
                            .addComponent(lblPesoTotal))
                        .addGap(38, 38, 38)
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftDataAut)
                            .addComponent(ftDataConf)
                            .addGroup(pnlConteudoLayout.createSequentialGroup()
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addComponent(btnAddCaminhao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnVerCaminhao))
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addComponent(btnAddNotaFiscal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNotasFiscaisCount))
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addComponent(btnAddAutorizadoPor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnVerAutorizado))
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addComponent(btnAddConferidoPor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnVerConferido))
                                    .addComponent(tfPesoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 14, Short.MAX_VALUE)))
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConteudoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExibirConsulta)
                .addGap(123, 123, 123))
        );

        pnlConteudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddAutorizadoPor, btnAddCaminhao, btnAddConferidoPor, btnAddNotaFiscal});

        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutorizadoPor)
                    .addComponent(btnAddAutorizadoPor)
                    .addComponent(btnVerAutorizado))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblConferidoPor)
                        .addComponent(btnAddConferidoPor))
                    .addComponent(btnVerConferido))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataAutorizacao)
                    .addComponent(ftDataAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataConferencia)
                    .addComponent(ftDataConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCaminhao)
                    .addComponent(btnAddCaminhao)
                    .addComponent(btnVerCaminhao))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNotasFiscais)
                    .addComponent(btnAddNotaFiscal)
                    .addComponent(lblNotasFiscaisCount))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesoTotal)
                    .addComponent(tfPesoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(pnlConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void btnAddAutorizadoPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAutorizadoPorActionPerformed
        SelecionarFuncModal slctFunc = new SelecionarFuncModal(null, true, cg.getAutorizadoPor(), 1);
        slctFunc.setVisible(true);

        if (cg.getAutorizadoPor().getCtps() != null) {
            btnAddAutorizadoPor.setText("Alterar");
        }
    }//GEN-LAST:event_btnAddAutorizadoPorActionPerformed

    private void btnAddConferidoPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddConferidoPorActionPerformed
        SelecionarFuncModal slctFunc = new SelecionarFuncModal(null, true, cg.getConferidoPor(), 2);
        slctFunc.setVisible(true);

        if (cg.getConferidoPor().getCtps() != null) {
            btnAddConferidoPor.setText("Alterar");
        }
    }//GEN-LAST:event_btnAddConferidoPorActionPerformed

    private void btnAddNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNotaFiscalActionPerformed

    }//GEN-LAST:event_btnAddNotaFiscalActionPerformed

    private void btnAddCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCaminhaoActionPerformed
        SelecionarCaminhaoModal slcCam = new SelecionarCaminhaoModal(null, true, c, 1);
        slcCam.setVisible(true);

        if (c.getMarca() != null) {
            btnAddCaminhao.setText("Alterar");
        }
    }//GEN-LAST:event_btnAddCaminhaoActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        try {
            float pesoTotal = 0;
            
            btnVerAutorizado.setEnabled(false);
            btnVerConferido.setEnabled(false);
            btnVerCaminhao.setEnabled(false);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            SelecionarCargaModal slctCgTela = new SelecionarCargaModal(null, true, 3);
            slctCgTela.setVisible(true);

            if (slctCgTela.getCg() != null) {
                cg = slctCgTela.getCg();

                if (cg.getAutorizadoPor() != null) {
                    btnAddAutorizadoPor.setText("Alterar");
                    btnVerAutorizado.setEnabled(true);
                }
                if (cg.getConferidoPor() != null) {
                    btnAddConferidoPor.setText("Alterar");
                    btnVerConferido.setEnabled(true);
                }
                if (cg.getDataAutorizacao() != null) {
                    ftDataAut.setText(cg.getDataAutorizacao().format(formatter));
                }
                if (cg.getDataConferencia() != null) {
                    ftDataConf.setText(cg.getDataConferencia().format(formatter));
                }

                c = camDao.getCaminhaoCarga(cg.getId());

                if (c != null) {
                    btnAddCaminhao.setText("Alterar");
                    btnVerCaminhao.setEnabled(true);
                }
                
                if (cg.getNotasFiscais() != null){
                    for (NotaFiscal n : cg.getNotasFiscais()){
                        for (Produto p : n.getProdutos()){
                            pesoTotal += p.getPeso();
                        }
                    }
                }
                
                tfPesoTotal.setText(Float.toString(pesoTotal));

                lblNotasFiscaisCount.setText(cg.getNotasFiscais().size() + " Notas Fiscais adicionadas");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnVerAutorizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAutorizadoActionPerformed
        verFuncionario verFunc = new verFuncionario(null, true, cg.getAutorizadoPor());
        verFunc.setVisible(true);
    }//GEN-LAST:event_btnVerAutorizadoActionPerformed

    private void btnVerConferidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerConferidoActionPerformed
        verFuncionario verFunc = new verFuncionario(null, true, cg.getConferidoPor());
        verFunc.setVisible(true);
    }//GEN-LAST:event_btnVerConferidoActionPerformed

    private void btnVerCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCaminhaoActionPerformed
        verCaminhao verCam = new verCaminhao(null, true, c);
        verCam.setVisible(true);
    }//GEN-LAST:event_btnVerCaminhaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAutorizadoPor;
    private javax.swing.JButton btnAddCaminhao;
    private javax.swing.JButton btnAddConferidoPor;
    private javax.swing.JButton btnAddNotaFiscal;
    private javax.swing.JButton btnExibirConsulta;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnVerAutorizado;
    private javax.swing.JButton btnVerCaminhao;
    private javax.swing.JButton btnVerConferido;
    private javax.swing.JFormattedTextField ftDataAut;
    private javax.swing.JFormattedTextField ftDataConf;
    private javax.swing.JLabel lblAutorizadoPor;
    private javax.swing.JLabel lblCaminhao;
    private javax.swing.JLabel lblConferidoPor;
    private javax.swing.JLabel lblDataAutorizacao;
    private javax.swing.JLabel lblDataConferencia;
    private javax.swing.JLabel lblNotasFiscais;
    private javax.swing.JLabel lblNotasFiscaisCount;
    private javax.swing.JLabel lblPesoTotal;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlPesquisa;
    private javax.swing.JTextField tfPesoTotal;
    // End of variables declaration//GEN-END:variables
}
