import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> d = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            d.add(i*i);
        }
        for(int i=0;i<d.size();i++){
            System.out.println(d.get(i));
        }
    }
}
