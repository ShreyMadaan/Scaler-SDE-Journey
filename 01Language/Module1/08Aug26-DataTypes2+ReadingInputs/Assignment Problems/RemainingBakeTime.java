import java.util.*;
public class RemainingBakeTime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int total_time = 40;
        int remaining_time = total_time - time;
        System.out.println(remaining_time);
    }
}
