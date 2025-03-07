/*
 VAR
inteiro: codigo
real: salario,novo_salario,aumento=0,diferença

INICIO    
  leia("Digite o salário:")

Se(salario for menor que 0)
{
 escreva("Salário inválido")
 pare
}

  leia("Digite o código do cargo:")

Se ( código equivalente a 91)
 {
  aumento = 0.10
 }
Senão se(código equivalente a 92)
 {
  aumento = 0.20
 }
Senão se( código equivalente a 93)
 {
  aumento = 0.30
 }
Senão
 {
  aumento = 0.355
 }

Definição
 novo_salário = salário * (1+aumento)
 diferença = novo_salário - salário

Escreva
 ("Salário antigo: R$ " + salário + "Novo salário: R$ " + novo_salário + "Diferença: R$ " + diferença)
 
fim

TESTE DE MESA

SALÁRIO / CÓDIGO / AUMENTO / NOVO_SALARIO / DIFERENÇA / ESCREVA
R$ 200      91      0.10      R$ 220,00       R$ 20        V
R$ 300      0      0.355      R$ 406,50     R$ 106,50      V
R$ -123     -        -             -             -         F

 */

package com.mycompany.ativ_q21;
import javax.swing.JOptionPane;
public class Ativ_Q21 {

    public static void main(String[] args) {
       int cod;      
       double salario,n_salario,aumento=0,diferenca;
       String ssalario,scod;
       
       ssalario = JOptionPane.showInputDialog(null,"Digite o salário:");
       salario = Double.parseDouble(ssalario);
       
       if( salario < 0)
       {
        JOptionPane.showMessageDialog(null,"Salário inválido");
        return;
       }
       
       scod = JOptionPane.showInputDialog(null,"Digite o código do cargo");
       cod = Integer.parseInt(scod);
       
       if ( cod == 91)
       {
        aumento = 0.10;  
       }
       else if ( cod == 92)
       {
        aumento = 0.20;  
       }
       else if ( cod == 93)
       {
        aumento = 0.30;  
       }
       else 
       {
        aumento = 0.355;  
       }
       
       n_salario = salario*(1+aumento);
       diferenca = n_salario - salario;
       
       JOptionPane.showMessageDialog(null, "Salário antigo: R$ " + String.format("%.2f", salario)  + "\n" + "Novo salário: R$ " + String.format("%.2f",n_salario) + "\n" + "Diferença: R$ " + String.format("%.2f", diferenca));
      
    }
}
