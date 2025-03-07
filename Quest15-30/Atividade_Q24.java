/*
VAR
agua,suco,litros_total
cadeia:REAL

INICIO
 leia("Quantidade de suco a ser feito")
 
 valores
agua = litros_total * 0.8
suco = litros_total * 0.2

se (litro_total for maior ou igual a -1)
 escreva("Para ... liros de de suco, é necessario ... litros de agua ou seja, ... litros de suco" + litros_total,agua,suco)

senao
 escreva("Valor inválido")

fim

TESTE DE MESA

LITROS_TOTAL / AGUA / SUCO / SE / SENAO / IMPRIMIR
      5       4.00   1.00    V     -        V(5/4.00/1.00)
      0          0     0     V     -        V(0)
     -0        -9     -88    -     F        F     
  
 */

package com.mycompany.atividade_q24;
import javax.swing.JOptionPane;

public class Atividade_Q24 {

    public static void main(String[] args) {
          double agua,suco,litros_total;
          String s_litros_total;
        
        s_litros_total = JOptionPane.showInputDialog(null, "Quantidade de suco a ser feito");
        litros_total = Double.parseDouble(s_litros_total);
        
        agua = litros_total*0.8;
        suco = litros_total*0.2;
        
        if (litros_total >= -1)
        {
        JOptionPane.showMessageDialog(null, String.format("Para %.2f Litros de suco, é nescessário %.2f litros de água ou seja, %.2f Litros de suco", + litros_total,agua,suco));
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Valor inválido");  
        }
    }
}
