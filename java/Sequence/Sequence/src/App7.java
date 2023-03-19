/*Anthony Zaccaria
 * Homework K-1 App class
 * CMSCI 256
 * 3/17/23
 * This is my own original work
 */


import java.util.List;

public class App7 {
    
    public static int inCommon(seq s1,seq s2){
        List<Integer> list1=s1.getSeq();
        int x=-10;
        for (int i:s2.getSeq()){
            if (list1.contains(i)){
                x=i;
                break;
            }
        }
            return x;
        }
        
    
    public static void main(String[] args) throws Exception {
        seq test1 = new seq(1,3,12);
        System.out.println(test1);
        seq test2 = new seq(5,5,10);
        System.out.println(test2);
        int val=inCommon(test1,test2);
        if (val!=-10) 
            System.out.println("First in common is "+val);
        else System.out.println("No Match!");
    }
}
