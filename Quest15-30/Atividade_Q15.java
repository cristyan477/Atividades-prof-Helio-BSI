/*
 VAR
 valor,valorporpessoa,centavos
 cadeia:REAL

INICIO    
  leia("Digite o valor total da conta: ")
    
definicao:
 valorporpessoa = valor/3
 centavos = valor - (valorporpessoa*3)
    
Se (valor for maior ou igual -1)
    escreva("Valor que André vai pagar é R$ " + valorporpessoa)
    escreva("Valor que Carlos vai pagar é R$ " + valorporpessoa)
    escreva("Valor que Felipe vai pagar é R$ " + (valorporpessoa + centavos))
senão
    escreva("Valor invalido")


fim


TESTE DE MESA

VALOR / CARLOS / ANDRE / FELIPE / SE / SENAO / IMPRIMIR
10.67    3.00     3.00    4.67     V     -       V
-1        -        -       -       -     F       F 
100      33.00    33.00   34.00     V    -       V 

 */

package com.mycompany.atividade_q15;
import javax.swing.JOptionPane;

public class Atividade_Q15 {

    public static void main(String[] args) {
       
        double valor,valorporpessoa,centavos;
        String svalor;

        svalor = JOptionPane.showInputDialog(null,"Digite o valor total da conta");
        valor = Double.parseDouble(svalor);

        valorporpessoa = Math.floor(valor / 3);
        centavos = valor - (valorporpessoa * 3);

        if (valor >= -1)
        {
        JOptionPane.showMessageDialog(null, "Valor que André vai pagar é R$ " + String.format("%.2f", valorporpessoa));
        JOptionPane.showMessageDialog(null, "Valor que Carlos vai pagar é R$ " + String.format("%.2f", valorporpessoa));
        JOptionPane.showMessageDialog(null, "Valor que Felipe vai pagar é R$ " + String.format("%.2f", (valorporpessoa + centavos)));
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Valor inválido");
        }
    }
}
