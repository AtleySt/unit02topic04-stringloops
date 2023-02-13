public class StringLoops {

  public static String reverseCharacters(String word) {
    String result = "";
    for (int pos = word.length()-1; pos > -1; pos--) {
      result = result+word.substring(pos,pos+1);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(reverseCharacters("taco cat"));
    
  }
}