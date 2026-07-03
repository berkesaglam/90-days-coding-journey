public class Day3ArmstrongNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
       
        check if the number is armstrong number or not from 100 to 999.
        use for loop
        Example: 153 = (1*1*1)+(5*5*5)+(3*3*3)
        
        */
        int temp,hundreds,tens,ones,total;
        
        for(int i = 100; i <= 999; i++) {
            temp = i;
            ones = temp %10;
            temp /= 10;
            tens = temp % 10;
            temp /= 10;
            hundreds = temp % 10;
            temp /= 10;
            
            total = (ones * ones * ones) + (tens * tens * tens) + (hundreds * hundreds * hundreds);
             
            if(total == i) {
                System.out.println(i + " is an armstrong number.");
                
            }
        }
    }
    
}
