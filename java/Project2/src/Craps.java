/*Anthony Zaccaria
 * Project 2 App Class
 * CMSCI 256
 * 5/04/23
 * This is my own original work
 */
import java.util.Scanner;

// App class for the game Craps
public class Craps {

    // Driver method
    public static void main(String[] args) throws Exception {
        Player p1 = new Player(50);
        boolean end=false;
        Scanner in = new Scanner(System.in);
        String q; // will contain player's input for quiting
        System.out.println("Welcome to Anthony's Dice and Pool Place!\n Enjoy the game of craps!");
        int winnings=0;
        while (!end){
            if (p1.holdings()==0) break;
            System.out.println("Holdings: "+p1.holdings());
            System.out.println("Do you want to quit? Enter y if yes, otherwise enter n. ");
            q=in.nextLine();
            if (q.toLowerCase().equals("y")) break;
            winnings=turn(p1);
    
            p1.setWinnings(p1.getWinnings()+winnings);
        }
        System.out.println("Your bets:\n"+p1.BetProfile());
        System.out.println("You left with $"+p1.holdings()+"!");
        in.close();
    }

    /**
     * Performs the craps passline bet once
     * @param p: Player that is betting
     * @param bet: the specific monetary bet
     * @return int which is the winnings of the player this bet
     */
    public static int passLine(Player p,int bet){
        Dice d = new Dice(2,6);
        int[] roll;
        int win = 0;
        int point = 0;
        boolean end=false;
        int turn=0;
        while (!end){
            turn++;
            roll = d.roll();
            System.out.println("Roll: "+roll[0]+","+roll[1]+" = "+roll[2]);
            if (turn==1){
                if (roll[2]==7 || roll[2]==11){
                    win=bet*2;

                    System.out.println("Yayyy!!! You Win $"+bet);
                    break;
                }
                else if (roll[2]==2 || roll[2]==3 || roll[2]==12){
                    System.out.println("You Lost $"+bet);
                    break;
                }
                else{
                    point=roll[2];
                    System.out.println("Point: "+point);
                }
            }
            else{
                if (roll[2]==point){
                    win=bet*2;

                    break;
                }
                else if (roll[2]==7){
                    System.out.println("You Lost $"+bet);
                    break;
                }
            }
        }
        if (win!=0) p.addBet(" win $"+Integer.toString(bet));
        else p.addBet(" lose $"+Integer.toString(bet));
        return win;
    }
    
    /**
     * goes through 1 turn of betting
     * @param p: The player that is playing craps
     * @return int which is the player's winnings this turn
     */
    public static int turn(Player p){
        int bet = p.bet();
        System.out.println("Pass Line Bet: "+bet);
        p.setWinnings(p.getWinnings()-bet);
        System.out.println("Holdings: "+p.holdings());
        int winnings = passLine(p,bet);
        return winnings;
    }
}
