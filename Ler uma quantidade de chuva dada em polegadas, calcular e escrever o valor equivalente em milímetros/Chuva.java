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
public class Chuva 
{
    private double pol, mm;

    public double getPol() {
        return pol;
    }

    public void setPol(double pol) {
        this.pol = pol;
    }

    public double getMm() {
        return mm;
    }

    public void setMm(double mm) {
        this.mm = mm;
    }
    
    public void entradaDados()
    {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite a quantidade de chuva em polegadas: ");
        pol = Double.parseDouble(sc.nextLine());
        
        mm = pol * 25.4;
        
    }
    
    public void imprimir()
    {
        System.out.println("A quantidade de chuva em milimetros e de " + mm);
    }
    
}
