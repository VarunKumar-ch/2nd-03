import java.util.*;

public class Question14 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.addAll(List.of(new Integer[]{99, 229, 122, 145, 75}));
        Collections.sort(arrayList);
        int second_smallest_element = arrayList.get(1);
        System.out.println(second_smallest_element);
    }
}
