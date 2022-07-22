/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectmeJoaoeLuis.Controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import connectmeJoaoeLuis.Controller.MyPrincipleController;
import connectmeJoaoeLuis.Model.Block;
import connectmeJoaoeLuis.View.Tela;
import java.io.File;
import java.net.URL;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author smile
 */
public class LevelController {
     private JPanel[][] matriz;
     private List<Block> blockList;
     
     public LevelController(JPanel[][] matriz) {
         this.matriz = matriz;
     }
    
    public void loadLevel(String pathFile) {
        this.blockList = readJson(pathFile);
        
//        for (int i = 0; i < blockList.size(); i++) {
//            System.out.println(blockList.get(i));
//            int[] position = blockList.get(i).getPosition(); 
//            
//            // set Images
//
//            URL urlImage = MyPrincipleController.class.getResource("../assets/images/"+blockList.get(i).getName()+".gif");
//            System.out.println(urlImage);
//            Icon image = new ImageIcon(urlImage);
            //matriz[position[1]][position[0]].setIcon(image);
            
//            list.get(blockList.get(i).getPosition()).setIcon(image);
            
            
           //PaintConnectors paint = new PaintConnectors(matriz[position[1]][position[0]]);
            
//        }
        
//        for(Block block : blockList) {
//            
//
//            // set connectors in block
//            
//        }
            
        
    }
    
    public List<Block> getBlockList() {
        return this.blockList;
    }

    public JPanel[][] getMatriz() {
        return matriz;
    }
    
    
    public List<Block> readJson(String pathFile) {
        
        
        // readJson   
        try{
            System.out.println("path:"+ pathFile);
            
            final ObjectMapper objectMapper = new ObjectMapper();
            
            List<Block> blockList = objectMapper.readValue(
                   new File(pathFile),
                    new TypeReference<List<Block>>() {
            });

            
            return blockList;
        } catch(Exception e) {
            e.printStackTrace();
        }
       
        return null;
        

    }
}
