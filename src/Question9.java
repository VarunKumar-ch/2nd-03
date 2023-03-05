import java.util.LinkedList;
import java.util.List;

public class Question9 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<Integer>();
        LL.addAll(List.of(new Integer[]{11, 22, 33, 44, 55}));
        int particular_element = 44;
        if(LL.contains(particular_element)){
            System.out.println("Exist");
        }else{
            System.out.println("Not Exist");
        }
    }
}
