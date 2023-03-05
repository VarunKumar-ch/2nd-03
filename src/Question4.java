import java.util.ArrayList;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        ArrayList<Integer> Al = new ArrayList<Integer>();
        Al.addAll(List.of(new Integer[]{1, 2, 3, 4, 5}));
        int index =3;
        System.out.println(Al.get(index));
    }
}
