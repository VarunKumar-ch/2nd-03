  import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
       str.addAll(List.of(new String[]{"Array", "List", "Java", "String"}));
        for(String i:str) {
            System.out.println(i);
        }
    }
}
