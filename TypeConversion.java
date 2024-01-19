import java.util.*;
public class TypeConversion
{
    public static void main(String[] args) {
        int a = 32;
        float b = a;
        System.out.println(b);

        // Type conversion or widening conv. or implicit conversion means converting a small datatype to big data type and the type should be
        // compatible.
        // Byte > short > int > float > long > double

        Scanner n = new Scanner(System.in);
        float num = n.nextInt();
        System.out.println(num);
    }
}
