/* Car Porject
 * Authors Tim Aston, Jun Ho Lim
 * CSF Winter 2017
 * Project 2
 */
public class Car {
  private int position ;
  private int gas ;
  private int distance ;
  
  public Car(int p, int g, int d) { 

    this.position = p ;
    this.gas = g ;
    this.distance = d ;
  }
  
  public int getPosition(){
    return this.position ;
  }
  
  public int getGas(){
    return this.gas ;
  }
  
  public int getDistance(){
    return this.distance ;
    
  }


  //Print out all the data
  public String toString(){
    return "" ; //" Position: " + this.position + " Gas: " + this.gas + " Distance: " + this.distance ;
  }

}