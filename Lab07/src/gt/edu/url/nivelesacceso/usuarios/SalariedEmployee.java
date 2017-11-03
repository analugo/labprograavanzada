/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.edu.url.nivelesacceso.usuarios;

/**
 *
 * @author t203
 */
public abstract class SalariedEmployee extends Employee{

    int annualSalary;

    public SalariedEmployee(){
        name = "Ana";
        setHireYear(1999);
        country = "GT";
    }
    
    public double monthlyPay(){
        return 1000.00;
    }
    
    public abstract double annualPay();

}
