import java.util.HashMap;
import java.util.Map;

public class StocareUrlMedii {
    public static void main(String[] args) {
        Map<String, String> urlMedii = new HashMap<>();
        urlMedii.put("dev", "http://dev.myapp.com");
        urlMedii.put("stg", "https://staging.myapp.com");
        urlMedii.put("prod", "https://www.myapp.com");

        String mediuSelectat = "stg";
        String urlCurent = urlMedii.get(mediuSelectat);

        System.out.println("Se vor rula testele pe mediul " + mediuSelectat + " la URL-ul: " + urlCurent);
    }

}
