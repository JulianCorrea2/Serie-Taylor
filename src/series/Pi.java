/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

/**
 *
 * @author JULIAN_PC
 */
public class Pi {
    public static double compPi()
    {
        int terms1 = 31;
        int sg = 1, denom1 = 1;
        double sum = 1.0, denom2 = 1.0;
        for (int t = 2; t <= terms1; t++){
            denom1 += 2; denom2 *= 3;
            double term = 1.0/ (denom1 * denom2);
            sg *= -1;
            sum += sg * term;
        }
        double pi = Math.sqrt(12) * sum;
        return pi;
    }
    
    public static void main(String[] args) {
        System.out.println("Pi:" + compPi());
    }
}
