import java.util.LinkedList;
import java.util.List;

public class Question11 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        ll.addAll(List.of(new Integer[]{1, 2, 3, 4, 5}));
        System.out.println(ll);
        ll1.addAll(List.of(new Integer[]{1, 2, 3, 4, 5}));
        System.out.println(ll1);
        int c=0;
        if(ll.size() != ll1.size()){
            c=1;
        }else{
           for(int i=0;i<ll.size();i++){
               if(ll.get(i) != ll1.get(i)){
                   c=1;
                   break;
               }
           }
        }
        if(c == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
