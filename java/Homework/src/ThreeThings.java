/*Anthony Zaccaria
 * Homework L-1
 * CMSCI 256
 * 4/06/23
 * This is my own original work
 */

public class ThreeThings<T> {
    private T v1;
    private T v2;
    private T v3;

    public ThreeThings(T v1, T v2, T v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }

    public void swap(int n1,int n2){
        T temp;
        
        //if (n1 > 3 || n1<1 || n2>3 || n2<1){
            //System.out.println("That is not a valid input!");
        //}
        if ((n1 == 1 && n2 == 2)||(n1 == 2 && n2 == 1)){
                temp=v1;
                v1=v2;
                v2=temp;
            }
        else if ((n1 == 1 && n2 == 3)||(n1 == 3 && n2 == 1)){
                temp=v1;
                v1=v3;
                v3=temp;
            }
        else if ((n1 == 2 && n2==3)||(n1==3&&n2==2)){
            temp=v2;
            v2=v3;
            v3=temp;
        }
    }

    public String toString(){
        return v1.toString()+" ; "+v2.toString()+" ; "+v3.toString();
    }

    public boolean equals(ThreeThings<T> obj){
        return v1.equals(obj.getV1()) && v2.equals(obj.getV2()) && v3.equals(obj.getV3()); 
    }

    public T getV1() {
        return v1;
    }

    public void setV1(T v1) {
        this.v1 = v1;
    }

    public T getV2() {
        return v2;
    }

    public void setV2(T v2) {
        this.v2 = v2;
    }

    public T getV3() {
        return v3;
    }

    public void setV3(T v3) {
        this.v3 = v3;
    }
    
}
