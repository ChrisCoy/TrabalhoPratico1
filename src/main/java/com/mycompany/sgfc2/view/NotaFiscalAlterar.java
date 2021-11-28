package com.mycompany.sgfc2.view;

import com.mycompany.sgfc2.controller.DAO.NotaFiscalDAO;
import com.mycompany.sgfc2.model.NotaFiscal;
import java.awt.Component;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NotaFiscalAlterar extends javax.swing.JInternalFrame {

    private NotaFiscal nf;
    private NotaFiscalDAO nfDao = new NotaFiscalDAO();

    public NotaFiscalAlterar() {
        initComponents();
    }

    private void verificaCampos() throws Exception {
        if (btnAddEndOrigem.getText() != "Alterar"){
            throw new Exception("endereço de origem vazio");
        }
        if (btnAddEndDestino.getText() != "Alterar"){
            throw new Exception("endereço de destino vazio");
        }
        if (btnSelecFunc.getText() != "Alterar"){
            throw new Exception("ajudante não selecionado");
        }
        if (nf.getProdutos().size() == 0){
            throw new Exception("nenhum Produto adicionado");
        }
    }

    private void habilitaCampos(boolean b) {
        for (Component c : pnlConteudo.getComponents()) {
            if (c instanceof JTextField || c instanceof JButton || c instanceof JFormattedTextField) {
                c.setEnabled(b);
            }
        }
    }

    private void resetaTela() {
        nf = null;
        lblProdQntd.setText("0 Produtos adicionados");
        tfPesquisa.setEnabled(true);
        jButton3.setEnabled(true);
        btnConfirmar.setEnabled(false);
        habilitaCampos(false);

        for (Component c : pnlConteudo.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            } else if (c instanceof JFormattedTextField) {
                ((JFormattedTextField) c).setText("");
            } else if (c instanceof JButton) {
                if (((JButton) c).getText().equals("Alterar")) {
                    ((JButton) c).setText("Adicionar");
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConteudo = new javax.swing.JPanel();
        lblEnderecoOrigem = new javax.swing.JLabel();
        lblEnderecoDestino = new javax.swing.JLabel();
        lblNumeroNotaFiscal = new javax.swing.JLabel();
        lblDataExpedicao = new javax.swing.JLabel();
        lblDataEntrega = new javax.swing.JLabel();
        lblAjudante = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfNum = new javax.swing.JTextField();
        btnAddEndOrigem = new javax.swing.JButton();
        btnAddEndDestino = new javax.swing.JButton();
        ftDataExp = new javax.swing.JFormattedTextField();
        ftDataEntreg = new javax.swing.JFormattedTextField();
        lblProdutos = new javax.swing.JLabel();
        btnAddProd = new javax.swing.JButton();
        lblProdQntd = new javax.swing.JLabel();
        btnSelecFunc = new javax.swing.JButton();
        pnlPesquisa = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        tfPesquisa = new javax.swing.JTextField();
        lblPesquisa = new javax.swing.JLabel();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_alterar.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar Nota Fiscal"));

        lblEnderecoOrigem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnderecoOrigem.setText("Endereco de origem: ");

        lblEnderecoDestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnderecoDestino.setText("Endereco de destino: ");

        lblNumeroNotaFiscal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumeroNotaFiscal.setText("Número da Nota Fiscal:");

        lblDataExpedicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataExpedicao.setText("Data de expedição:");

        lblDataEntrega.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataEntrega.setText("Data de entrega:");

        lblAjudante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAjudante.setText("Ajudante carga/descarga: ");

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

        tfNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNum.setEnabled(false);
        tfNum.setName("Nota Fiscal"); // NOI18N

        btnAddEndOrigem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddEndOrigem.setText("Adicionar");
        btnAddEndOrigem.setEnabled(false);
        btnAddEndOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEndOrigemActionPerformed(evt);
            }
        });

        btnAddEndDestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddEndDestino.setText("Adicionar");
        btnAddEndDestino.setEnabled(false);
        btnAddEndDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEndDestinoActionPerformed(evt);
            }
        });

        ftDataExp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftDataExp.setEnabled(false);
        ftDataExp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ftDataExp.setName("data de expedição"); // NOI18N

        ftDataEntreg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftDataEntreg.setEnabled(false);
        ftDataEntreg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ftDataEntreg.setName("data de entrega"); // NOI18N

        lblProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProdutos.setText("Produtos:");

        btnAddProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddProd.setText("Adicionar");
        btnAddProd.setEnabled(false);
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });

        lblProdQntd.setText("0 Produtos adicionados");

        btnSelecFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSelecFunc.setText("Adicionar");
        btnSelecFunc.setEnabled(false);
        btnSelecFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecFuncActionPerformed(evt);
            }
        });

        pnlPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tfPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPesquisa.setText("Número da Nota Fiscal:");

        javax.swing.GroupLayout pnlPesquisaLayout = new javax.swing.GroupLayout(pnlPesquisa);
        pnlPesquisa.setLayout(pnlPesquisaLayout);
        pnlPesquisaLayout.setHorizontalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPesquisa)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap())
        );
        pnlPesquisaLayout.setVerticalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(jButton3)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConteudoLayout.createSequentialGroup()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumeroNotaFiscal)
                                    .addComponent(lblEnderecoOrigem)
                                    .addComponent(lblEnderecoDestino)
                                    .addComponent(lblDataExpedicao))
                                .addGap(41, 41, 41)
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftDataExp)
                                    .addComponent(tfNum)
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAddEndDestino)
                                            .addComponent(btnAddEndOrigem))
                                        .addGap(0, 172, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataEntrega)
                                    .addComponent(lblAjudante)
                                    .addComponent(lblProdutos))
                                .addGap(20, 20, 20)
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftDataEntreg)
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addComponent(btnSelecFunc)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addComponent(btnAddProd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblProdQntd, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnConfirmar)
                        .addGap(82, 82, 82)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlConteudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddEndDestino, btnAddEndOrigem, btnAddProd, btnCancelar, btnConfirmar, btnSelecFunc});

        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroNotaFiscal)
                    .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoOrigem)
                    .addComponent(btnAddEndOrigem))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnderecoDestino)
                            .addComponent(btnAddEndDestino))
                        .addGap(18, 18, 18)
                        .addComponent(lblDataExpedicao))
                    .addComponent(ftDataExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataEntrega)
                    .addComponent(ftDataEntreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAjudante)
                    .addComponent(btnSelecFunc))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdutos)
                    .addComponent(btnAddProd)
                    .addComponent(lblProdQntd))
                .addGap(36, 36, 36)
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

    private void btnAddEndOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEndOrigemActionPerformed
        AddEndModal endOrigModal = new AddEndModal(null, true, nf.getOrigem());
        endOrigModal.setVisible(true);

        if (nf.getOrigem().getRua() != null) {
            btnAddEndOrigem.setText("Alterar");
        }
    }//GEN-LAST:event_btnAddEndOrigemActionPerformed

    private void btnAddEndDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEndDestinoActionPerformed
        AddEndModal endDestModal = new AddEndModal(null, true, nf.getDestino());;
        endDestModal.setVisible(true);

        if (nf.getDestino().getRua() != null) {
            btnAddEndDestino.setText("Alterar");
        }
    }//GEN-LAST:event_btnAddEndDestinoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        resetaTela();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdActionPerformed
        AddProdModal prodModal = new AddProdModal(null, true, nf.getProdutos());
        prodModal.setVisible(true);

        if (nf.getProdutos() != null) {
            lblProdQntd.setText(nf.getProdutos().size() + " Produtos adicionados");
        }
    }//GEN-LAST:event_btnAddProdActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            verificaCampos();
            NotaFiscalDAO nfDao = new NotaFiscalDAO();

            if (!ftDataExp.getText().isBlank()) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate ldExp = LocalDate.parse(ftDataExp.getText(), formatter);
                nf.setDataExpedicao(ldExp);
            }

            if (!ftDataEntreg.getText().isBlank()) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate ldEntreg = LocalDate.parse(ftDataEntreg.getText(), formatter);
                nf.setDataEntrega(ldEntreg);
            }

            nfDao.alterar(nf, nf.getNumero());

            resetaTela();
            
            JOptionPane.showMessageDialog(rootPane, "Nota Fiscal atualizada com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnSelecFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecFuncActionPerformed
        SelecionarFuncModal slctFunc = new SelecionarFuncModal(null, true, nf.getFuncionario(), 3);
        slctFunc.setVisible(true);

        if (!nf.getFuncionario().getCtps().isBlank()) {
            btnSelecFunc.setText("Alterar");
        }
    }//GEN-LAST:event_btnSelecFuncActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            nf = nfDao.consulta(Integer.parseInt(tfPesquisa.getText()));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            if (nf != null) {
                btnAddEndOrigem.setText("Alterar");
                btnAddEndDestino.setText("Alterar");
                btnSelecFunc.setText("Alterar");

                tfNum.setText(String.valueOf(nf.getNumero()));
                if (nf.getDataExpedicao() != null) {
                    ftDataExp.setText(nf.getDataExpedicao().format(formatter));
                }
                if (nf.getDataEntrega() != null) {
                    ftDataEntreg.setText(nf.getDataEntrega().format(formatter));
                }

                lblProdQntd.setText(nf.getProdutos().size() + " Produtos adicionados");

                tfPesquisa.setEnabled(false);
                jButton3.setEnabled(false);
                habilitaCampos(true);
                tfNum.setEnabled(false);
                btnConfirmar.setEnabled(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não encontrado.", "Resultado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEndDestino;
    private javax.swing.JButton btnAddEndOrigem;
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSelecFunc;
    private javax.swing.JFormattedTextField ftDataEntreg;
    private javax.swing.JFormattedTextField ftDataExp;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblAjudante;
    private javax.swing.JLabel lblDataEntrega;
    private javax.swing.JLabel lblDataExpedicao;
    private javax.swing.JLabel lblEnderecoDestino;
    private javax.swing.JLabel lblEnderecoOrigem;
    private javax.swing.JLabel lblNumeroNotaFiscal;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblProdQntd;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlPesquisa;
    private javax.swing.JTextField tfNum;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables
}
