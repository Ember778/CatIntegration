//PSI 2 (11) a class with private fields and public getters/accessors and setters/mutators.
public class CatAnalysisVariables {
  
  //PSI 1 (1) use of variables of multiple types within the program.
  
  // Declaring an integer variable
  private int kintyCat;
  // Declaring a double variable
  private double doubleCat;
  // Declaring a string variable
  private String yarn;

  public void setKintyCat(int kInt) {
    kintyCat = kInt;
  }

  public void setDoubleCat(double dubCat) {
    doubleCat = dubCat;
  }

  public void setYarn(String string) {
    yarn = string;
  }

  public int getKintyCat() {
    return kintyCat;
  }

  public double getDoubleCat() {
    return doubleCat;
  }

  public String getYarn() {
    return yarn;
  }
}
