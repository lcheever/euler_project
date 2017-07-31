package project_euler;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 */

public class question3 {

    public static double largestPrimeFactor(double num){   
        
        double largestFactor = 0.0;
      
        int divisor = 2;
        while(num > 1){
            while(num % divisor == 0){
                largestFactor = divisor;
                num /= divisor;
            }
            divisor += 1;
        }
        
        return largestFactor;
    }
    
    
    public static void main(String[] args){
     
        double test = 600851475143.0;
        double answer = largestPrimeFactor(test);
    
        System.out.println("the answer is: " + answer);
        
    }


}
