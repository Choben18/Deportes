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
public class PruebaDeportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deportes[] pais = new Deportes[3];
        for (int i = 0; i < pais.length; i++) {
            //pais[i].desplegarSubMenu();
            pais[i].correr();
            pais[i].toString();
        }

    }

}
