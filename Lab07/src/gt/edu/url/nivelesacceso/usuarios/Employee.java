/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.usuarios;

/**
 *
 * @author 
 */
public abstract class Employee {
    
    public String name;//Su nivel de acceso es default
    private int hireYear;
    protected String country;
    
    public void setHireYear(int hireYear){
        this.hireYear = hireYear;
    }
    public int getHireYear(){
        return this.hireYear;
    }
    protected abstract double monthlyPay(); //cuando es default = abtract double monthlyPay();
    protected abstract double annualPay();
    
}
