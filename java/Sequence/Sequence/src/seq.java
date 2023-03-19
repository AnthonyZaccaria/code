/*Anthony Zaccaria
 * Homework K-1 seq class
 * CMSCI 256
 * 3/17/23
 * This is my own original work
 */

import java.util.ArrayList;
import java.util.List;

public class seq {
    private int start;
    private int increment;
    private int count;

    public seq(int start, int increment, int count){
        this.start=start;
        this.increment=increment;
        this.count=count;
    }

    public String toString(){
        return getSeq().toString();
    }

    public  List<Integer> getSeq(){
        int cnt=0;
        List<Integer> L=new ArrayList<Integer>();
        int x = start;
        while (cnt<count){
            L.add(x);
            x += increment;
            cnt++;
        }
        return L;
    }
}
