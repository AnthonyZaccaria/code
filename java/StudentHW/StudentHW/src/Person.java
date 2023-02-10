/*Anthony Zaccaria
 * Homework E-1 Person class
 * CMSCI 256
 * 2/13/23
 * This is my own original work
 */

public class Person {
    private String name="NoName";
    private String citizenship="NoCitinzenship";

    public Person(String name,String citizenship){
        this.name=name;
        this.citizenship=citizenship;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", citezenship=" + citizenship + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Person other = (Person) obj;
        return this.citizenship.equals(other.citizenship) && 
            this.name.equals(other.name);
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    
}
