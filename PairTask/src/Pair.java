
public class Pair {
    private Object firstObj;
    private Object secondObj;
    
    public Object getFirstObj() {
        return firstObj;
    }

    public Object getSecondObj() {
        return secondObj;
    }
    
    public Pair(Object firstObj, Object secondObj) {
        this.firstObj = firstObj;
        this.secondObj = secondObj;
    }

    @Override
    public String toString() {
        return "(" + firstObj + "," + secondObj + ")";
    }
    
    
    public boolean equals(Pair other){
        if(other.firstObj == this.firstObj && other.secondObj == this.secondObj) return true;
        return false;
    }
    
}
