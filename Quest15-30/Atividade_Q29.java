/*
VAR
a,b

INICIO
 leia ("O coeficiente de A:")
 leia ("O coeficiente de B")

se ( A fo diferente ou igual a 0)
definiçao
 x = -b/a
 y = 0
 escreva("O ponto onde a reta toca o eixo X é: + x + y")

senao
 escreva(" A não pode ser igual a 0.")

fim

TESTE DE MESA 

 A / B / SE / SENAO / IMPRIMIR / 
10  5.2  V     -        V
0   10   -     F        F

 */

package com.mycompany.atividade_q29;
import javax.swing.JOptionPane;

public class Atividade_Q29 {

    public static void main(String[] args) {
        double a, b;
        String s_a,s_b;
        
        s_a = JOptionPane.showInputDialog(null, "O coeficiente A:");
        a = Double.parseDouble(s_a);
        s_b = JOptionPane.showInputDialog(null, "O coeficiente B:");
        b = Double.parseDouble(s_b);

        if (a != 0) 
        {
         double x = - b / a;
         double y = 0;

          JOptionPane.showMessageDialog(null, "O ponto onde a reta toca o eixo X é: (" + String.format("%.2f", x) + ", " + y + ")");
        }
        
        else 
        {
          JOptionPane.showMessageDialog(null, "A não pode ser igual a 0."); 
        }
    
  }
}
        
        
        
        
        
        
        
        
    