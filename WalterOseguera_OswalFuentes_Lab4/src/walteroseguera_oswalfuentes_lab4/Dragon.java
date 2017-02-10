package walteroseguera_oswalfuentes_lab4;

import java.awt.Color;

public class Dragon extends Pieza{

    public Dragon() {
    }

    public Dragon(Color color, String material) {
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
