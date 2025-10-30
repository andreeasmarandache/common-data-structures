import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Declararea unui ArrayList. Se folosește interfața List pentru o bună practică.
        List<String> testStatusuri = new ArrayList<>();

        // 1. Adăugarea elementelor
        testStatusuri.add("PASSED");
        testStatusuri.add("FAILED");
        testStatusuri.add("SKIPPED");
        testStatusuri.add("PASSED"); // Se permit duplicate

        System.out.println("Lista inițială: " + testStatusuri);

        // 2. Accesarea unui element
        String alDoileaStatus = testStatusuri.get(1);
        System.out.println("Al doilea status este: " + alDoileaStatus);

        // 3. Modificarea unui element
        testStatusuri.set(2, "BLOCKED"); // Înlocuim "SKIPPED" cu "BLOCKED"
        System.out.println("Lista după modificare: " + testStatusuri);

        // 4. Ștergerea unui element
        testStatusuri.remove(0); // Ștergem primul "PASSED"
        System.out.println("Lista după ștergere: " + testStatusuri);

        // 5. Aflarea dimensiunii
        System.out.println("Numărul curent de statusuri: " + testStatusuri.size());

        // 6. Parcurgerea cu o buclă for-each
        System.out.println("\n--- Iterare prin statusuri ---");
        for (String status : testStatusuri) {
            System.out.println("Status: " + status);
        }
    }

}
