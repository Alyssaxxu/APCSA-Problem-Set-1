
/**
 * Write a description of class MySolutions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MySolutions{
 
    public void celsiusToFarenheit() {
       
       double celsius = 30.0; 
       double fahrenheit = celsius * 9 / 5 + 32;
       System.out.println(celsius + "C = " + fahrenheit + "F");
    }
    
    public void elapsedTime() {
        int hours= 10;
        int minutes = 33;
        int seconds= 45;
        double totalSeconds = hours * 60 * 60 + minutes * 60 + seconds;
        System.out.println( "The current time is " + hours + ":" + minutes + ":" + seconds + ". It has been " + totalSeconds + " seconds since the day began.");
        System.out.println("There are " + (864000-totalSeconds)  + " seconds left in the day.");
        System.out.println("The day is " + (totalSeconds/86400 * 100) + "% done.");
    }
    
    public void secondsToHMS() {
      int startingSeconds = 37840;
      int hours = startingSeconds / 3600;
      int remainingMinutes = startingSeconds%3600;
      int minutes = remainingMinutes/60;
      int remainingSeconds = minutes%60;
      int secondsLeft = remainingSeconds;
      
      System.out.println( startingSeconds + "= " + hours + " hours," + minutes + " minutes, and " + secondsLeft + " seconds.");
      
    }
}
