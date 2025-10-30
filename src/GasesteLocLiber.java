public class GasesteLocLiber {
    public static void main(String[] args) {
        int[][] locuriCinema = {
                {1, 1, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {0, 1, 1, 1, 0}
        };

        boolean locGasit = false;

        for (int i = 0; i < locuriCinema.length; i++) {
            for (int j = 0; j < locuriCinema[i].length; j++) {
                if (locuriCinema[i][j] == 0) {
                    System.out.println("Primul loc liber găsit este la rândul " + (i + 1) + ", coloana " + (j + 1));
                    locGasit = true;
                    break; // Ieșim din bucla interioară
                }
            }
            if (locGasit) {
                break; // Ieșim și din bucla exterioară
            }
        }

        if (!locGasit) {
            System.out.println("Niciun loc liber nu a fost găsit.");
        }
    }

}
