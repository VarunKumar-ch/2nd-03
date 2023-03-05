import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        double sum =0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum / n);
    }
}
