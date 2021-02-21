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
public class ClasseNomeSobrenome {
    
    private String nome, sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void entradaDados()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        
        
        System.out.println("Digite o sobrenome: ");
        sobrenome = sc.nextLine();
        
    }
    
    public void imprimir()
    {
        System.out.println("O seu nome invertido será " + sobrenome + " " + nome);
    }
    
    
}
