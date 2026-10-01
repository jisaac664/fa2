package Es;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> correosUnicos = new HashSet<>();

        correosUnicos.add("juanemail.com");
        correosUnicos.add("isaac@email.com");
        correosUnicos.add("alejandro@email.com");

        System.out.println("Total correos únicos: " + correosUnicos.size());
        System.out.println("¿Existe isaac?: " + correosUnicos.contains("isaac@email.com"));
        System.out.println("¿Existe alejandro?: " + correosUnicos.contains("alejandro@email.com"));
    }
}