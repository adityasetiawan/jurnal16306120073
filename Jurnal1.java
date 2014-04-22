/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jurnal1;

import java.util.Scanner;

/**
 *
 * @author Asisten
 */
public class Jurnal1 {

    /**
     * @param args the command line arguments
     */
    public static long Jurnal1 (int f) {
        if(f<=1) {
            return f;
        }else{
            return Jurnal1(f-1) + Jurnal1 (f-2);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f;
        System.out.println("masukkan angka : ");
        f=s.nextInt();
        System.out.println("hasil :");
                for(int i=1; i<=f; i++){
                    System.out.println(Jurnal1(i)+" ");
                }
    }
    
}
