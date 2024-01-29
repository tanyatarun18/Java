import java.util.*;
public class Q2
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        if(num%2==0)
        {
            System.out.println(num + " is an even number.");
        }
        else {
            System.out.println(num + " is an odd number.");
        }
    }
}
