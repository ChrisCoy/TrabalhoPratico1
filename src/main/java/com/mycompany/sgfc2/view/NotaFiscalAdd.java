package com.mycompany.sgfc2.view;

import com.mycompany.sgfc2.controller.DAO.EnderecoDAO;
import com.mycompany.sgfc2.controller.DAO.NotaFiscalDAO;
import com.mycompany.sgfc2.controller.DAO.ProdutoDAO;
import com.mycompany.sgfc2.model.NotaFiscal;
import com.mycompany.sgfc2.model.Produto;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NotaFiscalAdd extends javax.swing.JInternalFrame {

    private NotaFiscal nf;

    public NotaFiscalAdd() {
        initComponents();

        nf = new NotaFiscal();
    }

    private void verificaCampos() throws Exception {
        for (Component c : pnlConteudo.getComponents()) {
            if (c instanceof JTextField || c instanceof JFormattedTextField) {
                if (((JTextField) c).getText().isBlank()) {
                    throw new Exception("Campo " + c.getName() + " vazio");
                }
            }
        }
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

    private void resetaTela() {
        nf = new NotaFiscal();
        lblProdQntd.setText("0 Produtos adicionados");
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
        lblAjudante = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfNum = new javax.swing.JTextField();
        btnAddEndOrigem = new javax.swing.JButton();
        btnAddEndDestino = new javax.swing.JButton();
        lblProdutos = new javax.swing.JLabel();
        btnAddProd = new javax.swing.JButton();
        lblProdQntd = new javax.swing.JLabel();
        btnSelecFunc = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_adicionar.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Nota Fiscal"));

        lblEnderecoOrigem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnderecoOrigem.setText("Endereco de origem: ");

        lblEnderecoDestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnderecoDestino.setText("Endereco de destino: ");

        lblNumeroNotaFiscal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumeroNotaFiscal.setText("Número da Nota Fiscal:");

        lblAjudante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAjudante.setText("Ajudante carga/descarga: ");

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

        tfNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNum.setName("Nota Fiscal"); // NOI18N

        btnAddEndOrigem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddEndOrigem.setText("Adicionar");
        btnAddEndOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEndOrigemActionPerformed(evt);
            }
        });

        btnAddEndDestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddEndDestino.setText("Adicionar");
        btnAddEndDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEndDestinoActionPerformed(evt);
            }
        });

        lblProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProdutos.setText("Produtos:");

        btnAddProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddProd.setText("Adicionar");
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });

        lblProdQntd.setText("0 Produtos adicionados");

        btnSelecFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSelecFunc.setText("Adicionar");
        btnSelecFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumeroNotaFiscal)
                                    .addComponent(lblEnderecoOrigem)
                                    .addComponent(lblEnderecoDestino))
                                .addGap(41, 41, 41)
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNum)
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAddEndDestino)
                                            .addComponent(btnAddEndOrigem))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAjudante)
                                    .addComponent(lblProdutos))
                                .addGap(20, 20, 20)
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addComponent(btnAddProd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblProdQntd, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                                        .addComponent(btnSelecFunc)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnConfirmar)
                        .addGap(82, 82, 82)
                        .addComponent(btnCancelar)))
                .addGap(43, 43, 43))
        );

        pnlConteudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddEndDestino, btnAddEndOrigem, btnAddProd, btnCancelar, btnConfirmar, btnSelecFunc});

        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroNotaFiscal)
                    .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoOrigem)
                    .addComponent(btnAddEndOrigem))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoDestino)
                    .addComponent(btnAddEndDestino))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAjudante)
                    .addComponent(btnSelecFunc))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdutos)
                    .addComponent(btnAddProd)
                    .addComponent(lblProdQntd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
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
            ProdutoDAO prodDao = new ProdutoDAO();
            NotaFiscalDAO nfDao = new NotaFiscalDAO();
            EnderecoDAO endDao = new EnderecoDAO();

            nf.setNumero(Integer.parseInt(tfNum.getText()));

            for (Produto p : nf.getProdutos()) {
                p.setId(prodDao.proximoCodigo());
                prodDao.incluir(p);
            }

            nf.getDestino().setId(endDao.proximoCodigo());
            endDao.incluir(nf.getDestino());
            nf.getOrigem().setId(endDao.proximoCodigo());
            endDao.incluir(nf.getOrigem());
            nfDao.incluir(nf);

            resetaTela();
            JOptionPane.showMessageDialog(rootPane, "Nota Fiscal adicionada com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnSelecFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecFuncActionPerformed
        SelecionarFuncModal slctFunc = new SelecionarFuncModal(null, true, nf.getFuncionario(), 3);
        slctFunc.setVisible(true);

        if (nf.getFuncionario().getCtps() != null) {
            if (!nf.getFuncionario().getCtps().isBlank()) {
                btnSelecFunc.setText("Alterar");
            }
        }
    }//GEN-LAST:event_btnSelecFuncActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEndDestino;
    private javax.swing.JButton btnAddEndOrigem;
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSelecFunc;
    private javax.swing.JLabel lblAjudante;
    private javax.swing.JLabel lblEnderecoDestino;
    private javax.swing.JLabel lblEnderecoOrigem;
    private javax.swing.JLabel lblNumeroNotaFiscal;
    private javax.swing.JLabel lblProdQntd;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JTextField tfNum;
    // End of variables declaration//GEN-END:variables
}
