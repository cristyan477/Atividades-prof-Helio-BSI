/*
VAR
real:x,y,calc

INICIO

Leia("Digite a posição de x:")
Leia("Digite a posição de y")

DEFINIÇAO
calc -> 2 * x + y + 3

se(calc for equivalente a 0)
 {
  Escreva("O ponto (X: " + x + " , Y: " + y + ")" + "PERTENCE à reta 2x + y + 3 = 0.")
 }
senao
 {
  Escreva("O ponto (X: " + x + " , Y: " + y + ")" + "NAO PERTENCE à reta 2x + y + 3 = 0.")
 }

fim

TESTE DE MESA

X / Y / RESULTADO
1  -5      V
2   2      F

 */

package com.mycompany.ativ_q24;

import javax.swing.JOptionPane;


public class Ativ_Q24 {

    public static void main(String[] args) {
        double x,y,calc;
        
         x=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a posição de x:"));
         y=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a posição de y:"));
        
        calc = 2 * x + y + 3;
        
        if (calc == 0) 
        {
            JOptionPane.showMessageDialog(null, "O ponto (X: " + x + " , Y: " + y + ")" + "\n" + "PERTENCE à reta 2x + y + 3 = 0.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O ponto (X: " + x + ", Y: " + y + ")" + "\n" + "NÃO PERTENCE à reta 2x + y + 3 = 0.");
        }
    }
}
