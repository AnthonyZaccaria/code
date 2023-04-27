
/*Anthony Zaccaria
 * Project 2 Dice Class
 * CMSCI 256
 * 5/04/23
 * This is my own original work
 */


public class Dice {
    private int nDice;
    private int sides;
    private int[] roll;
    private Die[] dice;

    // constructor
    public Dice(int nDice,int sides){
        this.nDice=nDice;
        this.sides=sides;
        roll=new int[nDice+1];
        dice = new Die[nDice];
        for (int i=0;i<nDice;i++){
            dice[i]=new Die(sides);
        }
    }

    // rolls the dice
    public int[] roll(){
        int sum=0;
        for (int i=0;i<nDice;i++){
            roll[i]=dice[i].roll();
            sum+=roll[i];
        }
        roll[roll.length-1]=sum;
        return roll;
    }

    // returns value of the dice
    public int value(){
        Die d = new Die(sides);
        // calculates the value of a single die with sides number of sides
        // then multiplies that by number of dice
        int value = d.value()*nDice;
        return value;
    }

    // toString method
    public String toString(){
        return ""+nDice + "dice with "+sides+"sides";
    }
}
