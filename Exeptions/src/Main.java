import java.io.ObjectInputStream.GetField;


public class Main {

    public static void main(String[] args) {
        try {
            User usr = new User();
            usr.uselessMethod(21);
            
        } catch (Exception e) {
            System.out.println(e);
        }
//        try {
//            
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }

}
