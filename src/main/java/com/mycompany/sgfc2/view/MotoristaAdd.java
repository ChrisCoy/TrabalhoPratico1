package com.mycompany.sgfc2.view;

import com.mycompany.sgfc2.controller.DAO.MotoristaDAO;
import com.mycompany.sgfc2.model.Motorista;
import java.awt.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MotoristaAdd extends javax.swing.JInternalFrame {

    MotoristaDAO motDao = new MotoristaDAO();

    public MotoristaAdd() {
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

        pnlConteudo = new javax.swing.JPanel();
        lblCtps = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCnh = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        tfCtps = new javax.swing.JTextField();
        tfSalario = new javax.swing.JTextField();
        tfCnh = new javax.swing.JTextField();
        lblTipoCarteira = new javax.swing.JLabel();
        tfTipoCarteira = new javax.swing.JTextField();
        lblDataValidade = new javax.swing.JLabel();
        ftDataValidade = new javax.swing.JFormattedTextField();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_adicionar.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Motorista"));

        lblCtps.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCtps.setText("Ctps:");

        lblSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSalario.setText("Salário:");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblCnh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCnh.setText("Cnh:");

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

        tfNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNome.setName("nome"); // NOI18N

        tfCtps.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCtps.setName("ctps"); // NOI18N

        tfSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfSalario.setName("salario"); // NOI18N

        tfCnh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCnh.setName("cnh"); // NOI18N

        lblTipoCarteira.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoCarteira.setText("Tipo Carteira:");

        tfTipoCarteira.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfTipoCarteira.setName("tipo carteira"); // NOI18N
        tfTipoCarteira.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTipoCarteiraKeyTyped(evt);
            }
        });

        lblDataValidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataValidade.setText("Data de Validade da Carteira:");

        ftDataValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftDataValidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ftDataValidade.setName("data de validade da carteira"); // NOI18N

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConteudoLayout.createSequentialGroup()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConteudoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConteudoLayout.createSequentialGroup()
                                .addComponent(lblTipoCarteira)
                                .addGap(18, 18, 18)
                                .addComponent(tfTipoCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlConteudoLayout.createSequentialGroup()
                                .addComponent(lblDataValidade)
                                .addGap(18, 18, 18)
                                .addComponent(ftDataValidade))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConteudoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblCtps)
                            .addComponent(lblSalario)
                            .addComponent(lblCnh))
                        .addGap(41, 41, 41)
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(tfCtps)
                            .addComponent(tfSalario)
                            .addComponent(tfCnh, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnConfirmar)
                        .addGap(83, 83, 83)
                        .addComponent(btnCancelar)
                        .addGap(25, 25, 25)))
                .addGap(43, 43, 43))
        );

        pnlConteudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnConfirmar});

        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(lblCnh)
                    .addComponent(tfCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoCarteira)
                    .addComponent(tfTipoCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDataValidade)
                    .addComponent(ftDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
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
            Motorista m = new Motorista();

            m.setNome(tfNome.getText());
            m.setCtps(tfCtps.getText());
            m.setSalario(Float.parseFloat(tfSalario.getText()));
            m.setCnh(tfCnh.getText());
            m.setTipoCarteira(tfTipoCarteira.getText().toUpperCase());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ld = LocalDate.parse(ftDataValidade.getText(), formatter);
            m.setDataValidade(ld);
            motDao.incluir(m);
            resetaTela();
            JOptionPane.showMessageDialog(rootPane, "Motorista adicionado com sucesso",
                    "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void tfTipoCarteiraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTipoCarteiraKeyTyped
        if (tfTipoCarteira.getText().length() > 2) {
            tfTipoCarteira.setText(tfTipoCarteira.getText().substring(0, 2));
        }
    }//GEN-LAST:event_tfTipoCarteiraKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JFormattedTextField ftDataValidade;
    private javax.swing.JLabel lblCnh;
    private javax.swing.JLabel lblCtps;
    private javax.swing.JLabel lblDataValidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTipoCarteira;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JTextField tfCnh;
    private javax.swing.JTextField tfCtps;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfTipoCarteira;
    // End of variables declaration//GEN-END:variables
}
