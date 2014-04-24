/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asisten
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            System.out.print("Input : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int angka=Integer.parseInt(br.readLine());
            int aw=1;
            int hsl=0;
            int temp=0;
            for(int i=0;i<angka;i++){
                if(i==0 || i==1){
                    hsl=aw;
                }else if(i>1){
                    hsl=hsl+temp;
                }
                System.out.print(hsl+" ");
                
                temp=aw;
                aw=hsl;
            }
        } catch (IOException ex) {
            System.out.println("System err "+ex.getMessage());;
        }
        
    }
    
}
