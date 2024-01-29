import java.util.*;
public class If_else
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();
        if(pass == 1920)
        {
            System.out.println("Welcome!");
        }
        else if(pass == 1918)
        {
            System.out.println("Welcome you too!");
        }
        else{
            System.out.println("Get Lost !");
        }
    }
}
