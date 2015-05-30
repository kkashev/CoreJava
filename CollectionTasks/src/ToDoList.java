import java.util.Comparator;
import java.util.PriorityQueue;

public class ToDoList {
    PriorityQueue<Task> tasks;
    int remainingTime;
    int tasktime;
    
    public ToDoList(int remainingTime) {
        this.remainingTime = remainingTime;
    }


    void addTask(Task task) {
        task = new Task(task.getPriority(), task.getRequiredTime());
        tasktime += task.getRequiredTime();
        tasks.add(task);
    }
    
    void markFinished(Task task){
        tasks.remove(task);
    }
    
    void markCancelled(Task task){
        tasks.remove(task);
    }
    Task getTop(){
        return tasks.peek();
    }
    
    boolean canFinish(){
        return true;
    }
    
    int getRemainingTime(){
        return remainingTime - tasktime;
    }
}
