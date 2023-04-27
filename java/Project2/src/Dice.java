
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

    public Dice(int nDice,int sides){
        this.nDice=nDice;
        this.sides=sides;
        roll=new int[nDice+1];
        dice = new Die[nDice];
        for (int i=0;i<nDice;i++){
            dice[i]=new Die(sides);
        }
    }

    public int[] roll(){
        int sum=0;
        for (int i=0;i<nDice;i++){
            roll[i]=dice[i].roll();
            sum+=roll[i];
        }
        roll[roll.length-1]=sum;
        return roll;
    }

    public int value(){
        Die d = new Die(sides);
        int value = d.value()*nDice;
        return value;
    }

    public String toString(){
        return ""+nDice + "dice with "+sides+"sides";
    }
}
