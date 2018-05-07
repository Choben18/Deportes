/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportesolimpiada;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author KILLER
 */
public class Futbol extends DeportesGenerales {
    int Goles;
    
    
        public Futbol(){
        super();
        desplegarSubMenu();
    }
        
       
    
    @Override
    public void desplegarSubMenu(){
        int Op = 0;
        String[] buttons = {"Establecer por defecto", "Escribir valores", "Volver"};
        while(Op != 3){
            Op = JOptionPane.showOptionDialog(null, "Llenado de datos", "Seleccionar llenado de datos", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
            Op = Op+1;
              switch (Op){
                case 1 : { 
                         
                         break;}
                case 2 : { super.establecerValores();
                          super.setCadena(toString());        

                          break;}
                case 3 : correr();
            }
        }
    }
    
    @Override
    public String toString(){
        return "-----FUTBOL------ \nPosicion tabla: "+super.getPosicionTabla()+"\n Numero de Representates: "+super.getNumeroDeRepresentantes()+"\nMedalllas: "+super.getContadorMedallas()+"\nNacionalidad: "+super.getNacionalidad()+"\n";
    }
    
}
