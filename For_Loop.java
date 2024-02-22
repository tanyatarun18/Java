import java.util.*;

public class For_Loop {
    public static void main(String[] args) {

        //Printing the square pattern.
        /*for (int i = 1; i < 5; i++){
            System.out.println("****");
        }*/

        //Print the reverse of a number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        while(n>0){
            int rev = n%10;
            System.out.print(rev);
            n /= 10;
        }
    }
}
