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
public class DeportesGenerales extends Deportes {
    
    private int re;

    public DeportesGenerales() {
        super();
       
    }

    @Override
    public void desplegarSubMenu() {  
        int Op = 0;
            
        while (Op != 3) {
            String[] buttons = {"Futbol", "Baloncesto", "Volver"};
            Op = JOptionPane.showOptionDialog(null, "Seleccione una categoria", "CATEGORIAS DE DEPORTES", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
            Op = Op+1;
            switch (Op){
                case 1 : {super.d = new Futbol(); break;}
                case 2 : {super.d = new Baloncesto(); break;}
                //case 3 : correr();
            }
        }

    }
    
}
