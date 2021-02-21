/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nomesobrenome;
import java.util.Scanner;
/**
 *
 * @author Jorge
 */
public class NomeSobrenome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ClasseNomeSobrenome ns1 = new ClasseNomeSobrenome();
        
        ns1.entradaDados();
        ns1.imprimir();
    }
    
}
