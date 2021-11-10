import java.util.ArrayList;
import java.util.List;

public class IsciMain {
    public static void main(String[] args) {
        List<Isci> isciler = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            isciler.add(IsciGenerator.yarat());
        }
        System.out.println(isciler);
    }
}
