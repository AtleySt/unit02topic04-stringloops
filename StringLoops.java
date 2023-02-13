import java.util.Arrays;

public class StringLoops {

  public static String reverseCharacters(String word) {
    String result = "";
    for (int pos = word.length()-1; pos > -1; pos--) {
      result = result+word.substring(pos,pos+1);
    }
    return result;
  }

  public static int[] indexesOfAll(String text, String searchTerm) {
    int searchTermCount = 0;
    for (int pos = 0; pos < text.length(); pos++) {
      if (text.substring(pos,pos+1).equals(searchTerm)) {
        searchTermCount++;
      }
    }
    int[] result = new int[searchTermCount];
    int count = 0;
    for (int pos = 0; pos < text.length(); pos++) {
      if (text.substring(pos,pos+1).equals(searchTerm)) {
        result[count] = pos;
        count++;
      }
    }
    return result;
  }

  public static boolean hasRepeatedConsecutives(String word) {
    for (int pos = 1; pos < word.length(); pos++) {
      if (word.substring(pos,pos+1).equals(word.substring(pos-1,pos))) {
        return true;
      }
    }
    return false;
  }


  public static void main(String[] args) {
    //System.out.println(reverseCharacters("taco cat"));
    System.out.println(Arrays.toString(indexesOfAll("attack", "b")));
    //System.out.println(hasRepeatedConsecutives("rook"));
  }
}