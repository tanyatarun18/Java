import java.util.*;

public class While_Loop {
    public static void main(String[] args) {
        // Print numbers from 1 to 10.

        int n = 1;
        while(n <= 10){
            System.out.println(n);
            n++;
        }


        //Printing the sum of n naturals numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum += i;
            i++;
        }
        System.out.println("Sum of " + num + " natural numbers is: " + sum);
    }
}
