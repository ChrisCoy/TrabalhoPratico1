package com.mycompany.sgfc2.view.funcionario;

import com.mycompany.sgfc2.controller.DAO.FuncionarioDAO;
import com.mycompany.sgfc2.model.Funcionario;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FuncionarioAlterar extends javax.swing.JInternalFrame {

    private FuncionarioDAO funcDao = new FuncionarioDAO();

    public FuncionarioAlterar() {
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

    private void habilitaTela(boolean b) {
        for (Component c : pnlConteudo.getComponents()) {
            if (c instanceof JTextField) {
                c.setEnabled(b);
            }
        }
        tfPesquisa.setEnabled(!b);
        btnPesquisa.setEnabled(!b);
        tfCtps.setEnabled(false);
        btnConfirmar.setEnabled(b);
        cbxNivel.setEnabled(b);
    }

    private void resetaTela() {
        for (Component c : pnlConteudo.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
        habilitaTela(false);
        cbxNivel.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConteudo = new javax.swing.JPanel();
        lblCtps = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblFuncao = new javax.swing.JLabel();
        lblNivelPermissao = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        cbxNivel = new javax.swing.JComboBox<>();
        tfCtps = new javax.swing.JTextField();
        tfSalario = new javax.swing.JTextField();
        tfFuncao = new javax.swing.JTextField();
        pnlPesquisa = new javax.swing.JPanel();
        btnPesquisa = new javax.swing.JButton();
        tfPesquisa = new javax.swing.JTextField();
        lblPesquisa = new javax.swing.JLabel();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_alterar.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar Funcionário"));

        lblCtps.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCtps.setText("Ctps:");
        lblCtps.setEnabled(false);

        lblSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSalario.setText("Salário:");
        lblSalario.setEnabled(false);

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("Nome:");
        lblNome.setEnabled(false);

        lblFuncao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFuncao.setText("Função:");
        lblFuncao.setEnabled(false);

        lblNivelPermissao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNivelPermissao.setText("Nível de Permissão:");
        lblNivelPermissao.setEnabled(false);

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

        tfNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNome.setEnabled(false);
        tfNome.setName("nome"); // NOI18N

        cbxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-Gerente", "2-Fiscal", "3-Outros" }));
        cbxNivel.setEnabled(false);

        tfCtps.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCtps.setEnabled(false);
        tfCtps.setName("ctps"); // NOI18N

        tfSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfSalario.setEnabled(false);
        tfSalario.setName("salario"); // NOI18N

        tfFuncao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfFuncao.setEnabled(false);
        tfFuncao.setName("função"); // NOI18N

        pnlPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        btnPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        tfPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPesquisa.setText("Ctps:");

        javax.swing.GroupLayout pnlPesquisaLayout = new javax.swing.GroupLayout(pnlPesquisa);
        pnlPesquisa.setLayout(pnlPesquisaLayout);
        pnlPesquisaLayout.setHorizontalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesquisa)
                .addGap(18, 18, 18)
                .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnPesquisa)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

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
                                    .addComponent(lblNome)
                                    .addComponent(lblCtps)
                                    .addComponent(lblSalario)
                                    .addComponent(lblFuncao))
                                .addGap(41, 41, 41)
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNome)
                                    .addComponent(tfCtps)
                                    .addComponent(tfSalario)
                                    .addComponent(tfFuncao, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                                .addComponent(lblNivelPermissao)
                                .addGap(18, 18, 18)
                                .addComponent(cbxNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnConfirmar)
                        .addGap(82, 82, 82)
                        .addComponent(btnCancelar)))
                .addGap(43, 43, 43))
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlConteudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnConfirmar});

        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCtps)
                    .addComponent(tfCtps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuncao)
                    .addComponent(tfFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNivelPermissao)
                    .addComponent(cbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        resetaTela();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            verificaCampos();
            Funcionario f = new Funcionario();

            f.setNome(tfNome.getText());
            f.setCtps(tfCtps.getText());
            f.setSalario(Float.parseFloat(tfSalario.getText()));
            f.setFuncao(tfFuncao.getText());

            f.setNivelPermissao(Character.getNumericValue(cbxNivel.getSelectedItem().toString().charAt(0)));

            funcDao.alterar(f, f.getCtps());
            resetaTela();

            JOptionPane.showMessageDialog(rootPane, "Funcionario alterado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        try {
            Funcionario f = funcDao.consulta(tfPesquisa.getText());

            if (f != null) {
                habilitaTela(true);
                tfNome.setText(f.getNome());
                tfCtps.setText(f.getCtps());
                tfSalario.setText(String.valueOf(f.getSalario()));
                tfFuncao.setText(f.getFuncao());

                if (f.getNivelPermissao() > 2) {
                    cbxNivel.setSelectedIndex(2);
                } else {
                    cbxNivel.setSelectedIndex(f.getNivelPermissao() - 1);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Não encontrado.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JComboBox<String> cbxNivel;
    private javax.swing.JLabel lblCtps;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblNivelPermissao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlPesquisa;
    private javax.swing.JTextField tfCtps;
    private javax.swing.JTextField tfFuncao;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JTextField tfSalario;
    // End of variables declaration//GEN-END:variables
}
