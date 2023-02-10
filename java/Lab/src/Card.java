/* Anthony Zaccaria
 * CMSCI 256
 * Lab 2 Card class
 * 2-3-23
 * This is my own original work
 */

public class Card {
    private String value;
    private String suit;

    public Card(){
        this.value="2";
        this.suit="D";
    }

    public Card(String value, String suit){
        this.value=value;
        this.suit=suit;
    }

    public boolean equalValue(Card c1, Card c2){
        if (c1.getValue()==c2.getValue()) return true;
        else return false;
    }

    public boolean equalSuit(Card c1, Card c2){
        if (c1.getSuit()==c2.getSuit()) return true;
        else return false;
    }

    public String toString(){
        String str=value+suit;
        return str;
    }

    public boolean equals(Card c1,Card c2){
        if (equalValue(c1,c2)&&equalSuit(c1,c2))
            return true;
        else return false;

    }

    public String getValue(){
        return value;
    }
    public String getSuit(){
        return suit;
    }

    public void setValue(String value){
        this.value=value;
    }
    public void setSuit(String suit){
        this.suit=suit;
    }
}
