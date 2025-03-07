/*
 VAR
inteiro:fragos
real:anelchip,anelalimentos,gasto


INICIO
leia ("Quantidade de frangos")

valores
anelchip = 4
anelalimentos = 3,50

gasto = (frangos*anelchip)+((anelalimentos*2)*frangos)

se (fragos fo maior ou igual a 0)
  escreva ("Gasto foi de " + gasto)

senao 
  escreva ("Valor invalido")

fim

TESTE DE MESA 

FRANGOS / SE / SENAO / GASTO /
 10       V     -     110,0
 0        V     -      0
-1        -     F      -

 */

package com.mycompany.atividade_q19;
import javax.swing.JOptionPane;

public class Atividade_Q19 {

    public static void main(String[] args) {
      
     int frangos;
      double anelchip,anelalimentos, gasto;
      
      String s_frangos;
      
      s_frangos = JOptionPane.showInputDialog(null, " quantidade de frangos ");
      frangos = Integer.parseInt(s_frangos);
      
      anelchip = 4;
      anelalimentos = 3.50;
      
      gasto = (frangos*anelchip)+((anelalimentos*2)*frangos);
      
      if (frangos >= 0)
       {
      JOptionPane.showMessageDialog(null,"o gasto foi de: " + gasto);
       } 
      else
      {
      JOptionPane.showMessageDialog(null,"Valor inválido");
      }
    }
}
