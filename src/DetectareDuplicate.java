import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DetectareDuplicate {
    public static void main(String[] args) {
        List<String> userNames = new ArrayList<>();
        userNames.add("test_user_01");
        userNames.add("test_user_02");
        userNames.add("admin_user");
        userNames.add("test_user_01"); // Duplicat

        Set<String> setUnic = new HashSet<>(userNames);

        if (setUnic.size() < userNames.size()) {
            System.out.println("Atenție: Lista conține username-uri duplicate!");
        } else {
            System.out.println("Toate username-urile sunt unice.");
        }
    }

}
