/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band;

/**
 *
 * @author alancerio18
 */
public class Band {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trumpet instrument1 = new Trumpet();
        Trombone instrument2 = new Trombone();
        Tuba instrument3 = new Tuba();
    
    instrument1.play();
    instrument2.play();
    instrument3.play();
    }
}
