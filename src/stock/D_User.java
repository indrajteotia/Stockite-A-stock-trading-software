package stock;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author indrajteotia
 */
public class D_User extends javax.swing.JFrame {
    
    int n = 0;

    /**
     * Creates new form A_welcome
     */
    public D_User() {
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

        bodyPnl = new javax.swing.JPanel();
        headLbl = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        prcLbl = new javax.swing.JLabel();
        prcHolder = new javax.swing.JLabel();
        stkLbl = new javax.swing.JLabel();
        stkHolder = new javax.swing.JLabel();
        mnyLbl = new javax.swing.JLabel();
        mnyHolder = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        idHolder = new javax.swing.JLabel();
        sellBtn = new javax.swing.JButton();
        buyBtn = new javax.swing.JButton();
        sellPnl = new javax.swing.JPanel();
        sellPnl.setVisible(false);
        sellLbl = new javax.swing.JLabel();
        sellPnlHead = new javax.swing.JLabel();
        sellTxt = new javax.swing.JTextField();
        sellConBtn = new javax.swing.JButton();
        buyPnl = new javax.swing.JPanel();
        buyPnl.setVisible(false);
        buyLbl = new javax.swing.JLabel();
        buyPnlHead = new javax.swing.JLabel();
        buyTxt = new javax.swing.JTextField();
        buyConBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Page");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 51, 51));

        bodyPnl.setBackground(new java.awt.Color(0, 51, 51));
        bodyPnl.setLayout(null);

        headLbl.setFont(new java.awt.Font("Liberation Mono", 1, 36)); // NOI18N
        headLbl.setForeground(new java.awt.Color(0, 204, 204));
        headLbl.setText("User Page");
        bodyPnl.add(headLbl);
        headLbl.setBounds(290, 0, 210, 70);

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/imgusr.png"))); // NOI18N
        bodyPnl.add(icon);
        icon.setBounds(590, 0, 150, 160);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/imgBack.png"))); // NOI18N
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBtnMouseExited(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        bodyPnl.add(backBtn);
        backBtn.setBounds(30, 30, 50, 50);

        prcLbl.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        prcLbl.setForeground(new java.awt.Color(255, 102, 0));
        prcLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        prcLbl.setText("Stocks Price :");
        bodyPnl.add(prcLbl);
        prcLbl.setBounds(20, 240, 160, 40);

        prcHolder.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        prcHolder.setForeground(new java.awt.Color(255, 255, 51));
        prcHolder.setText("100");
        bodyPnl.add(prcHolder);
        prcHolder.setBounds(200, 240, 140, 40);

        stkLbl.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        stkLbl.setForeground(new java.awt.Color(102, 153, 255));
        stkLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stkLbl.setText("Stocks you have :");
        bodyPnl.add(stkLbl);
        stkLbl.setBounds(80, 180, 160, 40);

        stkHolder.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        stkHolder.setForeground(new java.awt.Color(0, 255, 153));
        stkHolder.setText("10");
        bodyPnl.add(stkHolder);
        stkHolder.setBounds(260, 180, 140, 40);

        mnyLbl.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        mnyLbl.setForeground(new java.awt.Color(102, 153, 255));
        mnyLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mnyLbl.setText("Money you have :");
        bodyPnl.add(mnyLbl);
        mnyLbl.setBounds(80, 130, 160, 40);

        mnyHolder.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        mnyHolder.setForeground(new java.awt.Color(0, 255, 153));
        mnyHolder.setText("100");
        bodyPnl.add(mnyHolder);
        mnyHolder.setBounds(260, 130, 140, 40);

        idLbl.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        idLbl.setForeground(new java.awt.Color(102, 153, 255));
        idLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idLbl.setText("UserID :");
        bodyPnl.add(idLbl);
        idLbl.setBounds(110, 80, 130, 40);

        idHolder.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        idHolder.setForeground(new java.awt.Color(0, 255, 153));
        idHolder.setText("User");
        bodyPnl.add(idHolder);
        idHolder.setBounds(260, 80, 140, 40);

        sellBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        sellBtn.setForeground(new java.awt.Color(0, 51, 102));
        sellBtn.setText("Sell");
        sellBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        sellBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellBtnActionPerformed(evt);
            }
        });
        bodyPnl.add(sellBtn);
        sellBtn.setBounds(110, 370, 90, 40);

        buyBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        buyBtn.setForeground(new java.awt.Color(0, 51, 102));
        buyBtn.setText("Buy");
        buyBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        buyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBtnActionPerformed(evt);
            }
        });
        bodyPnl.add(buyBtn);
        buyBtn.setBounds(110, 320, 90, 40);

        sellPnl.setBackground(new java.awt.Color(0, 102, 102));
        sellPnl.setLayout(null);

        sellLbl.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        sellLbl.setForeground(new java.awt.Color(255, 102, 0));
        sellLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sellLbl.setText("Enter Stocks :");
        sellPnl.add(sellLbl);
        sellLbl.setBounds(40, 110, 130, 40);

        sellPnlHead.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        sellPnlHead.setForeground(new java.awt.Color(102, 153, 255));
        sellPnlHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sellPnlHead.setText("SELL");
        sellPnlHead.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 0), java.awt.Color.pink));
        sellPnl.add(sellPnlHead);
        sellPnlHead.setBounds(140, 20, 130, 40);

        sellTxt.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        sellPnl.add(sellTxt);
        sellTxt.setBounds(180, 110, 210, 40);

        sellConBtn.setBackground(new java.awt.Color(0, 204, 102));
        sellConBtn.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        sellConBtn.setForeground(new java.awt.Color(51, 0, 153));
        sellConBtn.setText("Confirm Transaction");
        sellPnl.add(sellConBtn);
        sellConBtn.setBounds(140, 180, 200, 30);

        bodyPnl.add(sellPnl);
        sellPnl.setBounds(350, 180, 420, 250);

        buyPnl.setBackground(new java.awt.Color(0, 102, 102));
        buyPnl.setLayout(null);

        buyLbl.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        buyLbl.setForeground(new java.awt.Color(255, 102, 0));
        buyLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        buyLbl.setText("Enter Stocks :");
        buyPnl.add(buyLbl);
        buyLbl.setBounds(40, 110, 130, 40);

        buyPnlHead.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        buyPnlHead.setForeground(new java.awt.Color(102, 153, 255));
        buyPnlHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buyPnlHead.setText("BUY");
        buyPnlHead.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 0), java.awt.Color.pink));
        buyPnl.add(buyPnlHead);
        buyPnlHead.setBounds(140, 20, 130, 40);

        buyTxt.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        buyPnl.add(buyTxt);
        buyTxt.setBounds(180, 110, 210, 40);

        buyConBtn.setBackground(new java.awt.Color(0, 204, 102));
        buyConBtn.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        buyConBtn.setForeground(new java.awt.Color(51, 0, 153));
        buyConBtn.setText("Confirm Transaction");
        buyPnl.add(buyConBtn);
        buyConBtn.setBounds(140, 180, 200, 30);

        bodyPnl.add(buyPnl);
        buyPnl.setBounds(350, 180, 420, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        setBounds(300, 200, 814, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new A_Welcome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void buyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBtnActionPerformed
        // TODO add your handling code here:
        sellPnl.setVisible(false);
        buyPnl.setVisible(true);
    }//GEN-LAST:event_buyBtnActionPerformed

    private void sellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellBtnActionPerformed
        // TODO add your handling code here:
        sellPnl.setVisible(true);
        buyPnl.setVisible(false);
    }//GEN-LAST:event_sellBtnActionPerformed

    private void backBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseEntered
        // TODO add your handling code here:
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/imgBackPressed.png")));
    }//GEN-LAST:event_backBtnMouseEntered

    private void backBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseExited
        // TODO add your handling code here:
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/imgBack.png")));
    }//GEN-LAST:event_backBtnMouseExited

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
            java.util.logging.Logger.getLogger(D_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new D_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel bodyPnl;
    private javax.swing.JButton buyBtn;
    private javax.swing.JButton buyConBtn;
    private javax.swing.JLabel buyLbl;
    private javax.swing.JPanel buyPnl;
    private javax.swing.JLabel buyPnlHead;
    private javax.swing.JTextField buyTxt;
    private javax.swing.JLabel headLbl;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel idHolder;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel mnyHolder;
    private javax.swing.JLabel mnyLbl;
    private javax.swing.JLabel prcHolder;
    private javax.swing.JLabel prcLbl;
    private javax.swing.JButton sellBtn;
    private javax.swing.JButton sellConBtn;
    private javax.swing.JLabel sellLbl;
    private javax.swing.JPanel sellPnl;
    private javax.swing.JLabel sellPnlHead;
    private javax.swing.JTextField sellTxt;
    private javax.swing.JLabel stkHolder;
    private javax.swing.JLabel stkLbl;
    // End of variables declaration//GEN-END:variables
}
