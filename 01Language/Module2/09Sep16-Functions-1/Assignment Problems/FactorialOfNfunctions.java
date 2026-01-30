package AssignmentProblems;

public class FactorialOfNfunctions {
    public int solve(int A){
        int fact = 1;
        while(A>0){
            fact *= A;
            A--;
        }
        return fact;
    }
}