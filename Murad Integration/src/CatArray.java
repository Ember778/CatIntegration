import java.util.Scanner;

public class CatArray {

  private boolean cuteCatGuess = false;
  private int arrayCatSum = 0;
  private int catArray[] = { 51, 9, 12, 18, 69, 32, 99, 28, 109, 88, 57, 77 };
  private int smallestCatNum = catArray[0];
  private int smallestCatMonth = 0;
  private int arrayIndex;
  private int catCounter = 0;
  private int cuteCatNum;

  
  public void initializeCatArray() {

    Scanner catScan = new Scanner(System.in);
    System.out.println();
    
    //PSI 2 (1) a demonstration of relational operators.
    //PSI 2 (6) a for loop
    //PSI 2 (8) find the smallest value in an array.
    //PSI 2 (9) get a sum of the values in an array using an accumulator.
    
    for (int it = 0; it < catArray.length; it++) {
      arrayCatSum = arrayCatSum + catArray[it];
      if (smallestCatNum >= catArray[it]) {
        smallestCatNum = catArray[it];
        smallestCatMonth = it;
      }
    }
    //PSI 2 (7) an array.
    String catArrayMonth[] = { "January", "February", "March", "April", "May",
        "June", "July", "August", "September", "October", "November", "December" };
    System.out.println("How many cute cats do you "
      + "think were seen in any one month last year?");

    cuteCatNum = catScan.nextInt();
     
    //PSI 2 (2) a demonstration of conditional operators
    //PSI 2 (5) a while loop
    //PSI 2 (10) search an array and identify the index where a value was found.
    while (cuteCatGuess == false && catCounter != 12) {
      for (int iter = 0; iter < catArray.length; iter++) {
        if (catArray[iter] == cuteCatNum) {
          cuteCatGuess = true;
          arrayIndex = iter;
          System.out.println("Your guess was correct! There were "
            + cuteCatNum + " cute cats seen in " + catArrayMonth[arrayIndex] + "."
              + " This data is stored in array index: " + arrayIndex);
          System.out.println();
          System.out.println("As a reward here are some facts on cute cats seen last year!");
          System.out.println();
          System.out.println("Last year there were only " + smallestCatNum
            + " cute cats seen in " + catArrayMonth[smallestCatMonth]);
          System.out.println();
          System.out.println("The total number of cute cats seen last year"
            + " was " + arrayCatSum + " cute cats.");
        }
        catCounter++;
      }
    }
    if (cuteCatGuess == false) {
      System.out.println("I'm sorry, but you were incorrect in your guess.");
      System.out.println();
      System.out.println("As a consolation prize here are some facts on"
        + " cute cats seen last year.");
      System.out.println();
      System.out.println("Last year there were only " + smallestCatNum
        + " cute cats seen in " + catArrayMonth[smallestCatMonth]);
      System.out.println();
      System.out.println("The total number of cute cats seen last year"
        + " was " + arrayCatSum + " cute cats.");
    }
  }
}