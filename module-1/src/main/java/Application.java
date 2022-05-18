import java.util.ArrayList;

public class Application {
    ArrayList<User>arrayList = new ArrayList<User>();
    public void request(String firstName,String lastName,String letter){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setLetter(letter);
        arrayList.add(user);
    }
}
