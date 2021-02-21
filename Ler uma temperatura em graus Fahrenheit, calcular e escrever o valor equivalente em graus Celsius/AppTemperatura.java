/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apptemperatura;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class AppTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Temperatura t1 = new Temperatura();
        
        t1.entradaDados();
        t1.imprimir();
        
    }
    
}
