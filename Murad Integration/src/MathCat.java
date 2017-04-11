import java.util.Scanner;

public class MathCat {

  private int mathCatNum;
  private int userCatAmount;
  private int mathCatSum;
  private int mathCatSub;
  private int mathCatMult;
  private int mathCatDiv;
  private int mathCatMod;
  private String miceMouse;
  private String catCats;

  public void catMath() {
    Scanner catScan = new Scanner(System.in);

    System.out.println("Now loading mathCat software...");
    System.out.println();
    System.out.println("Please enter a number 1-5 depending on what"
      + " type of calculation you want to do.");
    System.out.println();
    System.out.println("1: Addition");
    System.out.println("2: Subtraction");
    System.out.println("3: Multiplication");
    System.out.println("4: Division");
    System.out.println("5: Modulus");

    mathCatNum = catScan.nextInt();

    //PSI 1 (4) a demonstration of major mathematical operations.
    //PSI 1 (7) a switch statement.
    switch (mathCatNum) {

      case 1:
        System.out.println("Please enter the number of cats you own.");
        userCatAmount = catScan.nextInt();
        mathCatSum = userCatAmount + 2;
        System.out.println(
          "Jane has 2 cats." + " You own " + userCatAmount + " cats."
            + " Together you own " + mathCatSum + " cats.");
        break;

      case 2:
        System.out.println("Please enter the number of cats you own.");
        userCatAmount = catScan.nextInt();
        if (userCatAmount < 1) {
          System.out.println("You own no cats. How sad for you.");
        } else {
          mathCatSub = userCatAmount - 1;
          if (mathCatSub == 1) {
            catCats = "cat";
          } else {
            catCats = "cats";
          }
          System.out.println("You have " + userCatAmount + " cats. One cat runs"
            + " away. " + "You now have " + mathCatSub + " " + catCats + " left.");
        }
        break;

      case 3:
        System.out.println("Please enter the number of cats you own.");
        userCatAmount = catScan.nextInt();
        mathCatMult = userCatAmount * 2;
        if (mathCatMult == 1) {
          catCats = "cat";
        } else {
          catCats = "cats";
        }
        System.out.println("You have " + userCatAmount + " cats. The toal number"
          + " of ears your" + catCats + " have is " + mathCatMult + " ears.");
        break;
      
      // PSI 1 (5) a definition and demonstration of integer division.
      // This case uses integer division which divides the two integers and then
      // outputs the quotient slicing off the floating decimal point numbers
      case 4:
        System.out.println("Please enter how many cat paws reside in your dwelling?");
        userCatAmount = catScan.nextInt();
        mathCatDiv = userCatAmount / 4;
        System.out.println("You have " + mathCatDiv + " whole cats living in your home.");
        break;

      case 5:
        System.out.println("Please enter a number");
        userCatAmount = catScan.nextInt();
        mathCatMod = userCatAmount % 2;
        if (mathCatMod == 1) {
          miceMouse = "mouse";
        } else {
          miceMouse = "mice";
        }
        System.out.println("You have two cats and " + userCatAmount + " mice. If you"
          + " feed both cats equally you will have"
          + " " + mathCatMod + " " + miceMouse + " remaining.");
        break;

      default:
        System.out.println("Invalid integer... Exiting catMath.");
        break;
    }
  }

  public int getMathCatNum() {
    return mathCatNum;
  }

  public int getUserCatAmount() {
    return userCatAmount;
  }

  public int getMathCatSum() {
    return mathCatSum;
  }

  public int getMathCatSub() {
    return mathCatSub;
  }

  public int getMathCatMult() {
    return mathCatMult;
  }

  public int getMathCatDiv() {
    return mathCatDiv;
  }

  public int getMathCatMod() {
    return mathCatMod;
  }

  public void setMathCatNum(int catNum) {
    mathCatNum = catNum;
  }

  public void setUserCatAmount(int catAmount) {
    userCatAmount = catAmount;
  }

  public void setMathCatSum(int catSum) {
    mathCatSum = catSum;
  }

  public void setMathCatSub(int catSub) {
    mathCatSub = catSub;
  }

  public void setMathCatMult(int catMult) {
    mathCatMult = catMult;
  }

  public void settMathCatDiv(int catDiv) {
    mathCatDiv = catDiv;
  }

  public void setMathCatMod(int catMod) {
    mathCatMod = catMod;
  }
}