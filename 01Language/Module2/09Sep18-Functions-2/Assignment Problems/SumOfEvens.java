public class SumOfEvens {
    public int solve(int A){
        int sum = 0;
        for(int i=0;i<=A;i+=2){
            sum+=i;
        }
        return sum;
    }
}