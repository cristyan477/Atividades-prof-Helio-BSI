/*
  VAR
celsius,fahrenheit
cadeia:REAL

INICIO
leia
 (temperaura em calsius:...)

temperatura em Fº
fahrenheit = (celsius*1.8)+32

escreva o valor convertido...

fim

TESTE DE MESA

CELSIUS / FAHRENHEIT / IMPRIMA /
 25          77         77
-2          28,4        28,4

 */

package com.mycompany.atividade_q17;
import javax.swing.JOptionPane;

public class Atividade_Q17 {

    public static void main(String[] args) {
       
         double celsius,fahrenheit;
        String s_celsius;
        
        s_celsius = JOptionPane.showInputDialog(null, "Digite a Temperatura Atual: \n - Atual (Celsius) \n - Para (Fahrenheit)");
        celsius = Double.parseDouble(s_celsius);
        
        fahrenheit = (celsius*1.8)+32;
        
        JOptionPane.showMessageDialog(null,String.format("A temperatura convertida será %.1f ",+ fahrenheit));
    }
}
