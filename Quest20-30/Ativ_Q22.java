/*
  VAR
real: n1,n2,n3,med,med_a;
inteiro:ident

INICIO

Leia("Número de identidade:")
Leia("Nota obtida 1:")
Leia("Nota obtida 2:")
Leia("Nota obtida 3:")
Leia("Média:")

DEFINIÇAO
med_a=(n1+n2+n3+med)/7

se(med_a maior igual 9.0)
        {
         Escreva("Número ident: " + ident + "Notas:" + n1 + n2 + n3 + "Média dos exer: " + med +"Média de aprov:" + med_a +
                 "Classificação: A" + "Resultado: APROVADO")       
        }
        senao se((med_a maior igual 7.5) e (med_a menor 9.0))
        {
         Escreva("Número ident: " + ident + "Notas:" + n1 + n2 + n3 + "Média dos exer: " + med + "Média de aprov:" + med_a +
                 "Classificação: B" + "Resultado: APROVADO")        
        }
        senao se((med_a maior igual 6.0) e (med_a menor 7.5))
        {
         Escreva("Número ident: " + ident + "Notas:" + n1 + n2 + n3 + "Média dos exer: " + med + "Média de aprov:" + med_a +
                 "Classificação: C" + "Resultado: APROVADO") 
        }
        senao se((med_a maior igual 4.0) e (med_a menor 6.0))
        {
         Escreva("Número ident: " + ident + "Notas:" + n1 + n2 + n3 + "Média dos exer: " + med +"Média de aprov:" + med_a +
                 "Classificação: D" + "Resultado: REPROVADO")
        }
        senao se(med_a menor 4.0)
        {
         Escreva("Número ident: " + ident + "Notas:" + n1 + n2 + n3 + "Média dos exer: " + med +"Média de aprov:" + med_a +
                 "Classificação: E" + "Resultado: REPROVADO")        
        }
        senao
        {
         Escreva("Valores inválidos")
        }

fim


TESTE DE MESA

IDENT / N1 / N2 / N3 / MED / MED_A / CLASS / RESULT 
 1      7    8    9    6     4.28      E    REPROVADO    
 22     15   9.5  20   10    7.78      B    APROVADO

 */

package com.mycompany.ativ_q22;
import javax.swing.JOptionPane;

public class Ativ_Q22 {

    public static void main(String[] args) {
        
        double n1=0,n2=0,n3 =0,med=0,med_a;
        String sn,sn2,sn3,smed;
        int ident = 0;
       
         ident=Integer.parseInt(JOptionPane.showInputDialog(null, "Número de identidade:"));
         n1=Double.parseDouble(JOptionPane.showInputDialog(null, "Nota obtida 1:"));
         n2=Double.parseDouble(JOptionPane.showInputDialog(null, "Nota obtida 2:"));
         n3=Double.parseDouble(JOptionPane.showInputDialog(null, "Nota obtida 3:"));
         med=Double.parseDouble(JOptionPane.showInputDialog(null, "Média:"));
         
         med_a=(n1+n2+n3+med)/7;
        
        if(med_a >= 9.0)
        {
         JOptionPane.showMessageDialog(null,"Número de ident: " + ident + "\n" + "Notas:" + n1 + " | " +  n2 + " | " + n3 + "\n" + "Média dos exer: " + med + "\n" 
            + String.format("Média de aprovetiamento:%.2f", + med_a) + "\n" +"Classificação: A" + "\n" + "Resultado: APROVADO");        
        }
        else if((med_a >= 7.5) &&(med_a < 9.0))
        {
         JOptionPane.showMessageDialog(null,"Número de ident: " + ident + "\n" + "Notas:" + n1 + " | " +  n2 + " | " + n3 + "\n" + "Média dos exer: " + med + "\n" + String.format("Média de aproveitamento:%.2f", + med_a) + "\n" +
                 "Classificação: B" + "\n" + "Resultado: APROVADO");        
        }
        else if((med_a >= 6.0) && (med_a < 7.5))
        {
         JOptionPane.showMessageDialog(null,"Número de ident: " + ident + "\n" + "Notas:" + n1 + " | " +  n2 + " | " + n3 + "\n" + "Média dos exer: " + med + "\n" + String.format("Média de aproeitamento:%.2f", + med_a) + "\n" +
                 "Classificação: C" + "\n" + "Resultado: APROVADO");      
        }
        else if((med_a >= 4.0) && (med_a < 6.0))
        {
         JOptionPane.showMessageDialog(null,"Número ident: " + ident + "\n" + "Notas:" + n1 + " | " +  n2 + " | " + n3 + "\n" + "Média dos exer: " + med + "\n" + String.format("Média de aproveitamento:%.2f", + med_a) + "\n" +
                 "Classificação: D" + "\n" + "Resultado: REPROVADO");      
        }
        else if(med_a < 4.0)
        {
         JOptionPane.showMessageDialog(null,"Número de ident: " + ident + "\n" + "Notas:" + n1 + " | " +  n2 + " | " + n3 + "\n" + "Média dos exer: " + med + "\n"+ String.format("Média de aproveitamento:%.2f", + med_a) + "\n" +
                 "Classificação: E" + "\n" + "Resultado: REPROVADO");        
        }
        else
        {
         JOptionPane.showMessageDialog(null,"Valores inválidos");  
        }
    }
}
