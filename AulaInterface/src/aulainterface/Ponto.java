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

    public class Ponto implements PrimitivaGrafica
{
    private double x;
    private double y;
    private int espessura;
 
    public Ponto(double x, double y, int e) {
        this.x = x;
        this.y = y;
        setEspessura(e);
    }
   
    public void setX (double xVal) {
        x = xVal;
    }
 
    public void setY (double yVal) {
        y = yVal;
    }
 
    public double getX() {
        return(x);
    }
 
    public double getY() {
        return(y);
    }
 
    public String toString() {
         String str = "Ponto (" + x + "," + y + ") com tamanho " + espessura;
         return str;
    }
   
     public double area() {
         return 0;
     }
    
     public void setEspessura(int e) {
         if (e>0)
            espessura = e;
     }
       
     public String getNome(){
         return ("Ponto");
     }
}
    
