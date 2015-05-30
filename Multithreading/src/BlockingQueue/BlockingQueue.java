package BlockingQueue;

public class BlockingQueue {
    public Node head;
    public Node current;

    public BlockingQueue() {
        head = null;
        current = null;
    }

    //
    // public BlockingQueue(int value) {
    // this.head = head;
    // this.current = current;
    // }

    public void addValue(int value) {
        Node testNode = new Node(value);
        if (head == null) {
            head = testNode;
            current = head;
        }else {
            current.next = testNode;
            current = testNode;
        }
    }
    
    public void print(){
        
        
    }
    
    public void pull(){
        if (current == null){
            
        }
    }

}
