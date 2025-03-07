/*
 VAR
real:a1,a2,b1,b2,calc

INICIO

Leia("Digite o coeficiente a1:")
Leia("Digite o coeficiente b1:")
Leia("Digite o coeficiente a2:")
Leia("Digite o coeficiente b2")

DEFINIÇAO
calc -> a1 * b2 + a2 * b1

se(calc for equivalente a 0)
 {
   se((a1 menos a2 equivalente 0) e (b1 menos b2 equivalente 0))
     {
      Escreva("As retas são coincidentes e possuem pontos de interseção.") VERDADEIRO 1
     }
    senao 
     {
      Escreva("As retas são paralelas e não possuem pontos de interseção.") VERDADEIRO 2
     }
 }
senao
 {
  Escreva("O ponto de interseção das retas são 0, 0.") FALSO
 }

fim

TESTE DE MESA

A1 / B1 / A2 / B2 / SE1 / SE2 / SENAO1 / SENAO2
2    -1   1    1     F     F      F        V  
1     1   2    2     V     F      V        F 
1     1   1    1     V     V      F        F  

 */

package com.mycompany.ativ_q26;
import javax.swing.JOptionPane;

public class Ativ_Q26 {

    public static void main(String[] args) {
         double a1,a2,b1,b2,calc;

         a1=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o coeficiente a1:"));
         b1=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o coeficiente b1:"));
         a2=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o coeficiente a2:"));
         b2=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o coeficiente b2:"));
         
        calc= a1 * b2 - a2 * b1;
       
        if (calc == 0) 
        { 
          if ((a1 - a2 == 0) && (b1 - b2 ==0)) 
            {
             JOptionPane.showMessageDialog(null, "As retas são coincidentes e possuem pontos de interseção.");
            } 
          else 
            {
             JOptionPane.showMessageDialog(null, "As retas são paralelas e não possuem pontos de interseção.");
            }
         } 
        else 
        {  
          JOptionPane.showMessageDialog(null, "O ponto de interseção das retas são 0, 0.");
        }
        
    }
}
