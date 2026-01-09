import java.util.*;
public class Problem1 {
    public static int max(int[]A){
        int n = A.length;
        int max=A[0];
        for(int i=0; i<n; i++){
            if(max<A[i]){
                max=A[i];
            }
        }
        return max;
    }
    public static int min(int[]A){
        int n = A.length;
        int min=A[0];
        for(int i=0; i<n; i++){
            if(min>A[i]){
                min=A[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A= new int[n];
        for(int i=0; i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.print(max(A) + " " + min(A));
    }
}
