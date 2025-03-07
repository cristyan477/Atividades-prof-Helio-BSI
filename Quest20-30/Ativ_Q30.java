/*
 VAR
inteiro: cod,quant,tipo
real:preco=0,v_total

INICIO

Leia("Digite o código do refrigerante (1|2|3):")
Leia("Digite o tipo do refrigerante (1 para Normal, 2 para Diet):")
Leia("Digite a quantidade")

se(cod equivalente 1)
 {
   se(tipo equivalente 1)
   {
     preco -> 1.50
   }
   senao
   {
     preco -> 1.70
   }
 }

senao se(cod equivalente 2)
 {
  se(tipo equivalente 1)
   {
    preco -> 1.60
   }
  senao 
   { 
    preco -> 1.70
   }
 }

senao se(cod equivalente 3)
 {
  se(tipo equivalente 1)
   {
    preco -> 1.40
   }
  senao
  {
   preco -> 1.45
   }
 }
senao
 {
  Escreva("Código inálido")
  retorne
 }

DEFINIÇAO
v_total -> preco * quantidade

se(v_total > 100)
 {
  v_total -> v_total * 0.95
 }

Escreva("Valor total da compra: R$" + v_total)

fim

TESTE DE MESA

COD / TIPO / QUANT / SE > 100 / SENAO(VALOR INVALIDO) / VALOR NORMAL / DESCONTO
 1    1(N)     5       F              F                    R$7,50      R$7,50
 1    2(D)     60      V              F                    R$102,00    R$96,90
-1    99       00      -              V                      -           -

 */

package com.mycompany.ativ_q30;
import javax.swing.JOptionPane;

public class Ativ_Q30 {

    public static void main(String[] args) {
        
        int cod,quant,tipo;
        double preco=0,v_total;
        
        cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do refrigerante (1|2|3):"));
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do refrigerante (1 para Normal, 2 para Diet):"));
        quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
        
        if (cod == 1)
         {
            if (tipo == 1)
            {
             preco = 1.50;
            } 
            else 
            {
             preco = 1.70;
            }
        } 
        else if (cod == 2)
          {
            if (tipo==1)
            {
             preco = 1.60;
            } 
            else 
            {
             preco = 1.70;
            }
         } 
        else if (cod == 3)
        {
            if (tipo == 1)
            {
             preco = 1.40;
            }
            else
            {
             preco = 1.45;
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Código inválido");
            return;
        }
        
        v_total = preco * quant;
        
        if (v_total > 100) 
        {
            v_total = v_total * 0.95;
        }
        
        JOptionPane.showMessageDialog(null, "Valor total da compra: R$" + String.format("%.2f", v_total));
        
    }
}
