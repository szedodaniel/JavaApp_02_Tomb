
package tombok;

import java.util.Random;
import java.util.Scanner;


public class Tombok {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        //15.feladat
        int[] tomb = veletlenEgeszTomb(25, -10, 250);
        for (int item : tomb) {
           // System.out.println(item);
        }
        
        for (int i = 0; i < tomb.length; i+=2) {
           
            tomb[i] = (int)Math.pow(tomb[i],2);
           
           //System.out.println(tomb[i]);
        }
        //16.feladat
       int[] tomb2 = new int[5];
        System.out.println("Adjon meg öt számot!");
        tomb2[0] = sc.nextInt();
        tomb2[1] = sc.nextInt();
        tomb2[2] = sc.nextInt();
        tomb2[3] = sc.nextInt();
        tomb2[4] = sc.nextInt();
        
        System.out.println("Adjon meg egy indexet egy és öt között!");
        int ind = 0;
         ind = sc.nextInt();
        
        System.out.println("osszes");
        for(int item2 : tomb2) {
            
            System.out.println(item2);
        }
        System.out.println("vissza");
        for (int i = tomb2.length-1; i >=0; i--) {
            System.out.println(tomb2[i]);
        }
       
        System.out.println("második");
        for (int i = 0; i < tomb2.length; i+=2) {
           
            System.out.println(tomb2[i]);
        }
        System.out.println("A "+ind+". elem az a "+tomb2[ind-1]);
        
        
    }
    public static int[] veletlenEgeszTomb(int db, int min, int max){
    Random rnd = new Random();
        int[] t = new int[db];
            for (int i = 0; i < db; i++) {
                    t[i] = (int)(rnd.nextDouble()*(max-min)+min);
// t[i] = (int)(Math.random()*(max-min)+min);
            }
        return t;
    }
    
}
