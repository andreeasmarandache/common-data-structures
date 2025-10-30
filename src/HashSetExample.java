import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> emailuriUnice = new HashSet<>();

        // Adăugăm emailuri
        emailuriUnice.add("ana@test.com");
        emailuriUnice.add("bogdan@test.com");
        emailuriUnice.add("ana@test.com"); // Acest duplicat va fi ignorat!
        emailuriUnice.add("vlad@test.com");

        System.out.println("Setul de emailuri unice: " + emailuriUnice);
        System.out.println("Numărul de emailuri unice: " + emailuriUnice.size()); // Va fi 3

        // Verificarea existenței unui element
        if (emailuriUnice.contains("bogdan@test.com")) {
            System.out.println("Email-ul lui Bogdan a fost deja adăugat.");
        }
    }

}
