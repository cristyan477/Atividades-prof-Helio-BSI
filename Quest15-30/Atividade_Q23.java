/*
VAR 
alturaPessoa,sombraPessoa,sombraPredio,alturaPredio
cadeia:REAL

INICIO
leia ("Sua altura")
leia ("Comprimento da sombra")
leia ("comprimento da sombra do predio")

altura = (alturaPessoa*sombraPredio)/sombraPessoa

se ((alturaPessoa >= 0) e (sombraPessoa >= 0) e (sombraPredio >= 0))
 escreva ("A altura do prédio é aproximadamente" + alturaPredio)

senao
 escreva ("Valores invalidos")

fim

TESTE DE MESA

ALTURAPESSOA / SOMBRAPESSOA / SOMBRAPREDIO / SE / SENAO / ALTURAPREDIO / IMPRIMIR 
  171             181             500        V      -         471.38      471.38
   0               0               0         V      -           0           0
  -9              -76              -8        -      F           -           - 

 */

package com.mycompany.atividade_q23;
import javax.swing.JOptionPane;

public class Atividade_Q23 {

    public static void main(String[] args) {
       double alturaPessoa,sombraPessoa,sombraPredio,alturaPredio;
        String s_alturaPessoa,s_sombraPessoa,s_sombraPredio;
        
        s_alturaPessoa = JOptionPane.showInputDialog("Digite a sua altura:");
        alturaPessoa = Double.parseDouble(s_alturaPessoa);
        
        s_sombraPessoa = JOptionPane.showInputDialog("Digite o comprimento da sua sombra:");
        sombraPessoa = Double.parseDouble(s_sombraPessoa);
        
        s_sombraPredio = JOptionPane.showInputDialog("Digite o comprimento da sombra do prédio:");
        sombraPredio = Double.parseDouble(s_sombraPredio);
      
        alturaPredio = (alturaPessoa*sombraPredio)/sombraPessoa;
        
        if ((alturaPessoa > -1) && (sombraPessoa > -1) && (sombraPredio > -1))
        {
         JOptionPane.showMessageDialog(null, String.format("A altura do prédio é aproximadamente %.2f metros.", alturaPredio));
        }
        else
        {
         JOptionPane.showMessageDialog(null, "Valores inválidos");  
        }
    }
}
