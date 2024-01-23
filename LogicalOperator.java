public class LogicalOperator
{
    public static void main(String[] args) {
        int a = 23;
        int b = 56;
        int c = 54;
        System.out.println(a<b && b>c); // Logical AND
        System.out.println(a>b || b<c); // Logical OR
        System.out.println(!(a>b)); // Logical NOT
    }
}
