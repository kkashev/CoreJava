import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
//        CorrectBracket test = new CorrectBracket();
//        System.out.println(test.isCorrect("(()())"));
//        ArrayList<Integer> list = new ArrayList<Integer>(7);
//        list.add(4);
//        list.add(2);
//        list.add(5);
//        list.add(11);
//        list.add(2);
//        list.add(3);
//        ReverseCollection test = new ReverseCollection();
//        test.reverse(list);
//    }
        ToDoList todo = new ToDoList(11); //11 hours remaining!
        todo.addTask(new Task(10, 2)); //maximum priority!
        todo.addTask(new Task(5, 1));
        todo.addTask(new Task(0, 1));
//        todo.addTask(new LearnGeometryTask()); //default priority, smaller than 10
//        todo.addTask(new GoOutTask(1.5f));  //default priority, smaller than 10
//        todo.addTask(new SleepTask()); //straight 8 hours, of course!

        if (todo.canFinish()){
            System.out.println("Woohoo!");
        } else {
            System.out.println("I am ...screwed :(");
        }

        System.out.println(todo.getTop()); //StudyForAlgebraTask
        //System.out.println(todo.getTimeNeeded()); //sum of the time needed
    }
}
