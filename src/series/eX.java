/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import java.util.Scanner;

/**
 *
 * @author JULIAN_PC
 */
public class eX {
    static float exponential(int n, float x) 
    { 
        // initialize sum of series 
        float sum = 1;  
   
        for (int i = n - 1; i > 0; --i ) 
            sum = 1 + x * sum / i; 
   
        return sum; 
    } 
      
    // driver program 
    public static void main (String[] args)  
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base");
        int n = sc.nextInt();
        System.out.println("Ingrese la potencia");
        float x = sc.nextFloat();
        System.out.println("e^x = "+exponential(n,x)); 
    } 
}
