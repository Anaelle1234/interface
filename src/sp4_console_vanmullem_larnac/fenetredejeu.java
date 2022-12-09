/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_vanmullem_larnac;

/**
 *
 * @author Anaëlle
 */
public class fenetredejeu extends javax.swing.JFrame {

    
    joueur listeJoueurs[] = new joueur[2]; //tableau référence des deux joueurs 
    joueur joueurCourant;
    PlateauDeJeu plateau;
    CelluleDeGrille grille = new CelluleDeGrille();

    /**
     * Creates new form fenetredejeu
     */
    public fenetredejeu() {
        initComponents();
        panneau_info_joueur.setVisible(false);
        panneau_info_joueur1.setVisible(false);
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j > 7; j++) {
                cellulegraphique cellgraphe = new cellulegraphique(grille);
                panneau_grille.add(cellgraphe);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_info_jeu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomjoueur2 = new javax.swing.JTextField();
        nomjoueur1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        panneau_info_joueur = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        courant = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        panneau_info_partie = new javax.swing.JPanel();
        button_col_1 = new javax.swing.JButton();
        button_col_2 = new javax.swing.JButton();
        button_col_3 = new javax.swing.JButton();
        button_col_4 = new javax.swing.JButton();
        button_col_5 = new javax.swing.JButton();
        button_col_6 = new javax.swing.JButton();
        button_col_0 = new javax.swing.JButton();
        panneau_info_joueur1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nbdesin3 = new javax.swing.JLabel();
        nomjoueur4 = new javax.swing.JLabel();
        couleurj3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nbdesin4 = new javax.swing.JLabel();
        nomjoueur5 = new javax.swing.JLabel();
        couleurj4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 672, 576));

        panneau_info_jeu.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_jeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2 :");
        panneau_info_jeu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setText("Nom Joueur 1 :");
        panneau_info_jeu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        panneau_info_jeu.add(nomjoueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 150, -1));
        panneau_info_jeu.add(nomjoueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, -1));

        jButton1.setText("Let's start !");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panneau_info_jeu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        getContentPane().add(panneau_info_jeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 290, -1));

        panneau_info_joueur.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Info jeu");
        panneau_info_joueur.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        courant.setText("nomjoueurcourant");
        panneau_info_joueur.add(courant, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel7.setText("joueur courant");
        panneau_info_joueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneau_info_joueur.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(panneau_info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 290, 230));

        panneau_info_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 290, -1));

        button_col_1.setText("2");
        getContentPane().add(button_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        button_col_2.setText("3");
        getContentPane().add(button_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        button_col_3.setText("4");
        getContentPane().add(button_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        button_col_4.setText("5");
        getContentPane().add(button_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        button_col_5.setText("6");
        getContentPane().add(button_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        button_col_6.setText("7");
        getContentPane().add(button_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        button_col_0.setText("1");
        getContentPane().add(button_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        panneau_info_joueur1.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_joueur1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Info joueurs");
        panneau_info_joueur1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        nbdesin3.setText("nbdesi");
        panneau_info_joueur1.add(nbdesin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        nomjoueur4.setText("nomjoueur1");
        panneau_info_joueur1.add(nomjoueur4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        couleurj3.setText("nom couleur");
        panneau_info_joueur1.add(couleurj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel13.setText("joueur 1 ");
        panneau_info_joueur1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel14.setText("couleur");
        panneau_info_joueur1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel15.setText("desintégrateurs");
        panneau_info_joueur1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        panneau_info_joueur1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 170, 10));

        nbdesin4.setText("nbdesi1");
        panneau_info_joueur1.add(nbdesin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        nomjoueur5.setText("nomjoueur2");
        panneau_info_joueur1.add(nomjoueur5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        couleurj4.setText("nom couleur1");
        panneau_info_joueur1.add(couleurj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel16.setText("joueur 2 ");
        panneau_info_joueur1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel17.setText("couleur");
        panneau_info_joueur1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel18.setText("desintégrateurs");
        panneau_info_joueur1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        getContentPane().add(panneau_info_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 290, 230));

        setBounds(0, 0, 1049, 675);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panneau_info_joueur.setVisible(true);
        panneau_info_joueur1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetredejeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_col_0;
    private javax.swing.JButton button_col_1;
    private javax.swing.JButton button_col_2;
    private javax.swing.JButton button_col_3;
    private javax.swing.JButton button_col_4;
    private javax.swing.JButton button_col_5;
    private javax.swing.JButton button_col_6;
    private javax.swing.JLabel couleurj3;
    private javax.swing.JLabel couleurj4;
    private javax.swing.JLabel courant;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea message;
    private javax.swing.JLabel nbdesin3;
    private javax.swing.JLabel nbdesin4;
    private javax.swing.JTextField nomjoueur1;
    private javax.swing.JTextField nomjoueur2;
    private javax.swing.JLabel nomjoueur4;
    private javax.swing.JLabel nomjoueur5;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_jeu;
    private javax.swing.JPanel panneau_info_joueur;
    private javax.swing.JPanel panneau_info_joueur1;
    private javax.swing.JPanel panneau_info_partie;
    // End of variables declaration//GEN-END:variables
}
