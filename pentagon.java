import java.util.Scanner;

public class pentagon {
    public static void main(String[] args) {
      // input a scanner to allow users put the values of their choice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        double a = scanner.nextInt();

        //find the square of a
        double square = Math.pow(a,2);

        //find the square root of 5
        double branch_sqrt = Math.sqrt(5);
        
        // multiply 2 and root 5
        double first_multiplication = 2 * branch_sqrt;

        //add first_multiplication and 5
        double first_add = 5 + first_multiplication;

        //multiply everything in the bracket by 5
        double first_total = 5 * first_add;

        //square root all values under the the root symbol
        double main_sqrt = Math.sqrt(first_total);

        //find the area
        double area =  (main_sqrt * square)/4;

        //print output
        System.out.println(area);

        scanner.close();
    }
}
