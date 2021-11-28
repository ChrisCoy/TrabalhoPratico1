package com.mycompany.sgfc2.view;

import com.mycompany.sgfc2.controller.DAO.CaminhaoDAO;
import com.mycompany.sgfc2.controller.DAO.CargaDAO;
import com.mycompany.sgfc2.controller.DAO.NotaFiscalDAO;
import com.mycompany.sgfc2.model.Caminhao;
import com.mycompany.sgfc2.model.Carga;
import com.mycompany.sgfc2.model.NotaFiscal;
import com.mycompany.sgfc2.model.Produto;
import java.awt.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CargaAlterar extends javax.swing.JInternalFrame {

    private CargaDAO cargDao = new CargaDAO();
    private Carga cg = new Carga();
    private Caminhao c = new Caminhao();
    private CaminhaoDAO camDao = new CaminhaoDAO();
    private NotaFiscalDAO nfDao = new NotaFiscalDAO();
    private boolean foiRemovido = false;
    private float pesoTotal = 0;

    public CargaAlterar() {
        initComponents();
    }

    private boolean verificaEntregue(ArrayList<NotaFiscal> nf) {
        for (NotaFiscal n : nf) {
            if (n.getDataEntrega() == null) {
                return true;
            }
        }
        return false;
    }

    private void verificaPeso(Carga cargaTemp) {
        pesoTotal = 0;
        if (cargaTemp.getNotasFiscais() != null) {
            for (NotaFiscal n : cargaTemp.getNotasFiscais()) {
                for (Produto p : n.getProdutos()) {
                    pesoTotal += p.getPeso();
                }
            }
        }
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

    private void habilitaTela(boolean b) {
        btnAddAutorizadoPor.setEnabled(b);
        btnAddConferidoPor.setEnabled(b);
        btnAddCaminhao.setEnabled(b);
        ftDataAut.setEnabled(b);
        ftDataConf.setEnabled(b);
        btnAddNotaFiscal.setEnabled(b);
        btnConfirmar.setEnabled(b);
    }

    private void resetaTela() {
        pesoTotal = 0;
        btnAddAutorizadoPor.setText("Selecionar");
        btnAddConferidoPor.setText("Selecionar");
        btnAddCaminhao.setText("Selecionar");
        lblNotasFiscaisCount.setText("0 Notas Fiscais adicionadas");
        foiRemovido = false;
        cg = new Carga();
        c = new Caminhao();

        for (Component cc : pnlConteudo.getComponents()) {
            if (cc instanceof JTextField || cc instanceof JFormattedTextField) {
                ((JFormattedTextField) cc).setText("");
            }
        }
        habilitaTela(false);
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
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
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
        btnRMVCaminhao = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_alterar.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar Carga"));

        lblAutorizadoPor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAutorizadoPor.setText("Autorizado por:");

        lblConferidoPor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblConferidoPor.setText("Conferido por:");

        lblDataAutorizacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataAutorizacao.setText("Data da Autorização:");

        lblDataConferencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataConferencia.setText("Data de Conferência:");

        lblNotasFiscais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNotasFiscais.setText("Notas Fiscais:");

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

        ftDataAut.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftDataAut.setEnabled(false);
        ftDataAut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ftDataAut.setName("data da autorização"); // NOI18N

        ftDataConf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftDataConf.setEnabled(false);
        ftDataConf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ftDataConf.setName("data de conferência"); // NOI18N

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
        lblPesquisa.setText("Selecione a carga a ser alterada:");

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

        btnRMVCaminhao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRMVCaminhao.setText("Remover");
        btnRMVCaminhao.setEnabled(false);
        btnRMVCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRMVCaminhaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnConfirmar)
                        .addGap(82, 82, 82)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAutorizadoPor)
                            .addComponent(lblConferidoPor)
                            .addComponent(lblDataAutorizacao)
                            .addComponent(lblDataConferencia)
                            .addComponent(lblNotasFiscais)
                            .addComponent(lblCaminhao))
                        .addGap(38, 38, 38)
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftDataAut)
                            .addComponent(ftDataConf)
                            .addGroup(pnlConteudoLayout.createSequentialGroup()
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddConferidoPor)
                                    .addComponent(btnAddAutorizadoPor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE))
                            .addGroup(pnlConteudoLayout.createSequentialGroup()
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addComponent(btnAddNotaFiscal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNotasFiscaisCount))
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addComponent(btnAddCaminhao)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRMVCaminhao)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(43, 43, 43))
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlConteudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddAutorizadoPor, btnAddCaminhao, btnAddConferidoPor, btnAddNotaFiscal, btnCancelar, btnConfirmar});

        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutorizadoPor)
                    .addComponent(btnAddAutorizadoPor))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConferidoPor)
                    .addComponent(btnAddConferidoPor))
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
                    .addComponent(btnRMVCaminhao))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNotasFiscais)
                    .addComponent(btnAddNotaFiscal)
                    .addComponent(lblNotasFiscaisCount))
                .addGap(50, 50, 50)
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
                .addContainerGap(25, Short.MAX_VALUE))
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
            if (ftDataAut.getText() != null) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate ldAut = LocalDate.parse(ftDataAut.getText(), formatter);
                cg.setDataAutorizacao(ldAut);
            }
            if (ftDataConf.getText() != null) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate ldConf = LocalDate.parse(ftDataConf.getText(), formatter);
                cg.setDataConferencia(ldConf);
            }
            if (btnAddCaminhao.getText() == "Alterar") {
                if (foiRemovido) {
                    c.setCarga(null);
                    camDao.updateCarga(null, c.getId());
                } else {
                    if (c.getCarga() != null) {
                        if (c.getCarga().getId() != cg.getId()) {
                            cargDao.alterar(cg, cg.getId());
                            c.setCarga(cg);
                            camDao.updateCarga(c, c.getId());
                        }
                    } else {
                        cargDao.alterar(cg, cg.getId());
                        c.setCarga(cg);
                        camDao.updateCarga(c, c.getId());
                    }

                }
            }

            for (NotaFiscal n : cg.getNotasFiscais()) {
                n.setDataExpedicao(LocalDate.now());
                nfDao.alterar(n, n.getNumero());
            }

            cargDao.alterar(cg, cg.getId());

            resetaTela();
            JOptionPane.showMessageDialog(this, "Carga alterada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        resetaTela();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
        NotaFiscal nf = new NotaFiscal();
        float pesoTemp = 0;

        SelecionarNotaFiscalModal slctNF = new SelecionarNotaFiscalModal(null, true, nf, cg);
        slctNF.setVisible(true);

        verificaPeso(cg);

        if (nf != null) {
            for (Produto p : nf.getProdutos()) {
                pesoTemp += p.getPeso();
            }
        }

        if (c != null) {
            if (c.getMarca() != null) {
                if (pesoTotal + pesoTemp <= c.getCapacidadeCarga()) {
                    if (slctNF.isModificado()) {
                        cg.getNotasFiscais().add(nf);
                        lblNotasFiscaisCount.setText(cg.getNotasFiscais().size() + " Notas Fiscais adicionadas");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "O caminhão não suporta o peso total dos produtos nas notas fiscais!",
                            "Erro", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else if (slctNF.isModificado()) {
            cg.getNotasFiscais().add(nf);
            lblNotasFiscaisCount.setText(cg.getNotasFiscais().size() + " Notas Fiscais adicionadas");
        }

    }//GEN-LAST:event_btnAddNotaFiscalActionPerformed

    private void btnAddCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCaminhaoActionPerformed
        if (c == null) {
            c = new Caminhao();
        }

        SelecionarCaminhaoModal slcCam = new SelecionarCaminhaoModal(null, true, c, 1);
        slcCam.setVisible(true);

        verificaPeso(cg);

        if (slcCam.isSelecionado()) {
            if (pesoTotal > c.getCapacidadeCarga()) {
                JOptionPane.showMessageDialog(rootPane, "O caminhão não suporta o peso total dos produtos nas notas fiscais!",
                        "Erro", JOptionPane.WARNING_MESSAGE);
                c = new Caminhao();
                btnAddCaminhao.setText("Selecionar");
            } else if (slcCam.isSelecionado()) {
                btnAddCaminhao.setText("Alterar");
                btnRMVCaminhao.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnAddCaminhaoActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            SelecionarCargaModal slctCgTela = new SelecionarCargaModal(null, true, 3);
            slctCgTela.setVisible(true);

            if (slctCgTela.getCg() != null) {
                cg = slctCgTela.getCg();

                if (cg.getAutorizadoPor() != null) {
                    btnAddAutorizadoPor.setText("Alterar");
                }
                if (cg.getConferidoPor() != null) {
                    btnAddConferidoPor.setText("Alterar");
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
                    btnRMVCaminhao.setEnabled(true);
                }

                lblNotasFiscaisCount.setText(cg.getNotasFiscais().size() + " Notas Fiscais adicionadas");

                if (verificaEntregue(cg.getNotasFiscais())) {
                    habilitaTela(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Essa carga já foi entregue, logo não é possivel altera-lá",
                            "Erro", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnRMVCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRMVCaminhaoActionPerformed
        btnAddCaminhao.setText("Selecionar");
        btnRMVCaminhao.setEnabled(false);
        foiRemovido = true;
    }//GEN-LAST:event_btnRMVCaminhaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAutorizadoPor;
    private javax.swing.JButton btnAddCaminhao;
    private javax.swing.JButton btnAddConferidoPor;
    private javax.swing.JButton btnAddNotaFiscal;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnRMVCaminhao;
    private javax.swing.JFormattedTextField ftDataAut;
    private javax.swing.JFormattedTextField ftDataConf;
    private javax.swing.JLabel lblAutorizadoPor;
    private javax.swing.JLabel lblCaminhao;
    private javax.swing.JLabel lblConferidoPor;
    private javax.swing.JLabel lblDataAutorizacao;
    private javax.swing.JLabel lblDataConferencia;
    private javax.swing.JLabel lblNotasFiscais;
    private javax.swing.JLabel lblNotasFiscaisCount;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlPesquisa;
    // End of variables declaration//GEN-END:variables
}
