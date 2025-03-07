/*
 VAR
volume,raio,altura
cadeia:real

INICIO
 leia ("Valor do raio:")
 leia ("Valor da altura:")

definiçao
 volume = (raio*raio)*altura*3.14

se ((raio maior ou igual -1) e (altura maior ou igual -1))
 escreva ("O volume da caixa D'Água é " + volume)

senao
 escreva ("Valores inválidos")

fim

TESTE DE MESA

RAIO / ALTURA / SE / SENAO / VOLUME / IMPRIMIR
 3.5     8.14    V     -     313.10    V(313.10)
  0       0      V     -       0.0     V(0.0)
 -3.5     -0     -     F        -       F

 */

package com.mycompany.atividade_q25;
import javax.swing.JOptionPane;

public class Atividade_Q25 {

    public static void main(String[] args) {
        double volume,raio,altura;
        String sraio,saltura;
        
        sraio = JOptionPane.showInputDialog(null," Valor do raio ");
        raio = Double.parseDouble(sraio);
        
        saltura = JOptionPane.showInputDialog(null," Valor da altura ");
        altura = Double.parseDouble(saltura);
        
        volume = (raio*raio)*altura*3.14;
        
        if ((raio > -1) && (altura > -1))
        {
        JOptionPane.showMessageDialog(null,"O volume da caixa D'Água é" + volume);
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Valores inválidos");    
        }
        
    }
}
