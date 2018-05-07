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
public class Ritmica extends Gimnasia {
    public Ritmica(){
        super();
        desplegarSubMenu();
    }
    @Override
    public void desplegarSubMenu(){
        JOptionPane.showMessageDialog(null,"ESToEs RitmicA");
    }
}
