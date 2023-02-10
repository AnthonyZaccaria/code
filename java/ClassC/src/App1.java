public class App1 {
    public static void main(String[] args) throws Exception {
        Box b = new Box();
        b.setContents("Message");
        System.out.println(b);
        
        Box second = new Box(2, "fancy");
        System.out.println(second.getSize());
        if (b.equals(second))
        System.out.println("Equal");
        else
        System.out.println("Not Equal");
        
        Box.setSymbol('-');
        
        System.out.println(b);
        System.out.println(second);
        }
    }
