package gambar;

import java.awt.CardLayout;

public class gambarpokoknya extends javax.swing.JFrame {
private CardLayout card;
    public gambarpokoknya() {
        initComponents();  
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jptoombol = new javax.swing.JPanel();
        gmbr1 = new javax.swing.JToggleButton();
        gmbr2 = new javax.swing.JToggleButton();
        gmbr3 = new javax.swing.JToggleButton();
        gmbr4 = new javax.swing.JToggleButton();
        imagePanel = new javax.swing.JPanel();
        gambar1 = new javax.swing.JLabel();
        gambar2 = new javax.swing.JLabel();
        gambar3 = new javax.swing.JLabel();
        gambar4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jptoombol.setBackground(new java.awt.Color(255, 255, 153));

        gmbr1.setText("Gambar 1");
        gmbr1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gmbr1ItemStateChanged(evt);
            }
        });
        gmbr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmbr1ActionPerformed(evt);
            }
        });
        jptoombol.add(gmbr1);

        gmbr2.setText("Gambar 2");
        gmbr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmbr2ActionPerformed(evt);
            }
        });
        jptoombol.add(gmbr2);

        gmbr3.setText("Gambar 4");
        gmbr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmbr3ActionPerformed(evt);
            }
        });
        jptoombol.add(gmbr3);

        gmbr4.setText("Gambar 3");
        gmbr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmbr4ActionPerformed(evt);
            }
        });
        jptoombol.add(gmbr4);

        imagePanel.setLayout(new java.awt.CardLayout());

        gambar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/3.png"))); // NOI18N
        gambar1.setName("2"); // NOI18N
        imagePanel.add(gambar1, "1");

        gambar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/2.png"))); // NOI18N
        gambar2.setName("1"); // NOI18N
        imagePanel.add(gambar2, "3");

        gambar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Design.png"))); // NOI18N
        gambar3.setName("0"); // NOI18N
        imagePanel.add(gambar3, "0");

        gambar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/4.png"))); // NOI18N
        gambar4.setName("3"); // NOI18N
        imagePanel.add(gambar4, "2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jptoombol, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jptoombol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gmbr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmbr1ActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_gmbr1ActionPerformed

    private void gmbr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmbr2ActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_gmbr2ActionPerformed

    private void gmbr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmbr4ActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_gmbr4ActionPerformed

    private void gmbr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmbr3ActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "3");
    }//GEN-LAST:event_gmbr3ActionPerformed

    private void gmbr1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gmbr1ItemStateChanged
       CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_gmbr1ItemStateChanged

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
            java.util.logging.Logger.getLogger(gambarpokoknya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gambarpokoknya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gambarpokoknya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gambarpokoknya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gambarpokoknya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gambar1;
    private javax.swing.JLabel gambar2;
    private javax.swing.JLabel gambar3;
    private javax.swing.JLabel gambar4;
    private javax.swing.JToggleButton gmbr1;
    private javax.swing.JToggleButton gmbr2;
    private javax.swing.JToggleButton gmbr3;
    private javax.swing.JToggleButton gmbr4;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JPanel jptoombol;
    // End of variables declaration//GEN-END:variables
}
