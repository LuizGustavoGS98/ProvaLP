package com.mycompany.projeto;

import java.util.Random;

public class ProjetoLP extends javax.swing.JFrame {
        
    public ProjetoLP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgbCPU = new javax.swing.JProgressBar();
        pgbDisco = new javax.swing.JProgressBar();
        pgbMemoria = new javax.swing.JProgressBar();
        lblTitulo = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblMinCPU = new javax.swing.JLabel();
        lblMaxCPU = new javax.swing.JLabel();
        lblmedCPU = new javax.swing.JLabel();
        lblUsoMin = new javax.swing.JLabel();
        lblUsoMax = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblTextCPU = new javax.swing.JLabel();
        lblTextMemoria = new javax.swing.JLabel();
        lblTextDisco = new javax.swing.JLabel();
        lblMinMemo = new javax.swing.JLabel();
        lblMaxMemo = new javax.swing.JLabel();
        lblMedMemo = new javax.swing.JLabel();
        lblMinDisc = new javax.swing.JLabel();
        lblMaxDisc = new javax.swing.JLabel();
        lblMedDisc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lblTitulo.setText("Projeto individual LP");

        btnCalcular.setText("Fazer leitura dos dados");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblMinCPU.setText("Mínimo:");

        lblMaxCPU.setText("Máxima:");

        lblmedCPU.setText("Média:");

        lblUsoMin.setText("0%");

        lblUsoMax.setText("100%");

        jLabel12.setText("100%");

        jLabel13.setText("0%");

        jLabel14.setText("100%");

        jLabel15.setText("0%");

        lblTextCPU.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTextCPU.setText("CPU");

        lblTextMemoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTextMemoria.setText("Memória");

        lblTextDisco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTextDisco.setText("Disco");

        lblMinMemo.setText("Mínimo:");

        lblMaxMemo.setText("Máxima:");

        lblMedMemo.setText("Média:");

        lblMinDisc.setText("Mínimo:");

        lblMaxDisc.setText("Máxima:");

        lblMedDisc.setText("Média:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUsoMin, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblMinCPU)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMaxCPU))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblMinDisc)
                                    .addGap(96, 96, 96)
                                    .addComponent(lblMedDisc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMaxDisc))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblMinMemo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMaxMemo))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(pgbCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(pgbMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pgbDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUsoMax)
                                .addComponent(jLabel14)
                                .addComponent(jLabel12)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(lblmedCPU)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lblTextMemoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addGap(113, 113, 113))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMedMemo)
                                    .addComponent(lblTextDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(182, 182, 182)))))
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTextCPU)
                .addGap(324, 324, 324))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblUsoMin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblUsoMax))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTextCPU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pgbCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMinCPU)
                        .addComponent(lblMaxCPU))
                    .addComponent(lblmedCPU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextMemoria)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pgbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel14))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinMemo)
                    .addComponent(lblMaxMemo)
                    .addComponent(lblMedMemo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblTextDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pgbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMinDisc)
                        .addComponent(lblMaxDisc))
                    .addComponent(lblMedDisc))
                .addGap(24, 24, 24)
                .addComponent(btnCalcular)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
        Integer cont = 0, minCPU = 100, maxCPU = 0, minMemo = 100, maxMemo = 0, minDisc = 100, maxDisc = 0;
        Double mediaCPU = 0.0, mediaDisc = 0.0, mediaMemo = 0.0;

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        Random rand = new Random();
        
        Integer randCPU = rand.nextInt(101);
        Integer randMemo = rand.nextInt(101);
        Integer randDisc = rand.nextInt(101);
        
        pgbCPU.setValue(randCPU);
        pgbMemoria.setValue(randMemo);
        pgbDisco.setValue(randDisc);
        
        if(randCPU < minCPU){
            minCPU = randCPU;
        }
        if(randCPU > maxCPU){
            maxCPU = randCPU;
        }
        if(randMemo < minMemo){
            minMemo = randMemo;
        }
        if(randMemo > maxMemo){
            maxMemo = randMemo;
        }
        if(randDisc < minDisc){
            minDisc = randDisc;
        }
        if(randDisc > maxDisc){
            maxDisc = randDisc;
        }
        cont++;
        
        mediaCPU = (mediaCPU + randCPU);
        mediaMemo = (mediaMemo + randMemo);
        mediaDisc = (mediaDisc + randDisc);
        
        Double mCPU = (mediaCPU/cont);
        Double mMemo = (mediaMemo/cont);
        Double mDisc = (mediaDisc/cont); 
        
        lblMinCPU.setText(String.valueOf("Mínimo: " + minCPU));    
        lblmedCPU.setText(String.valueOf(String.format("Média: %.0f",mCPU)));        
        lblMaxCPU.setText(String.valueOf("Máxima: " + maxCPU));
        
        lblMinMemo.setText(String.valueOf("Mínimo: " + minMemo));     
        lblMedMemo.setText(String.valueOf(String.format("Média: %.0f",mMemo)));
        lblMaxMemo.setText(String.valueOf("Máxima: " + maxMemo));
        
        lblMinDisc.setText(String.valueOf("Mínimo: " + minDisc));
        lblMedDisc.setText(String.valueOf(String.format("Média: %.0f",mDisc)));
        lblMaxDisc.setText(String.valueOf("Máxima: " + maxDisc));
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(ProjetoLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoLP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel lblMaxCPU;
    private javax.swing.JLabel lblMaxDisc;
    private javax.swing.JLabel lblMaxMemo;
    private javax.swing.JLabel lblMedDisc;
    private javax.swing.JLabel lblMedMemo;
    private javax.swing.JLabel lblMinCPU;
    private javax.swing.JLabel lblMinDisc;
    private javax.swing.JLabel lblMinMemo;
    private javax.swing.JLabel lblTextCPU;
    private javax.swing.JLabel lblTextDisco;
    private javax.swing.JLabel lblTextMemoria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsoMax;
    private javax.swing.JLabel lblUsoMin;
    private javax.swing.JLabel lblmedCPU;
    private javax.swing.JProgressBar pgbCPU;
    private javax.swing.JProgressBar pgbDisco;
    private javax.swing.JProgressBar pgbMemoria;
    // End of variables declaration//GEN-END:variables
}
