public class Day3DoWhileExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Example 1: take a number from user until a negative input.
                   add the even numbers
                   print the result.
                   use do-while.
         */
        Scanner scan = new Scanner(System.in);
        int number;
        int result = 0;
        do {
            System.out.print("Enter a number: ");
            number = scan.nextInt();
            if (number >= 0 && number % 2 == 0) {
                result += number;
            }
        }    while(number >= 0);
    System.out.println ("Result is: " + result);
    scan.close ();


        
   }
    
}
