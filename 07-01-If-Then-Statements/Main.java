// When you are ready to run unit tests, change the value below from N to Y
// ReadyForSubmission=N

class Main 
{
  public static void main(String[] args) 
  {
    
    //This variable will be passed into the checkLightColor method to be evaluated.
    char lightColor = 'g';
    
    //Call for checkLightColor method.
    checkLightColor(lightColor);
    
    
  }
  
  //This is the checkLightColor(char) method that takes a char 
  //variable called color as a parameter. 
  public static void checkLightColor(char color)
  {
    
    //Here is your first if-then statement completed! 
    if (color == 'y')
    {
      System.out.println("Slow down!");
    }

    if (color == 'r')
    {
      System.out.println("STOP!");
    }

    if (color == 'g')
    {
      System.out.println("Put the pedal to the metal!");
    }
    //Now create two more for red and green lights.
    //Create the next if-then statement here!
    
    
    
    
  }
}