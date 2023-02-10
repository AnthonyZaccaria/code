/*Anthony Zaccaria
 * CMSCI 256
 * Lab 1
 * 1/27/23
 * This is my own original work
 */

public class Lab1 {
    public static void main(String[] args) throws Exception {
        double[] orig= new double[21];
        for (int i=0;i<21;i+=1){
            orig[i]=i/2.0;
        }
        double[] post = computeVals(orig);
        display(post);
    }

    public static void display(double[] lst){
        for (int i=0;i<lst.length;i++){
        System.out.printf("%7.2f",lst[i]);
        if ((i+1)%7==0){
            System.out.println();
        }
        }
    }

    public  static double [] computeVals(double[] orig){
        double[] post = new double[21];
        double mat = 0;
        for (int i=0;i<orig.length;i++){
            mat = Math.sin(orig[i])+Math.sin(orig[i]*orig[i]);
            post[i]=mat;
        }
        return post;
    }

}
