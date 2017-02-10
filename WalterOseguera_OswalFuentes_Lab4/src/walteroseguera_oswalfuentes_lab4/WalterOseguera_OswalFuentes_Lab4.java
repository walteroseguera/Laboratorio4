package walteroseguera_oswalfuentes_lab4;

/**
 *
 * @author Oswal
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class WalterOseguera_OswalFuentes_Lab4 {

    public static void main(String[] args) {

        String Nombre, Usuario, LugarNacimiento, Sexo;
        int Puntos, Edad;
        ArrayList Jugadores = new ArrayList();
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
    } // Fin main
}// Fin class WalterOseguera_OswalFuentes_Lab4