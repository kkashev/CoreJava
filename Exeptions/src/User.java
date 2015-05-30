
public class User {
    public User() {
    }

    String username = "";
    
    public void uselessMethod(int number){
        if(number == 21)
            throw new DatabaseCorruptedException("The number is 21 (retarded number)");
    }

}
