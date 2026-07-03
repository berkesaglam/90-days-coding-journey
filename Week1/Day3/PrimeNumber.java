public class Day3PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Take a number from user.
        check the number is prime or not.
        use for loop.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number(must be bigger than 1): ");
        int number = scan.nextInt();
        boolean prime = true;
        
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                prime = false;
                break; 
            }
            
        }
        if(prime) {
            System.out.println("Number " + number + " is a prime number.");
        }
        else {
            System.out.println("Number " + number + " is not a prime number.");
        }
        scan.close();
    }
    
}
