package walteroseguera_oswalfuentes_lab4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class WalterOseguera_OswalFuentes_Lab4 {

    public static void main(String[] args) {

        String Nombre, Usuario, LugarNacimiento, Sexo;
        int Puntos, Edad;
        ArrayList Jugadores = new ArrayList();
        Tablero T = new Tablero();
        Pieza[][] Tablero = T. Tablero();
        int Opcion = 0;
        while (Opcion != 4) {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a Personas: \n"
                    + "Menú Personas\n"
                    + "1.- Agregar Personas\n"
                    + "2.- Eliminar Personas\n"
                    + "3.- Listar Personas\n"
                    + "4.- Salir\n"
                    + "Eliga una de las opciones: "));

            switch (Opcion) {
                case 1:

                    Nombre = JOptionPane.showInputDialog("Nombre: ");
                    Usuario = JOptionPane.showInputDialog("Usuario: ");
                    Puntos = 0;
                    LugarNacimiento = JOptionPane.showInputDialog("Lugar de nacimiento: ");
                    Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
                    Sexo = JOptionPane.showInputDialog("Sexo (Femenino o Masculino): ");
                    Jugadores.add(new Personas(Nombre, Usuario, Puntos, LugarNacimiento, Edad, Sexo));

                    break;
                case 2:

                    int Posicion = Integer.parseInt(JOptionPane.showInputDialog(Jugadores + "\n"
                            + "Eliga la posicion del jugador a eliminar: "));
                    Jugadores.remove(Posicion);
                    JOptionPane.showMessageDialog(null, "Se ha eliminado al jugador exitosamente");

                    break;
                case 3:

                    JOptionPane.showMessageDialog(null, Jugadores);

                    break;
            } // Fin switch
        } // Fin while
        int X, Y;
        X = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion en X de la pieza a mover: "));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion en Y de la pieza a mover: "));
        if (X >= 0 && Y >= 0 || X <= 9 && X <= 9) {
            while (X >= 0 && Y >= 0 || X <= 9 && Y <= 9){
                for (int i = 0; i < Tablero.length; i++) {
                    for (int j = 0; j < Tablero[i].length; j++) {
                        if (i == X && j == Y) {
                            
                        } // Fin if
                    } // Fin for j
                } // Fin for i
            } // Fin while
        } /* Fin if */ else{
            JOptionPane.showMessageDialog(null, "La posición de la pieza no existe");
        } // Fin else
        
        
    } // Fin main
}// Fin class WalterOseguera_OswalFuentes_Lab4