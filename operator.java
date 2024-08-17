//LAB2
public class operator {
    public static void main(String[] args) {
        int a = 10, b = 5;                      //Arithmatic operation
        int sum = a + b;
        System.out.println("Sum: " + sum);
        int difference = a - b;
        System.out.println("Difference: " + difference);
        int product = a * b;
        System.out.println("Product: " + product);
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);
        int x = 5, y = 10;                             //operation operation
        System.out.println("Is x equal to y? " + (x == y));
        System.out.println("Is x not equal to y? " + (x != y));
        System.out.println("Is x greater than y? " + (x > y));
        System.out.println("Is x less than y? " + (x < y));
        System.out.println("Is x greater than or equal to y? " + (x >= y));
        System.out.println("Is x less than or equal to y? " + (x <= y));
        boolean z= true, w = false;                   //logical operation
        System.out.println("Logical AND: " + (z && w));
        System.out.println("Logical OR: " + (z || w));
        System.out.println("Logical NOT for 'a': " + !z);
        System.out.println("Logical NOT for 'b': " + !w);
    }
}
