import java.util.Scanner;

/**
 *
 * @author berke
 */
public class Day3WhileExamples2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Example 1: Factoral calculation
        Example 2: Harmonic numbers
        Example 3: Printing a triangle using *'s
        Example 4: Calculation of powers
        */
        
        //Example 1
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to its factorial value: ");
        int input = scan.nextInt();
        int factorial = 1;
        while(input > 0 ) {
            factorial = factorial * input;
            input--;
        }
        System.out.println("Result is: " + factorial);
        
        
        //Example 2
        System.out.print("Enter the number: ");
        double number = scan.nextDouble();
        double a = 1.0;
        double result = 0;
        while(a <= number) {
            result += (1 / a);
            a++;
        }
        System.out.println("Result is " + result);
        
        //Example 3
        System.out.print("Enter the number; see the triangle: ");
        int triangle = scan.nextInt();
        int k = 1;
        while(k <= triangle) {
            int l = 1;
            while(l <= k) {
                System.out.print("*");
                l++;
            }
            System.out.println();
            k++;
        }
        
        //Example 4
        System.out.print("Enter the number: ");
        int first = scan.nextInt();
        System.out.print("Enter the power: ");
        int power = scan.nextInt();
        int res = 1;
        
        int i = 1;
        while(i <= power) {
            res *= first;
            i++;
        }
        System.out.println("Result is: " + res);
        scan.close();
        
        
       
    }
    
}
