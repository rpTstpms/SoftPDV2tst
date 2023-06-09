/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package softpdv.view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import softpdv.data.ListaProdutos;
import softpdv.data.ListaProdutosVenda;
import softpdv.data.Produtos;
import softpdv.data.ProdutosVenda;

/**
 *
 * @author Paulo
 */
public class TelaVenda extends javax.swing.JFrame {
    TelaCancelarProduto telaCancelar = new TelaCancelarProduto();
    private int idProduto = 0;
    private final StringBuilder sbProdutos = new StringBuilder();
    int quantidade = 0;
    double vlTotal = 0;
    /**
     * Creates new form Venda
     */
    public TelaVenda() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        txtCodigo.requestFocus();
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbProdutos = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnCancelarItem = new javax.swing.JButton();
        btnCancelarVenda = new javax.swing.JButton();
        btnQuantidade = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbVlTotal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Venda");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(151, 0, 222));
        jPanel1.setForeground(new java.awt.Color(255, 199, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 199, 0));
        jLabel1.setText("SoftPDV");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 199, 0));
        jLabel2.setText("Venda");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(234, 158, 48));

        lbProdutos.setEditable(false);
        lbProdutos.setBackground(new java.awt.Color(234, 158, 48));
        lbProdutos.setColumns(20);
        lbProdutos.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lbProdutos.setForeground(new java.awt.Color(151, 0, 222));
        lbProdutos.setRows(5);
        lbProdutos.setBorder(null);
        lbProdutos.setFocusable(false);
        jScrollPane1.setViewportView(lbProdutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(234, 158, 48));

        btnCancelarItem.setBackground(new java.awt.Color(102, 0, 102));
        btnCancelarItem.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnCancelarItem.setForeground(new java.awt.Color(234, 158, 48));
        btnCancelarItem.setText("Cancelar Item");
        btnCancelarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarItemActionPerformed(evt);
            }
        });

        btnCancelarVenda.setBackground(new java.awt.Color(102, 0, 102));
        btnCancelarVenda.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnCancelarVenda.setForeground(new java.awt.Color(234, 158, 48));
        btnCancelarVenda.setText("Cancelar Venda");
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        btnQuantidade.setBackground(new java.awt.Color(102, 0, 102));
        btnQuantidade.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnQuantidade.setForeground(new java.awt.Color(234, 158, 48));
        btnQuantidade.setText("Quantidade");
        btnQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCancelarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(234, 158, 48));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(151, 0, 222));
        jLabel5.setText("Total:");

        lbVlTotal.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        lbVlTotal.setForeground(new java.awt.Color(151, 0, 222));
        lbVlTotal.setText("0,00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lbVlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(234, 158, 48));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(151, 0, 222));
        jLabel4.setText("C�digo de Barras:");

        txtCodigo.setBackground(new java.awt.Color(151, 0, 222));
        txtCodigo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(234, 158, 48));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addGap(809, 809, 809)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarItemActionPerformed
        TelaCancelarProduto AbrirTelaCancelar = new TelaCancelarProduto();
        AbrirTelaCancelar.setVisible(true);
    }//GEN-LAST:event_btnCancelarItemActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "N�o");

        int cancelar = JOptionPane.showConfirmDialog(rootPane, "Deseja cancelar a venda?", "Cancelar Venda", 
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, 
                null);
        if(cancelar == 0){
            dispose();
        }
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrarVenda();
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void btnQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuantidadeActionPerformed
        String quantidadeStr;
        quantidadeStr = JOptionPane.showInputDialog(rootPane, "Digite a quantidade", "Quantidade", HEIGHT);
        if(quantidadeStr != null){
            try{
                quantidade = Integer.parseInt(quantidadeStr);
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Digite apenas n�meros", "Erro", HEIGHT);
            }
        }
    }//GEN-LAST:event_btnQuantidadeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarItem;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lbProdutos;
    private javax.swing.JLabel lbVlTotal;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
    
    private void cadastrarVenda(){
        String codigo = txtCodigo.getText();
        
        if(!codigo.isEmpty()){
            Produtos produtoAtual = ListaProdutos.buscarProdutoCodigo(codigo, codigo);
            
            if(produtoAtual != null){
                idProduto ++;
                double vlVenda;
                double vlUnitario;
                vlUnitario = Double.parseDouble(produtoAtual.getVlVenda());
                
                if(quantidade > 1){
                    vlVenda = vlUnitario * quantidade; 
                } else {
                    quantidade = 1;
                    vlVenda = vlUnitario * quantidade; 
                }
                
                vlTotal += vlVenda;
                String vlTotalStr = String.format("%.2f",vlTotal);
                String vlUnitarioStr = String.format("%.2f", vlUnitario);
                String vlVendaStr = String.format("%.2f", vlVenda);
                lbVlTotal.setText(vlTotalStr);
                
                String produtos = idProduto + " - " + produtoAtual.getCodigo() + " - " + produtoAtual.getDescricao() + " - R$ " 
                        + vlUnitarioStr + "\n          x" + quantidade + " - " + vlVendaStr + "\n\n";
                
                ProdutosVenda produtoVenda = new ProdutosVenda();
                produtoVenda.setProduto(produtos);
                produtoVenda.setCodigoProduto(produtoAtual.getCodigo());
                produtoVenda.setCodigo(idProduto);
                produtoVenda.setDescricao(produtoAtual.getDescricao());
                produtoVenda.setQuantidade(quantidade);
                produtoVenda.setVlTotal(vlVenda);
                produtoVenda.setVlUnitario(vlUnitario);
                ListaProdutosVenda.adicionar(produtoVenda);
                
                quantidade = 0;
                lbProdutos.append(produtos);
                txtCodigo.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Produto n�o encontrado", "Erro", HEIGHT);
                txtCodigo.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Produto n�o encontrado", "Erro", HEIGHT);
            txtCodigo.setText("");
        }
    }

    public JTextArea getLbProdutos() {
        return lbProdutos;
    }
    
    public void excluirProduto(){
        String produtoNovo = telaCancelar.getNewTxtProdutos();
        lbProdutos.remove(this);
    }    
    
}
