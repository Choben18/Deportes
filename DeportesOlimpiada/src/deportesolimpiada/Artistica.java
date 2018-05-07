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
    public Artistica(){
        super();
        desplegarSubMenu();
    }
    
    @Override
    public void desplegarSubMenu(){
        JOptionPane.showMessageDialog(null,"Esto Es ARTISTICA");
    }
}
