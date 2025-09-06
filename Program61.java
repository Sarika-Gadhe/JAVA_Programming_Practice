import java.util.*;

class Number 
{
   public int SumFactors(int iNo)
   {
      int iCnt = 0;
      int iSum = 0;

      for(iCnt = 1; iCnt<=(iNo/2); iCnt++)
      {
          if((iNo % iCnt) == 0)
          {
            iSum = iSum + iCnt;
          }
      }
      return iSum;
     
   }
   
}

class Program60
{
  public static void main(String A[])
  {
      int iValue = 0;

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter number : ");
      iValue = sobj.nextInt();

      Number nobj = new Number();
     

      int iRet = nobj.SumFactors(iValue);

      System.out.println("Summention of factors is : "+iRet);
      
  }
}

