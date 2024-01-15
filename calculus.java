import java.util.Scanner;

public class calculus {
    public static void main(String[] args){


     //Use a scanner to allow users input values of thier choice 
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the Base Length of the Pyramid : ");
      double Base_length = scanner.nextInt();

      System.out.println("Enter the Base Width of the Pyramid : ");
      double Base_Width = scanner.nextInt();

      System.out.println("Enter the Pyramid Height : ");
      double Pyramid_height = scanner.nextInt();
        

  
  //Divide the base length and Base Width by 2
  double first_div = Base_Width/2;
  double second_div = Base_length/2;
  
  //square the first_div and second_div and the pyramid_height
  double first_square = Math.pow(first_div,2);
  double height_square = Math.pow(Pyramid_height,2);
  double second_square = Math.pow(second_div,2);
  
  //Add the values under the square roots
  double First_sect = first_square + height_square;
  double Second_sect = second_square + height_square;
  
 
 //Squareroot the answers from First_sect and Second_sect
  double First_sect_sqrt = Math.sqrt(First_sect);
  double Second_sect_sqrt = Math.sqrt(Second_sect);
  
  
  //Multiply the Base_length and First_sect_sqrt for the first section and multiply the Base_width and the Second_sect_sqrt for the second section
  double first_collate = Base_length * First_sect_sqrt;  
  double second_collate= Base_Width * Second_sect_sqrt;
  
  
  // multiply the Base_length and the Base_with at the beginning of the formula
  double front_sect = Base_length * Base_Width;
  
 
 //Add all your valles in the first section and second section sepreately
  double First_total = front_sect + first_collate;
  double Second_total = second_collate;
  
  //Add the first section and second section together
  double Area = First_total + Second_total; 
  
  
  //Print the Area of the Pyramid
 
 System.out.println(Area);

 scanner.close();
    }
}
