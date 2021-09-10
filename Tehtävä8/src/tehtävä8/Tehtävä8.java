/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä8;
import java.util.Scanner;

/**
 *
 * @author tommi
 */
public class Tehtävä8 {

    
    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna korkeus: ");
        int korkeus = lukija.nextInt();
        
        System.out.print("Anna leveys: ");
        int leveys = lukija.nextInt();
        
        Piirrä(korkeus, leveys);
        
        
        
    }
    
    public static void Piirrä(int korkeus, int leveys){
        
        for(int i = 0; i <= korkeus; i++){
            
            if(i == 0 || i == korkeus){
                
                for(int x = 0; x <= leveys; x++){
                    
                    if (x == leveys){
                        System.out.println("-");
                    }
                    else{
                        System.out.print("-");
                    }
                }
                
            }
            
            else if (i >= 0 || i <= korkeus){
                
                for (int x = 0; x <= leveys; x++){
                    
                    if(x == 0){
                        System.out.print("|");
                    }
                    else if(x == leveys){
                        System.out.println("|");
                    }
                    else if(x < leveys) {
                        System.out.print(" ");
                    }
                }
            }
            
        }
        
    }
    
}
