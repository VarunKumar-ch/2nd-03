import java.util.LinkedList;
import java.util.List;

public class Question8 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<Integer>();
        LL.addAll(List.of(new Integer[]{1, 2, 3, 4, 5}));
        for(Integer i=0;i<LL.size();i++){
            System.out.println(LL.get(i));
        }
        System.out.println("#");
        System.out.println(LL);
    }
}
