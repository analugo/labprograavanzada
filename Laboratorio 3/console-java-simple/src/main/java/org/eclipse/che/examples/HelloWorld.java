package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
    
    
        Shake a1, b1, c1;
        
        a1 = new Rectangulo (10,10); //Toma forma de rectangulo = Polimorficos
        System.out.println(a1.toString());
        
        b1= new Triangle (10,4);// b1 Toma forma de triangulo = Polimorficos 
        System.out.println(b1.toString());

        c1 = new Rectangulo(5,5);
        System.out.println(c1.toString());
        
        
        Rectangulo re1; //Downcasting
        re1 = (Rectangulo)c1; //se hace un castin para esta seguros que es un rectangulo
        System.out.println(re1.toString());

        //c1 = new Rectangulo (5,5);
        //c1 = b1;
      
          //System.out.println(c1.toString());      
        
          
    }
}
