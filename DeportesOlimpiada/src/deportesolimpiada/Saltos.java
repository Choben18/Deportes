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
public class Saltos extends Atletismo {
         public Saltos(){
        super();
        desplegarSubMenu();
    }
    
    @Override
    public void desplegarSubMenu(){
        int Op = 0;

        while (Op != 3) {
            String[] buttons = {"1.-Llenar por default", "3.-Llenar manualmente", "Volver"};
            Op = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "LLENADO DE INFORMACION", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
            Op = Op + 1;
            switch (Op) {
                case 1: {
                    
                    break;
                }
                case 2: {
                    
                    break;
                }
                case 3:
                    super.desplegarSubMenu();
            }
        }
    }
    
}
