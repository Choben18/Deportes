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
    public Artistica(Deportes x []){
        
    }
    @Override
    public void desplegarSubMenu() {

        int Op = 0;

        while (Op != 3) {
            String[] buttons = {"1.-Llenar por default", "3.-Llenar manualmente", "Volver"};
            Op = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "LLENADO DE INFORMACION", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
            Op = Op + 1;
            switch (Op) {
                case 1: {
                    setNombreDeporte("Artistica");
                    establecerValores();
                    setPuntuacion();
                    
                    break;
                }
                case 2: {
                    setNombreDeporte(JOptionPane.showInputDialog(null,"Nombre del DEporte"));
                    establecerValores();
                    break;
                }
                case 3:
                    super.desplegarSubMenu();
            }
        }

    }
   
}
