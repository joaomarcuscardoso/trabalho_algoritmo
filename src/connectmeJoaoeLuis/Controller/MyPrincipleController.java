/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectmeJoaoeLuis.Controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import connectmeJoaoeLuis.Model.Block;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author smile
 */
public class MyPrincipleController {
    private List<JButton> list = new ArrayList<JButton>(16);
    
    public MyPrincipleController(List<JButton> list) {
        this.list = list;
    }
    
    
    public void readJson(File file) {
        
        
        // readJson   
       
        try{

            
            final ObjectMapper objectMapper = new ObjectMapper();
            
            List<Block> langList = objectMapper.readValue(
                   //new File("src/connectmeJoaoeLuis/assets/json/level1.json"),
                    file,
                    new TypeReference<List<Block>>() {
            });


            langList.forEach(x -> System.out.println(x.toString()));

        } catch(Exception e) {
            e.printStackTrace();
        }
       
        
        // get Images
        String[] nameImages = new String[]{"password", "screen", "skull_green", "wifi_blue"};
        
        URL urlImage = MyPrincipleController.class.getResource("../assets/images/"+nameImages[1]+".gif");
        System.out.println(urlImage);
        Icon image = new ImageIcon(urlImage);
        list.get(0).setIcon(image);
    }

}
