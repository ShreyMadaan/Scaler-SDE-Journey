public class WhichTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A==B && B==C){
            System.out.println("Equilateral");
        }else if(A!=B && A!=C && B!=C){
            System.out.println("Scalene");
        }else {
            System.out.println("Isosceles");
        }
    }
}