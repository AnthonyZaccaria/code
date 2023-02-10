/*Anthony Zaccaria
 * Homework E-1 Student class
 * CMSCI 256
 * 2/13/23
 * This is my own original work
 */

public class Student extends Person {
    private School school;

    public Student(String name,String citizenship,School school){
        super(name,citizenship);
        this.school=school;
    }



    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return this.school.equals(other.school) && 
            super.equals(other);
        //super.getName().equals(other.getName()) && 
        //super.getCitizenship().equals(other.getCitizenship());

    }




    @Override
    public String toString() {
        return "Student [name="+super.getName()+", citizenship="+
        super.getCitizenship()+", school=" + school.toString()+ "]";
    }


    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
