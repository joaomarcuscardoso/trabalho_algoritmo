/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package connectmeJoaoeLuis.View;

import connectmeJoaoeLuis.Controller.LevelController;
import connectmeJoaoeLuis.Controller.MyPrincipleController;
import connectmeJoaoeLuis.Model.Block;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.File;
import java.net.URL;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author smile
 */
public class Tela extends javax.swing.JFrame {

    
    private final JFileChooser openFileChooser;
    private BufferedReader originalBI;
    private File fileJson;
    
    private JButton[][] matriz = new JButton[4][4];
    
    public void paintConnectors(Graphics g, List<Block> listBlock, JButton[][] matriz) {
        Graphics2D g2D = (Graphics2D) g;
        matriz[0][0].paintComponents(g);
        URL urlImage = MyPrincipleController.class.getResource("../assets/images/cano.png");
        Icon image = new ImageIcon(urlImage);
        
  

        
       
    }
   
    
    public Tela() {
                
        initComponents();
        button03.setIcon(new ImageIcon("../images.jpeg"));
        matriz[0][0] = button01;
        matriz[0][1] = button02;
        matriz[0][2] = button03;
        matriz[0][3] = button04;

        matriz[1][0] = button05;
        matriz[1][1] = button06;
        matriz[1][2] = button07;
        matriz[1][3] = button08;

        matriz[2][0] = button09;
        matriz[2][1] = button10;
        matriz[2][2] = button11;
        matriz[2][3] = button12;

        matriz[3][0] = button13;
        matriz[3][1] = button14;
        matriz[3][2] = button15;
        matriz[3][3] = button16;
        
        
        
        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("src/connectmeJoaoeLuis/assets/json/"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("json Files", "json"));
        
    
    }
    
    
    public JButton[][] getmatrizBotoes() {
        return matriz;
    }
    
    public void setFileJson(File url){
        this.fileJson = url;
    }
    
    public File getFileJson(){
        return fileJson;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        button03 = new javax.swing.JButton();
        button06 = new javax.swing.JButton();
        button02 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        button14 = new javax.swing.JButton();
        button04 = new javax.swing.JButton();
        button07 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        button15 = new javax.swing.JButton();
        button12 = new javax.swing.JButton();
        button16 = new javax.swing.JButton();
        button08 = new javax.swing.JButton();
        button13 = new javax.swing.JButton();
        button01 = new javax.swing.JButton();
        button05 = new javax.swing.JButton();
        button09 = new javax.swing.JButton();
        ButtonLargura = new javax.swing.JButton();
        ButtonProfundidade = new javax.swing.JButton();
        Message = new javax.swing.JLabel();
        Level = new javax.swing.JButton();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button03.setAlignmentY(0.2F);
        button03.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button06.setAlignmentY(0.2F);
        button06.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button02.setAlignmentY(0.2F);
        button02.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button10.setAlignmentY(0.2F);
        button10.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button14.setAlignmentY(0.2F);
        button14.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button04.setAlignmentY(0.2F);
        button04.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button07.setAlignmentY(0.2F);
        button07.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button11.setAlignmentY(0.2F);
        button11.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button15.setAlignmentY(0.2F);
        button15.setMargin(new java.awt.Insets(1, 1, 1, 1));
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });

        button12.setAlignmentY(0.2F);
        button12.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button16.setAlignmentY(0.2F);
        button16.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button08.setAlignmentY(0.2F);
        button08.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button13.setAlignmentY(0.2F);
        button13.setMargin(new java.awt.Insets(1, 1, 1, 1));
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        button01.setAlignmentY(0.2F);
        button01.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button05.setAlignmentY(0.2F);
        button05.setMargin(new java.awt.Insets(1, 1, 1, 1));

        button09.setAlignmentY(0.2F);
        button09.setMargin(new java.awt.Insets(1, 1, 1, 1));

        ButtonLargura.setText("Largura");

        ButtonProfundidade.setText("Profundidade");

        Level.setText("Level");
        Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(ButtonLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button05, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button09, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button03, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button07, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button02, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button06, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button04, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button08, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Message, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(Level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button05, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button09, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button06, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button02, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button03, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button07, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button04, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button08, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button13ActionPerformed

    public void showView() {
        setVisible(true);
    }
    
    public void clearView() {
        for (JButton[] jButtons : matriz) {
            for (JButton jButton : jButtons) {
                jButton.setIcon(null);
            }
        }
    }
    
    
    private void LevelmatrizctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelmatrizctionPerformed


    
    }//GEN-LAST:event_LevelmatrizctionPerformed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed

    }//GEN-LAST:event_button15ActionPerformed

    private void LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        int returnValue = openFileChooser.showOpenDialog(this);
       
        System.out.println("button");
        if(returnValue == JFileChooser.APPROVE_OPTION){
            clearView();

            
            
            try{
                //String ex = FilenameUtils.getExtention(openFileChooser.getSelectedFile().getName());
                //if(!ex.equals(".json")){
                  //  throw new Exception("arquivo nao encontrado");
                //}
                
                Message.setText(openFileChooser.getSelectedFile().getName());
                this.fileJson = openFileChooser.getSelectedFile();
                
                LevelController level = new LevelController(getmatrizBotoes());
                
                level.loadLevel(fileJson.getAbsolutePath());
                
                paintConnectors(getGraphics(), level.getBlockList(), level.getMatriz());
                
//            //fileJson.setFileJson(openFileChooser);
//            File filess = openFileChooser.getSelectedFile();
//            System.out.println(filess.getName());
//                //Message.setText("Arquivo encontrado");
//                System.out.println(openFileChooser.getSelectedFile());
            }catch(Exception ioe){
                ioe.printStackTrace();
                Message.setText("Arquivo invalido");
            }
            
            
        }
        //else{
  //          Message.setText("Arquivo nao encontrado ");
        //}
        
    }//GEN-LAST:event_LevelActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLargura;
    private javax.swing.JButton ButtonProfundidade;
    private javax.swing.JButton Level;
    private javax.swing.JLabel Message;
    private javax.swing.JButton button01;
    private javax.swing.JButton button02;
    private javax.swing.JButton button03;
    private javax.swing.JButton button04;
    private javax.swing.JButton button05;
    private javax.swing.JButton button06;
    private javax.swing.JButton button07;
    private javax.swing.JButton button08;
    private javax.swing.JButton button09;
    private java.awt.Button button1;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button13;
    private javax.swing.JButton button14;
    private javax.swing.JButton button15;
    private javax.swing.JButton button16;
    // End of variables declaration//GEN-END:variables
}
