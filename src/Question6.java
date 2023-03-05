import java.util.ArrayList;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            arr.add(temp);
        }
        System.out.println(arr);
        int element_to_be_searched = 14;
        int verify =0;
        for(Integer i:arr){
            if(element_to_be_searched == i){
                verify =1;
                break;
            }
        }
        if(verify ==0){
            System.out.println("Element not found");
        }else{
            System.out.println("Element Found");
        }
    }

}
