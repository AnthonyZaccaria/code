import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> stack;

    public Stack(){
        stack = new ArrayList<T>();
    }

    public int size(){
        return stack.size();
    }

    public void push(T x){
        stack.add(x);
    }

    public T peek(){
        if (size()==0){
            return null;
        }
        return stack.get(size()-1);
    }

    public T pop(){
        T p = stack.get(size()-1);
        stack.remove(p);
        return p;
    }

    @Override
    public String toString() {
        String out = "";
        for (T x:stack){
            out += x.toString()+"\n";
        }
        return "Stack: \n" + out;
    }



}
