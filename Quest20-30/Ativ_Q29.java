/*
 VAR 
caractere: car

INICIO

Leia("Digite um caratere (maiúsulo):")

se(car maior igual 'A' e menor igual 'Z')
 {
  se(car equivalente 'A' ou equivalente 'E' ou equivalente 'I' ou equivalente 'O' ou equivalente 'U')
   {
    Escreva("O caractere '" + car + "' é uma VOGAL")
   }
   senao
   {
    Escreva("O caractere '" + car + "' é UMA CONSOANTE")
   }
 }
senao
  {
   Esreva("O caractere '" + car + "' é OUTRO TIPO")
  }

fim

TESTE DE MESA

CAR / SE1 / SE2 / SENAO1 / SENAO2
 A     V     V      F       F
 Z     V     F      V       F
 1     F     F      F       V

 */

package com.mycompany.ativ_q29;
import javax.swing.JOptionPane;

public class Ativ_Q29 {

    public static void main(String[] args) {
        
        char car;
        
        car = JOptionPane.showInputDialog("Digite um caractere (maiúsculo):").charAt(0);
        
        if (car >= 'A' && car <= 'Z') 
        {
            if (car == 'A' || car == 'E' || car == 'I' || car == 'O' || car == 'U')
            {
                JOptionPane.showMessageDialog(null, "O caractere ' " + car + " ' é uma VOGAL");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "O caractere ' " + car + " ' é uma CONSOANTE");
            }
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "O caractere ' " + car + " ' é OUTRO TIPO");
        }
    }
}
