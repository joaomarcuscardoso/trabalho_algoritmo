/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectmeJoaoeLuis.Model;

/**
 *
 * @author smile
 */
public class Block {
    private String name;
    private int[] connectors = new int[4];
    private int[] position = new int[2];
    private int[] done = new int [4];

    public Block(String name, int[] connectors, int[] position, int[] done ) {
        this.name = name;
        this.connectors = connectors;
        this.done = done;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int[] getConnectors() {
        return connectors;
    }


    public int[] getPosition() {
        return position;
    }

    public int[] getDone() {
        return done;
    }


    @Override
    public String toString() {
        return "Block{" + "name=" + name + ", connectors=" + connectors + ", position=" + position + ", done=" + done + '}';
    }

}
