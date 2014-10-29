/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulainterface;

import java.lang.*;

/**
 *
 * @author 12280437
 */
public class Circulo implements PrimitivaGrafica {

    private Ponto p1;
    private Ponto p2;
    private int espessura;
    private double pi = 3.1416;

    public Circulo(Ponto p1, Ponto p2, int espessura) {
        this.p1 = p1;
        this.p2 = p2;
        setEspessura(espessura);
    }

    @Override
    public double area() {
        double raio;
        double x;
        double y;
        x = Math.pow((p2.getX() - p1.getX()), 2);
        y = Math.pow((p2.getY() - p1.getY()), 2);
        raio = Math.pow((x + y), 2);
        return pi * raio;
    }

    @Override
    public void setEspessura(int e) {
        if (espessura >= 0) {
            this.espessura = e;
        }
    }

    @Override
    public String getNome() {
        return "Circulo";
    }

    @Override
    public String toString() {
        return "Circulo{" + "p1=" + p1 + ", p2=" + p2 + ", espessura=" + espessura + ", pi=" + pi + '}';
    }

}
