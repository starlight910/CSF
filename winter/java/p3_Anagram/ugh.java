public class  ListOfAnagrams{
  static final int MAX_ANAGRAMLIST_SIZE = 10 ;
  private String key = null ;
  private String [] values = null ;
  
  // store word
  public ListOfAnagrams(String word) {
    values= new String [MAX_ANAGRAMLIST_SIZE] ;
    values [0] = word ;
  }
  
  public static String computeKey(String word) {
    word = word.toLowerCase();
    char[] characters = word.toCharArray() ;
    Arrays.sort(characters) ;
    return "" ;
  }
  public String getKey(){
    return key ;
  }
  
  public int getValues(){
    return values ;
  }
}

/*
public class Anagram {
  static final int MMAx
  private String array ; ;
  private String key ;
  private String word ;
  
  public Car(String a, String k, String w) { 
    this.array = a ;
    this.key = k ;
    this.word = w ;
  }
  
  public String getArray(){
    return this.array ;
  }
  
  public int getKey(){
    return this.key ;
  }
  
  public int getDistance(){
    return this.distance ;
    
  }

  //Print out all the data
  public String toString(){
    return "" ;
  }
*/  

  
/////////// POOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOP
  
}