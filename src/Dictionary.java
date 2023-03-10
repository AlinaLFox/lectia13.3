import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {

        /*
        instanțiază interfața Map cu implementarea HashMap
        (important de menționat că în interiorul operatorului <>
        este necesară specificarea a 2 tipuri de date, unul pentru cheie
        și altul pentru valoare)
         */
        Map<String, String>translate = new HashMap<>();
        translate.put("Cat", "Pisica"); // adaugă o pereche cheie-valoare în Map
        translate.put("Dog", "Caine");
        translate.put("Cow", "Vaca");
        translate.put("Chicken", "Pui");
        translate.put("Pig", "Porc");
        translate.put("Rabbit", "Iepure");
        translate.put("Frog", "Broasca");
        translate.put("Bear", "Urs");
        translate.put("Wolf", "Lup");
        translate.put("Fox", "Vulpe");


      //  System.out.println(translate.get("Cow")); // afișează la ecran valoarea asociată cheii

        for (String english : translate.keySet()) { // parcurge doar prin cheile Map-ului
           // System.out.println(english);
        }

        for (String romanian : translate.values()) { // iterează doar prin valorile Map-ului
           // System.out.println(romanian);
        }

        for (Map.Entry<String, String>entry : translate.entrySet()) { //  iterează prin perechile de cheie-valoare ale Map-ului
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}