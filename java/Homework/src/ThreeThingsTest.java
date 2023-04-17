/*Anthony Zaccaria
 * Homework L-1 Tester Class
 * CMSCI 256
 * 4/06/23
 * This is my own original work
 */

public class ThreeThingsTest {
    public static void main(String[] args) throws Exception {
    ThreeThings<Integer> g1=new ThreeThings<Integer>(4,2,6);
    System.out.println(g1);
    g1.swap(1,2);
    System.out.println("After swap 1 and 2: "+g1);
    g1.swap(1,3);
    System.out.println("After swap 1 and 3: "+g1);
    g1.swap(2,3);
    System.out.println("After swap 2 and 3: "+g1);
    g1.swap(3,2);
    System.out.println("After swap 3 and 2: "+g1);   
   


    ThreeThings<String> g2=new ThreeThings<String>("Hi","my","Name");
    System.out.println(g2);
    g2.swap(1,2);
    System.out.println("After swap 1 and 2: "+g2);
    g2.swap(1,3);
    System.out.println("After swap 1 and 3: "+g2);
    g2.swap(2,3);
    System.out.println("After swap 2 and 3: "+g2);  
    g2.swap(3,1);
    System.out.println("After swap 3 and 1: "+g2);   
   



    
    }
}
