import java.util.*;
import Lib.*;

public class Main {
    static ArrayList<User> arrUser = new ArrayList<>();
    public static void main(String[] args) {
        Manager mgr1 = new Manager();
        arrUser.add(new User(1111, "KY"));
        arrUser.get(0).setCard(new Card(123456, arrUser.get(0).getName(), new DateM(18, 7, 2021), "Visa", 100000));
        //arrUser.add(mgr1.tao_User());
        //mgr1.tao_The(arrUser.get(0));
        arrUser.get(0).print();
        arrUser.get(0).nap_Tien(500);
        arrUser.get(0).print();
    }
}
