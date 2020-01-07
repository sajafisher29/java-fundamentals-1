import java.time.LocalDateTime;

public class Main {
  public static void main(final String[] args) {
    System.out.println("Main method is working!");

    int dogCount = 1;
    int catCount = 2;
    int turtleCount = 0;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
    
    flipNHeads(1);
   Main object = new Main();
   object.getTime();
  }
  
  
  
  public static String pluralize(String word , int animal) {
    if ( animal > 1 || animal == 0) {
      return word + "s";
    } else {
      return word;
    }
  }
  
  public static void flipNHeads (int coin ) {
    int counter = 0;
    int heads = 0;
    int headsinarow = 0;

    while ( headsinarow < 2) {
      
      double count = Math.random();
      if ( count > .5) {
        headsinarow ++;
        heads ++;
        counter ++; 
      } else if ( count < .5) {
        headsinarow = 0;
        counter ++;
  
      }
    }
    System.out.println("It took" + " " + counter + " " + "flips to flip"  + " " + heads + " heads in a row");

    }


    private synchronized void getTime () {
    LocalDateTime now = LocalDateTime.now(); 
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
   
    
    while (true) {
			System.out.println(String.format("always running program ==> %d:%d:%d", hour, minute, second));
			try {
				this.wait(1000);
			} catch (InterruptedException e) {
 
				e.printStackTrace();
			}
		}


  } 
}



