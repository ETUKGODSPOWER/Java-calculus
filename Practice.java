public class Practice {
    public static void main (String[] args){

        // switch (3) {
        //     case 1:
        //     System.out.println("Today is Monday!!");
        //     break;

        //     case 2:
        //     System.out.println("Today is Tuesday!!");
        //     break;

        //     case 3:
        //     System.out.println("Today is Wednesday!!");
        //     break;

        //     case 4:
        //     System.out.println("Today is Thursday!!");
        //     break;
            
        //     case 5:
        //     System.out.println("Today is Friday!!");
                
        //         break;
        
        //     default:
        //         break;
        // }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7, 8, 9} };
        for (int i = 0; i < myNumbers.length; ++i) {
           for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
           }
        }

    }
}
