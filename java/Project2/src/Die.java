/*Anthony Zaccaria
 * Homework Lab 8 Die Class
 * CMSCI 256
 * 4/17/23
 * This is my own original work
 */


import java.util.Random;

public class Die {
    private int sides;

    public Die(int sides){
        this.sides=sides;
    }

    public int roll(){
        int roll;
        Random gen= new Random();
        roll = gen.nextInt(sides)+1;
        return roll;
    }

    public String toString(){
        return ""+sides+" sided die";
    }

    public int value(){
        int val=0;
        for (int i=1;i<=sides;i++) val+=i;
        return val;
        
    }
}
