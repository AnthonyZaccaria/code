/*Anthony Zaccaria
 * Homework Lab 8 App
 * CMSCI 256
 * 4/17/23
 * This is my own original work
 */


import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Dice group1=new Dice(2,6);
        Dice group2=new Dice(1,6);
        Dice group3=new Dice(4,4);
        Dice group4=new Dice(2,20);
        int[] rolls=group1.roll();
        int[] rolls2=group2.roll();
        int[] rolls3=group3.roll();
        int[] rolls4=group4.roll();
        System.out.println("The last element is the sum of the rolls.");
        System.out.println("The prior elements are the respective rolls.");
        System.out.println(Arrays.toString(rolls));
        System.out.println(Arrays.toString(rolls2));
        System.out.println(Arrays.toString(rolls3));
        System.out.println(Arrays.toString(rolls4));
        System.out.println("Value of group1: "+group1.value());
        System.out.println("Value of group2: "+group2.value());
        System.out.println("Value of group3: "+group3.value());
        System.out.println("Value of group4: "+group4.value());
    }
}
