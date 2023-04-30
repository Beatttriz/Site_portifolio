
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class TelaCalculadora extends javax.swing.JFrame {
    String operador;
    
    public TelaCalculadora() {
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

        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        btMais = new javax.swing.JButton();
        btMenos = new javax.swing.JButton();
        btVezes = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        n1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                n1FocusGained(evt);
            }
        });
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        btMais.setBackground(new java.awt.Color(255, 255, 255));
        btMais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btMais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-soma-16.png"))); // NOI18N
        btMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaisActionPerformed(evt);
            }
        });

        btMenos.setBackground(new java.awt.Color(255, 255, 255));
        btMenos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-subtração-16.png"))); // NOI18N
        btMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenosActionPerformed(evt);
            }
        });

        btVezes.setBackground(new java.awt.Color(255, 255, 255));
        btVezes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btVezes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-multiplicação-16.png"))); // NOI18N
        btVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVezesActionPerformed(evt);
            }
        });

        btDividir.setBackground(new java.awt.Color(255, 255, 255));
        btDividir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-subtração-16 - Copia.png"))); // NOI18N
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-apagador-16.png"))); // NOI18N
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btIgual.setBackground(new java.awt.Color(255, 255, 255));
        btIgual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-subtração-16 - Copia (2).png"))); // NOI18N
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Calculadora");

        txtResult.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btVezes, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btDividir, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(btMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n2ActionPerformed

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIgualActionPerformed
  try{
           double num1 = Double.parseDouble(n1.getText());
           double num2 = Double.parseDouble(n2.getText());
           double resultado;
           
           switch (operador){
                case "somar":
                       resultado = num1 + num2;
                       txtResult.setText(Double.toString(resultado));
                       break;
                case "subtrair":
                       resultado = num1 - num2;
                       txtResult.setText(Double.toString(resultado));
                       break;
                case "Multiplicar":
                       resultado = num1 * num2;
                       txtResult.setText(Double.toString(resultado)); 
                       break;
                case "Dividir":
                       resultado = num1 / num2;
                       DecimalFormat dc = new DecimalFormat("0.00");
                       txtResult.setText(dc.format(resultado));
                       break;
           }
            
           }catch(NumberFormatException erro){
           JOptionPane.showMessageDialog(null, "Informe o valor validos", "calculadora", JOptionPane.ERROR_MESSAGE);
           
           }
            n1.setText("");
            n2.setText("");
    }//GEN-LAST:event_btIgualActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
     
        
    }//GEN-LAST:event_txtResultActionPerformed

    private void btMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaisActionPerformed
        operador = null;
        operador = "somar";
    }//GEN-LAST:event_btMaisActionPerformed

    private void btMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenosActionPerformed
        operador = null;
        operador = "subtrair";
    }//GEN-LAST:event_btMenosActionPerformed

    private void btVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVezesActionPerformed
        operador = null;
        operador = "Multiplicar";
    }//GEN-LAST:event_btVezesActionPerformed

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        operador = null;
        operador = "Dividir";
    }//GEN-LAST:event_btDividirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        n1.setText("");
        n2.setText("");
        txtResult.setText("");
        n1.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed

    private void n1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_n1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_n1FocusGained

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_n1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btMais;
    private javax.swing.JButton btMenos;
    private javax.swing.JButton btVezes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}