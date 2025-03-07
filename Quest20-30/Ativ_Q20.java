/*
 VAR
 saldo_médio
 crédito=0
cadeia:REAL

INICIO    
  leia("Digite o saldo médio:")

Se ( saldo_médio for menor igual a 200)
 {
  crédito = 0
 }
Senão se( saldo_médio for maior que 200 e menor igual a 1000)
 {
  crédito = saldo_médio*0.20
 }
Senão se( saldo_médio for maior que 1000 e menor igual a 2000 )
 {
  crédito = saldo_médio*0.30
 }
Senão se( saldo_médio for maior que 2000)
 {
  crédito = saldo_médio*0.40
 }

Escreva
 ("Saldo médio: R$ " + saldo_médio + "Valor do crédito: R$ " + crédito)
 
fim


TESTE DE MESA

SALDO_MÉDIO / CRÉDITO / VALOR_CRÉDITO / ESCREVA
  300           0.20         60            V            
  3000          0.40        1200           V
   0              0           0            V

 */

package com.mycompany.ativ_q20;
import javax.swing.JOptionPane;

public class Ativ_Q20 {

    public static void main(String[] args) {
        double saldo_m,credito=0;
        String ssaldo_m;
        
        ssaldo_m = JOptionPane.showInputDialog(null,"Digite o saldo médio:");
        saldo_m = Double.parseDouble(ssaldo_m);
        
        if (saldo_m <= 200) 
        {
            credito = 0; 
        } 
        else if (saldo_m > 200 && saldo_m <= 1000) 
        {
            credito = saldo_m * 0.20; 
        }
        else if (saldo_m > 1000 && saldo_m <= 2000) 
        {
            credito = saldo_m * 0.30; 
        } 
        else if (saldo_m > 2000) 
        {
            credito = saldo_m * 0.40; 
        }
        
        JOptionPane.showMessageDialog(null,"Saldo médio: R$ " + String.format("%.2f", saldo_m) + "\n" +"Valor do crédito: R$ " + String.format("%.2f", credito));
                          
    }
}
       
   