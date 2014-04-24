/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revfibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asisten
 */
public class RevFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // TODO code application logic here
            System.out.print("Input : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int angka=Integer.parseInt(br.readLine());
            int aw=1;
            int hsl=0;
            int temp=0;
            int[] arr = new int[angka];
            for(int i=0;i<angka;i++){
                if(i==0 || i==1){
                    hsl=aw;
                }else if(i>1){
                    hsl=hsl+temp;
                }
                arr[i]=hsl;
                temp=aw;
                aw=hsl;
            }
            System.out.println("output : ");
            for(int j=angka-1;j!=-1;j--){
                System.out.print(arr[j]+" ");
            }
        } catch (IOException ex) {
            System.out.println("System err "+ex.getMessage());;
        }
    }
    
}
