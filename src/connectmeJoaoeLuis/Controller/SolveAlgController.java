/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectmeJoaoeLuis.Controller;

import connectmeJoaoeLuis.Helper.Busca;
import connectmeJoaoeLuis.Helper.BuscaLargura;
import connectmeJoaoeLuis.Helper.Estado;
import connectmeJoaoeLuis.Helper.Nodo;
import connectmeJoaoeLuis.Model.Block;
import connectmeJoaoeLuis.Model.Mapa;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author smile
 */
public class SolveAlgController{
    List<Block> block;
    public SolveAlgController() {}
    
    public void solveProfundidade(JButton[][] matriz, String path, List<Block> block) {
        System.out.println("block:"+block.toString());
       this.block = block;
        for (Block block1 : block) {
            
        }
       
        Mapa estadoInicial = new Mapa(block, matriz);
        
        Nodo buscaLargura = new BuscaLargura<Mapa>().busca(estadoInicial);

//        
//        if(buscaLargura == null) {
//            System.out.println("Sem solucao");
//        } else {
//            System.out.println(buscaLargura.getProfundidade());
//        }
        
        //		TorreHanoi estadoInicial = new TorreHanoi(new int[][] { { 1, 2, 3 }, { 0, 0, 0 }, { 0, 0, 0 } });
        // chama busca em profundidade
//        System.out.println("busca em profundidade");
//        Nodo n = new BuscaProfundidade<TorreHanoi>().busca(estadoInicial);
       
      
        
        
        
    }

}
