import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Declararea unui HashMap care mapează String (nume browser) la Integer (număr versiune)
        Map<String, Integer> versiuniBrowser = new HashMap<>();

        // 1. Adăugarea de perechi (put)
        versiuniBrowser.put("Chrome", 108);
        versiuniBrowser.put("Firefox", 107);
        versiuniBrowser.put("Edge", 108);
        versiuniBrowser.put("Chrome", 109); // Suprascrie valoarea pentru cheia "Chrome"

        System.out.println("Harta versiunilor: " + versiuniBrowser);

        // 2. Accesarea unei valori (get)
        int versiuneChrome = versiuniBrowser.get("Chrome");
        System.out.println("Versiunea de Chrome este: " + versiuneChrome);

        // 3. Verificarea existenței unei chei (containsKey)
        if (versiuniBrowser.containsKey("Safari")) {
            System.out.println("Avem și o versiune pentru Safari.");
        } else {
            System.out.println("Nu avem configurată o versiune pentru Safari.");
        }

        // 4. Ștergerea unei perechi (remove)
        versiuniBrowser.remove("Edge");
        System.out.println("Harta după ștergerea Edge: " + versiuniBrowser);

        // 5. Iterarea prin hartă
        System.out.println("\n--- Iterare prin chei ---");
        for (String cheieBrowser : versiuniBrowser.keySet()) {
            System.out.println("Browser: " + cheieBrowser);
        }

        System.out.println("\n--- Iterare prin valori ---");
        for (Integer valoareVersiune : versiuniBrowser.values()) {
            System.out.println("Versiune: " + valoareVersiune);
        }

        System.out.println("\n--- Iterare prin perechi (intrări) ---");
        for (Map.Entry<String, Integer> intrare : versiuniBrowser.entrySet()) {
            System.out.println("Browser: " + intrare.getKey() + ", Versiune: " + intrare.getValue());
        }
    }

}
