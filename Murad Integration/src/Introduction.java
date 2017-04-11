public class Introduction {
  
  //PSI 2 (3) use and identification of a header.
  //PSI 2 (4) use and identification of a parameter.
  // A header for the introduction class.
  // A string parameter is used here to get a name which will be used in the
  // method.
  public void introduce(String name, String sentence) {
          
    // A string output
    System.out.println("Hello, " + name + ". Welcome to the cat integration software!");
    System.out.println();
    //System.out.println(sentence.length);
    if (sentence.length() > 15) {
      System.out.println("Your joke displeased the cat so he stole part of it and ran off"
        + "with it");
      System.out.println(sentence.substring(0,5) + sentence.substring(10));
    } else if (sentence.length() > 10) {
        System.out.println("Your joke displeased the cat so he stole part of it and ran off"
          + "with it");
        System.out.println(sentence.substring(0,3) + sentence.substring(6));
    } else {
      System.out.println("Your joke was way to short and displeased the cat. He ran off "
        + "and is probably plotting vengence for your bad joke.");
    }
  }
}