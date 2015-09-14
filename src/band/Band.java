/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band;
import java.util.Random;
/**
 *
 * @author alancerio18
 */
public class Band {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String names[] = {"John","Nick","Matt","Alex","Andrew","Jennifer","Jim","Jackie","Tom","Mitch"};
       String random = (names[new Random().nextInt(names.length)]);  
       String random1 = (names[new Random().nextInt(names.length)]);
       String random2 = (names[new Random().nextInt(names.length)]);
        Trumpet instrument1 = new Trumpet();
        Trombone instrument2 = new Trombone();
        Tuba instrument3 = new Tuba();
    
    System.out.println(random +" " + " is playing the " + instrument1.getName() + " in the band");
    System.out.println(random1 +" " + " is playing the " + instrument2.getName() + " in the band");
    System.out.println(random2+" " + " is playing the " + instrument3.getName() + " in the band");
    }
}
