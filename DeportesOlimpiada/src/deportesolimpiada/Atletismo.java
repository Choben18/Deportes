/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportesolimpiada;

import javax.swing.JOptionPane;

/**
 *
 * @author KILLER
 */
public class Atletismo extends Deportes {

    private int re;

    public Atletismo() {
        super();
        desplegarSubMenu();

    }

    @Override
    public void desplegarSubMenu() {
        int Op = 0;

        while (Op != 3) {
            String[] buttons = {"Carreras", "Saltos", "Volver"};
            Op = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "LLENADO DE INFORMACION", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
            Op = Op + 1;
            switch (Op) {
                case 1: {
                    super.d = new Carreras();
                    break;
                }
                case 2: {
                    super.d = new Saltos();
                    break;
                }
                case 3:
                    correr();
            }
        }

    }

}
