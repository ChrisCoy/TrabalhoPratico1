package com.mycompany.sgfc2.view;

import com.mycompany.sgfc2.controller.AdminActions;
import com.mycompany.sgfc2.controller.Conexao;
import java.awt.Component;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private Connection conn = null;
    private int tipoUsuario = 0;

    public Principal() {
        initComponents();
        try {
            mniApagarTudo.setVisible(false);
            conn = Conexao.getConexao();
        } catch (SQLException e) {
            tipoUsuario(0);
            JOptionPane.showMessageDialog(null, "Erro ao conectar-se ao banco de dados, motivo: " + e.getStackTrace(),
                    "Erro", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {
            tipoUsuario(0);
            JOptionPane.showMessageDialog(null, "Erro ao conectar-se ao banco de dados, motivo: " + ex.getMessage(),
                    "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void addCentered(Component jif) {
        fechaTelas();
        dskpTela.add(jif);
        jif.setLocation((dskpTela.getWidth() - jif.getWidth()) / 2, (dskpTela.getHeight() - jif.getHeight()) / 2);
        jif.setVisible(true);
    }

    private void tipoUsuario(int tipo) {
        switch (tipo) {
            case 0:
                for (Component c : mnMenus.getComponents()) {
                    c.setEnabled(false);
                }
                break;
            case 1:
                mniApagarTudo.setVisible(true);
                break;
            case 2:
                mniAddCarga.setEnabled(false);
                mniDespCarga.setEnabled(false);
                mniPendCarga.setEnabled(false);
                mniAtrCarga.setEnabled(false);
                mniRmvCarga.setEnabled(false);
                break;
            case 3:
                mnCarga.setEnabled(false);
                mnCaminhao.setEnabled(false);
                mnNotaFiscal.setEnabled(false);
                mnMotorista.setEnabled(false);
                mniAddFuncionario.setEnabled(false);
                mniAtrFuncionario.setEnabled(false);
                mniRmvFuncionario.setEnabled(false);
                break;
        }
    }

    private void fechaTelas() {
        if (dskpTela.getComponents().length > 0) {
            for (Component c : dskpTela.getComponents()) {
                c.setVisible(false);
            }
            dskpTela.removeAll();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskpTela = new javax.swing.JDesktopPane();
        mnMenus = new javax.swing.JMenuBar();
        mnCarga = new javax.swing.JMenu();
        mniAddCarga = new javax.swing.JMenuItem();
        mniDespCarga = new javax.swing.JMenuItem();
        mniPendCarga = new javax.swing.JMenuItem();
        mniAtrCarga = new javax.swing.JMenuItem();
        mniRmvCarga = new javax.swing.JMenuItem();
        mniCstCarga = new javax.swing.JMenuItem();
        mniRelatorioVisualCarga = new javax.swing.JMenuItem();
        mnCaminhao = new javax.swing.JMenu();
        mniAddCaminhao = new javax.swing.JMenuItem();
        mniAtrCaminhao = new javax.swing.JMenuItem();
        mniRmvCaminhao = new javax.swing.JMenuItem();
        mniCstCaminhao = new javax.swing.JMenuItem();
        mniRelatorioVisualCam = new javax.swing.JMenuItem();
        mnNotaFiscal = new javax.swing.JMenu();
        mniAddCarga1 = new javax.swing.JMenuItem();
        mniAtrNotaFiscal = new javax.swing.JMenuItem();
        mniRmvNotaFiscal = new javax.swing.JMenuItem();
        mniCstNotaFiscal = new javax.swing.JMenuItem();
        mniRelaNotaFiscal = new javax.swing.JMenuItem();
        mniRelatorioVisualNF = new javax.swing.JMenuItem();
        mnMotorista = new javax.swing.JMenu();
        mniAddMotorista = new javax.swing.JMenuItem();
        mniAtrMotorista = new javax.swing.JMenuItem();
        mniRmvMotorista = new javax.swing.JMenuItem();
        mniCstMotorista = new javax.swing.JMenuItem();
        mniRelaMotorista = new javax.swing.JMenuItem();
        mniRelatorioVisualMot = new javax.swing.JMenuItem();
        mnFuncionario = new javax.swing.JMenu();
        mniAddFuncionario = new javax.swing.JMenuItem();
        mniAtrFuncionario = new javax.swing.JMenuItem();
        mniRmvFuncionario = new javax.swing.JMenuItem();
        mniCstFuncionario = new javax.swing.JMenuItem();
        mniRelaFuncionario = new javax.swing.JMenuItem();
        mniRelatorioVisualFunc = new javax.swing.JMenuItem();
        mnProdEnd = new javax.swing.JMenu();
        mnProdutos = new javax.swing.JMenu();
        ProdutosRelatorio = new javax.swing.JMenuItem();
        mniRelatorioVisualProd = new javax.swing.JMenuItem();
        mnEnderecos = new javax.swing.JMenu();
        mniEnderecosRelatorio = new javax.swing.JMenuItem();
        mniApagarTudo = new javax.swing.JMenuItem();
        mniRelatorioVisualEnd = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGFC");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dskpTela.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout dskpTelaLayout = new javax.swing.GroupLayout(dskpTela);
        dskpTela.setLayout(dskpTelaLayout);
        dskpTelaLayout.setHorizontalGroup(
            dskpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );
        dskpTelaLayout.setVerticalGroup(
            dskpTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );

        mnCarga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnCarga.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_carga.png")); // NOI18N
        mnCarga.setText("Carga  ");
        mnCarga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mniAddCarga.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_adicionar.png")); // NOI18N
        mniAddCarga.setText("Adicionar");
        mniAddCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddCargaActionPerformed(evt);
            }
        });
        mnCarga.add(mniAddCarga);

        mniDespCarga.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_despachar.png")); // NOI18N
        mniDespCarga.setText("Despachar Carga");
        mniDespCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDespCargaActionPerformed(evt);
            }
        });
        mnCarga.add(mniDespCarga);

        mniPendCarga.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_pendente.png")); // NOI18N
        mniPendCarga.setText("Cargas Pendentes");
        mniPendCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPendCargaActionPerformed(evt);
            }
        });
        mnCarga.add(mniPendCarga);

        mniAtrCarga.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_alterar.png")); // NOI18N
        mniAtrCarga.setText("Alterar");
        mniAtrCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAtrCargaActionPerformed(evt);
            }
        });
        mnCarga.add(mniAtrCarga);

        mniRmvCarga.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_remover.png")); // NOI18N
        mniRmvCarga.setText("Remover");
        mniRmvCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRmvCargaActionPerformed(evt);
            }
        });
        mnCarga.add(mniRmvCarga);

        mniCstCarga.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_consultar.png")); // NOI18N
        mniCstCarga.setText("Consultar");
        mniCstCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCstCargaActionPerformed(evt);
            }
        });
        mnCarga.add(mniCstCarga);

        mniRelatorioVisualCarga.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio_visual.png")); // NOI18N
        mniRelatorioVisualCarga.setText("Relatório Visual");
        mnCarga.add(mniRelatorioVisualCarga);

        mnMenus.add(mnCarga);

        mnCaminhao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnCaminhao.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_caminhao.png")); // NOI18N
        mnCaminhao.setText("Caminhao  ");
        mnCaminhao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mniAddCaminhao.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_adicionar.png")); // NOI18N
        mniAddCaminhao.setText("Adicionar");
        mniAddCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddCaminhaoActionPerformed(evt);
            }
        });
        mnCaminhao.add(mniAddCaminhao);

        mniAtrCaminhao.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_alterar.png")); // NOI18N
        mniAtrCaminhao.setText("Alterar");
        mniAtrCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAtrCaminhaoActionPerformed(evt);
            }
        });
        mnCaminhao.add(mniAtrCaminhao);

        mniRmvCaminhao.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_remover.png")); // NOI18N
        mniRmvCaminhao.setText("Remover");
        mniRmvCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRmvCaminhaoActionPerformed(evt);
            }
        });
        mnCaminhao.add(mniRmvCaminhao);

        mniCstCaminhao.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_consultar.png")); // NOI18N
        mniCstCaminhao.setText("Consultar");
        mniCstCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCstCaminhaoActionPerformed(evt);
            }
        });
        mnCaminhao.add(mniCstCaminhao);

        mniRelatorioVisualCam.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio_visual.png")); // NOI18N
        mniRelatorioVisualCam.setText("Relatório Visual");
        mnCaminhao.add(mniRelatorioVisualCam);

        mnMenus.add(mnCaminhao);

        mnNotaFiscal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnNotaFiscal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_notafiscal.png")); // NOI18N
        mnNotaFiscal.setText("Nota Fiscal  ");
        mnNotaFiscal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mniAddCarga1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_adicionar.png")); // NOI18N
        mniAddCarga1.setText("Adicionar");
        mniAddCarga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddCarga1ActionPerformed(evt);
            }
        });
        mnNotaFiscal.add(mniAddCarga1);

        mniAtrNotaFiscal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_alterar.png")); // NOI18N
        mniAtrNotaFiscal.setText("Alterar");
        mniAtrNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAtrNotaFiscalActionPerformed(evt);
            }
        });
        mnNotaFiscal.add(mniAtrNotaFiscal);

        mniRmvNotaFiscal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_remover.png")); // NOI18N
        mniRmvNotaFiscal.setText("Remover");
        mniRmvNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRmvNotaFiscalActionPerformed(evt);
            }
        });
        mnNotaFiscal.add(mniRmvNotaFiscal);

        mniCstNotaFiscal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_consultar.png")); // NOI18N
        mniCstNotaFiscal.setText("Consultar");
        mniCstNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCstNotaFiscalActionPerformed(evt);
            }
        });
        mnNotaFiscal.add(mniCstNotaFiscal);

        mniRelaNotaFiscal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio.png")); // NOI18N
        mniRelaNotaFiscal.setText("Relatório");
        mniRelaNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelaNotaFiscalActionPerformed(evt);
            }
        });
        mnNotaFiscal.add(mniRelaNotaFiscal);

        mniRelatorioVisualNF.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio_visual.png")); // NOI18N
        mniRelatorioVisualNF.setText("Relatório Visual");
        mnNotaFiscal.add(mniRelatorioVisualNF);

        mnMenus.add(mnNotaFiscal);

        mnMotorista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnMotorista.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_motorista.png")); // NOI18N
        mnMotorista.setText("Motorista  ");
        mnMotorista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mniAddMotorista.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_adicionar.png")); // NOI18N
        mniAddMotorista.setText("Adicionar");
        mniAddMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddMotoristaActionPerformed(evt);
            }
        });
        mnMotorista.add(mniAddMotorista);

        mniAtrMotorista.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_alterar.png")); // NOI18N
        mniAtrMotorista.setText("Alterar");
        mniAtrMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAtrMotoristaActionPerformed(evt);
            }
        });
        mnMotorista.add(mniAtrMotorista);

        mniRmvMotorista.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_remover.png")); // NOI18N
        mniRmvMotorista.setText("Remover");
        mniRmvMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRmvMotoristaActionPerformed(evt);
            }
        });
        mnMotorista.add(mniRmvMotorista);

        mniCstMotorista.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_consultar.png")); // NOI18N
        mniCstMotorista.setText("Consultar");
        mniCstMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCstMotoristaActionPerformed(evt);
            }
        });
        mnMotorista.add(mniCstMotorista);

        mniRelaMotorista.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio.png")); // NOI18N
        mniRelaMotorista.setText("Relatório");
        mniRelaMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelaMotoristaActionPerformed(evt);
            }
        });
        mnMotorista.add(mniRelaMotorista);

        mniRelatorioVisualMot.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio_visual.png")); // NOI18N
        mniRelatorioVisualMot.setText("Relatório Visual");
        mnMotorista.add(mniRelatorioVisualMot);

        mnMenus.add(mnMotorista);

        mnFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_funcionario.png")); // NOI18N
        mnFuncionario.setText("Funcionário  ");
        mnFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mniAddFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_adicionar.png")); // NOI18N
        mniAddFuncionario.setText("Adicionar");
        mniAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddFuncionarioActionPerformed(evt);
            }
        });
        mnFuncionario.add(mniAddFuncionario);

        mniAtrFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_alterar.png")); // NOI18N
        mniAtrFuncionario.setText("Alterar");
        mniAtrFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAtrFuncionarioActionPerformed(evt);
            }
        });
        mnFuncionario.add(mniAtrFuncionario);

        mniRmvFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_remover.png")); // NOI18N
        mniRmvFuncionario.setText("Remover");
        mniRmvFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRmvFuncionarioActionPerformed(evt);
            }
        });
        mnFuncionario.add(mniRmvFuncionario);

        mniCstFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_consultar.png")); // NOI18N
        mniCstFuncionario.setText("Consultar");
        mniCstFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCstFuncionarioActionPerformed(evt);
            }
        });
        mnFuncionario.add(mniCstFuncionario);

        mniRelaFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio.png")); // NOI18N
        mniRelaFuncionario.setText("Relatório");
        mniRelaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRelaFuncionarioActionPerformed(evt);
            }
        });
        mnFuncionario.add(mniRelaFuncionario);

        mniRelatorioVisualFunc.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio_visual.png")); // NOI18N
        mniRelatorioVisualFunc.setText("Relatório Visual");
        mnFuncionario.add(mniRelatorioVisualFunc);

        mnMenus.add(mnFuncionario);

        mnProdEnd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnProdEnd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_prod_end.png")); // NOI18N
        mnProdEnd.setText("Produtos/Endereços");
        mnProdEnd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_produtos.png")); // NOI18N
        mnProdutos.setText("Produtos");

        ProdutosRelatorio.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio.png")); // NOI18N
        ProdutosRelatorio.setText("Relatório");
        ProdutosRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosRelatorioActionPerformed(evt);
            }
        });
        mnProdutos.add(ProdutosRelatorio);

        mniRelatorioVisualProd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio_visual.png")); // NOI18N
        mniRelatorioVisualProd.setText("Relatório Visual");
        mnProdutos.add(mniRelatorioVisualProd);

        mnProdEnd.add(mnProdutos);

        mnEnderecos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_endereco.png")); // NOI18N
        mnEnderecos.setText("Endereços");

        mniEnderecosRelatorio.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio.png")); // NOI18N
        mniEnderecosRelatorio.setText("Relatorio");
        mniEnderecosRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEnderecosRelatorioActionPerformed(evt);
            }
        });
        mnEnderecos.add(mniEnderecosRelatorio);

        mniApagarTudo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_apagartudo.png")); // NOI18N
        mniApagarTudo.setText("Apagar Todos os registros");
        mniApagarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniApagarTudoActionPerformed(evt);
            }
        });
        mnEnderecos.add(mniApagarTudo);

        mniRelatorioVisualEnd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Coy\\Documents\\NetBeansProjects\\sgfc2\\src\\main\\java\\com\\mycompany\\sgfc2\\resources\\icn_relatorio_visual.png")); // NOI18N
        mniRelatorioVisualEnd.setText("Relatório Visual");
        mnEnderecos.add(mniRelatorioVisualEnd);

        mnProdEnd.add(mnEnderecos);

        mnMenus.add(mnProdEnd);

        setJMenuBar(mnMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskpTela)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskpTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniAddCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddCargaActionPerformed
        addCentered(new CargaAdd());
    }//GEN-LAST:event_mniAddCargaActionPerformed

    private void mniAddCarga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddCarga1ActionPerformed
        addCentered(new NotaFiscalAdd());
    }//GEN-LAST:event_mniAddCarga1ActionPerformed

    private void mniAtrNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAtrNotaFiscalActionPerformed
        addCentered(new NotaFiscalAlterar());
    }//GEN-LAST:event_mniAtrNotaFiscalActionPerformed

    private void mniRmvNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRmvNotaFiscalActionPerformed
        addCentered(new NotaFiscalRemover());
    }//GEN-LAST:event_mniRmvNotaFiscalActionPerformed

    private void mniCstNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCstNotaFiscalActionPerformed
        addCentered(new NotaFiscalConsulta());
    }//GEN-LAST:event_mniCstNotaFiscalActionPerformed

    private void mniAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddFuncionarioActionPerformed
        addCentered(new FuncionarioAdd());
    }//GEN-LAST:event_mniAddFuncionarioActionPerformed

    private void mniAtrFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAtrFuncionarioActionPerformed
        addCentered(new FuncionarioAlterar());
    }//GEN-LAST:event_mniAtrFuncionarioActionPerformed

    private void mniRmvFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRmvFuncionarioActionPerformed
        addCentered(new FuncionarioRemover());
    }//GEN-LAST:event_mniRmvFuncionarioActionPerformed

    private void mniCstFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCstFuncionarioActionPerformed
        addCentered(new FuncionarioConsulta());
    }//GEN-LAST:event_mniCstFuncionarioActionPerformed

    private void mniAddMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddMotoristaActionPerformed
        addCentered(new MotoristaAdd());
    }//GEN-LAST:event_mniAddMotoristaActionPerformed

    private void mniAtrMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAtrMotoristaActionPerformed
        addCentered(new MotoristaAlterar());
    }//GEN-LAST:event_mniAtrMotoristaActionPerformed

    private void mniRmvMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRmvMotoristaActionPerformed
        addCentered(new MotoristaRemover());
    }//GEN-LAST:event_mniRmvMotoristaActionPerformed

    private void mniCstMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCstMotoristaActionPerformed
        addCentered(new MotoristaConsulta());
    }//GEN-LAST:event_mniCstMotoristaActionPerformed

    private void ProdutosRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosRelatorioActionPerformed
        ProdutoRelatorioModal prodRelatorio = new ProdutoRelatorioModal(this, false, null);
        prodRelatorio.setVisible(true);
    }//GEN-LAST:event_ProdutosRelatorioActionPerformed

    private void mniEnderecosRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEnderecosRelatorioActionPerformed
        EnderecoRelatorioModal endRelatorio = new EnderecoRelatorioModal(this, false);
        endRelatorio.setVisible(true);
    }//GEN-LAST:event_mniEnderecosRelatorioActionPerformed

    private void mniAddCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddCaminhaoActionPerformed
        addCentered(new CaminhaoAdd());
    }//GEN-LAST:event_mniAddCaminhaoActionPerformed

    private void mniAtrCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAtrCaminhaoActionPerformed
        addCentered(new CaminhaoAlterar());
    }//GEN-LAST:event_mniAtrCaminhaoActionPerformed

    private void mniRmvCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRmvCaminhaoActionPerformed
        addCentered(new CaminhaoRemover());
    }//GEN-LAST:event_mniRmvCaminhaoActionPerformed

    private void mniCstCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCstCaminhaoActionPerformed
        addCentered(new CaminhaoConsulta());
    }//GEN-LAST:event_mniCstCaminhaoActionPerformed

    private void mniAtrCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAtrCargaActionPerformed
        addCentered(new CargaAlterar());
    }//GEN-LAST:event_mniAtrCargaActionPerformed

    private void mniRmvCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRmvCargaActionPerformed
        addCentered(new CargaRemover());
    }//GEN-LAST:event_mniRmvCargaActionPerformed

    private void mniDespCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDespCargaActionPerformed
        addCentered(new CargaDespachar());
    }//GEN-LAST:event_mniDespCargaActionPerformed

    private void mniPendCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPendCargaActionPerformed
        addCentered(new CargaPendentes());
    }//GEN-LAST:event_mniPendCargaActionPerformed

    private void mniCstCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCstCargaActionPerformed
        addCentered(new CargaConsulta());
    }//GEN-LAST:event_mniCstCargaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        SelecionarTipoUsuario slcTipoUser = new SelecionarTipoUsuario(this, true);
        slcTipoUser.setVisible(true);
        this.tipoUsuario = slcTipoUser.getTipo();
        tipoUsuario(this.tipoUsuario);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            Conexao.fecharConexao();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowClosed

    private void mniApagarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniApagarTudoActionPerformed
        int opt = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja apagar todos os registros do banco de dados?",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        if (opt == 0){
            try {
                AdminActions adminActions = new AdminActions();
                adminActions.apagaTudo();
                JOptionPane.showMessageDialog(rootPane, "Banco de dados apagado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro: "+ e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_mniApagarTudoActionPerformed

    private void mniRelaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelaFuncionarioActionPerformed
        FuncionarioRelatorioModal relatorioFunc = new FuncionarioRelatorioModal(this, true);
        relatorioFunc.setVisible(true);
    }//GEN-LAST:event_mniRelaFuncionarioActionPerformed

    private void mniRelaMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelaMotoristaActionPerformed
        MotoristaRelatorioModal motRelatorio = new MotoristaRelatorioModal(this, true);
        motRelatorio.setVisible(true);
    }//GEN-LAST:event_mniRelaMotoristaActionPerformed

    private void mniRelaNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRelaNotaFiscalActionPerformed
        NotaFiscalRelatorioModal nfRelatorio = new NotaFiscalRelatorioModal(this, true);
        nfRelatorio.setVisible(true);
    }//GEN-LAST:event_mniRelaNotaFiscalActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ProdutosRelatorio;
    private javax.swing.JDesktopPane dskpTela;
    private javax.swing.JMenu mnCaminhao;
    private javax.swing.JMenu mnCarga;
    private javax.swing.JMenu mnEnderecos;
    private javax.swing.JMenu mnFuncionario;
    private javax.swing.JMenuBar mnMenus;
    private javax.swing.JMenu mnMotorista;
    private javax.swing.JMenu mnNotaFiscal;
    private javax.swing.JMenu mnProdEnd;
    private javax.swing.JMenu mnProdutos;
    private javax.swing.JMenuItem mniAddCaminhao;
    private javax.swing.JMenuItem mniAddCarga;
    private javax.swing.JMenuItem mniAddCarga1;
    private javax.swing.JMenuItem mniAddFuncionario;
    private javax.swing.JMenuItem mniAddMotorista;
    private javax.swing.JMenuItem mniApagarTudo;
    private javax.swing.JMenuItem mniAtrCaminhao;
    private javax.swing.JMenuItem mniAtrCarga;
    private javax.swing.JMenuItem mniAtrFuncionario;
    private javax.swing.JMenuItem mniAtrMotorista;
    private javax.swing.JMenuItem mniAtrNotaFiscal;
    private javax.swing.JMenuItem mniCstCaminhao;
    private javax.swing.JMenuItem mniCstCarga;
    private javax.swing.JMenuItem mniCstFuncionario;
    private javax.swing.JMenuItem mniCstMotorista;
    private javax.swing.JMenuItem mniCstNotaFiscal;
    private javax.swing.JMenuItem mniDespCarga;
    private javax.swing.JMenuItem mniEnderecosRelatorio;
    private javax.swing.JMenuItem mniPendCarga;
    private javax.swing.JMenuItem mniRelaFuncionario;
    private javax.swing.JMenuItem mniRelaMotorista;
    private javax.swing.JMenuItem mniRelaNotaFiscal;
    private javax.swing.JMenuItem mniRelatorioVisualCam;
    private javax.swing.JMenuItem mniRelatorioVisualCarga;
    private javax.swing.JMenuItem mniRelatorioVisualEnd;
    private javax.swing.JMenuItem mniRelatorioVisualFunc;
    private javax.swing.JMenuItem mniRelatorioVisualMot;
    private javax.swing.JMenuItem mniRelatorioVisualNF;
    private javax.swing.JMenuItem mniRelatorioVisualProd;
    private javax.swing.JMenuItem mniRmvCaminhao;
    private javax.swing.JMenuItem mniRmvCarga;
    private javax.swing.JMenuItem mniRmvFuncionario;
    private javax.swing.JMenuItem mniRmvMotorista;
    private javax.swing.JMenuItem mniRmvNotaFiscal;
    // End of variables declaration//GEN-END:variables
}
