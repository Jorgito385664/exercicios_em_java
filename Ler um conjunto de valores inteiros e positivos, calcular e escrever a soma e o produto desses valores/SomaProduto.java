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
public class SomaProduto
{
    private int num,qtd;
    protected int soma = 0;
    protected int prod = 1;

    public int getProd() {
        return prod;
    }

    public void setProd(int prod) {
        this.prod = prod;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void entradaDados()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de valores: ");
        qtd = Integer.parseInt(sc.nextLine());
        
        for(int i=0; i<qtd; i++)
        {
            System.out.println("Digite o valor: ");
            num = Integer.parseInt(sc.nextLine());
            
            
            soma = num + soma;
            prod = num * prod;
            
            
        }
    }
    
    
    public void imprimir()
    {
        System.out.println("A soma é igual a " + soma);
        System.out.println("O produto é igual a " + prod);
    }
}

