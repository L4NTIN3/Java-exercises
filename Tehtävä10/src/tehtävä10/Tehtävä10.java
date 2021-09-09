/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä10;
import java.util.Scanner;

/**
 *
 * @author tommi
 */
public class Tehtävä10 {
    
    public static void main(String[] args) {
        
        Scanner lukija = new Scanner( System.in );
        
        print("Anna luku: ");
        
        int syöte = lukija.nextInt();
        
        käännä(syöte);
    }
    
    
    public static void print(String x) {
        
        System.out.print(x);
        
    }
    
    public static void println(String x) {
        
        System.out.println(x);
        
    }
    
    public static void käännä(int x) {
        
        int käännettävä = x;
        
        String käännös = String.valueOf(käännettävä);
        char[] chars = new char[käännös.length()];
        
        for(int i = 0; i < käännös.length(); i++){
            chars[i] = käännös.charAt(i);
        }
        
        for(int i = chars.length; i > 0; i--){
            
            System.out.print(chars[i - 1]);
            
        }
        System.out.print("\n");
        
    }
    
}
