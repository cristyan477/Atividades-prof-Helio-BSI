/*
 VAR
valor_cheque,imposto
cadeia:REAL

INICIO
 leia ("Valor do cheque:")

definiçao
 imposto = valor_cheque * 0.0038

se (valor_cheque maior ou igual a 0)
 escreva("Será recolhido de CPMF: R$" + imposto")

senao
 escreva("Valor inválido")

fim

TESTE DE MESA 

VALOR_CHEQUE / SE / SENAO / IMPRIMIR  IMPOSTO /
    150        V      -      V       R$0,57
     0         V      -      V       R$0.00
   -150        -      F      F         -

 */

package com.mycompany.atividade_q28;
import javax.swing.JOptionPane;

public class Atividade_Q28 {

    public static void main(String[] args) {
        double valor_cheque,imposto;
        String svalor_cheque;

        svalor_cheque = JOptionPane.showInputDialog("Valor do cheque:");
        valor_cheque = Double.parseDouble(svalor_cheque);
        
        imposto = valor_cheque * 0.0038;
        
        if (valor_cheque >= 0)
        {
        JOptionPane.showMessageDialog(null, "Será recolhido de CPMF: R$" + String.format("%.2f", imposto));
        }
        else 
        {
        JOptionPane.showMessageDialog(null, "Valor inválido");   
        }
    }
}
