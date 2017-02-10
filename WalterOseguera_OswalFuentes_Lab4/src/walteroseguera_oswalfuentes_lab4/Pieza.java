package walteroseguera_oswalfuentes_lab4;

import java.awt.Color;

public abstract class Pieza implements Movimiento {

    protected Color color;
    protected String material;

    public Pieza() {
    }

    public Pieza(Color color, String material) {
        this.color = color;
        this.material = material;
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
