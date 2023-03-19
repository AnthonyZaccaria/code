/*Anthony Zaccaria
 * Homework E-1 Driver Class
 * CMSCI 256
 * 2/16/23
 * This is my own original work
 */
public class App {
    public static void main(String[] args) throws Exception {
        //Person p1 = new Person("Joe","US");
        //System.out.println(p1);
        School sc1=new School("Glenbrook North High School","Ed Rooney");
        School sc2=new School("Alaska School","Bob Tomato");
       
        Student s1 = new Student("Ferris Bueller","US",sc1);
        System.out.println(s1);
        Student s2 = new Student("Andie Walsh","US",sc2);
        System.out.println(s2);
    }
}
