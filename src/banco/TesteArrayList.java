/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class TesteArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArrayList<String> bandas = new ArrayList();
    
    bandas.add(JOptionPane.showInputDialog(null, "Digite o nome d euma banda"));
        System.out.println(bandas);
    }
    
}
