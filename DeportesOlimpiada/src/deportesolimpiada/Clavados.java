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
public class Clavados extends Acuaticos {
      public Clavados(){
        super();
        desplegarSubMenu();
    }
    
    @Override
    public void desplegarSubMenu(){
        JOptionPane.showMessageDialog(null,"Clavados ");
    }
    
}
