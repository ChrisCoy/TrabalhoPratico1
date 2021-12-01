package com.mycompany.sgfc2.view.notafiscal;

import com.mycompany.sgfc2.controller.Conexao;
import com.mycompany.sgfc2.controller.DAO.NotaFiscalDAO;
import com.mycompany.sgfc2.model.NotaFiscal;
import com.mycompany.sgfc2.view.outros.ProdutoRelatorioModal;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class NotaFiscalConsulta extends javax.swing.JInternalFrame {

    private NotaFiscal nf;
    private NotaFiscalDAO nfDao = new NotaFiscalDAO();
    private Connection conn;
    
    public NotaFiscalConsulta() {
        initComponents();
    }

        private void criaRelatorio(String archiveName, HashMap parametros) {
        try {
            conn = Conexao.getConexao();
            String path = "src/main/java/com/mycompany/sgfc2/view/relatoriosjasper/" + archiveName;
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);

            JasperViewer jv = new JasperViewer(JasperFillManager.fillReport(jr, parametros, conn), false);
            jv.setExtendedState(JFrame.MAXIMIZED_BOTH);
            jv.setVisible(true);
            jv.setTitle("Relatório detalhado de nota fiscal.");

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(),
                    "Erro", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(),
                    "Erro", JOptionPane.WARNING_MESSAGE);
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
        tfNum = new javax.swing.JTextField();
        ftDataExp = new javax.swing.JFormattedTextField();
        ftDataEntreg = new javax.swing.JFormattedTextField();
        lblProdutos = new javax.swing.JLabel();
        lblProdQntd = new javax.swing.JLabel();
        pnlPesquisa = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        tfPesquisa = new javax.swing.JTextField();
        lblPesquisa = new javax.swing.JLabel();
        tfEndOrigem = new javax.swing.JTextField();
        tfEndDest = new javax.swing.JTextField();
        tfAjudante = new javax.swing.JTextField();
        btnVerProdutos = new javax.swing.JButton();
        btnExibirConsulta = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_consultar.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Nota Fiscal"));

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

        tfNum.setEditable(false);
        tfNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ftDataExp.setEditable(false);
        ftDataExp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        ftDataEntreg.setEditable(false);
        ftDataEntreg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        lblProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProdutos.setText("Produtos:");

        lblProdQntd.setText("0 Produtos adicionados");

        pnlPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
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
                .addComponent(tfPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addContainerGap())
        );
        pnlPesquisaLayout.setVerticalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(btnPesquisar)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tfEndOrigem.setEditable(false);
        tfEndOrigem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfEndDest.setEditable(false);
        tfEndDest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfAjudante.setEditable(false);
        tfAjudante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnVerProdutos.setText("Ver");
        btnVerProdutos.setEnabled(false);
        btnVerProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProdutosActionPerformed(evt);
            }
        });

        btnExibirConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExibirConsulta.setText("Exibir Consulta Visualmente");
        btnExibirConsulta.setEnabled(false);
        btnExibirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConteudoLayout.createSequentialGroup()
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
                                    .addComponent(tfEndOrigem)
                                    .addComponent(tfEndDest)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataEntrega)
                                    .addComponent(lblAjudante))
                                .addGap(20, 20, 20)
                                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftDataEntreg)
                                    .addComponent(tfAjudante)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlConteudoLayout.createSequentialGroup()
                                .addComponent(lblProdutos)
                                .addGap(18, 18, 18)
                                .addComponent(lblProdQntd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerProdutos)))
                        .addGap(43, 43, 43))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addComponent(pnlPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnExibirConsulta)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroNotaFiscal)
                    .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnderecoOrigem)
                    .addComponent(tfEndOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnderecoDestino)
                            .addComponent(tfEndDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(tfAjudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdutos)
                    .addComponent(lblProdQntd)
                    .addComponent(btnVerProdutos))
                .addGap(27, 27, 27)
                .addComponent(btnExibirConsulta)
                .addGap(19, 19, 19))
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

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        btnVerProdutos.setEnabled(false);
        try {
            nf = nfDao.consulta(Integer.parseInt(tfPesquisa.getText()));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            if (nf != null) {

                tfNum.setText(String.valueOf(nf.getNumero()));
                if (nf.getDataExpedicao() != null) {
                    ftDataExp.setText(nf.getDataExpedicao().format(formatter));
                }
                if (nf.getDataEntrega() != null) {
                    ftDataEntreg.setText(nf.getDataEntrega().format(formatter));
                }

                if (!nf.getProdutos().isEmpty()){
                    btnVerProdutos.setEnabled(true);
                }
                
                tfEndOrigem.setText(nf.getOrigem().getRua());
                tfEndDest.setText(nf.getDestino().getRua());
                tfAjudante.setText(nf.getFuncionario().getNome());

                lblProdQntd.setText(nf.getProdutos().size() + " Produtos adicionados");
                btnExibirConsulta.setEnabled(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnVerProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProdutosActionPerformed
        ProdutoRelatorioModal verProd = new ProdutoRelatorioModal(null, true, nf.getProdutos());
        verProd.setVisible(true);
    }//GEN-LAST:event_btnVerProdutosActionPerformed

    private void btnExibirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirConsultaActionPerformed
        HashMap param = new HashMap();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        param.put("numero", nf.getNumero());
        if (nf.getDataExpedicao()!= null){
            param.put("dataExped", nf.getDataExpedicao().format(formatter));
        }else{
            param.put("dataExped", "");
        }
        if (nf.getDataEntrega() != null){
            param.put("dataEntr", nf.getDataEntrega().format(formatter));
        }else {
            param.put("dataEntr", "");
        }
        if (nf.getFuncionario() != null){
            param.put("ajudanteNome", nf.getFuncionario().getNome());
        }
        
        param.put("ruaOrigem", nf.getOrigem().getRua());
        param.put("municipioOrigem", nf.getOrigem().getMunicipio());
        param.put("estadoOrigem", nf.getOrigem().getEstado());
        param.put("numeroOrigem", nf.getOrigem().getNumero());
        param.put("cepOrigem", nf.getOrigem().getCep());
        
        param.put("ruaDestino", nf.getDestino().getRua());
        param.put("municipioDestino", nf.getDestino().getMunicipio());
        param.put("estadoDestino", nf.getDestino().getEstado());
        param.put("numeroDestino", nf.getDestino().getNumero());
        param.put("cepDestino", nf.getDestino().getCep());
        
        criaRelatorio("NotaFiscalCompletoJasper.jasper", param);
    }//GEN-LAST:event_btnExibirConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExibirConsulta;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVerProdutos;
    private javax.swing.JFormattedTextField ftDataEntreg;
    private javax.swing.JFormattedTextField ftDataExp;
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
    private javax.swing.JTextField tfAjudante;
    private javax.swing.JTextField tfEndDest;
    private javax.swing.JTextField tfEndOrigem;
    private javax.swing.JTextField tfNum;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables
}
