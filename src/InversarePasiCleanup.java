import java.util.Arrays;

public class InversarePasiCleanup {
    public static void main(String[] args) {
        String[] pasi = {"Creează folder temporar", "Scrie în fișier", "Închide fișier"};

        System.out.println("Pașii de creare: " + Arrays.toString(pasi));

        for (int i = 0; i < pasi.length / 2; i++) {
            String temp = pasi[i];
            pasi[i] = pasi[pasi.length - 1 - i];
            pasi[pasi.length - 1 - i] = temp;
        }

        System.out.println("Pașii de cleanup (ordine inversă): " + Arrays.toString(pasi));
    }

}
