//Type promotion means if you have different datad types in a single expression, then result will be calculated in a single datatype.
// Type Promotion has 2 rules -
// 1. data type like byte, short and char will be converted to int.
// 2. Datatype like long, double and float will be converted to the greatest datatype existing in an expression.
public class TyprPromotion
{
    public static void main(String[] args) {
        /*byte a = 43;
        char b = 'a';
        short c = 4;
        System.out.println(a+b+c);

        long x = 45;
        float y = 23f;
        System.out.println(x+y);*/

        //Wrong
        /*byte p = 34;
        p = p*3;
        System.out.println(q);*/

        // Right
        byte p = 34;
        p = (byte)(p*4);
        System.out.println(p);

    }
}
