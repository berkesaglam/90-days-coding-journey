import java.util.Scanner;

/**
 *
 * @author berke
 */
public class Day2UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Kullnanıcı adı ve şifre alacağız (Scanner)
        doğru mu diye kontrol edeceğiz(if)
        doğruysa giriş başarılı
        yanlışsa başarısız giriş yazacak(else bloğu)
        */
        Scanner scan = new Scanner(System.in);
        String usernamematch = "Java123";
        int passwordmatch = 123456;
        String username;
        int password;
        System.out.print("Please enter your user name: ");
        username = scan.next();
        System.out.print("Please enter your password: ");
        password = scan.nextInt();
        
        if((username.equals(usernamematch)) && (password == passwordmatch)) {
            System.out.println("Login successful. Welcome user 'Java123'.");
        }
        else{
            System.out.println("Incorrect password or username. Please try again.");
        }
        scan.close();
    }
    
}
