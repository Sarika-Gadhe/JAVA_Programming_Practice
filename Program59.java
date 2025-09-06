import java.util.*;

class Number 
{
   public boolean CheckEven(int iNo)
   {
      
          if((iNo % 2) == 0)
          {
            return true;
          }
          else
          {
            return false;
          }
      
     
   }
   
}

class Program59
{
  public static void main(String A[])
  {
      int iValue = 0;
      boolean bRet = false;

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter number : ");
      iValue = sobj.nextInt();

      Number nobj = new Number();

      bRet = nobj.CheckEven(iValue);

      if(bRet == true)
      {
         System.out.println(iValue + " is Even");
      }
      else
      {
         System.out.println(iValue + " is Odd");
      }
      
      
  }
}

