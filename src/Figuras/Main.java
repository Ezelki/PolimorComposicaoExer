/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author IFSC
 */
public class Main {

    public static void main(String[] args) {
        Circulo c = new Circulo();
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();
        
        c.desenhar();
        q.desenhar();
        t.desenhar();
    }
}
