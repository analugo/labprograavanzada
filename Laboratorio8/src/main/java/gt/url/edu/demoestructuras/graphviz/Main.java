/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.url.edu.demoestructuras.graphviz;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ana Godínez
 */
public class Main {
    
    Scanner sc = new Scanner(System.in);
		DemoGraphviz objDemo = new DemoGraphviz();
		String s;
		System.out.print("Introduzca la ruta, ej. example/ex1.png");
		s = sc.nextLine();
	    try {
			objDemo.createDemoGraph(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
    

