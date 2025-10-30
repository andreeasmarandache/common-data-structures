import java.util.ArrayList;
import java.util.List;

public class FiltrareTeste {
    public static void main(String[] args) {
        List<String> toateStatusurile = new ArrayList<>();
        toateStatusurile.add("PASSED");
        toateStatusurile.add("FAILED");
        toateStatusurile.add("PASSED");
        toateStatusurile.add("BLOCKED");
        toateStatusurile.add("SKIPPED");

        List<String> testeDeInvestigat = new ArrayList<>();
        for (String status : toateStatusurile) {
            if (status.equals("FAILED") || status.equals("BLOCKED")) {
                testeDeInvestigat.add(status);
            }
        }

        System.out.println("Toate statusurile: " + toateStatusurile + " - " + toateStatusurile.size() + " teste");
        System.out.println("Teste de investigat: " + testeDeInvestigat + " - " + testeDeInvestigat.size() + " teste");
    }

}
