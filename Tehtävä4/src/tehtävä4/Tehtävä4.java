/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä4;
import java.util.Scanner;

/**
 *
 * @author tommi
 */
public class Tehtävä4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        p("Anna jaettava luku: ");
        
        int jaettava = lukija.nextInt();

        laske(jaettava);
        
    }
    
    
    public static void p(String x) {
        System.out.print(x);
    }
    
    public static void laske(int x){
        int jaettava = x;
        
        int sataset = 0;
        int viiskymppiset = 0;
        int kakskymppiset = 0;
        int kympit = 0;
        int vitoset = 0;
        
        sataset = jaettava / 100;
        viiskymppiset = (jaettava % 100) / 50;
        kakskymppiset = ((jaettava % 100) % 50) / 20;
        kympit = (((jaettava % 100) % 50) % 20) / 10;
        vitoset = ((((jaettava % 100) % 50) % 20) % 10) / 5;
        
        System.out.println(sataset);
        System.out.println(viiskymppiset);
        System.out.println(kakskymppiset);
        System.out.println(kympit);
        System.out.println(vitoset);
        
    }
}
