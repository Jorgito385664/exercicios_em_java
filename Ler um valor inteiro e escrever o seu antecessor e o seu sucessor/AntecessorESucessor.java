/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package antecessoresucessor;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class AntecessorESucessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Numeros n1 = new Numeros();
        
        n1.entradaDados();
        n1.imprimir();
    }
    
}
