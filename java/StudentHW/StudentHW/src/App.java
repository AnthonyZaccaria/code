public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("Joe","US");
        System.out.println(p1);
        School sc1=new School("Glenbrook North High School","Ed Rooney");
        Student s1 = new Student("Ant","Taiwan",sc1);
        System.out.println(s1);
        Student s2 = new Student("Ant","Taiwan",sc1);
        Student s3 = new Student("Ant","US",sc1);
        System.out.println(s1+" and "+s2+" are equal: "+s1.equals(s2));
        System.out.println(s1+" and "+s3+" are equal: "+s1.equals(s3));
    }
}
