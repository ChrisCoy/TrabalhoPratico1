package com.mycompany.sgfc2.view.selecionar;

import com.mycompany.sgfc2.controller.DAO.NotaFiscalDAO;
import com.mycompany.sgfc2.model.Carga;
import com.mycompany.sgfc2.model.NotaFiscal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SelecionarNotaFiscalModal extends javax.swing.JDialog {

    private ArrayList<NotaFiscal> notas;
    private NotaFiscalDAO nfDao = new NotaFiscalDAO();
    private NotaFiscal nf;
    private boolean Modificado = false;

    public SelecionarNotaFiscalModal(java.awt.Frame parent, boolean modal, NotaFiscal notafiscal, Carga cg) {
        super(parent, modal);
        initComponents();

        tblNF.getColumnModel().getColumn(4).setMinWidth(110);

        nf = notafiscal;
        DefaultTableModel model = (DefaultTableModel) tblNF.getModel();

        try {
            notas = nfDao.listar();

            if (notas != null) {
                for (NotaFiscal n : notas) {
                    String endOri = (n.getOrigem() != null) ? n.getOrigem().getRua() : "Sem informação";
                    String endDest = (n.getDestino() != null) ? n.getDestino().getRua() : "Sem informação";

                    if (n.getDataExpedicao() == null && !temNota(n, cg.getNotasFiscais())) {
                        model.addRow(new Object[]{n.getNumero(), endOri, endDest,
                            n.getFuncionario().getNome(), n.getProdutos().size()});
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean temNota(NotaFiscal nota, ArrayList<NotaFiscal> nf) {
        for (NotaFiscal n : nf) {
            if (n.getNumero() == nota.getNumero()) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblNF = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblNF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Origem", "Destino", "Ajudante", "Quantidade de Produtos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNF.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblNF);

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSelecionar)
                .addGap(139, 139, 139)
                .addComponent(btnCancelar)
                .addGap(162, 162, 162))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnSelecionar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionar)
                    .addComponent(btnCancelar))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        try {
            NotaFiscal nfTemp = nfDao.consulta((Integer) tblNF.getValueAt(tblNF.getSelectedRow(), 0));

            nf.setNumero(nfTemp.getNumero());

            if (nfTemp.getDataEntrega() != null) {
                nf.setDataEntrega(nfTemp.getDataEntrega());
            }
            if (nfTemp.getDataExpedicao() != null) {
                nf.setDataExpedicao(nfTemp.getDataExpedicao());
            }
            if (nfTemp.getFuncionario() != null) {
                nf.setFuncionario(nfTemp.getFuncionario());
            }
            if (nfTemp.getOrigem() != null) {
                nf.setOrigem(nfTemp.getOrigem());
            }
            if (nfTemp.getDestino() != null) {
                nf.setDestino(nfTemp.getDestino());
            }
            if (nfTemp.getProdutos() != null) {
                nf.setProdutos(nfTemp.getProdutos());
            }

            Modificado = true;

            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao selecionar a linha, tente novamente;");
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SelecionarNotaFiscalModal dialog = new SelecionarNotaFiscalModal(new javax.swing.JFrame(),
                        true, new NotaFiscal(), new Carga());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public boolean isModificado() {
        return Modificado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNF;
    // End of variables declaration//GEN-END:variables
}
