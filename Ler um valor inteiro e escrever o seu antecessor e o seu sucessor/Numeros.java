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
public class Numeros 
{
    private int num; 

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
   
    public int antecessor()
    {   
        int ant;
        
        ant = num - 1;
        
        return ant;
        
    }
    
    public int sucessor()
    {
        int suc;
        
        suc = num + 1;
        
        return suc;
    }
    
    public void entradaDados()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        num = Integer.parseInt(sc.nextLine());
        
        
    }
    
    public void imprimir()
    {
        System.out.println("O antecessor do número é " + antecessor());
        System.out.println("O sucessor do número é " + sucessor());
    }
    
}

