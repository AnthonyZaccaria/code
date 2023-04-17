/*Anthony Zaccaria
 * Homework Lab 8 Dice Class
 * CMSCI 256
 * 4/17/23
 * This is my own original work
 */


public class Dice {
    private int nDice;
    private int sides;

    public Dice(int nDice,int sides){
        this.nDice=nDice;
        this.sides=sides;
    }

    public int[] roll(){
        int[] rolls = new int[nDice+1];
        int sum=0;
        for (int i=0;i<nDice;i++){
            Die d = new Die(sides);
            rolls[i]=d.roll();
            sum+=rolls[i];
        }
        rolls[rolls.length-1]=sum;
        return rolls;
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
