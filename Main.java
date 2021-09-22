import java.util.Random;
class Main {
  public static void main(String[] args) {

    Random r = new Random();
    int randomInt = r.nextInt(50);
    System.out.println("The Random number is: " + randomInt);
    if(randomInt > 0){
      while (randomInt != 0){
        System.out.println(randomInt);
        randomInt--;
      }
    }
    else if(randomInt < 5){
      System.out.println("Ahoy mateys!");
    }
    else if(randomInt > 25 && randomInt < 42){
      System.out.println("Cannon Ball!");
    }
    else { 
      while(randomInt != 0){
        System.out.println(randomInt);
          randomInt++;
         }
    }   
    System.out.println("Blast off");
  }
}