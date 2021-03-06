package com.mycompany.sgfc2.view.carga;

import com.mycompany.sgfc2.controller.DAO.CaminhaoDAO;
import com.mycompany.sgfc2.controller.DAO.CargaDAO;
import com.mycompany.sgfc2.controller.DAO.NotaFiscalDAO;
import com.mycompany.sgfc2.model.Caminhao;
import com.mycompany.sgfc2.model.Carga;
import com.mycompany.sgfc2.model.NotaFiscal;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CargaPendentes extends javax.swing.JInternalFrame {

    private CargaDAO cargDao = new CargaDAO();
    private CaminhaoDAO camDao = new CaminhaoDAO();
    private NotaFiscalDAO nfDao = new NotaFiscalDAO();

    private boolean verificaCarga(Carga c) {
        for (NotaFiscal n : c.getNotasFiscais()) {
            if (n.getDataEntrega() == null) {
                return true;
            }
        }
        return false;
    }

    public CargaPendentes() {
        initComponents();

        tblCarga.getColumnModel().getColumn(5).setMinWidth(120);
        DefaultTableModel model = (DefaultTableModel) tblCarga.getModel();

        ArrayList<Carga> cargas;

        try {
            cargas = cargDao.listar();

            if (cargas != null) {
                for (Carga c : cargas) {
                    if (camDao.temCarga(c.getId())) {
                        if (verificaCarga(c)) {
                            model.addRow(new Object[]{c.getId(), c.getAutorizadoPor().getNome(),
                                c.getConferidoPor().getNome(), c.getDataAutorizacao(), c.getDataConferencia(),
                                c.getNotasFiscais().size(), camDao.getCaminhaoCarga(c.getId()).getMotorista().getNome()});
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro, motivo: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConteudo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarga = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnSelecionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_pendente.png")); // NOI18N

        pnlConteudo.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargas Pendentes"));

        tblCarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Autorizado Por", "Conferido Por", "Data Autoriza????o", "Data Confer??ncia", "Quantidade NotasFiscais", "Caminhoneiro"
            }
        ));
        tblCarga.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblCarga);

        lblTitulo.setText("Selecione uma carga a ser conclu??da.");

        btnSelecionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(btnSelecionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(174, 174, 174))
        );

        pnlConteudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnSelecionar});

        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionar)
                    .addComponent(btnCancelar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (tblCarga.getSelectedRow() != -1) {
            try {
                Carga cg = cargDao.consulta((Integer) tblCarga.getValueAt(tblCarga.getSelectedRow(), 0));
                Caminhao c = camDao.getCaminhaoCarga(cg.getId());
                camDao.updateCarga(null, c.getId());

                for (NotaFiscal n : cg.getNotasFiscais()) {
                    n.setDataEntrega(LocalDate.now());
                    nfDao.alterar(n, n.getNumero());
                }

                DefaultTableModel model = (DefaultTableModel) tblCarga.getModel();
                model.removeRow(tblCarga.getSelectedRow());

                JOptionPane.showMessageDialog(this, "Carga marcada como entregue com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao concluir carga, por favor verifique e tente novamente",
                        "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } else
            JOptionPane.showMessageDialog(this, "Por favor selecione uma carga", "Erro", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JTable tblCarga;
    // End of variables declaration//GEN-END:variables
}
