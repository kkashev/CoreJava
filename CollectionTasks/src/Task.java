
public class Task implements Comparable<Task> {
    int priority;
    float requiredTime;

    public int getPriority() {
        return priority;
    }

    public float getRequiredTime() {
        return requiredTime;
    }

    public Task(int priority, float requiredTime) {
        this.priority = priority;
        this.requiredTime = requiredTime;
    }
    
    public int compareTo(Task compareTask){
        int comparePriority = ((Task) compareTask).priority;
        return this.priority - comparePriority;
        
    }
}