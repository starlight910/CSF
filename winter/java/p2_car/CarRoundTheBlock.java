/* Car Porject
 * Authors Tim Aston, Jun Ho Lim
 * CSF Winter 2017
 * Project 2
 */
//java.lang.ArrayIndexOutOfBoundsException: -1
import java.util.Scanner ;



public class CarRoundTheBlock {
  
 
  
  public static boolean checkWinner(Car[] carData, Car car, int firstPos, int currentPos, int remainingGas, int carsOnRoad) {
  if (car.getGas() >= car.getDistance()) {
    if(currentPos == firstPos) {
      return true;
    } else {
      remainingGas = remainingGas + (car.getGas() - car.getDistance());
      //Car nextCar = nextCar(carData, currentPos, carsOnRoad);
      checkWinner(carData, car, firstPos, currentPos, remainingGas, carsOnRoad);
      System.out.println(currentPos);
    }
  }
  
  return false;
}
  
   public static int findTheWinner (Car carData[ ], int carsOnRoad) {
     for(int i = 0; i < carsOnRoad; i++) {
      if (checkWinner(carData, carData[i], i, i, carData[i].getGas(), carsOnRoad)) {
        return i;
      }/*
      else{
        System.out.println("Not enough gas for full circle");
      }*/
       }
    
    return carsOnRoad + 1;
  }
  
  
  /*public static int findTheWinner (Car carData[ ], int carsOnRoad) {
    int position = 0;
    int winner = 0;
    for(int j = 0;j<carsOnRoad;j++){
      int gas = carData[j].getGas() - carData[j].getDistance();
      if(checkWinner(carData, carData[position], position, j, gas, carsOnRoad) == true){
        winner = j;
        break;
      }
      else{
        position++;
      }
      }
      
      
      
      
      if(carData[position].getGas() >= carData[position].getDistance()){
        int gas = carData[position].getGas();
        int distance = carData[position].getDistance();
        int i=position+1;
        int score = 0;
           while(i!=position){
             if((gas + nextCar(carData, position, carsOnRoad).getGas() - distance + nextCar(carData, position, carsOnRoad).getGas())>=0){ 
              position = (position+1)%carsOnRoad;
              score++;
              if(score==carsOnRoad){
                winner = position;
                break;
             }
             else{
               break;}
           }
      }
    }
return winner;
  }
      /*if(winner>=carsOnRoad){
        log(carData, carsOnRoad, winner);
                             }
      else{
        System.out.println("Not enough gas for full circle");
           }*/
    
  
  
  public static int fillCarArray (Car cars [ ], int maxsize) {
   Scanner input = new Scanner(System.in);
    

   int position = 0 ;
   int gas = 0;
   int distance = 0;
   int temp = 75;
   while(position<99){
    temp = input.nextInt();
    if(temp<0)
    {
      /*if(position == 0) {
      System.out.println("No cars, no winner to be found") ;
    }*/
      break;
      }
    gas = temp;
    temp = input.nextInt();
    if(temp<0){
      break;}
    distance = temp;
    Car newCar = new Car (position , gas , distance) ;
         cars[position] = newCar ;
    System.out.println(newCar);
    position++;
   }
   int carsroad = (position);
  return carsroad;
  }
  
  public static void printCarArray (Car carData [ ], int carsOnRoad) {
    System.out.println("Number of cars on the road: " + carsOnRoad);
    for(int j=0; j < carsOnRoad; j++){
      System.out.println("car #" + carData[j].getPosition() + " has gas enough for " + carData[j].getGas() + " miles, distance to neighbor " + carData[j].getDistance() + " miles"); 
  }
  }
    public static void log (Car carData[ ], int carsOnRoad, int position) {

    int i = position;
    int gas = carData[position].getGas();
    int distance = carData[position].getDistance();
    int totaldistance = distance;
    
    if(carsOnRoad==1 && (gas-distance)>=0){
      int left = gas-distance;
      System.out.println("This car can move the whole distance with gas left for "+ left + " more miles.");
    }
    else{
    System.out.println("Starting driving log");
    System.out.println("Begin at position " + position + " gas " + carData[position].getGas() + " distance " + carData[position].getDistance());
    i = (i + 1)%carsOnRoad;
    if(carsOnRoad>1){
    while(i!=position){
      gas -= distance;
      System.out.println("Got to position " + i +", "+ gas + " miles gas left, " + totaldistance + " miles distance traveled");
      gas = gas + carData[i].getGas();
      System.out.println("Getting " + carData[i].getGas() + " miles worth of gas, now have " + gas + " miles worth, starting next leg");
      totaldistance += carData[i].getDistance();
      distance = carData[i].getDistance();
      i = (i +1)%carsOnRoad;
    } 
    }
    gas -= distance;
    System.out.println("Finished driving, drove " + totaldistance + " miles, gas left " + gas + " miles worth");
    }
    return;
  }
    
 /* public static void log (Car carData[ ], int carsOnRoad, int position) {
    int i = position + 1;
    int gas = carData[position].getGas();
    //int distance = carData[position].getDistance();
    int totaldistance = 0;
    System.out.println("Begin at position "+carData[position].getPosition()+ " gas " + carData[position].getGas()+" distance "+carData[position].getDistance());
    while(i!=position){
      //our gas left after driving
      gas = gas - carData[i-1].getDistance();

      //distance = distance - distance
      //total distance added up for all travel.
      totaldistance = totaldistance + carData[i-1].getDistance();

      
      System.out.println("Got to position " + i%carsOnRoad +", "+ gas + " miles gas  left, " + totaldistance + " miles distance travelled");
      //works until here
      
      gas = gas + carData[i%carsOnRoad].getGas();
      
//distance = distance + carData[i].getDistance()
      System.out.println("Getting " + carData[i%carsOnRoad].getGas() + " miles worth of gas, now have " + gas + " miles worth, starting next leg");
        i = (i+1)%carsOnRoad ;
        
    }
    gas = gas - carData[i-1].getDistance();
    totaldistance = totaldistance + carData[i-1].getDistance();
    System.out.println("Finished driving, drove " + totaldistance + " miles, gas left " + gas +" miles worth");
    return;
  }*/
  
  public static Car nextCar ( Car carData[ ], int currentPosition, int carsOnRoad) {

    
    return carData[(currentPosition+1)%carsOnRoad];
  }
  
   public static void main(String[] args) {
   final int maxSize = 99;  
   Car[] carData = new Car[maxSize];
   
   int carsOnRoad = fillCarArray(carData, maxSize);
   if(carsOnRoad<=0){
   System.out.println("No cars, no winner to be found");
   }
   else{
   printCarArray(carData, carsOnRoad);
   int winner = findTheWinner(carData, carsOnRoad);
    
   if(winner<carsOnRoad){
     System.out.println("The winner is car # " + winner);
     log(carData, carsOnRoad, winner);
   }
   else{
     System.out.println("Not enough gas for full circle");
   }
   }

 }
}