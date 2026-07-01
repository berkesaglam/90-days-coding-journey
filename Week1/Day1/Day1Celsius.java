package day1celciustofahreneit;
import java.util.Scanner;

/**
 *
 * @author berke
 */
public class Day1CelciusToFahreneit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        kullanıcıdan celcius al
        fahreneite çevir 
        yazdır
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Celcius cinsinden derece girniz: ");
        double celcius = scan.nextDouble();
        
        double fahreneit = (celcius * 9  / 5) + 32;
        System.out.println("Fahreneit cinsinden derece: " + fahreneit);
        scan.close();
    }
    
}
