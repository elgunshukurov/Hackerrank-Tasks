import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IsciGenerator {
    static List<String> adlar = new ArrayList<>();
    static List<String> soyadlar = new ArrayList<>();

    static {
        adlar.add("elgun");
        adlar.add("elvin");
    }

    static {
        soyadlar.add("Sukurov");
        soyadlar.add("Sakirov");
    }

    public static Isci yarat() {
        Isci isci = new Isci();
        Random random = new Random();

        int index = random.nextInt(adlar.size());
        isci.setAd(adlar.get(index));
        int index1 = random.nextInt(adlar.size());
        isci.setSoyad(soyadlar.get(index1));
        return isci;
    }
}
