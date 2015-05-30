import java.util.ArrayList;


public class StackImpl implements StackI{
//    private Stack stack = new Stack();
    public ArrayList<Integer> stack = new ArrayList<Integer>();
    
    public void push(int item){
        stack.add(item);
    }
    
    public void pop(){
        int counter;
        counter = (stack.size() - 1);
        stack.remove(counter);
    }
    
    public int length(){
        return stack.size();
    }
    
    public boolean isEmpty(){
        return (stack.size() == 0);
    }

    @Override
    public void clear() {
                
    }    
    
    
}
