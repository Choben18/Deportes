/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportesolimpiada;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public abstract class Deportes {

    protected Deportes d;
    private static int Id_Deporte;
    private String NombreDeporte;
    private int posicionTabla;
    private int NumeroDeRepresentantes;
    private String[] Medallas = new String[3];
    private int contadormedallas;
    private String Nacionalidad;

    public Deportes() {

    }

    public Deportes(int NumeroDeRepresentantes, String Nacionalidad) {
        this.NumeroDeRepresentantes = NumeroDeRepresentantes;
        this.Nacionalidad = Nacionalidad;
    }

    public Deportes(int NumeroDeRepresentantes, String Nacionalidad, String[] Medallas, int contadoremedallas) {
        this.NumeroDeRepresentantes = NumeroDeRepresentantes;
        this.Nacionalidad = Nacionalidad;
        this.Medallas = Medallas;
        this.contadormedallas = contadormedallas;
    }

    public void desplegarMenu1() {
        setNacionalidad();
        setNumeroDeRepresentantes();
        setMedallas();
        setContadorMedallas();
        
    }
    
    public void establecerValores(){
        setNacionalidad();
        setNumeroDeRepresentantes();
        setMedallas();
        setContadorMedallas();
    }

    public static void correr() {
        String[] buttons = {"Deportes Generales ", "Acuaticos", "Gimnasia", "Atletismo", "Cerrar Programa "};
        Deportes d;
        int op = 0;
        while (op != 5) {
            op = JOptionPane.showOptionDialog(null, "Seleccione una categoria", "CATEGORIAS DE DEPORTES", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
            op = op + 1;
            switch (op) {
                case 1:
                    d = new DeportesGenerales();
                    d.desplegarSubMenu();
                    break;
                case 2:
                    d = new Acuaticos();
                    d.desplegarSubMenu();
                    break;
                case 3:
                    d = new Gimnasia();
                    d.desplegarSubMenu();
                case 4:
                    d = new Atletismo();
                    break;

                case 5: {
                    JOptionPane.showMessageDialog(null, "¡Hasta la proxima!");
                    System.exit(0);
                }
                default:
                    JOptionPane.showMessageDialog(null, "Elija una opcion valida", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    

    public abstract void desplegarSubMenu();

    /**
     * Getters
     */
    public int getIdDeporte() {
        return this.Id_Deporte;
    }

    public String getNombreDeporte() {
        return this.NombreDeporte;
    }

    public int getPosicionTabla() {
        
        return this.posicionTabla;
    }

    public int getNumeroDeRepresentantes() {
        return this.NumeroDeRepresentantes;
    }

    public String[] getMedallas() {
        return this.Medallas;
    }

    public int getContadorMedallas() {
        return this.contadormedallas;
    }

    public String getNacionalidad() {
        return this.Nacionalidad;
    }

    /**
     * Setters
     */
    public void setIdDeporte() {

    }

    public void setNombreDeporte() {
       
    }

    public void setPosicionTabla() {
        int x, x1, x2;
        x = Integer.parseInt(Medallas[0]);
        x1 = Integer.parseInt(Medallas[1]) * 2;
        x2 = Integer.parseInt(Medallas[2]) * 5;
        puntosTabla = x + x1 + x2;
    }

    public void setNumeroDeRepresentantes() {
        Random r = new Random();
        NumeroDeRepresentantes = r.nextInt(50);
    }

    public void setMedallas() {
        Medallas[0] = JOptionPane.showInputDialog(null, "Ingrese las medallas de bronce");
        Medallas[1] = JOptionPane.showInputDialog(null, "Ingrese las medallas de Plata");
        Medallas[2] = JOptionPane.showInputDialog(null, "Ingrese las medallas de Oro");

    }

    public void setContadorMedallas() {
        int m1 = Integer.parseInt(Medallas[0]);
        int m2 = Integer.parseInt(Medallas[1]);
        int m3 = Integer.parseInt(Medallas[2]);
        contadormedallas = (m1 + m2 + m3);
        JOptionPane.showMessageDialog(null, "Total de medallas: " + contadormedallas);
    }

    public void setNacionalidad() {
        Nacionalidad = JOptionPane.showInputDialog(null, "Ingrese Nacionalidad");
    }

    @Override
    public String toString() {
        return "Deportes{" + " ID_DEPORTE " + Id_Deporte + "NombreDeporte=" + NombreDeporte + ", puntosTabla=" + puntosTabla + ", NumeroDeRepresentantes=" + NumeroDeRepresentantes + ", Medallas Bronce=" + Medallas[0] + ", Medallas Plata=" + Medallas[1] + ", Medallas Oro=" + Medallas[2] + ", Contadormedallas=" + contadormedallas + ", Nacionalidad=" + Nacionalidad + '}';
    }

}
