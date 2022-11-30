import java.util.Scanner;

public class kasgh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[100];
        int[] b = new int[100];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        int max=a[0];
        for(int i=0; i<n; i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        for(int i=0; i<max; i++){
            b[i]=0;
        }

        for(int i=0; i<=max; i++){
            b[a[i]]+=1;
        }

        for(int i=0; i<=max; i++){
            if(b[i]>0){
                System.out.print(i + " " + b[i]);
            }
        }
    }
}
