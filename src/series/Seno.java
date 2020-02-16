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
public class Seno {
    public static int factorial(int num){
    if(num == 0) return 1;
    return num * factorial(num -1);
}

public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);

    System.out.println("Ingrese el numero");

    int num = scanner.nextInt();
    boolean op_checker = true;

    int denom = 0;
    double numrad = num * (2 * Math.PI/360);
    double sum = 0;

    for(int counter = 0; counter < 4; counter++){
        denom = counter * 2 + 1;
        if(op_checker)
                sum += Math.pow(numrad,(double)denom)/factorial(denom);
        else    sum -= Math.pow(numrad,(double)denom)/factorial(denom); 

        op_checker = op_checker ? false : true;   
        System.out.println(sum);
    }  

    System.out.printf("%.4f",sum); 
}
}
