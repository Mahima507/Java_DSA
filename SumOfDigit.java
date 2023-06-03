
public class SumOfDigit {
   
    static void sod(int num, int sum){

        // termination case 
        if(num == 0){
            System.out.println("Sum of digit is "+sum);  
            return  ; 
        }
     // get the remainder (Single digit)
     // local variable
      int  singleDigit = num % 10; // business logic
         sum = sum+ singleDigit;
         // small problem
         // num/10 make the number small and pass the sum for the next call 
       
        sod(num/10, sum);   
    }
   

    public static void main(String[] args) {
        int num = 235352;
        sod(num,0);        
    }
}
 