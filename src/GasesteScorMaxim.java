public class GasesteScorMaxim {
    public static void main(String[] args) {
        int[] scoruri = {85, 92, 78, 99, 88, 95};

        if (scoruri.length == 0) {
            System.out.println("Nu există scoruri de analizat.");
            return;
        }

        int scorMaxim = scoruri[0]; // Presupunem că primul scor este cel mai mare

        for (int i = 1; i < scoruri.length; i++) {
            if (scoruri[i] > scorMaxim) {
                scorMaxim = scoruri[i]; // Am găsit un scor mai mare, îl actualizăm
            }
        }

        System.out.println("Cel mai mare scor obținut la teste este: " + scorMaxim);
    }

}
