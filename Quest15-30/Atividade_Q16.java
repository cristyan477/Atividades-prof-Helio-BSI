/*
 VAR
inteiro:sanduiches
real:queijo,presunto,hamburguer
cadeia

INICIO

leia (Quantidade de sanduiches)

quantidade de ingredientes por sanduiche
queijo = 0.05 + 0.05 
presunto = 0.05 
hamburge = 0.10 

se (valor maior que 0)
 escreva("Total de Queijo...")
 escreva("Total de Presunto...")
 escreva("Total de Hambuguer...")

senão
 escreva("Valor invalido")

fim

TESTE DE MESA 

SANDUICHES / SE / SENAO / QUEIJO / PRESUNTO / HAMBURGUER /
    2        V     -       200g      100g     200g
    0        -     F        -          -         -   
   -1        -     F        -          -         - 

 */

package com.mycompany.atividade_q16;
import javax.swing.JOptionPane;

public class Atividade_Q16 {

    public static void main(String[] args) {
        
         int sanduiches;
        double queijo,presunto,hamburguer;
        String s_sanduiches;
        
        s_sanduiches = JOptionPane.showInputDialog(null, "Digite a Quantidade de Sanduíches a ser Feito");
        sanduiches = Integer.parseInt(s_sanduiches);
        
        queijo = sanduiches*(0.05 + 0.05);
        presunto = sanduiches*0.05;
        hamburguer = sanduiches*0.10;
        
        if (sanduiches >= 0)
        {
        JOptionPane.showMessageDialog(null, String.format("O Total de Queijo é: %.3f gramas", + queijo));
        JOptionPane.showMessageDialog(null, String.format("O Total de Pesunto é: %.3f gramas", + presunto));
        JOptionPane.showMessageDialog(null, String.format("O Total de Hambuguer é: %.3f gramas", + hamburguer));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Valor inválido.");
        }
    }
}
