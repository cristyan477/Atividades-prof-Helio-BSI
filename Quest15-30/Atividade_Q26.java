/*
 VAR
primeiro_p,segundo_p,terceiro_p,totalprimeiro_p,totalsegundo_p,totalterceiro_p,proporção,divisao
cadeia:REAL

INICIO
 leia ("Pontuaçao do primeiro participante:")
 leia ("Pontuaçao do segundo participante:")
 leia ("Pontuaçao do terceiro participante:")

definiçao
 proporção = primeiro_p + segundo_p + terceiro_p
 divisao = (500000)/proporção
 totalprimeiro_p = divisao*primeiro_p
 totalsegundo_p = divisao*segundo_p
 totalterceiro_p = divisao*terceiro_p

se ((primeiro_p maior igual 0) e (segundo_p maior igual 0) e (terceiro_p mior igual 0))
 escreva("O prêmio do primeiro é R$ " + totalprimeiro_p)
 escrevs("O prêmio do segundo é de R$ " + totalsegundo_p)
 escreva("O prêmio do terceiro é de R$ " + totalterceiro_p)

senao
 escreva("Valores inválidos")

fim

TESTE DE MESA

PRIMEIRO_P / SEGUNDO_P / TERCEIRO_P / SE / SENAO / IMPRIMIR     PRIMEIRO      SEGUNDO        TERCEIRO /
   10          7            5         V     -          V      R$227272.73   R$159090.9     R$113636.37
   0           0            0         V     -          V        R$00.0        R$00.0          R$00.0
  -10         -7           -5         -     F          F          -             -               -

 */

package com.mycompany.atividade_q26;
import javax.swing.JOptionPane;

public class Atividade_Q26 {

    public static void main(String[] args) {
       float primeiro_p,segundo_p,terceiro_p,totalprimeiro_p,totalsegundo_p,totalterceiro_p,proporção,divisao;
       String sprimeiro_p,ssegundo_p,sterceiro_p;
       
       sprimeiro_p = JOptionPane.showInputDialog(null,"Pontuaçao do primeiro participante:");
       primeiro_p = Float.parseFloat(sprimeiro_p);
       
       ssegundo_p = JOptionPane.showInputDialog(null,"Pontuaçao do segundo participante:");
       segundo_p = Float.parseFloat(ssegundo_p);
       
       sterceiro_p = JOptionPane.showInputDialog(null,"Pontuaçao do terceiro participante:");
       terceiro_p = Float.parseFloat(sterceiro_p);
       
       proporção = primeiro_p + segundo_p + terceiro_p;
        divisao = (500000)/proporção;
        totalprimeiro_p = divisao*primeiro_p;
        totalsegundo_p = divisao*segundo_p;
        totalterceiro_p = divisao*terceiro_p;
        
        if ((primeiro_p >= 0) && (segundo_p >= 0) && (terceiro_p >= 0))
        {
        JOptionPane.showMessageDialog(null, "O prêmio do primeiro é R$ " + totalprimeiro_p ); 
        JOptionPane.showMessageDialog(null, "O prêmio do segundo é de R$ " + totalsegundo_p ); 
        JOptionPane.showMessageDialog(null, "O prêmio do terceiro é de R$ " + totalterceiro_p ); 
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Valores inválidos");    
        }
       
    }
}
