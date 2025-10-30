import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContorizareStatusuri {
    public static void main(String[] args) {
        List<String> rezultate = new ArrayList<>();
        rezultate.add("PASSED");
        rezultate.add("FAILED");
        rezultate.add("PASSED");
        rezultate.add("SKIPPED");
        rezultate.add("PASSED");
        rezultate.add("FAILED");

        Map<String, Integer> contor = new HashMap<>();

        for (String status : rezultate) {
            // Obținem numărul curent pentru acest status. Dacă nu există, getOrDefault returnează 0.
            int numarCurent = contor.getOrDefault(status, 0);
            // Incrementăm și punem la loc valoarea actualizată.
            contor.put(status, numarCurent + 1);
        }

        System.out.println("Sumarul rezultatelor testelor:");
        for (Map.Entry<String, Integer> intrare : contor.entrySet()) {
            System.out.println("- " + intrare.getKey() + ": " + intrare.getValue() + " ori");
        }
    }

}
