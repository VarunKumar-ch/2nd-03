import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            int add = sc.nextInt();
            a[i]=add;
        }

        for(int i:a){
            System.out.println(i);
        }
        System.out.println("Upadating");
        int givenelement =33;
        int atpostion = 2;
        a[atpostion] = givenelement;
        for(int i:a){
            System.out.println(i);
        }
    }
}
