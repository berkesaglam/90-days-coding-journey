import java.util.Scanner;

/**
 *
 * @author berke
 */
public class Day2PassingClassAccGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        not ortalamasına göre sınıf geçme
        önce vize final ve quiz notunu alıp ortalama hesaplanacak
        vize %30 final %50 quiz %20
        eğer not ortalaması 60 ve üzeri ise sınıf geçilecek
        yoksa kaldınız denecek
        */
        Scanner scan = new Scanner(System.in);
        int midterm,quiz,finale;
        double average;
        System.out.print("Please enter your midterm grade: ");
        midterm = scan.nextInt();
        System.out.print("Please enter your quiz grade: ");
        quiz = scan.nextInt();
        System.out.print("Please enter your final grade: ");
        finale = scan.nextInt();
        
        average = (midterm * 0.3) + (quiz * 0.2) + (finale * 0.5);
        
        if(average >= 60) {
            System.out.println("Congratulations! You passed the class.");
        }
        else {
            System.out.println("Unfortunately you failed this class.");
        }
        scan.close();
    }
    
}
