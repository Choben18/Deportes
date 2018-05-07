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
    private String[] Medallas={"Oro","Plata","Bronce"};
    private String medallas;
    private int contadormedallas;
    private String Nacionalidad;
    static String cadena="";
    
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
        String[] buttons = {"Deportes Generales ", "Acuaticos", "Gimnasia", "Atletismo","Imprimir Objetos", "Cerrar Programa "};
        Deportes d;
        int op = 0;
        while (op != 6) {
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
                    
                case 5:
                    JOptionPane.showMessageDialog(null,cadena);

                case 6: {
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

    public String getCadena() {
        return cadena;
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

    public void setNombreDeporte(String name) {
       this.NombreDeporte = name;
    }

    public void setPosicionTabla() {
<<<<<<< HEAD
        Random rd = new Random();
        this.posicionTabla = rd.nextInt(2)+1;
=======
        int x, x1, x2;
        x = Integer.parseInt(Medallas[0]);
        x1 = Integer.parseInt(Medallas[1]) * 2;
        x2 = Integer.parseInt(Medallas[2]) * 5;
        posicionTabla = x + x1 + x2;
>>>>>>> 4465903c9473d9c3f1663202eb532b877885a63a
    }

    public void setNumeroDeRepresentantes() {
        Random r = new Random();
        NumeroDeRepresentantes = r.nextInt(50);
    }

    public void setCadena(String cadena) {
        cadena = Deportes.cadena+cadena;
    }

    
    public void setMedallas() {
        if (this.posicionTabla==3) {
            this.medallas=Medallas[2];
        }
        if (this.posicionTabla==2) {
            this.medallas=Medallas[1];
        }
        if (this.posicionTabla==1) {
            this.medallas=Medallas[0];
        }

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
<<<<<<< HEAD
        return "Deportes{" + " ID_DEPORTE " + Id_Deporte + "NombreDeporte=" + NombreDeporte + ", posicionTabla=" + posicionTabla + ", NumeroDeRepresentantes=" + NumeroDeRepresentantes + ", Medallas Bronce=" + Medallas[0] + ", Medallas Plata=" + Medallas[1] + ", Medallas Oro=" + Medallas[2] + ", Contadormedallas=" + contadormedallas + ", Nacionalidad=" + Nacionalidad + '}';
=======
        return "Deportes{" + " ID_DEPORTE " + Id_Deporte + "NombreDeporte=" + NombreDeporte + ", puntosTabla=" + posicionTabla + ", NumeroDeRepresentantes=" + NumeroDeRepresentantes + ", Medallas Bronce=" + Medallas[0] + ", Medallas Plata=" + Medallas[1] + ", Medallas Oro=" + Medallas[2] + ", Contadormedallas=" + contadormedallas + ", Nacionalidad=" + Nacionalidad + '}';
>>>>>>> 4465903c9473d9c3f1663202eb532b877885a63a
    }

}
