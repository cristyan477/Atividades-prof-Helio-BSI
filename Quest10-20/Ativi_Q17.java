/*
VAR
inteiro: garr->20000,vaz->50,tempo->0,horas,minutos

INICIO

enquanto(garr maior 0)
{ 
 garr -> garr - vaz
 tempo -> tempo + 30
}

DEFINIÇÃO
horas -> tempo / 60
minutos -> tempo % 60

Escreva("O garrafão estará vazio em " + horas + " horas e " + minutos + " minutos.")

fim

TESTE DE MESA

ENQUANTO / ESCREVA 
   V       O garrafão estará vazio em 200 horas e 0 minutos.

 */

package com.mycompany.ativi_q17;
import javax.swing.JOptionPane;

public class Ativi_Q17 {

    public static void main(String[] args) {
        
        int garr = 20000,vaz = 50,tempo = 0,horas,minutos; 
        
        while (garr > 0)
        {
            garr -= vaz;
            tempo += 30;
        }

        horas = tempo / 60;
        minutos = tempo % 60;

        JOptionPane.showMessageDialog(null, "O garrafão estará vazio em " + horas + " horas e " + minutos + " minutos");
        
    }
}
