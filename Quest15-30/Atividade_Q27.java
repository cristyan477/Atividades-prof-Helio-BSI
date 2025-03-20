/*
 VAR
compra_1,compra_2,compra_3,compra_4,pontos,total_gasto
cadeia:REAL

INICIO
 leia("Valor da primeira compra:")
 leia*"Valor da segunda compra:")
 leia("Valor da terceira compra:")
 leia("Valor da quarta compra:")

definiçao
 total_gasto = compra_1 + compra_2 + compra_3 + compra_4
 pontos = total_gasto/5.0

se ((compra_1 maior igual 0) e (compra_2 maior igual 0) e (compra_3 maior igual 0) e (compra_4 maior igual 0))
 escreva("O gasto total: " + total_gasto + " Total de pontos acumulados: " + pontos)

senao
 escreva("Valores inválidos")

fim

TESTE DE MESA

COMPRA_1 / COMPRA_2 / COMPRA_3 / COMPRA_4 / SE / SENAO / IMPRIMIR    TOTAL_GASTO   PONTOS /
 15.5        34         25           73     V     ´-         V       R$147.5        29.5
  0          0          0            0      V      -         V       R$00.0          0
 -1         -9         -99.9        -6      -      F         F          -            -

 */

package com.mycompany.atividade_q27;
import javax.swing.JOptionPane;

public class Atividade_Q27 {

    public static void main(String[] args) {
        double compra_1,compra_2,compra_3,compra_4,pontos,total_gasto;
        String scompra_1,scompra_2,scompra_3,scompra_4;
        
        scompra_1 = JOptionPane.showInputDialog(null,"Valor da primeira compra: ");
        compra_1 = Double.parseDouble(scompra_1);
        
        scompra_2 = JOptionPane.showInputDialog(null,"Valor da segunda compra: ");
        compra_2 = Double.parseDouble(scompra_2);
        
        scompra_3 = JOptionPane.showInputDialog(null,"Valor da terceira compra: ");
        compra_3 = Double.parseDouble(scompra_3);
        
        scompra_4 = JOptionPane.showInputDialog(null,"Valor da quarta compra: ");
        compra_4 = Double.parseDouble(scompra_4);
        
        total_gasto = compra_1 + compra_2 + compra_3 + compra_4;
        pontos = total_gasto/5.0;
        
        if ((compra_1 >= -1) && (compra_2 >= -1) && (compra_3 >= -1) && (compra_4 >= -1))
        {
        JOptionPane.showMessageDialog(null,"O gasto total: R$" + total_gasto + " E total de pontos acumulados: " + pontos);
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Valores inválidos"); 
        }
    }
}
