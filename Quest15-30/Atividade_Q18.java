/*
  VAR
salariobruto,salarioliquido
cadeia:real

INICIO
horas_trabalhadas,horas_trabalhadas_extra,salariobruto,salarioliquido;

leia "Digite o número de Horas Trabalhadas"
leia "Digite o número de Horas Trabalhadas Extra"

salariobruto = (horas_trabalhadas*10)+(horas_trabalhadas*15)
salarioliquido = (salariobruto-(salariobruto*0.10)

se ((horas_trabalhadas maior que -1) e (horas_trabalhadas_extra maior que -1))
escreva ("o Salário Bruto é:" + salariobruto)
escreva ("o Salário líquido é:" + salarioliquido)

senao
escreva("Numero invalido")

fim

TESTE DE MESA

HORAS_TRABALHADAS / HORAS_TRABALHADASEXTRA / SE / SENAO / SALIQUIDO / SALBRUTO
      16                    6                V     -      250,00      225,00
     -10                   -4                -     F        -           -
      0                     0                V     -        0           0

 */

package com.mycompany.atividade_q18;
import javax.swing.JOptionPane;

public class Atividade_Q18 {

    public static void main(String[] args) {
        double horas_trabalhadas,horas_trabalhadas_extra,salariobruto,salarioliquido;
        String s_horas_trabalhadas,s_horas_trabalhadas_extra;

        
        s_horas_trabalhadas = JOptionPane.showInputDialog(null, "Digite o número de Horas Trabalhadas");
        s_horas_trabalhadas_extra = JOptionPane.showInputDialog(null, "Digite o número de Horas Trabalhadas Extra");
        horas_trabalhadas = Integer.parseInt(s_horas_trabalhadas);
        horas_trabalhadas_extra = Integer.parseInt(s_horas_trabalhadas_extra);
        
        salariobruto = (horas_trabalhadas*10)+(horas_trabalhadas_extra*15);
        salarioliquido = salariobruto-(salariobruto*0.10);
        
        if ((horas_trabalhadas >= -1) && (horas_trabalhadas_extra >= -1))
        {
        JOptionPane.showMessageDialog(null, String.format("o Salário Bruto é: %.2f", + salariobruto));
        JOptionPane.showMessageDialog(null, String.format("o Salário líquido é: %.2f", + salarioliquido));
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Número inválido");    
        }
    }
}
