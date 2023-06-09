/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package softpdv.view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import softpdv.data.ListaProdutos;
import softpdv.data.Produtos;

/**
 *
 * @author Paulo
 */
public class TelaCadastroProduto extends javax.swing.JFrame {
    
    /**
     * Creates new form CadastroProduto
     */
    public TelaCadastroProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoAdicional = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtSecao = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbLucro = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbPcLucro = new javax.swing.JLabel();
        txtPrecoCusto = new javax.swing.JFormattedTextField();
        txtPrecoVenda = new javax.swing.JFormattedTextField();
        txtQuantidade = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de produto");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(151, 0, 222));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 199, 0));
        jLabel2.setText("Produto");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 199, 0));
        jLabel1.setText("SoftPDV");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(234, 158, 48));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(151, 0, 222));
        jLabel5.setText("C�digo:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(151, 0, 222));
        jLabel6.setText("Descri��o:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(151, 0, 222));
        jLabel7.setText("Se��o:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(151, 0, 222));
        jLabel8.setText("C�digo adicional:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(151, 0, 222));
        jLabel9.setText("Pre�o de Venda:");

        txtCodigoAdicional.setBackground(new java.awt.Color(151, 0, 222));
        txtCodigoAdicional.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtCodigoAdicional.setForeground(new java.awt.Color(234, 158, 48));
        txtCodigoAdicional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoAdicionalKeyPressed(evt);
            }
        });

        txtDescricao.setBackground(new java.awt.Color(151, 0, 222));
        txtDescricao.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(234, 158, 48));
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });

        txtSecao.setBackground(new java.awt.Color(151, 0, 222));
        txtSecao.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtSecao.setForeground(new java.awt.Color(234, 158, 48));
        txtSecao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSecaoKeyPressed(evt);
            }
        });

        txtCodigo.setBackground(new java.awt.Color(151, 0, 222));
        txtCodigo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(234, 158, 48));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(151, 0, 222));
        jLabel10.setText("Pre�o de Custo:");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(151, 0, 222));
        jLabel11.setText("Quantidade:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(151, 0, 222));
        jLabel12.setText("Lucro:");
        jLabel12.setToolTipText("");

        lbLucro.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        lbLucro.setForeground(new java.awt.Color(151, 0, 222));
        lbLucro.setText("0,00");
        lbLucro.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(151, 0, 222));
        jLabel14.setText("Porcentagem de lucro:");
        jLabel14.setToolTipText("");

        lbPcLucro.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        lbPcLucro.setForeground(new java.awt.Color(151, 0, 222));
        lbPcLucro.setText("0,00%");
        lbPcLucro.setToolTipText("");

        txtPrecoCusto.setBackground(new java.awt.Color(151, 0, 222));
        txtPrecoCusto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPrecoCusto.setForeground(new java.awt.Color(234, 158, 48));
        try {
            txtPrecoCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPrecoCusto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecoCusto.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtPrecoCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoCustoKeyPressed(evt);
            }
        });

        txtPrecoVenda.setBackground(new java.awt.Color(151, 0, 222));
        txtPrecoVenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPrecoVenda.setForeground(new java.awt.Color(234, 158, 48));
        try {
            txtPrecoVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPrecoVenda.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtPrecoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoVendaKeyPressed(evt);
            }
        });

        txtQuantidade.setBackground(new java.awt.Color(151, 0, 222));
        txtQuantidade.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(234, 158, 48));
        txtQuantidade.setToolTipText("");
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(lbLucro)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(lbPcLucro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtCodigoAdicional))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(143, 143, 143)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                                    .addComponent(txtSecao))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecoVenda)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtQuantidade)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigo)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtCodigoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescricao))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrecoVenda)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrecoCusto))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLucro)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPcLucro))
                .addGap(31, 31, 31))
        );

        btnFinalizar.setBackground(new java.awt.Color(234, 158, 48));
        btnFinalizar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(151, 0, 222));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        btnFinalizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFinalizarKeyPressed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(234, 158, 48));
        btnSair.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnSair.setForeground(new java.awt.Color(151, 0, 222));
        btnSair.setText("Cancelar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(809, 809, 809)
                                .addComponent(jLabel1)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "N�o");

        int cancelar = JOptionPane.showConfirmDialog(rootPane, "Deseja cancelar o cadastro?", "Cancelar Cadastro", 
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, 
                null);
        if(cancelar == 0){
            dispose();
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        cadastroProduto();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN){
            txtCodigoAdicional.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCodigoAdicionalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoAdicionalKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN){
            txtDescricao.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoAdicionalKeyPressed

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN){
            txtSecao.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtCodigoAdicional.requestFocus();
        }
    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void txtSecaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecaoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN){
            txtQuantidade.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtDescricao.requestFocus();
        }
    }//GEN-LAST:event_txtSecaoKeyPressed

    private void txtPrecoCustoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoCustoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN){
            txtPrecoVenda.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtQuantidade.requestFocus();
        }
    }//GEN-LAST:event_txtPrecoCustoKeyPressed

    private void txtPrecoVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoVendaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnFinalizar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtPrecoCusto.requestFocus();
        }
    }//GEN-LAST:event_txtPrecoVendaKeyPressed

    private void btnFinalizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFinalizarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastroProduto();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtPrecoVenda.requestFocus();
        }
    }//GEN-LAST:event_btnFinalizarKeyPressed

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantidadeKeyTyped

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN){
            txtPrecoCusto.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtSecao.requestFocus();
        }
    }//GEN-LAST:event_txtQuantidadeKeyPressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbLucro;
    private javax.swing.JLabel lbPcLucro;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoAdicional;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JFormattedTextField txtPrecoCusto;
    private javax.swing.JFormattedTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtSecao;
    // End of variables declaration//GEN-END:variables
    
    private void cadastroProduto(){
        
        String codigo = txtCodigo.getText();
        String codigoAdicional = txtCodigoAdicional.getText();
        String descricao = txtDescricao.getText();
        String secao = txtSecao.getText();
        String quantidade = txtQuantidade.getText();
        String vlCusto = txtPrecoCusto.getText();
        String vlVenda = txtPrecoVenda.getText();
        
        if(vlVenda.equals("   .  ") || vlVenda.equals("000.00")){
            vlVenda = "0";
        }
        if(vlCusto.equals("   .  ") || vlCusto.equals("000.00")){
            vlCusto = "0";
        }
        
        double valorCusto = Double.parseDouble(vlCusto);
        double valorVenda = Double.parseDouble(vlVenda);
        
        if(!descricao.isEmpty() || valorCusto > 0.00 || valorVenda > 0.00){
            if(quantidade.isEmpty()){
                quantidade = "0";
            }
            if(codigoAdicional.isEmpty()){
                int idCodigoAdicional = Produtos.getIdCodigoAdicional();
                idCodigoAdicional++;
                Produtos.setIdCodigoAdicional(idCodigoAdicional);
                String idCodigoAdicionalStr = String.valueOf(idCodigoAdicional);
                codigoAdicional = idCodigoAdicionalStr;
            }
            if (codigo.isEmpty()){
                int idCodigo = Produtos.getIdCodigo();
                idCodigo++;
                Produtos.setIdCodigo(idCodigo);
                String idCodigoStr = String.valueOf(idCodigo);
                codigo = idCodigoStr;
            }
            if (secao.isEmpty()){
                secao = "NENHUMA";
            }
            Produtos produtoAtual;
            produtoAtual = ListaProdutos.buscarProdutoCodigo(codigo, codigoAdicional);
            if(produtoAtual == null){
                Produtos produto = new Produtos();
                produto.setCodigo(codigo);
                produto.setCodigoAdicional(codigoAdicional);
                produto.setDescricao(descricao);
                produto.setSecao(secao);
                produto.setQuantidade(quantidade);
                produto.setVlCusto(vlCusto);
                produto.setVlVenda(vlVenda);
                ListaProdutos.adicionar(produto);
                String resumo = "C�digo: " + codigo
                        + "\nC�digo Adicional: " + codigoAdicional
                        + "\nNome: " + descricao
                        + "\nSe��o: " + secao
                        + "\nQuantidade: " + quantidade
                        + "\nValor de custo: " + vlCusto
                        + "\nValor de venda: " + vlVenda;
                JOptionPane.showMessageDialog(rootPane, resumo, "Resumo", HEIGHT);
                JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso", "Sucesso", HEIGHT);
                dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Produto j� registrado", "Erro", HEIGHT);
            }    
        } else {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os dados", "Erro", HEIGHT);
        }
                
    }
    
    
}
