public class UnaryOperator
{
    public static void main(String[] args) {
        int a = 23;
        int b = ++a; /* This is pre increment operator. It changes the value of operator to which is attatched and then increments the value
        of other variable. Basically , it increments the value of a anf then b and gives the same answer for both variable.
        Same is the condition with pre decrement operator.*/
        int c = 43;
        int d = --c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        int p = 32;
        int q = p++; /* This post increment operator. It changes the value of the varaible to which it attatched and stores but doesn't changes
        the value of other variable. Here , b will get the previous value of a and value of a will be changed becuase the operand the after a so
        a's value will be changed and not b.
        Same is the case with post decrement operator.*/
        int r = 76;
        int s = r--;
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }
}
