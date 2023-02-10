/* Anthony Zaccaria
 * CMSCI 256
 * Lab 2 tester class
 * 2-3-23
 * This is my own original work
 */

public class App {
    public static void main(String[] args) throws Exception {
        Card c1 = new Card("4","H");
        Card c2 = new Card("8","H");
        System.out.println("Card 1: "+c1);
        System.out.println("Card 2: "+c2);
        System.out.println(c1+" and "+c2+" have the same suit: "+c1.equalSuit(c1,c2));
        System.out.println(c1+" and "+c2+" have the same value: "+c1.equalValue(c1,c2));
        c2.setValue("4");
        c2.setSuit("D");
        System.out.println("Card 2 now: "+c2);
        System.out.println(c1+" and "+c2+" have the same suit: "+c1.equalSuit(c1,c2));
        System.out.println(c1+" and "+c2+" have the same value: "+c1.equalValue(c1,c2));
        Card c3=new Card("4","H");
        System.out.println("Card 3: "+c3);
        System.out.println(c1+" and "+c2+" are the same: "+c1.equals(c1,c2));
        System.out.println(c1+" and "+c3+" are the same: "+c1.equals(c1,c3));
    }
}
