/*
VAR
lata350ml,garrafa600ml,garrafa2L,litostotal
cadeia:REAL

INICIO
 escreva ("Quantidade...350ml")
 escreva ("Quantidade...600ml")
 escreva ("Quantidade...2L")

litrostotal = (lata350ml * 0.35) + (garrafa600ml * 0.6) + (garrafa2L * 2)

se ((lata350ml >= 0) e (garrafa600ml >= 0) e (garrafa2L >= 0))
 escreva ("Quanidade total de litros é " + litrostotal")

senao
 escreva("Valoes inválidos")

fim

TESTE DE MESA

LATA350ML / GARRAFA600ML / GARRAFA2L / SE / SENAO / IMPRIMA 
  2            4              8        V     -       19.1 ml/L
  0            0              0        V     -        0
-1            -4             -7        -     F        F

 */

package com.mycompany.atividade_q21;
import javax.swing.JOptionPane;

public class Atividade_Q21 {

    public static void main(String[] args) {
         double lata350ml, garrafa600ml, garrafa2L, litrostotal;
        String s_lata350ml, s_garrafa600ml, s_garrafa2L;
        
        s_lata350ml = JOptionPane.showInputDialog(null, "Quantidade de latas de 350ml");
        lata350ml = Double.parseDouble(s_lata350ml);
        
        s_garrafa600ml = JOptionPane.showInputDialog(null, "Quantidade de garrafas de 600ml");
        garrafa600ml = Double.parseDouble(s_garrafa600ml);
        
        s_garrafa2L = JOptionPane.showInputDialog(null, "Quandidade de garrafas de 2L");
        garrafa2L = Double.parseDouble(s_garrafa2L);
        
        litrostotal = (lata350ml * 0.35) + (garrafa600ml * 0.6) + (garrafa2L * 2);
        
        if ((lata350ml >= 0) && (garrafa600ml >= 0) && (garrafa2L >= 0))
        {
        JOptionPane.showMessageDialog(null, "Quanidade total de litros é " + litrostotal +" ml/L");
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Valores inválidos");  
        }
    }
}
