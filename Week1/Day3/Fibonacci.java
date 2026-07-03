public class Day3Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        fibonacci = 0,1,1,2,3,5,8,13,.........
        need 2 ints(first and second)
        check how many steps you need to find from user
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("How many step you want to go in fibonacci? ");
        int step = scan.nextInt();
        int first = 0;
        int second = 1;
        int next;

        for (int i = 1; i <= step; i++) {
            System.out.print(first + " , ");

            next = first + second;
            first = second;
            second = next;
        }
        scan.close();

    }

}
