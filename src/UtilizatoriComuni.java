import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UtilizatoriComuni {
    public static void main(String[] args) {
        // Liste inițiale de utilizatori
        String[] participantiSesiuneA = {"ana.pop", "ion.vasile", "maria.ionescu", "radu.george"};
        String[] participantiSesiuneB = {"maria.ionescu", "vlad.andrei", "ana.pop", "elena.stan"};

        // Convertim primul array într-un HashSet pentru căutare rapidă
        Set<String> setSesiuneA = new HashSet<>(Arrays.asList(participantiSesiuneA));

        // Creăm un set pentru a stoca utilizatorii comuni
        Set<String> comuni = new HashSet<>();

        // Iterăm prin a doua listă și verificăm dacă fiecare utilizator există în primul set
        for (String utilizatorB : participantiSesiuneB) {
            if (setSesiuneA.contains(utilizatorB)) {
                comuni.add(utilizatorB);
            }
        }

        System.out.println("Utilizatorii care au participat la ambele sesiuni sunt: " + comuni);
    }

}
