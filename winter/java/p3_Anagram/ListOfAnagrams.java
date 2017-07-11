import java.io.* ;
import java.util.Scanner ;
import java.util.Arrays ;

public class ListOfAnagrams {
  
  public static String computeKey(String word) {
    word = word.toLowerCase();
    char[] chars = word.toCharArray();
    Arrays.sort(chars);
    String sorted = new String(chars);
    return sorted;
  }
  
  public static boolean checking(String word, String anagram) {
    for(int i = 0; i < MAX_ANAGRAMLIST_SIZE ; i++) {
      if(theArray[i].length() != anagram.length()) {
      return false ; 
    }
      
      
      
      
      
      
      
      
      
      
      
      
    char[] chars = word.toLowerCase().toCharArray();
    for(char c : chars) {
      int index = anagram.indexOf(c);
      if(index != -1) {
        anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
      }
  
 
  
  public static int wordFinderPutter(String filename){
   /*
    * This method counts all the words in the file
    */
    String usrWord = scnr.hasNext();
    String compareWord = usrWord.computeKey();
    int wordLength = compareWord.length();
    if (wordLength 
    File infile = new File(filename);
    try(Scanner input = new Scanner(new FileInputStream(filename))){
   
   while(input.hasNext()){
     input.next();
     counter++;
  
  public static void main (String[]args) {
   Scanner scnr = new Scanner(System.in);
   FileInputStream infile = null;
   Scanner fileInput = null;
   
   infile = new FileInputStream("dictionary.txt");
   fileInput = new Scanner(infile);
    
  }