/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectmeJoaoeLuis.Model;

import connectmeJoaoeLuis.Helper.Estado;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author smile
 */
public class Mapa implements Estado{
    private List<Block> block;
    private JButton[][] matriz;
    // jButton
    
    public Mapa(List<Block> block, JButton[][] matriz) {
        this.block = block;
        this.matriz = matriz;
    }

    public List<Block> getBlock() {
        return block;
    }

    public void setBlock(List<Block> block) {
        this.block = block;
    }
    
      
    
    @Override
    public String getDescricao() {
        return "Profundidade";
    }

    @Override
    public boolean ehMeta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int custo() {
      return 1;
    }

    @Override
    public List<Block> sucessores() {
        // ler bloco
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
