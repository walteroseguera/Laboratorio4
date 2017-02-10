/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walteroseguera_oswalfuentes_lab4;

import java.awt.Color;

/**
 *
 * @author Oswal
 */
public class Caballero extends Pieza {

    public Caballero() {
    }

    public Caballero(Color color, String material) {
        super(color, material);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }   
}
