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

public class  Anagram{
  
  
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
  public static boolean compare(String word1, String filename, String filename2){
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
  
  
  
  
  
  
  
  public static void PrintAnagram(String word){
    
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