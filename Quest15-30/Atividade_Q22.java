/*
 VAR
moeda1cent,moeda5cent,moeda10cent,moeda25cent,moeda50cent,moeda1real,total
cadeia:REAL

INICIO
 leia ("Quantidade de moedas de 1 centavos:") 
 leia ("Quantidade de moedas de 5 centavos:")
 leia ("Quantidade de moedas de 10 centavos:")
 leia ("Quantidade de moedas de 25 centavos:")
 leia ("Quantidade de moedas de 50 centavos:")
 leia ("Quantidade de moedas de 1 Real:")

total = (moeda1cent * 0.01) + (moeda5cent * 0.05) + (moeda10cent * 0.10) + (moeda25cent * 0.25) + (moeda50cent * 0.50) + (moeda1real * 1.00)

se ((moeda1cent >= 0) e (moeda5cent >= 0) e (moeda10cent >= 0) && (moeda25cent >= 0) e (moeda50cent >= 0) e (moeda1real >= 0))
 escreva ("Total economizado: R$ " + total)

senao 
 escreva("Valores inválidos")

fim

TESTE DE MESA 

MOEDA1CENT / MOEDA5CENT / MOEDA10CENT / MOEDA25CENT / MOEDA50CENT / MOEDA1REAL / SE /SENAO / IMPRIMIR
    1           2             3            4             5             6         V    -       R$9.91
    0           0             0            0             0             0         V    -       R$0.00
   -1          -6            -5           -7            -8            -2         -    F         F

 */

package com.mycompany.atividade_q22;
import javax.swing.JOptionPane;

public class Atividade_Q22 {

    public static void main(String[] args) {
         int moeda1cent,moeda5cent,moeda10cent,moeda25cent,moeda50cent,moeda1real;
        double total;
        String s_moeda1cent,s_moeda5cent,s_moeda10cent,s_moeda25cent,s_moeda50cent,s_moeda1real;
        
        s_moeda1cent = JOptionPane.showInputDialog(null, "Quantidade de Moedas de 1 centavos:");
        moeda1cent = Integer.parseInt(s_moeda1cent);
        
        s_moeda5cent = JOptionPane.showInputDialog(null, "Quantidade de Moedas de 5 centavos:");
        moeda5cent = Integer.parseInt(s_moeda5cent);
        
        s_moeda10cent = JOptionPane.showInputDialog(null, "Quantidade de Moedas de 10 centavos:");
        moeda10cent = Integer.parseInt(s_moeda10cent);
        
        s_moeda25cent = JOptionPane.showInputDialog(null, "Quantidade de Moedas de 25 centavos:");
        moeda25cent = Integer.parseInt(s_moeda25cent);
        
        s_moeda50cent = JOptionPane.showInputDialog(null, "Quantidade de Moedas de 50 centavos;");
        moeda50cent = Integer.parseInt(s_moeda50cent);
        
        s_moeda1real = JOptionPane.showInputDialog(null, "Quantidade de Moedas de 1 Real:");
        moeda1real = Integer.parseInt(s_moeda1real);

        total = (moeda1cent * 0.01) + (moeda5cent * 0.05) + (moeda10cent * 0.10) + (moeda25cent * 0.25) + (moeda50cent * 0.50) + (moeda1real * 1.00);

        if ((moeda1cent >= 0) && (moeda5cent >= 0) && (moeda10cent >= 0) && (moeda25cent >= 0) && (moeda50cent >= 0) && (moeda1real >= 0))
        {
        JOptionPane.showMessageDialog(null, "Total economizado: R$ " + String.format("%.2f", total));
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Valores inválidos");
        }
    }
}
