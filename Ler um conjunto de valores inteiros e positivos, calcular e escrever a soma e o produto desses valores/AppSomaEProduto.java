/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appsomaeproduto;
import java.util.Scanner;
/**
 *
 * @author Jorge
 */
public class AppSomaEProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SomaProduto sp1 = new SomaProduto();
        
        sp1.entradaDados();
        sp1.imprimir();
    }
    
}
