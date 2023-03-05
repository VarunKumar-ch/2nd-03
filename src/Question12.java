import java.util.HashSet;

public class Question12 {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<Integer>();
        for(int i=1;i<=10;i++){
            st.add(i);
        }
        System.out.println(st.size());
        int j=1;
        while(st.size()>0){
            st.remove(j);
            j++;

        }
        System.out.println(st.size());
    }
}
