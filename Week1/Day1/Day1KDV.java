package day1kdvhesabı;
import java.util.Scanner;
/**
 *
 * @author berke
 */
public class Day1KDVHesabı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        ürün maliyeti al
        kdv oranını çıkarıp gerçek maliyetini göster
        */
        Scanner scan = new Scanner(System.in);
        double kdvoranı = 0.18;
        System.out.print("Ürününüzün maliyetini girin: ");
        double fiyat = scan.nextDouble();
        
        double maliyet =fiyat - ( fiyat * kdvoranı);
        System.out.println("KDVsiz ürün fiyatı: " + maliyet);
        scan.close();
    }
    
}
