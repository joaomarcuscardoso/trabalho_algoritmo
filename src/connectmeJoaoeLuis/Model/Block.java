/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectmeJoaoeLuis.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author smile
 */
public class Block {
    
    private String name;
    private int[] connectors = new int[4];  
    private int[] position = new int[2];
    private int[] done = new int [4];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getConnectors() {
        return connectors;
    }

    public void setConnectors(int[] connectors) {
        this.connectors = connectors;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public int[] getDone() {
        return done;
    }

    public void setDone(int[] done) {
        this.done = done;
    }
    
    


    @Override
    public String toString() {
        String content = "Block { name = "+name;
        
        content += "\n, connectors: [";
        
        int cont = 0;
        
        for (int connector : connectors) {
            if(cont == 3) {
                content += connector + " ";
            } else {
                content += connector + ", ";
            }
            
            cont++;
        }
        
        content += "],\n position: [";
        
        cont= 0;
        
        for (int i : position) {
            if(cont == 1) {
                content += i + " ";
            } else {
                content += i + ", ";
            }
            
        }
        
        content += "],\n done: [";
        
        cont = 0;
        
        for (int ds : done) {  
            
            if(cont == 3) {
                content += ds + " ";
            } else {
                content += ds + ", ";
            }
            
            cont++;
        }
        
        content += "]\n}";
        
        return content;
    }

}
