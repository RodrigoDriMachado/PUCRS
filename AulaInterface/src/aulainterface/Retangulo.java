/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulainterface;

/**
 *
 * @author 12280437
 */
public class Retangulo implements PrimitivaGrafica{
    
    private Ponto x1;
    private Ponto x2;
    private int espessura;

    public Retangulo(Ponto x1, Ponto x2, int espessura) {
        this.x1 = x1;
        this.x2 = x2;
        setEspessura(espessura);
    }
    
    @Override
    public double area() {
        double altura;
        double base;
        base = Math.abs(x2.getX()  - x1.getX());
        altura = Math.abs(x1.getY() - x2.getY());
        return (base*altura);
    }

    @Override
    public void setEspessura(int e) {
        if(espessura >= 0)
            this.espessura= e;
    }

    @Override
    public String getNome() {
        return "Retangulo";
    }

    @Override
    public String toString() {
        return "Retangulo{" + "x1=" + x1 + ", x2=" + x2 + ", espessura=" + espessura + '}';
    }

}
