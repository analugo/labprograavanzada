package org.eclipse.che.examples;

public class Rectangulo implements Shake {
    
    private double width;
    
    private double length;
    
    public Rectangulo (double width, double length){
        
        this.width = width;
        this.length = length;
        
    }
        
    public double getArea(){
        return this.width * this.length;
    }
    
    public String toString()
    {
        return "Rentangulo[ width " + this.width 
                + " length" + this.length
                + "area" + this.getArea()+ "]";
    }
    
    
}
