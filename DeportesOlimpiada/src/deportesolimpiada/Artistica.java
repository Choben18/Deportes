/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportesolimpiada;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Artistica extends Gimnasia {

    String movimientos;

    public Artistica() {
        super();
        desplegarSubMenu();
    }

    public Artistica(Deportes x[]) {

    }

    @Override
    public void desplegarSubMenu() {
        int Op = 0;
        String[] buttons = {"Establecer por defecto", "Escribir valores", "Volver"};
        while (Op != 3) {
            Op = JOptionPane.showOptionDialog(null, "Llenado de datos", "Seleccionar llenado de datos", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
            Op = Op + 1;
            switch (Op) {
                case 1: {
                    setNacionalidad("Mexicana");
                    setNumeroDeRepresentantes();
                    setPosicionTabla();
                    setContadorMedallasR();
                    setMedallas();
                    
                    super.setCadena(toString());
                    break;
                }
                case 2: {
                    super.establecerValores();
                    super.setCadena(toString());

                    break;
                }
                case 3:
                    correr();
            }
        }
    }

    @Override
    public String toString() {
        return "-----Artistica------ \nPosicion tabla: " + super.getPosicionTabla() + "\n Numero de Representates: " + super.getNumeroDeRepresentantes() + "\nMedalllas: " + super.getContadorMedallas() + "\nNacionalidad: " + super.getNacionalidad() + "\n";
    }

}
