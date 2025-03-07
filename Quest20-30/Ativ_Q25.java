/*
VAR
real:x,y,a,b,calc

INICIO

Leia("Digite o coeficiente a:")
Leia("Digite o coeficiente b:")
Leia("Digite a posição de x:")
Leia("Digite a posição de y")

DEFINIÇAO
calc -> a * x + b * y

se(calc for equivalente a 0)
 {
  Escreva("O ponto (X: " + x + " , Y: " + y + ")" + "PERTENCE à reta " + a + "x + " + b + "y = 0.")
 }
senao
 {
  Escreva("O ponto (X: " + x + " , Y: " + y + ")" + "NAO PERTENCE à reta " + a + "x + " + b + "y = 0.")
 }

fim

TESTE DE MESA

A / B / X / Y / RESULTADO
2  -1   1   2     V
1   1   2   3     F

 */

package com.mycompany.ativ_q25;
import javax.swing.JOptionPane;

public class Ativ_Q25 {

    public static void main(String[] args) {
         double x,y,a,b,calc;
         
         a=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o coeficiente A:"));
         b=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o coeficiente B:"));
         x=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a posição de x:"));
         y=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a posição de y:"));
         
        calc = a * x + b * y;
        
        if (calc == 0) 
        {
            JOptionPane.showMessageDialog(null, "O ponto (X: " + x + " , Y: " + y + ")" + "\n" + "PERTENCE à reta " + a + "x + " + b + "y = 0.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O ponto (X: " + x + ", Y: " + y + ")" + "\n" + "NÃO PERTENCE à reta " + a + "x + " + b + "y = 0.");
        }
    }
}
