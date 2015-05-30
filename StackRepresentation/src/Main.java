
public class Main {

    public static void main(String[] args) {
        StackImpl myStack = new StackImpl();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.length());
        myStack.pop();
        System.out.println(myStack.length());
        System.out.println(myStack.isEmpty());
        myStack.pop();
        myStack.pop();
        myStack.pop();      
        System.out.println(myStack.isEmpty());
    }

}
