/*
VAR
inteiro num,p1,p2,soma

INICIO

Leia("Digite o número:")

se(num menor 1000 ou num maior 9999)
 {
   Escreva("O número deve possuir 4 digitos")
   retorne
 }

DEFINIÇÃO
p1 -> num / 100
p2 -> num % 100
soma -> p1 + p2

se(soma vezes soma for equialente 0)
 {
  Escreva("O número " + num + " SATISFAZ a característica: (" + p1 + " + " + p2 + ")^2 = " + num)
 }
senao
 {
  Escreva("O número " + num + " NÃO SATISFAZ a característica")
 }

fim

TESTE DE MESA

NUM / SE1 / SE2 / SENAO
3025   F     V     F
1234   F     F     V 
123    V     -     -  
12345  V     -     -  

 */

package com.mycompany.ativ_q28;
import javax.swing.JOptionPane;

public class Ativ_Q28 {

    public static void main(String[] args) {
        
        int num,p1,p2,soma;
       
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número:"));
        
        if (num < 1000 || num > 9999)
        {
         JOptionPane.showMessageDialog(null, "O número deve possuir 4 dígitos");
         return;
        }
        
        p1 = num / 100; 
        p2 = num % 100;
        soma = p1 + p2;
        
        if (soma * soma == num)
        {
            JOptionPane.showMessageDialog(null, "O número " + num + " SATISFAZ a característica: (" + p1 + " + " + p2 + ")^2 = " + num);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O número " + num + " NÃO SATISFAZ a característica.");
        }
        
    }
}
