/*
 VAR
 p_grande,p_medio,p_pequeno,tempo_de_empresa,total
cadeia:REAL

INICIO
 leia("Projetos Grandes:")
 leia("Projetos Médios:")
 leia("Projetos Pequenos:")
 leia("Anos de Empresa:")

deiniçao
 total = ((p_grande*10) + (p_medio*5)+ (p_pequeno*2)+ (tempo_de_empresa*2))

se ((p_grande maior igual -1) e (p_medio maior igual -1) e (p_pequeno maior igual -1) e (tempo_de_empresa maior igual -1))
 escreva("Total de pontos: + total")

senao
 escreva("Valores inválidos")

fim

TESTE DE MESA

P_GRANDE / P_MEDIO / P_PEQUENO / TEMPO_DE_EMPRESA / SE / SENAO / IMPRIMIR   TOTAL /
   2         4          6              2            V     -        V         56
   0         0          0              0            V     -        V         0
  -2        -4         -6             -2            -     F        F         -  
 
 */

package com.mycompany.atividade_q30;
import javax.swing.JOptionPane;

public class Atividade_Q30 {

    public static void main(String[] args) {
       int p_grande,p_medio,p_pequeno,tempo_de_empresa,total;
        String sp_grande,sp_medio,sp_pequeno,stempo_de_empresa;
        
        sp_grande = JOptionPane.showInputDialog(null, "Projetos Grandes: ");
        p_grande = Integer.parseInt(sp_grande);
        
        sp_medio = JOptionPane.showInputDialog(null, "Projetos Médios: ");
        p_medio = Integer.parseInt(sp_medio);
        
        sp_pequeno = JOptionPane.showInputDialog(null, "Projetos Pequenos ");
        p_pequeno = Integer.parseInt(sp_pequeno);
        
        stempo_de_empresa = JOptionPane.showInputDialog(null, "Anos de Empresa ");
        tempo_de_empresa = Integer.parseInt(stempo_de_empresa);
        
        total = ((p_grande*10) + (p_medio*5)+ (p_pequeno*2)+ (tempo_de_empresa*2));
        
        if ((p_grande >= -1) && (p_medio >= -1) && (p_pequeno >= -1) && (tempo_de_empresa >= -1))
        {
        JOptionPane.showMessageDialog(null, "O Total de Pontos: " + total);
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Valores inválidos");    
        }
        
    }
}
