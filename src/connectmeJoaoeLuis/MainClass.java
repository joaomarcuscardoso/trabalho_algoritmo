/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectmeJoaoeLuis;

import connectmeJoaoeLuis.Controller.MyPrincipleController;
import connectmeJoaoeLuis.View.Tela;
import java.util.List;
import javax.swing.JButton;
/**
 *
 * @author smile
 */
public class MainClass {

    public static void main(String[] args)  {
        // TODO code application logic here
        Tela tela = new Tela();
        tela.setVisible(true);
        List<JButton> list = tela.getListaBotoes();
        MyPrincipleController principleController = new MyPrincipleController(list);
        principleController.readJson();
    }    
}
