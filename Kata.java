import java.util.Scanner;
public class Kata {
  public static void main(String... args) {
     Scanner input = new Scanner(System.in);
     
          System.out.println("Enter the number: ");
          int number = input.nextInt();
          
          System.out.println(floatOf(number));
          }
          public static int maximumNumber(int number, int secondNumber) {
          
              if(secondNumber > number) {
                return secondNumber;
                }
                else {
                  return number;
                  }   
           }
           public static boolean isEven(int integer) {
           
              if(integer % 2 == 0) {
                return true;
                }
                else {
                  return false;
                  }
           }
           public static boolean isPrimeNumber(int number) {
           
              boolean isPrime = true;
              for(int index = 2; index < number; index++) {
                if(number % index == 0) {
                isPrime = false;
                break;
                    }
                }
                
              if (isPrime) {
                return true;
                }
                else {
                  return false;
                    }
            }
            public static int subtract(int number, int secondNumber) {
            
                if (number > secondNumber) {
                    return number - secondNumber;
                    }
                    else {
                      return secondNumber - number;
                    }
            }
            public static float divide(float number, float secondNumber) {
            
                if (secondNumber == 0) {
                    return 0;
                    }
                    else {
                      return number / secondNumber;
                    }
            }
            public static int floatOf(int number) {
                int count = 0;
                for (int index = 1; index <= number; index++) {
                    if (number % index == 0) {   
                      count++;
                            }
                      }
                      return count;
                    }
            }
              
                    
                
                
                    
                  
           
      
    
    
    
  
