/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä14;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author tommi
 */
public class Tehtävä14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        
        int min = -50;
        int max = 50;
        
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        
        System.out.println(randomNum);
        
    }
    
}
