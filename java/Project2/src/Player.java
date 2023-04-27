import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Anthony Zaccaria
 * Project 2 Player Class
 * CMSCI 256
 * 5/04/23
 * This is my own original work
 */

public class Player implements MoneyHolder {
    private int start;
    private int winnings;
    List<String> bets;

    /**
     * Constructor
     * @param start: The starting amount of money a player starts off with
     */
    public Player(int start){
        this.start=start;
        winnings=0;
        bets = new ArrayList<String>();
    }

    /**
     * 
     * @return
     */
    public int bet(){
        int[] Pbets = {5,10,15,20};
        Random gen = new Random();
        int bet;
        int b = (holdings()/5)-1;
        int maxBet = Math.min(4,b);
        if (maxBet==0) bet=5;
        else bet = Pbets[gen.nextInt(maxBet)];
        return bet;
         
    }

    @Override
    /** From MoneyHolder interface
     * @return int which is the current amount of money the player is holding
     */
    public int holdings() {
        return start + winnings;
    }

    /**
     * 
     * @param bet
     */
    public void addBet(String bet){
        bets.add(bet);
    }

    /**
     * 
     * @return
     */
    public String BetProfile(){
        String str="";
        for (int i=0;i<bets.size();i++){
            str+="Bet"+Integer.toString(i+1)+": "+bets.get(i)+"\n";
        }
        return str;
    }

    @Override
    // toString method
    public String toString() {
        return "Player [start=" + start + ", winnings=" + winnings + ", bets:" + bets + "]";
    }

    // getters and setters
    public int getWinnings() {
        return winnings;
    }

    public void setWinnings(int winnings) {
        this.winnings = winnings;
    }

}
