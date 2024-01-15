import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
      
        
        //Use a scanner to allow users input values of thier choice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = scanner.nextInt();
        
        System.out.println("Enter b : ");
        double b = scanner.nextInt();

        System.err.println("Enter c : ");
        double c = scanner.nextInt();
        

        //square b 
        double Square_1 = Math.pow(b,2);
         //System.out.println(Square_1);
        //find the square root of the values and divide by 2
        double multiply =  4 * a * c;
       
        double subtract = Square_1 - multiply ;
        double squart_1 = Math.sqrt(subtract);
        
        double lower_fraction = 2 * a;
        double Second_part = squart_1 /lower_fraction;

        double area_1 = -b + Second_part;
        double area_2 = -b - Second_part;

        System.out.println( "x = " + area_1 + "      " + " x = " + area_2 );

      

        scanner.close();

    }
    
}
