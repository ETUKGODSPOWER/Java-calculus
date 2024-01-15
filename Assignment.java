import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a Word");
        String word = scanner.nextLine();  

        //Check if the word is a palindrome
        if (ispalindrome(word)){
            System.out.println( word + "is a palindrome. ");
        } else{
            System.out.println(word + "is not a palindrome. ");
        };

        scanner.close();
    
    }
   

    private static boolean ispalindrome(String str) {
        str = str.toLowerCase();

        str = str.replaceAll("[^a-zA-Z0-9]", "");

        int length = str.length();
        for (int i = 0; i < length / 2; i++){
            if(str.charAt(i) != str.charAt(length- 1 - i)){
                return false;

            }
        }

       return true; 
    } 
        
    
  }

