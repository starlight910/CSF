import java.io.*;
import java.util.* ;

public class Anagram {
  static final int MAX_ANAGRAMLIST_SIZE = 10 ;
  private String key = null ;
  private String [] values = null ;
  
  public String sorted(String word) {
    values = new String [MAX_ANAGRAMLIST_SIZE] ;
    values [0] = word ;
    String sorted = computekey(word) ;
  
  public static String computeKey(String word) {
    word = word.toLowerCase();
    char[] characters = word.toCharArray() ;
    Arrays.sort(characters) ;
    return word ;
  }
  

    
      public String getKey(){
    return key ;
  }
  
  public int getValues(){
    return values ;
  }
    
    }