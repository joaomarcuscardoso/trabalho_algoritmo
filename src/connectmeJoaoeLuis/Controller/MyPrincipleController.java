/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectmeJoaoeLuis.Controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    
    
    public void readJson() {
        
        // readJson 
        Map<String, Object> jsonData = new HashMap<String, Object>();
        
        try{
            URL url = MyPrincipleController.class.getResource("../assets/json/level1.json");
            InputStream input = url.openStream();
            System.out.println(url);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));
            System.out.println(bufferedReader);
            String line = bufferedReader.readLine(); // read first line
            while(line != null) {
//                Block block = objectMapper.readValue("<json object>", Block.class);
                
//                System.out.println("block"+block.toString());
                
//                jsonData += line + "\n";
                jsonData.get(line);
                line = bufferedReader.readLine(); 
                
            }
            
            bufferedReader.close();
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
