/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.util.ArrayList;
import static javax.swing.BorderFactory.createBevelBorder;
import javax.swing.*;
/**
 *
 * @author Gustavo
 */
public class Ver_Fotos extends javax.swing.JFrame {

    menu menuMain;
    void setMenuMain(menu aThis) {
        this.menuMain = aThis;
    }
    
    
    /**
     * Creates new form Ventana
     */
    public Ver_Fotos() {
        
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2Scroll = new javax.swing.JPanel();
        jLblPreviewImage = new javax.swing.JLabel();
        JLblPaisText = new javax.swing.JLabel();
        jLTDate = new javax.swing.JLabel();
        jLblDescriptionText = new javax.swing.JLabel();
        jButtonADD = new javax.swing.JButton();
        jButtonDELETE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCountry = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaDate = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        JtextName = new javax.swing.JTextArea();
        JLblPaisText1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2Scroll.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2Scroll.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2Scroll.setAlignmentX(15);
        jPanel2Scroll.setLayout(new javax.swing.BoxLayout(jPanel2Scroll, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane2.setViewportView(jPanel2Scroll);

        jLblPreviewImage.setBackground(new java.awt.Color(255, 255, 255));
        jLblPreviewImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblPreviewImage.setText("Preview");
        jLblPreviewImage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JLblPaisText.setText("Country:");
        JLblPaisText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLblPaisTextMouseClicked(evt);
            }
        });

        jLTDate.setText("Date:");

        jLblDescriptionText.setText("Description:");

        jButtonADD.setText("ADD");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });

        jButtonDELETE.setText("DELETE");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextAreaCountry.setEditable(false);
        jTextAreaCountry.setColumns(20);
        jTextAreaCountry.setForeground(java.awt.Color.darkGray);
        jTextAreaCountry.setLineWrap(true);
        jTextAreaCountry.setRows(5);
        jTextAreaCountry.setWrapStyleWord(true);
        jTextAreaCountry.setAutoscrolls(false);
        jTextAreaCountry.setBorder(null);
        jTextAreaCountry.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextAreaCountry);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextAreaDate.setEditable(false);
        jTextAreaDate.setColumns(20);
        jTextAreaDate.setLineWrap(true);
        jTextAreaDate.setRows(5);
        jTextAreaDate.setWrapStyleWord(true);
        jTextAreaDate.setBorder(null);
        jTextAreaDate.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTextAreaDate);

        jTextAreaDescription.setEditable(false);
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setLineWrap(true);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setWrapStyleWord(true);
        jTextAreaDescription.setBorder(null);
        jTextAreaDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextAreaDescription.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(jTextAreaDescription);

        JtextName.setEditable(false);
        JtextName.setColumns(20);
        JtextName.setForeground(java.awt.Color.darkGray);
        JtextName.setLineWrap(true);
        JtextName.setRows(5);
        JtextName.setWrapStyleWord(true);
        JtextName.setAutoscrolls(false);
        JtextName.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        JtextName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JtextName.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(JtextName);
        setVisible(false);

        JLblPaisText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLblPaisText1.setText("Name:");
        JLblPaisText1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLblPaisText1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblPreviewImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLblPaisText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLblDescriptionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLblPaisText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonDELETE)
                            .addComponent(jButtonADD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane5))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLblPaisText1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLblPreviewImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(JLblPaisText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLTDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblDescriptionText)
                        .addGap(24, 24, 24)
                        .addComponent(jButtonADD)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDELETE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
        String temp = JtextName.getText();
        System.out.print("\n \n intentaremos agregar: " + temp + "\n \n");
        menuMain.agregarAlCarrito(temp);
    }//GEN-LAST:event_jButtonADDActionPerformed

    private void JLblPaisTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLblPaisTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JLblPaisTextMouseClicked

    private void JLblPaisText1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLblPaisText1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JLblPaisText1MouseClicked
   
    
    public void desplegarDatos(ArrayList<ArrayList<Object>> tempListL){
        
//        String temp = (String) tempListL.get(0).get(0);
//        ImageIcon imageFinal = (ImageIcon) tempListL.get(0).get(1);
//        Icon icono = new ImageIcon(imageFinal.getImage().getScaledInstance(Ibl_Icon.getWidth(), Ibl_Icon.getHeight(), Image.SCALE_DEFAULT));
//        
        jPanel2Scroll.setLayout(new BoxLayout(jPanel2Scroll, BoxLayout.Y_AXIS));
        jPanel2Scroll.setBackground(Color.red);
        
        for(ArrayList<Object> ArrayList : tempListL)
        {
            javax.swing.JLabel jLabelIconF;
            javax.swing.JLabel jLblDescripcion;
            javax.swing.JLabel jLblFecha;
            javax.swing.JLabel jLblPais;
            
            jLabelIconF = new javax.swing.JLabel();
            jLblFecha = new javax.swing.JLabel();
            jLblDescripcion = new javax.swing.JLabel();
            jLblPais = new javax.swing.JLabel();


            jLabelIconF.setText("jLabel1");
            jLabelIconF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabelIconF.setSize(116, 116);
            
            jLblDescripcion.setText(ArrayList.get(2).toString());
            jLblFecha.setText(ArrayList.get(3).toString());
            jLblPais.setText(ArrayList.get(4).toString());
            
            
            jLblFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLblDescripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLblPais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            String tempString = (String) ArrayList.get(0);
            ImageIcon tempimageFinal = (ImageIcon) ArrayList.get(1);
            
            JLabel templblInfo = new JLabel();
            templblInfo.setText("prueba");

            JLabel tempIbl_Icon = new javax.swing.JLabel();
            tempIbl_Icon.setBackground(new java.awt.Color(0, 0, 153));
            tempIbl_Icon.setBorder(createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            tempIbl_Icon.setSize(100,100);

            //
            Icon tempicono = new ImageIcon(tempimageFinal.getImage().getScaledInstance(jLabelIconF.getWidth(), jLabelIconF.getHeight(), Image.SCALE_DEFAULT));
            //
            
            JPanel tempJPanel1 = new javax.swing.JPanel();
            tempJPanel1.setBorder(createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(tempJPanel1);
            tempJPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tempIbl_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLblPais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLblDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(jLblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tempIbl_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLblFecha)
                            //.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLblPais)
                            //.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            
            System.out.print("\n \n estoy por aqui...... n2:  "+ tempString + " --ID2:" + tempicono.getIconHeight() + "\n" + "--x2: " );
            templblInfo.setText(tempString);
            tempIbl_Icon.setIcon(tempicono);
            System.out.print("\n \nestoy por aqui...... n:  "+ templblInfo.getText()+ " --ID:" + tempIbl_Icon.getText() + "\n" + "--x: " );
            tempJPanel1.setAlignmentX(Component.LEFT_ALIGNMENT);
            
            templblInfo.setVisible(true);
            tempIbl_Icon.setVisible(true);
            tempJPanel1.setVisible(true);
            

            tempJPanel1.setBackground(Color.orange);
            repaint();
            
            jPanel2Scroll.add(tempJPanel1);
            //jPanel2Scroll.setAlignmentX(Component.LEFT_ALIGNMENT);
            
            jPanel2Scroll.updateUI();
            
            tempIbl_Icon.addMouseListener(new java.awt.event.MouseAdapter() 
            {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) 
                {
                    System.out.print("\n \n OSIII NENAS : " + tempString + "\n \n");
                    menuMain.traerFotoSeleccionada(tempString);
                }
            });
        }
        repaint();
    }
    
    

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
            java.util.logging.Logger.getLogger(Ver_Fotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_Fotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_Fotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_Fotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver_Fotos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLblPaisText;
    private javax.swing.JLabel JLblPaisText1;
    private javax.swing.JTextArea JtextName;
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonDELETE;
    private javax.swing.JLabel jLTDate;
    private javax.swing.JLabel jLblDescriptionText;
    private javax.swing.JLabel jLblPreviewImage;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2Scroll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextAreaCountry;
    private javax.swing.JTextArea jTextAreaDate;
    private javax.swing.JTextArea jTextAreaDescription;
    // End of variables declaration//GEN-END:variables

    void mostrarFotoSeleccionada(ArrayList<Object> photoTemp) 
    {
        ImageIcon tempimageFinal = (ImageIcon) photoTemp.get(1);
        Icon tempicono = new ImageIcon(tempimageFinal.getImage().getScaledInstance(jLblPreviewImage.getWidth(), jLblPreviewImage.getHeight(), Image.SCALE_DEFAULT));
        
        jLblPreviewImage.setIcon(tempicono);
        
        
        jTextAreaDate.setText(photoTemp.get(3).toString());
        jTextAreaDescription.setText(photoTemp.get(2).toString());          
        jTextAreaCountry.setText(photoTemp.get(4).toString());   
        
        JtextName.setText(photoTemp.get(0).toString());
    }


}
