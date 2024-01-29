// Calculate the income tax

import java.util.*;
public class Q3
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int income = n.nextInt();
        int tax;

        if(income < 500000)
        {
            System.out.println("tax = " + 0);
        }
        else if(income > 500000 && income < 1000000)
        {
            System.out.println("tax = " + 0.2*income);
        }
        else{
            System.out.println("tax = " + 0.3*income);
        }
    }
}
