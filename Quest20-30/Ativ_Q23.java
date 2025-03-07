/*
VAR
inteiro: x,y,z

INICIO

x -> 10
y -> 12
z -> x - y
x -> x+8

se(z maior x)
 {
 se(x maior x)
  {
   z = y
  }
 senao
  {
   z = x
  }
 }
senao se(y maior x)
 {
  y = z
 }
senao
 {
  y = y + 11
 }

Escreva("O valor de X é" + x)
Escreva("O valor de Y é" + y)
Escreva("O valor de Z é" + z)

fim

TESTE DE MESA

X / Y / Z / ESCREVA
18 23  -2      V

 */

package com.mycompany.ativ_q23;
import javax.swing.JOptionPane;

public class Ativ_Q23 {

    public static void main(String[] args) {
        int x, y, z;
        
        x = 10;
        y = 12;
        z = x - y;
        x = x + 8;

        
        if (z > x) 
          {
            if (x > x) 
            {
             z = y;
            } 
            else 
            {
             z = x;
            }
          } 
        else if (y > x) 
        {
         y = z;
        } 
        else 
        {
         y = y + 11;
        }
        JOptionPane.showMessageDialog(null, "O valor de X é " + x);
        JOptionPane.showMessageDialog(null, "O valor de Y é " + y);
        JOptionPane.showMessageDialog(null, "O valor de Z é " + z);
    }
}
