package day1dairealanıvecevresi;
import java.util.Scanner;

/**
 *
 * @author berke
 */
public class Day1DaireAlanıVeCevresi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        r yi al dairenin alan ve çevresini göster pi final olacak 3.14
        */
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Dairenin yarıçapını giriniz: ");
        double yarıcap = scan.nextDouble();
        double alan = PI * yarıcap * yarıcap;
        double cevre = 2 * PI * yarıcap;
        System.out.println("Alan: " + alan);
        System.out.println("Çevre " + cevre);
        scan.close();
    }
    
}
