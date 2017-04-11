import java.util.InputMismatchException;
import java.util.Scanner;

/*
David Murad
Integration project, basically a sum of most of the things
I have learned over the course of COP2006
*/

/*
 * PSI 1 (2) a definition of a variable.
Variables are created from built in data types
Variables are a named unit of storage that can be changed to any
of a set of specified values during execution of a program
 * PSI 1 (3) a list and description of Java built-in data types. 
byte: 8-bit two's complement integer
short: 16-bit two's complement integer
int: 32-bit two's complement integer
long: 64-bit two's complement integer
float: 32-bit precision floating point number
double: 64-bit precision floating point number
boolean: 2-bit data type which can only be true or false
char: a single 16-bit unicode character
 * PSI 2 (1) a definition, and description of relational operators.
Relational operators are programming language constructs which test or define
a relation between two entities
Relational operators are operators such as ==, !=, <, <=, >, and >=
 * PSI 2 (2) a definition, and description of conditional operators.
Conditional operators are programming language constructs which test or define
operations on two boolean expressions.
Conditional operators are operators such as &&(and), and ||(or)
*/

public class Main {

  public static void main(String[] args) {

    // A scanner object
    Scanner catScan = new Scanner(System.in);
    Introduction catIntro = new Introduction();
    UserCatAnalysis yourAnalysis = new UserCatAnalysis();
    MathCat mathCat = new MathCat();
    CatArray catRay = new CatArray();

    int chapter = 0;
    

    while (chapter != 99) {
      boolean catIntCheck = false; 
      System.out.println("Now loading cat integration software.");
      System.out.println();
      System.out.println("Enter 1 for introduction");
      System.out.println("Enter 2 for cat analysis");
      System.out.println("Enter 3 for mathCAT software");
      System.out.println("Enter 4 for cute cat array program");
      System.out.println("Enter 99 to exit cat integration software");
      
      while (catIntCheck == false) {
        
        try {       
        chapter = catScan.nextInt();
        catIntCheck = true;
        } catch (InputMismatchException e) {
        System.out.println();
        System.out.println("Please enter an integer and not a string");
        catScan.next();
      } catch (Exception e) {
        e.printStackTrace();
        catScan.next();
      }

      switch (chapter) {

        // PSI 2 (3,4)
        case 1:
          System.out.println("Please enter your name.");

          String yourName = catScan.next();

          System.out.println("A cat is watching you right now. To please the "
            + "cat you should tell it a joke to please it. Please enter a joke.");

          String yourSentence = catScan.next();

          // PSI 2 (3) use and identification of a method call.
          // PSI 2 (4) use and identification of an argument.
          // This is a method call we are calling the introduce method.
          // Inside the parenthesis of the call is a string argument.
          catIntro.introduce(yourName, yourSentence);
          break;

        // PSI 1 (1,6) PSI 2 (11)
        case 2:
          yourAnalysis.analyze();
          break;

        // PSI 1 (4,5,7)
        case 3:
          mathCat.catMath();
          break;

        // PSI 2 (1,2,5,6,7,8,9,10)
        case 4:
          catRay.initializeCatArray();
          break;

        case 99:
          System.out.println();
          System.out.println("Exiting cat integration software.");
          break;

        default:
          System.out.println();
          System.out.println("Invalid integer. Please enter a valid integer.");
          System.out.println();
          break;

      }
    }
  }
}
}