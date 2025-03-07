/*
VAR 
int id1,id2,id3
real alt1,alt2,alt3,altura_m
ler n1,n2,n3,m_alto,m_baixo,m_velho,m_moco

INICIO

Leia("Digite o nome da pessoa 1:")
Leia("Dige a idade do(a) " + n1 + " :")
Leia("Digite a altura do(a) " + n1 + " :")
Leia("Digite o nome da pessoa 2:")
Leia("Dige a idade do(a) " + n2 + " :")
Leia("Digite a altura do(a) " + n2 + " :")
Leia("Digite o nome da pessoa 3:")
Leia("Dige a idade do(a) " + n3 + " :")
Leia("Digite a altura do(a) " + n3 + " :")

m_alto -> n1
 se(alt2 maior alt1 e alt2 maior alt3) 
  {
    m_alto -> n2;
   }
  se (alt3 maior alt1 e alt3 maior alt2) 
   {
    m_alto -> n3;
    }

m_baixo -> n1
 se (alt2 menor alt1 e alt2 menor alt3) 
   {
     m_baixo -> n2;
    }
 se (alt3 menor alt1 e alt3 menor alt2) 
   {
     m_baixo -> n3;
    }

DEFINIÇÃO
altura_m -> (alt1 + alt2 + alt3) / 3;

m_velho -> n1
 se (id2 maior id1 e id2 meior id3) 
  {
    m_velho -> n2;
   }
 se (id3 maior id1 e id3 maior id2) 
   {
     m_velho -> n3;
    }

m_moco -> n1
 se (id2 menor id1 e id2 menor id3) 
   {
     m_moco -> n2
    }
  se (id3 menor id1 e id3 menor id2) 
    {
      m_moco -> n3
     }

Escreva("Mais alto: " + m_alto + "Mais baixo: " + m_baixo + "Altura média: " + altura_m + " metros" +
       "Mais velho: " + m_velho + "Mais moço: " + m_moco );       
             
fim

TESTE DE MESA

N1 / ID1 / ALT1 / N2 / ID2 / ALT2 / N3 / ID3 / ALT3 / MAISALTO / MAISBAIXO / ALTURAMEDIA / MAISVELHO / MAIS MOCO
A    18   1.70    B    20    1.75   C    16    1.69     B           C           1.71          B             C
D    20   1.75    E    20    1.75   F    18    1.74     D           F           1.75          D             F  
 */

package com.mycompany.ativ_q27;
import javax.swing.JOptionPane;

public class Ativ_Q27 {

    public static void main(String[] args) {
        
        int id1,id2,id3;
        double alt1,alt2,alt3,altura_m;
        String n1,n2,n3,m_alto,m_baixo,m_velho,m_moco;
        
        
        n1 = JOptionPane.showInputDialog("Digite o nome da pessoa 1:");
        id1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) " + n1 + " :"));
        alt1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do(a) " + n1 + " :"));
        n2 = JOptionPane.showInputDialog("Digite o nome da pessoa 2:");
        id2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) " + n2 + " :"));
        alt2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do(a) " + n2 + " :"));
        n3 = JOptionPane.showInputDialog("Digite o nome da pessoa 3:");
        id3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a)" + n3 + " :"));
        alt3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do(a) " + n3 + " :"));
        
        m_alto = n1;
        if (alt2 > alt1 && alt2 > alt3) {
            m_alto = n2;
        }
        if (alt3 > alt1 && alt3 > alt2) {
            m_alto = n3;
        }
        
        m_baixo = n1;
        if (alt2 < alt1 && alt2 < alt3) {
            m_baixo = n2;
        }
        if (alt3 < alt1 && alt3 < alt2) {
            m_baixo = n3;
        }
        
        altura_m = (alt1 + alt2 + alt3) / 3;
        
        m_velho = n1;
        if (id2 > id1 && id2 > id3) {
            m_velho = n2;
        }
        if (id3 > id1 && id3 > id2) {
            m_velho = n3;
        }
        
        m_moco = n1;
        if (id2 < id1 && id2 < id3) {
            m_moco = n2;
        }
        if (id3 < id1 && id3 < id2) {
            m_moco = n3;
        }
        
        JOptionPane.showMessageDialog(null,"Mais alto: " + m_alto + "\n" + "Mais baixo: " + m_baixo + "\n" + "Altura média: " +
        String.format("%.2f", altura_m) + " metros" + "\n" + "Mais velho: " + m_velho + "\n" + "Mais moço: " + m_moco );
              
    }
}

 