/*
 VAR
inteiro:blusas
novelos,novelosporblusas
cadeia:REAL

INICIO
leia ("Numeo de blusas")
leia ("... novelos")

novelosporblusas = novelos/blusas

se (blusas for maior que 0) e (novelos maior que 0)
 escreva ("O gasto é de" + novelosporblusas)

senao
 escreva ("Valor invalido")

fim

TESTE DE MESA

BLUSAS / NOVELOS / SE / SENAO / IMPRIMA /
 2         40      V     -       20
 0         0       -     F       -
-1        -1       -     F       -

*/

package com.mycompany.atividade_q20;
import javax.swing.JOptionPane;

public class Atividade_Q20 {

    public static void main(String[] args) {
       double blusas,novelos, novelosporblusas ;
      String s_blusas, s_novelos;
      
      s_blusas = JOptionPane.showInputDialog(null, "Número de blusas ");
      blusas = Double.parseDouble(s_blusas);
      
      s_novelos = JOptionPane.showInputDialog(null, "Número de novelos ");
      novelos = Double.parseDouble(s_novelos);
      
      novelosporblusas = novelos / blusas;
      
      if ((blusas > 0) && (novelos > 0))
      {
      JOptionPane.showMessageDialog(null,"O gasto é de " + novelosporblusas);
      } 
      else
      {
      JOptionPane.showMessageDialog(null,"Valor inválido");
      }
      
    }
}
