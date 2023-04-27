/*Anthony Zaccaria
 * Homework M-1
 * CMSCI 256
 * 4/15/23
 * This is my own original work
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThreeNamesTest {
    public static void main(String[] args) throws Exception {
    List<ThreeNames> nameList= new ArrayList<ThreeNames>();
    ThreeNames name1 = new ThreeNames();
    ThreeNames name2 = new ThreeNames();  
    ThreeNames name3 = new ThreeNames();
    ThreeNames name4 = new ThreeNames();  
    ThreeNames name5 = new ThreeNames();
    ThreeNames name6 = new ThreeNames();  
    ThreeNames name7 = new ThreeNames();
    ThreeNames name8 = new ThreeNames();  
    ThreeNames name9 = new ThreeNames();
    ThreeNames name10 = new ThreeNames();
    
    name1.assign(0,"Anthony");
    name1.assign(1,"Michael");
    name1.assign(2,"Zaccaria");

    name2.assign(0,"John");
    name2.assign(1,"Paul");
    name2.assign(2,"Marinelli");

    name3.assign(0,"Anthony");
    name3.assign(1,"Michael");
    name3.assign(2,"Zaccaria");

    name4.assign(0,"Jack");
    name4.assign(1,"Leo");
    name4.assign(2,"Daly");

    name5.assign(0,"Mister");
    name5.assign(1,"Green");
    name5.assign(2,"Tree");

    name6.assign(0,"William");
    name6.assign(1,"Michael");
    name6.assign(2,"Zaccaria");

    name7.assign(0,"Anthony");
    name7.assign(1,"Hello");
    name7.assign(2,"Zaccaria");

    name8.assign(0,"Anthony");
    name8.assign(1,"Michael");
    name8.assign(2,"Smith");

    name9.assign(0,"Anthony");
    name9.assign(1,"Michael");
    name9.assign(2,"Zaccaria");

    name10.assign(0,"Hello");
    name10.assign(1,"My");
    name10.assign(2,"Name");

    nameList.add(name1);
    nameList.add(name2);
    nameList.add(name3);
    nameList.add(name4);
    nameList.add(name5);
    nameList.add(name6);
    nameList.add(name7);
    nameList.add(name8);
    nameList.add(name9);
    nameList.add(name10);
    System.out.println("Before sort:");
    System.out.println(nameList);
    System.out.println(name1.compareTo(name2));//should be positive
    System.out.println(name2.compareTo(name1));//should be negative
    System.out.println(name1.compareTo(name9));//should be 0
    System.out.println(name5.compareTo(name4));//should be positive
    System.out.println(name4.compareTo(name5));//should be negative
    System.out.println(name2.compareTo(name9));//should be negative
    System.out.println(name9.compareTo(name3));//should be 0
    //Collections.sort(nameList);
    //I can't seem to get the sort to work despite compareTo working
    /*
    Here is the specific error:
    Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        The method sort(List<T>) in the type Collections is not applicable for the arguments (List<ThreeNames>)

        at ThreeNamesTest.main(ThreeNamesTest.java:85)
*/
    
    System.out.println("After sort:");
    //System.out.println(nameList);
    
    } 


}
