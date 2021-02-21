/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appchuva;
import java.util.Scanner;
/**
 *
 * @author Jorge
 */
public class AppChuva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       Chuva c1 = new Chuva();
       
       c1.entradaDados();
       c1.imprimir();
    }
    
}
