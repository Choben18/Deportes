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
public class Acuaticos extends Deportes {

    private int re;

    public Acuaticos() {
        super();

    }

    @Override
    public void desplegarSubMenu() {
        int Op = 0;

        while (Op != 3) {
            String[] buttons = {"Clavados", "Natacion", "Volver"};
            Op = JOptionPane.showOptionDialog(null, "Seleccione una categoria", "CATEGORIAS DE DEPORTES", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
            Op = Op + 1;
            //Op = Integer.parseInt(JOptionPane.showInputDialog(null, " 1.- Clavados \n 2.- Natacion \n 3.-Volver"));
            switch (Op) {
                case 1: {
                    super.d = new Clavados();
                    break;
                }
                case 2: {
                    super.d = new Natacion();
                    break;
                }
                case 3:
                    desplegarMenu1();
            }
        }

    }

}
