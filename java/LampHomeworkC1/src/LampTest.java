/* Anthony Zaccaria
 * CMSCI 256
 * Homework C-1 Lamp Test class
 * 2-1-23
 * This is my own original work
*/

import java.util.Random;

public class LampTest {
    public static void main(String[] args) throws Exception {
        Random gen = new Random();
        Lamp[] lamps = new Lamp[30];
        for (int i=0;i<lamps.length;i++){
            lamps[i] = new Lamp(gen.nextBoolean());
        }
        System.out.println("Before switching the lamps:");
        displayLamps(lamps);
        for (int i=0;i<lamps.length;i++){
            if (i<10) lamps[i].flip();
            
            else if (i<20) lamps[i].turnOn();

            else lamps[i].turnOff();
        }
        System.out.println("After switching the lamps:");
        displayLamps(lamps);
    }

    public static void displayLamps(Lamp[] lamps){
        for (int i=0;i<lamps.length;i++){
            System.out.print(lamps[i].toString()+" ");
            if ((i+1)%5==0){
                System.out.println();
            }
        }
    }

}
