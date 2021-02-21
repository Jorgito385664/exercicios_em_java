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
public class Temperatura 
{
    private double tempF,tempC;

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(int tempF) {
        this.tempF = tempF;
    }
    
    public void entradaDados()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em fahrenheit: ");
        tempF = Double.parseDouble(sc.nextLine());
        
        tempC = (5*tempF - 160)/9;
    }
    
    
    public void imprimir()
    {
       
        System.out.println("A temperatura em celsius é de " + tempC);
    }

}
