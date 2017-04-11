import java.util.Scanner;

public class UserCatAnalysis {

  Scanner catScan = new Scanner(System.in);

  public void analyze() {
    
    //PSI 1 (1) use of variables of multiple types within the program.
    CatAnalysisVariables catVar = new CatAnalysisVariables();

    System.out.println("Now starting your cat assessment.");
    System.out.println();
    // Asking for user input to define previously declared integer variable
    System.out.println("Please enter number of cats you own.");
    // Assigning previously declared integer variable through user input
    catVar.setKintyCat(catScan.nextInt());
    // Asking for user input to define previously declared double variable
    System.out.println("Please rate on a scale of one to ten how much you love cats.");
    // Assigning previously declared double variable through user input
    catVar.setDoubleCat(catScan.nextDouble());
    // Getting past the empty line
    catScan.nextLine();
    // Asking for user input to define previously declared string variable
    System.out.println("Please enter your favorite type of cat.");
    // Assigning previously declared string variable through user input
    catVar.setYarn(catScan.nextLine());
    System.out.println("Please wait for your cat assessment to process.");
    System.out.println();
    // Outputting text in response to user input (uses conCATenation)
    System.out.println("You currently own " + catVar.getKintyCat() + " cats This"
      + " is nowhere near enough please go out and get more!");
    System.out.println();

    // PSI 1 (6) If else statements 
    if (catVar.getDoubleCat() >= 10) {
      System.out.println("Your cat love rating is a "
        + catVar.getDoubleCat() + ". Congratulations you love cats the perfect amount!");
    } else if (catVar.getDoubleCat() > 8) {
      System.out.println("Your cat love rating is a " + catVar.getDoubleCat() + ". You're"
        + " close to loving cats enough, but you're not quite there.");
    } else if (catVar.getDoubleCat() > 5) {
      System.out.println("Your cat love rating is a " + catVar.getDoubleCat()
        + ". You're dangerously close to falling below the acceptable"
          + " cat love level. Please reassess your love for cats!");
    } else {
      System.out.println("Your cat love rating is a " + catVar.getDoubleCat() + ". Your"
        + " love for cats is far below acceptable levels."
          + " Please stand by cat purrrrsuasion agents are on their way.");
    }
    System.out.println();
    System.out.println("Your favorite type of cat is " + catVar.getYarn()
      + ". That's a very good choice.");
    System.out.println();
  }
}