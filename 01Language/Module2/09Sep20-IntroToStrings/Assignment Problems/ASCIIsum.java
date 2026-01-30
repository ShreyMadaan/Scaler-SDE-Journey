public class ASCIIsum {
    public int solve(String A){
        int len = A.length();
        int sum = 0;
        for(int i=0;i<len;i++){
            sum+= (int)A.charAt(i);
        }
        return sum;
    }
}