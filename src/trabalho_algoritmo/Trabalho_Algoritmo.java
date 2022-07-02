/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho_algoritmo;

import java.awt.Color;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import trabalho_algoritmo.views.Tela;

/**
 *
 * @author smile
 */
public class Trabalho_Algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tela tela = new Tela();
        tela.setVisible(true);
        List<JButton> lista = tela.getListaBotoes();
        
        Icon imagemUm = new ImageIcon("imagem.png");
        Icon imagemDois = new ImageIcon("images.jpeg");
        lista.get(0).setBackground(Color.blue);
        lista.get(0).setIcon(imagemUm);
        lista.get(1).setIcon(imagemDois);
                
    }
    
}
