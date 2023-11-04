/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

/**
 *
 * @author Alfre
 */
public class IMC {
    Double peso;
    Double altura;
    Double imc;
    public String verinfo()
    {
        return " su peso es " +this.peso+ "kg"+" y su altura "+this.altura +"m"+" su imc es " +this.imc;
    }
                    
    public static void main(String[] args) {
        IMC i1= new IMC();
        i1.peso=80.0;
        i1.altura=1.62;
        i1.imc= i1.peso/(i1.altura*i1.altura);
        System.out.println(i1.verinfo());
                
    }
    
}
