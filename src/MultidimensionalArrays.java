public class MultidimensionalArrays {
    public static void main(String[] args) {
        // Un array 2D pentru a stoca date de login: (username, password)
        // 3 rânduri și 2 coloane
        String[][] dateLogin = {
                {"user1", "pass123"},
                {"user2", "pass456"},
                {"admin", "admin_secret"}
        };

        // Accesarea elementelor: [index_rând][index_coloană]
        String usernameAdmin = dateLogin[2][0]; // Rândul 3, coloana 1
        String parolaAdmin = dateLogin[2][1];   // Rândul 3, coloana 2

        System.out.println("Username-ul adminului este: " + usernameAdmin);
        System.out.println("Parola adminului este: " + parolaAdmin);

        // Parcurgerea unei matrici cu bucle imbricate
        System.out.println("\n--- Date de test pentru login ---");
        for (int i = 0; i < dateLogin.length; i++) { // Iterează prin rânduri
            String username = dateLogin[i][0];
            String password = dateLogin[i][1];
            System.out.println("Test " + (i + 1) + ": User = " + username + ", Pass = " + password);
        }
    }

}
