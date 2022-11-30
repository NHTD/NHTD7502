import java.util.*;
 
 public class LongestCommonSubsequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x=sc.nextLine();
        String y=sc.nextLine();
        int n=x.length();
        int m=y.length();
        int[][] arr = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if(i==0 || j==0){ 
                    arr[i][j]=0;
                }else{
                    if(x.charAt(i-1)==y.charAt(j-1)){
                        arr[i][j]=arr[i-1][j-1]+1;
                    }else{
                        arr[i][j]=Math.max(arr[i-1][j], arr[i][j-1]);
                    } 
                }
            }
        }
        System.out.print(arr[n][m]);
    }
 }