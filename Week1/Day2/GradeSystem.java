import java.util.Scanner;

/**
 *
 * @author berke
 */
public class Day2GradeSystem {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        take the grade from user
        0–49 → F
        50–59 → D
        60–69 → C
        70–84 → B
        85–100 → A
        */
        Scanner scan = new Scanner(System.in);
        int grade;
        System.out.print("Enter your grade: ");
        grade = scan.nextInt();
        if (grade < 0 || grade > 100) {
           System.out.println("Invalid grade.");
        }
        else {
            if(grade >= 0 && grade < 50) {
            System.out.println("F");
            
        }
            else if(grade >=50 && grade < 60) {
            System.out.println("D");
        }
            else if(grade >= 60 && grade < 70) {
            System.out.println("C");
        }
            else if(grade >= 70 && grade < 85) {
            System.out.println("B");
        }
            else { 
            System.out.println("A");
            }
        }
        
        scan.close();
    }
    
}
