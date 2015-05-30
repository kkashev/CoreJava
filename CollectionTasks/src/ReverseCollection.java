import java.security.cert.CollectionCertStoreParameters;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class ReverseCollection {
    public ReverseCollection() {
    }

    static void reverse(Collection<Integer> collection) {
        Stack stack = new Stack();
        collection.forEach(element -> stack.push(element));
        for(int i = 0; i<collection.size(); i++){
            System.out.println(stack.pop());
            //collection.add(stack.pop());
            collection.add((Integer) stack.pop());
        }
    }
}
