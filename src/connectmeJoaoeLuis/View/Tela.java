/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package connectmeJoaoeLuis.View;

import connectmeJoaoeLuis.Controller.LevelController;
import connectmeJoaoeLuis.Controller.MyPrincipleController;
import connectmeJoaoeLuis.Model.Block;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author smile
 */
public class Tela extends javax.swing.JFrame {

    private final JFileChooser openFileChooser;
    private BufferedReader originalBI;
    private File fileJson;

    private JPanel[][] matriz = new JPanel[4][4];
    int i = 0;
    int valueX = 0;
    int valueY = 0;

    public void paintConnectors(Graphics g, JPanel[][] matriz, List<Block> blocks) throws IOException {
        Graphics2D g2D = (Graphics2D) g;
        
        BufferedImage cano = ImageIO.read(Tela.class.getResource("../assets/images/cano.png"));
        BufferedImage cano90 = ImageIO.read(Tela.class.getResource("../assets/images/cano90.png"));
        
        for (Block block : blocks) {
            int x = block.getPosition()[0];
            int y = block.getPosition()[1];

            String imgString = block.getName();

            BufferedImage img = ImageIO.read(Tela.class.getResource("../assets/images/" + imgString + ".gif"));

            g2D.drawImage(img, matriz[x][y].getX(), matriz[x][y].getY(), 120, 120, matriz[x][y]);
            
            i = 0;
            for (int number : block.getConnectors()) {
                if(i == 0) {
                    System.out.println("cima");
                    valueX = matriz[x][y].getX() + 40;
                    valueY = matriz[x][y].getY() - 60;

                } else if(i == 1) {
                    System.out.println("direita");
                    valueX = matriz[x][y].getX() + 60;
                    valueY = matriz[x][y].getY();
                } else if(i ==2 ) {
                    System.out.println("baixo");
                    valueX = matriz[x][y].getX() + 40;
                    valueY = matriz[x][y].getY() + 60;
                } else {
                    System.out.println("esquerda");
                    valueX = matriz[x][y].getX() - 60;
                    valueY = matriz[x][y].getY();
                }
                
                while(number > 0) {

                    if(i == 1 || i == 3) {
                        valueY += 15;
                        g2D.drawImage(cano, valueX, valueY, matriz[x][y].getWidth() - 30, matriz[x][y].getHeight() - 30, matriz[x][y]);


                    } else {
                        valueX -= 15;
                        
                        g2D.drawImage(cano90, +valueX, valueY, matriz[x][y].getWidth() - 30, matriz[x][y].getHeight() - 30, matriz[x][y]);

                    }

                    


                    System.out.println("x: " + matriz[x][y].getX());
                    System.out.println("y: " + matriz[x][y].getY());
                    System.out.println("valueY: " + valueY);
                    System.out.println("valueX: " + valueY);

                    number--;
                }
                
                i++;
            }           
        }
    }

    public Tela() {

        initComponents();

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

    public JPanel[][] getmatrizBotoes() {
        return matriz;
    }

    public void setFileJson(File url) {
        this.fileJson = url;
    }

    public File getFileJson() {
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
        ButtonLargura = new javax.swing.JButton();
        ButtonProfundidade = new javax.swing.JButton();
        Message = new javax.swing.JLabel();
        Level = new javax.swing.JButton();
        button01 = new javax.swing.JPanel();
        button02 = new javax.swing.JPanel();
        button03 = new javax.swing.JPanel();
        button04 = new javax.swing.JPanel();
        button05 = new javax.swing.JPanel();
        button06 = new javax.swing.JPanel();
        button07 = new javax.swing.JPanel();
        button08 = new javax.swing.JPanel();
        button09 = new javax.swing.JPanel();
        button10 = new javax.swing.JPanel();
        button11 = new javax.swing.JPanel();
        button12 = new javax.swing.JPanel();
        button13 = new javax.swing.JPanel();
        button14 = new javax.swing.JPanel();
        button15 = new javax.swing.JPanel();
        button16 = new javax.swing.JPanel();
        buttonClear = new javax.swing.JButton();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonLargura.setText("Largura");
        ButtonLargura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLarguraActionPerformed(evt);
            }
        });

        ButtonProfundidade.setText("Profundidade");

        Level.setText("Level");
        Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelActionPerformed(evt);
            }
        });

        button01.setMaximumSize(new java.awt.Dimension(120, 120));
        button01.setMinimumSize(new java.awt.Dimension(120, 120));
        button01.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button01Layout = new javax.swing.GroupLayout(button01);
        button01.setLayout(button01Layout);
        button01Layout.setHorizontalGroup(
            button01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button01Layout.setVerticalGroup(
            button01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button02.setMaximumSize(new java.awt.Dimension(120, 120));
        button02.setMinimumSize(new java.awt.Dimension(120, 120));
        button02.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button02Layout = new javax.swing.GroupLayout(button02);
        button02.setLayout(button02Layout);
        button02Layout.setHorizontalGroup(
            button02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button02Layout.setVerticalGroup(
            button02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        button03.setMaximumSize(new java.awt.Dimension(120, 120));
        button03.setMinimumSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button03Layout = new javax.swing.GroupLayout(button03);
        button03.setLayout(button03Layout);
        button03Layout.setHorizontalGroup(
            button03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button03Layout.setVerticalGroup(
            button03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        button04.setMaximumSize(new java.awt.Dimension(120, 120));
        button04.setMinimumSize(new java.awt.Dimension(120, 120));
        button04.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button04Layout = new javax.swing.GroupLayout(button04);
        button04.setLayout(button04Layout);
        button04Layout.setHorizontalGroup(
            button04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button04Layout.setVerticalGroup(
            button04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        button05.setMaximumSize(new java.awt.Dimension(120, 120));
        button05.setMinimumSize(new java.awt.Dimension(120, 120));
        button05.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button05Layout = new javax.swing.GroupLayout(button05);
        button05.setLayout(button05Layout);
        button05Layout.setHorizontalGroup(
            button05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button05Layout.setVerticalGroup(
            button05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button06.setMaximumSize(new java.awt.Dimension(120, 120));
        button06.setMinimumSize(new java.awt.Dimension(120, 120));
        button06.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button06Layout = new javax.swing.GroupLayout(button06);
        button06.setLayout(button06Layout);
        button06Layout.setHorizontalGroup(
            button06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button06Layout.setVerticalGroup(
            button06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button07.setMaximumSize(new java.awt.Dimension(120, 120));
        button07.setMinimumSize(new java.awt.Dimension(120, 120));
        button07.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button07Layout = new javax.swing.GroupLayout(button07);
        button07.setLayout(button07Layout);
        button07Layout.setHorizontalGroup(
            button07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button07Layout.setVerticalGroup(
            button07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button08.setMaximumSize(new java.awt.Dimension(120, 120));
        button08.setMinimumSize(new java.awt.Dimension(120, 120));
        button08.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button08Layout = new javax.swing.GroupLayout(button08);
        button08.setLayout(button08Layout);
        button08Layout.setHorizontalGroup(
            button08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button08Layout.setVerticalGroup(
            button08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button09.setMaximumSize(new java.awt.Dimension(120, 120));
        button09.setMinimumSize(new java.awt.Dimension(120, 120));
        button09.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button09Layout = new javax.swing.GroupLayout(button09);
        button09.setLayout(button09Layout);
        button09Layout.setHorizontalGroup(
            button09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button09Layout.setVerticalGroup(
            button09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button10.setMaximumSize(new java.awt.Dimension(120, 120));
        button10.setMinimumSize(new java.awt.Dimension(120, 120));
        button10.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button10Layout = new javax.swing.GroupLayout(button10);
        button10.setLayout(button10Layout);
        button10Layout.setHorizontalGroup(
            button10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button10Layout.setVerticalGroup(
            button10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button11.setMaximumSize(new java.awt.Dimension(120, 120));
        button11.setMinimumSize(new java.awt.Dimension(120, 120));
        button11.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button11Layout = new javax.swing.GroupLayout(button11);
        button11.setLayout(button11Layout);
        button11Layout.setHorizontalGroup(
            button11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button11Layout.setVerticalGroup(
            button11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button12.setMaximumSize(new java.awt.Dimension(120, 120));
        button12.setMinimumSize(new java.awt.Dimension(120, 120));
        button12.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button12Layout = new javax.swing.GroupLayout(button12);
        button12.setLayout(button12Layout);
        button12Layout.setHorizontalGroup(
            button12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button12Layout.setVerticalGroup(
            button12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button13.setMaximumSize(new java.awt.Dimension(120, 120));
        button13.setMinimumSize(new java.awt.Dimension(120, 120));
        button13.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button13Layout = new javax.swing.GroupLayout(button13);
        button13.setLayout(button13Layout);
        button13Layout.setHorizontalGroup(
            button13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button13Layout.setVerticalGroup(
            button13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button14.setMaximumSize(new java.awt.Dimension(120, 120));
        button14.setMinimumSize(new java.awt.Dimension(120, 120));
        button14.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button14Layout = new javax.swing.GroupLayout(button14);
        button14.setLayout(button14Layout);
        button14Layout.setHorizontalGroup(
            button14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button14Layout.setVerticalGroup(
            button14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button15.setMaximumSize(new java.awt.Dimension(120, 120));
        button15.setMinimumSize(new java.awt.Dimension(120, 120));
        button15.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button15Layout = new javax.swing.GroupLayout(button15);
        button15.setLayout(button15Layout);
        button15Layout.setHorizontalGroup(
            button15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button15Layout.setVerticalGroup(
            button15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        button16.setMaximumSize(new java.awt.Dimension(120, 120));
        button16.setMinimumSize(new java.awt.Dimension(120, 120));
        button16.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout button16Layout = new javax.swing.GroupLayout(button16);
        button16.setLayout(button16Layout);
        button16Layout.setHorizontalGroup(
            button16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        button16Layout.setVerticalGroup(
            button16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        buttonClear.setText("Limpar Campos");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(ButtonLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(button08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(button04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showView() {
        setVisible(true);
    }


    private void LevelmatrizctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelmatrizctionPerformed


    }//GEN-LAST:event_LevelmatrizctionPerformed

    private void LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelActionPerformed
 
        int returnValue = openFileChooser.showOpenDialog(this);   

        if (returnValue == JFileChooser.APPROVE_OPTION) {

            
            try {

                Message.setText(openFileChooser.getSelectedFile().getName());
                this.fileJson = openFileChooser.getSelectedFile();

                LevelController level = new LevelController(getmatrizBotoes());

                level.loadLevel(fileJson.getAbsolutePath());
                List<Block> blocks = level.getBlockList();
                paintConnectors(getGraphics(), matriz, blocks);

//                paintConnectors(getGraphics(), level.getMatriz());
//            //fileJson.setFileJson(openFileChooser);
//            File filess = openFileChooser.getSelectedFile();
//            System.out.println(filess.getName());
//                //Message.setText("Arquivo encontrado");
//                System.out.println(openFileChooser.getSelectedFile());
            } catch (Exception ioe) {
                ioe.printStackTrace();
                Message.setText("Arquivo invalido");
            }

        }
        //else{
        //          Message.setText("Arquivo nao encontrado ");
        //}

    }//GEN-LAST:event_LevelActionPerformed

    private void ButtonLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLarguraActionPerformed

    }//GEN-LAST:event_ButtonLarguraActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        // TODO add your handling code here:
        
         
    }//GEN-LAST:event_buttonClearActionPerformed

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
    private javax.swing.JPanel button01;
    private javax.swing.JPanel button02;
    private javax.swing.JPanel button03;
    private javax.swing.JPanel button04;
    private javax.swing.JPanel button05;
    private javax.swing.JPanel button06;
    private javax.swing.JPanel button07;
    private javax.swing.JPanel button08;
    private javax.swing.JPanel button09;
    private java.awt.Button button1;
    private javax.swing.JPanel button10;
    private javax.swing.JPanel button11;
    private javax.swing.JPanel button12;
    private javax.swing.JPanel button13;
    private javax.swing.JPanel button14;
    private javax.swing.JPanel button15;
    private javax.swing.JPanel button16;
    private javax.swing.JButton buttonClear;
    // End of variables declaration//GEN-END:variables
}
