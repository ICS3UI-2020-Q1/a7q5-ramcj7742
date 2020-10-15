import java.util.Scanner;
/**
 * Prints the first digit of users number
 * @author Jaden Ramcharan
 */
public class Main {
  //finds first digit
  public static int firstDigit(int userNum){
    int digit = 0;
    //first digit if number is above 0
    if(userNum > 0){
      for(int i = userNum; i > 0; i /= 10){
        digit = i % 10;
     }
     //first digit if numer is negative
    }else if(userNum < 0){
      for(int i = userNum * -1; i > 0; i /= 10){
        digit = i % 10;
    }
    }
    System.out.println(digit);
    return digit;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets user number
    int userNum = input.nextInt();

    //shows first digit
    firstDigit(userNum);
    
  }
}
