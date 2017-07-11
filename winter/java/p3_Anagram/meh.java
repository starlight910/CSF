import java.io.* ;
import java.util.Scanner ;
import java.util.Arrays ;

public class ListOfAnagrams {
  public static 
    
  Scanner wbwgiwr = new scanner
    
    inputword = scaaner next.()
    
    lowercase
    sort
    
    lengthfind
    
    call the txt file
    sort
    
    int(txt file line. length)
    
    if txtfile legth = word.length
    for i
    if char[i] = txt.char[i]
    store in array
    
    call arrays
    

/* Anagram Project
 * Computer Science Foundation Winter 2017 
 * Authors:
 * Tim Aston
 * Jun Ho Lim
 * Justin Speer
 */
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

/*
 * What this program does is takes words from a file
 * Gets the ammount of words
 * each word is made lowercase and sorted alphabetically
 * then compared to the 2nd file
 * all instances that match that word are printed out.
 */ 

public class  ListOfAnagrams{
  static final int MAX_ANAGRAMLIST_SIZE = 10 ;
  private String key = null ;
  private String [] values = null ;
  
  // store word
  public ListOfAnagrams(String word) {
    values= new String [MAX_ANAGRAMLIST_SIZE] ;
    values [0] = word ;
  }
  /*
  public static String Cleam(String word){
    //InputStreamReader input = new InputStreamReader;
    //works

    char[] characters = word.toCharArray();
    Arrays.sort(characters);
    String sorted = new String(characters);
    
   return sorted;
  }
  */
  public static String computeKey(String word) {
    word = word.toLowerCase();
    char[] characters = word.toCharArray() ;
    Arrays.sort(characters) ;
    return "" ;
  }
  
  public static int countWords(String filename){
   /*
    * This method counts all the words in the file
    */
    int counter = 0;
    File infile = new File(filename);
    try(Scanner input = new Scanner(new FileInputStream(filename))){
   
   while(input.hasNext()){
     input.next();
     counter++;
     //System.out.println(counter);
     //System.out.println("Im running on energizer batteries");
     }
   
    }catch (IOException excpt){
      System.out.println("Caught IOException: " + excpt.getMessage());
    }
   return counter;
  }
  
  
  
  static String[] createDictionary(String filename){
    
  }
  
  
  
  static int findAnagram(String word){  //returns the index if found and -1 if not
  
  
  }
  
  
  static void addAnagram(Anagram gram){
    
  }
  
  //***********************This method will remove spaces and make everything lowercase**********************
  public static String cleanup(String word){
    //InputStreamReader input = new InputStreamReader;
    word = word.toLowerCase(); //works

    char[] chars = word.toCharArray();
    Arrays.sort(chars);
    String sorted = new String(chars);
    
   return sorted;
  }
  
  
  
  
  
  
  
  
  // *************This method will compare the words to check if they are a match ********************
  public static boolean compare(String word, String filename){
    File infile = new File(filename);
    try(Scanner input = new Scanner(new FileInputStream(filename))){
   
   while(input.hasNext()){
     input.next();
     
                         }
    }catch (IOException excpt){
      System.out.println("Caught IOException: " + excpt.getMessage());
    }
    
   return false;
  }
  
  
  
  
  
  
  //
  public static void printAnagrams(){
    
  }
  

  
  // in the main method we 
  public static void main(String[]args){
    
  System.out.println("Enter the name of the file"); 
  
  Scanner input = new Scanner(System.in);
  
  String filename = input.next();
  
  int num = countWords(filename);
  
  System.out.println(cleanup(cleanup(filename)));
    
  }
  
  
  
}