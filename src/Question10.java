import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        LinkedList<Character> LL = new LinkedList<Character>();
        LL.addAll(List.of(new Character[]{'J', 'A', 'V', 'A'}));
        System.out.println(LL.getClass().getName());
        System.out.println(LL);
        ArrayList<Character> arrayList = new ArrayList<Character>();
        arrayList.addAll(LL);
        System.out.println(arrayList.getClass().getName());
        System.out.println(arrayList);

    }
}
