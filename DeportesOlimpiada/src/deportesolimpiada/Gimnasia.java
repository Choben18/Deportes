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
public class Gimnasia extends Deportes {

    private int puntuacion;
    private int posicin;
    

    public Gimnasia() {
        super();

    }

    @Override
    public void desplegarSubMenu() {
        int Op = 0;

        while (Op != 3) {
            String[] buttons = {"Artistica", "Ritmica", "Volver"};
            Op = JOptionPane.showOptionDialog(null, "Seleccione una categoria", "CATEGORIAS DE DEPORTES", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
            Op = Op + 1;
            switch (Op) {
                case 1: {
                    super.d = new Artistica();
                    break;
                }
                case 2: {
                    super.d = new Ritmica();
                    break;
                }
                case 3:
                    correr();
            }
        }

    }
    

}
