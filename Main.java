
import java.util.Random;

class Main {
  public static void main(String[] args) {
    
    Random r_obj = new Random();
    int randomNum = r_obj.nextInt(51);
    System.out.println("The Random number is: " + randomNum + " ");

    int i = randomNum;
    while(i >= 0 )
    {
      System.out.println(i);
      i--;
    }

    if(randomNum <= 5) {
      System.out.println("Ahoy mateys!");
    }
    else if(randomNum > 25 && randomNum < 42) {
      System.out.println("Cannonball!");
    }
    else {
      System.out.println("Blast off!");
    }
  }
}