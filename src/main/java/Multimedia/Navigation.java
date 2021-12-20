package Multimedia;


public class Navigation {

    public static String Stadtnamen(String stadt) {
        String[] stadtnamen = { "Stuttgart", "Hamburg", "Berlin", "Dortmund", "Paris", "Rom" };

        for (int i = 0; i < stadtnamen.length; i++) {
            if (stadt == stadtnamen[i])
                switch (stadt) {
                case "Hamburg":
                    return stadt + " Postleitzah: 20095";
                case "Stuttgart":
                    return stadt + " Postleitzah: 70173";
                case "Berlin":
                    return stadt + " Postleitzah: 10115";
                case "Dortmund":
                    return stadt + " Postleitzah: 44263";
                case "Paris":
                    return stadt + " Postleitzah: 75116";
                case "Rom":
                    return stadt + " Postleitzah: 00017";
                default:
                    break;
                }
        }

        return "Wir können leider keine Adresse ausmachen.";
    }
}
