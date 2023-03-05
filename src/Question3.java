import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> Al = new ArrayList<Integer>();
        Al.addAll(List.of(new Integer[]{22, 33, 44, 55}));
        System.out.println(Al);
        Al.add(0,11);
        System.out.println(Al);
    }
}
