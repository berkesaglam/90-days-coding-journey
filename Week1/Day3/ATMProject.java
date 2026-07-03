public class Day3ATMProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        make a menu
        user will select what they want to do
        deposit money, withdraw money,check the balance,exit
        user can keep going until balance reaches 0.
        balance starts with 1000$
        */
        Scanner scan = new Scanner(System.in);
        int balance = 1000;
        System.out.println("Welcome to Java bank!");
        System.out.println("Your current balance is " + balance + "$.");
        
        while(balance > 0) {
            System.out.println("1- Deposit money.");
            System.out.println("2- Withdraw money.");
            System.out.println("3- Check the balance.");
            System.out.println("4- Exit.");
            System.out.print("Please enter your choice(1-4): ");
            int input = scan.nextInt();
            
            switch(input) {
                case 1:
                    System.out.print("Please enter the amount you want to deposit: ");
                    int amountOne = scan.nextInt();
                    balance += amountOne;
                    System.out.println("Your updated balance: " + balance);
                    break;
                case 2:
                    System.out.print("Please enter the amount you want to withdraw: ");
                    int amountTwo = scan.nextInt();
                    if(amountTwo > balance) {
                        System.out.println("You dont have that much money in your account. Invalid request.");
                        break;
                    }
                    else {
                        balance -= amountTwo;
                        System.out.println("Your updated balance: " + balance);
                    break;
                    }   
                case 3:
                    System.out.println("Your balance is " + balance + "$.");
                    break;
                case 4:
                    System.out.println("Exiting the ATM.");
                    System.out.println("Have a nice day.");
                    return;
                    
                   
                default: 
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scan.close();
    }
    //u can withdraw more money than whats in ur acc (fix this)
    // add a exit option
    //problem with exit option that it doesnt exit the loop it just exits switch case i need to fix that
}
