
import java.util.Scanner;
/*Anthony Zaccaria
 * Homework B-1
 * CMSCI 256
 * 1/26/23
 * This is my own original work
 */
public class Caesar {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str=getInput(in);
        String ceas;
        int ofset=4;
        ceas=ceasar(str,ofset);
        System.out.println("Original String: "+str);
        System.out.println("New String with ofset of "+ofset+": "+ceas);
        
        ofset=7;
        ceas=ceasar(str,ofset);
        System.out.println("Original String: "+str);
        System.out.println("New String with ofset of "+ofset+": "+ceas);
        
        ofset=1;
        ceas=ceasar(str,ofset);
        System.out.println("Original String: "+str);
        System.out.println("New String with ofset of "+ofset+": "+ceas);
        
        in.close();
    }

    public static String getLowerCase() {
        String out = "";
        for (char x = 'a'; x <= 'z'; x++) {
        out += Character.toString(x);
        }
        return out;
        }
    
        public static String getInput(Scanner in){
            String str;
            System.out.println("Enter a String: ");
            str=in.nextLine();
            return str;
        }

        public static String ceasar(String str,int ofset){
            char[] ch = str.toCharArray();
            String ceas="";
            int newc=0;

            for (int i=0; i<str.length();i++){
                if ((int)ch[i]>96 && (int)ch[i]<123){
                    if ((int)ch[i]+ofset>122){
                        newc = (int)ch[i]+ofset-(122-97);
                    }
                    else newc=(int)ch[i]+ofset;
                    ch[i]=(char)newc;
                }
                ceas+=ch[i];
            }
            return ceas;
        }
}
