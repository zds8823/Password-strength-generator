   //**************************************************************************
   //**************************************************************************
   //    Password.java                           Author: Eric Lavoie
   //                                                       100122593
   //  Generates long and short passwords for passwordTester and solves the 
   // the password dog and checks the amount of character possiblities 
   //**************************************************************************
   import java.util.Random;
   
   public class Password
   {
    //sets the global variables for chracters and a random variable
    private char variable1,variable2,variable3;
    private Random rand;

    public Password()
    {
     //initializes the random function
     rand = new Random();
     //resets everyhtime pasword is called on
     reset();
    }
    
     //creates a global reset  for all variables
    public void reset()
     {
      variable1 = 'a' - 1 ;// NEEDS - 1 for proper output not + 1 ?
      variable2 = 'a';//(char)('a' + 1) = 'b')
      variable3 = 'a';
     }
     
    //shortPassword returns 3 randomly generated lower case letters
    public String shortPassword()
    {
    //returns 3 generated characters within the 26 characters of the alphabet
    return Character.toString((char) (rand.nextInt(26) + variable1))
    + Character.toString((char) (rand.nextInt(26) + variable2))     
    + Character.toString((char) (rand.nextInt(26) + variable3));  
    }
    
 
  //solves why nextPassword = (???) 
   public String nextPassword()
   {
    //sets the first variable to a count
    variable1 = (char)(variable1 + 1);
    //loops from a + 1 to '}'  and stops once its done the alphabet
    if (variable1 == (char)('z' + 1 ))
    {
     //resets the char  value
     variable1 = 'a';
     //sets the second variable to a count
     variable2 = (char)(variable2 + 1);
     //loops variabl2  from a + 1 to '}'and stops once its done the alphabet
     if (variable2 == (char)('z' + 1 ))
     {
      //resets the char  val
      variable2 = 'a';
      //sets the third variable to a count
      variable3 = (char)(variable3 + 1);
       //loops variabl3  from a + 1 to '}'and stops once its done the alphabet
       if (variable3 == (char)('z'  + 1))
       {
        // looops the 3 variables untill password is solved
        variable1 = '?';
        variable2 = '?';
        variable3 = '?';
       }
     }
   }
    // returns 26 * 26 * 26 witch = 17576  for every possibility of 
    // three seperate variables  alphabets
    return Character.toString(variable3) + Character.toString(variable2) 
    + Character.toString(variable1);
  }
  
  
  //creates a password with 25 random characters
  public String longPassword()
  {
    //classes variables
    int count = 0, opt;
    String lPass = "";
    char temp = '?';
    
    
    //creates a loop untill count = 25
    while (count <= 25 + 1)
    {
     // gives the loop 3 options  
     opt = rand.nextInt(3)+1;
     // if option one then random number is generated
     if (opt == 1)
     {
      temp = (char) (rand.nextInt(10) + '0');
     }
     //if option two then random lower case is generated
     if (opt == 2)
     {    
      temp = (char) (rand.nextInt(26) + 'a');
     }
     //if option 3 then random capital letter is generated
     if (opt == 3){
      temp = (char) (rand.nextInt(26) + 'A');
     }
     //creates a count for the while loop
     count++;
     //every time and option is picked adds the char to the lpass string
     lPass = lPass + temp;
    }
      //returns long passsword
     return lPass;
    }
   }
