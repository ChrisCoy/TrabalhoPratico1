package com.mycompany.sgfc2.view;

import com.mycompany.sgfc2.controller.DAO.FuncionarioDAO;
import com.mycompany.sgfc2.model.Funcionario;
import javax.swing.JOptionPane;

public class FuncionarioConsulta extends javax.swing.JInternalFrame {

    private FuncionarioDAO funcDao = new FuncionarioDAO();

    public FuncionarioConsulta() {
        initComponents();
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
        tfNome = new javax.swing.JTextField();
        cbxNivel = new javax.swing.JComboBox<>();
        tfCtps = new javax.swing.JTextField();
        tfSalario = new javax.swing.JTextField();
        tfFuncao = new javax.swing.JTextField();
        pnlPesquisa = new javax.swing.JPanel();
        btnPesquisa = new javax.swing.JButton();
        tfPesquisa = new javax.swing.JTextField();
        lblPesquisa = new javax.swing.JLabel();
        btnExibirConsulta = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_consultar.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Funcionário"));

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

        tfNome.setEditable(false);
        tfNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-Gerente", "2-Fiscal", "3-Outros" }));
        cbxNivel.setEnabled(false);

        tfCtps.setEditable(false);
        tfCtps.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfSalario.setEditable(false);
        tfSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfFuncao.setEditable(false);
        tfFuncao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                                .addComponent(cbxNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(43, 43, 43))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addComponent(pnlPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnExibirConsulta)
                .addGap(0, 0, Short.MAX_VALUE))
        );
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
                .addComponent(btnExibirConsulta)
                .addGap(21, 21, 21))
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

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        try {
            Funcionario f = funcDao.consulta(tfPesquisa.getText());

            if (f != null) {
                tfNome.setText(f.getNome());
                tfCtps.setText(f.getCtps());
                tfSalario.setText(String.valueOf(f.getSalario()));
                tfFuncao.setText(f.getFuncao());

                if (f.getNivelPermissao() > 2) {
                    cbxNivel.setSelectedIndex(2);
                } else {
                    cbxNivel.setSelectedIndex(f.getNivelPermissao() - 1);
                }
                
                btnExibirConsulta.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Não encontrado.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExibirConsulta;
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
