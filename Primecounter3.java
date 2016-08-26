import java.util.Scanner;
public class Primecounter3
{ //This program will print out all prime numbers up to the given number
  public static void main(String []args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("This program will print out all prime numbers up to this number");
    
    int inputnumber = in.nextInt();
    int currentnumber = 2;  //this number will be incremented
  
    while (currentnumber < inputnumber)
    {
      if (currentnumber % 2 > 0) //this checks to see if its not divisible by 2
      {
        if (currentnumber % 3 > 0) //if number is not divisible by 3 
        {
          if (currentnumber % 5 > 0)// not divisible by 5
          {
            if (currentnumber % 7 > 0)//not divisible by 7
            {
        System.out.println(currentnumber);
        }
       }
      }
     }
      if (currentnumber == 2) {System.out.println("2");}
      if (currentnumber == 3) {System.out.println("3");}
      if (currentnumber == 5) {System.out.println("5");}
      if (currentnumber == 7) {System.out.println("7");}
        
   
      currentnumber++;
    }
  }
}


        
      
      
    
    
    