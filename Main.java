
public class Main {


  public static void main(String[] args) {

    /*Challenge 1: Find Maximum
    Write a method maximum that returns the largest 
    integer in the list. You can assume that the list has
    at least one element.*/
    
    Integer[] numList =  {5,4,8,6};
    Array objeto = new Array(numList);
    System.out.println("Resultado de challenge 1: El máximo numero es: " + objeto.maximum());
    
    // *********************

    /*Challenge 2: Print number in word
    Write a program called printNumberInWord which 
    prints "ONE", "TWO",... , "NINE", "OTHER" if the 
    int variable "number" is 1, 2,... , 9, or other, 
    respectively. Use:
        (a) a "nested-if" statement;
        (b) a "switch-case-default" statement.*/

    int num=9;

    System.out.println("Resultado de challenge 2: " + printNumberInWord(num));


    /*Challenge 3: Check Odd/Even
Write a method called checkOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
  
Hint n is an even number if (n % 2) is 0; otherwise, it is an odd number. Use == for comparison, e.g., (n % 2) == 0.*/

    int num2=5;
   
    System.out.print("Resultado de challenge 3: ");
    checkOddEven(num2);
    
  /*Challenge 4: Calculate the average
Write a method average that returns the average of the integer in the list. You can assume that the list has at least one element.*/
    
    Integer[] numList2 =  {2,3,4,7,8};
    Array objeto2 = new Array(numList2);
    System.out.println("Resultado de challenge 4: El promedio de la lista es: " + objeto2.average());
    
    
  }
  //Challenge 2:
  
    public static String printNumberInWord(int num) {

      String resultado;
      
      switch(num){
        case 1: resultado="ONE";
          break;
        case 2: resultado="TWO";
          break;
        case 3: resultado="THREE";
          break;
        case 4: resultado="FOUR";
          break;
        case 5: resultado="FIVE";
          break;
        case 6: resultado="SIX";
          break;
        case 7: resultado="SEVEN";
          break;
        case 8: resultado="EIGHT";
          break;
        case 9: resultado="NINE";
          break;
        default: resultado= "OTHER";
          break;
        }
    
      return resultado;
      }

  //Challenge 3:

  public static void checkOddEven(int num) { 
    
    if(num%2==0){
      System.out.println("Even Number");
    }else{
      System.out.println("Odd Number");
    }

    
}


}