import java.util.*;

class Number 
{
   public void SumFactors(int iNo)
   {
      int iCnt = 0;
      int iFSum = 0;
      int iNSum = 0;
      
      for(iCnt = 1; iCnt<=iNo; iCnt++)
      {
          if((iNo % iCnt) != 0)
          {
            iNSum = iNSum + iCnt;
            
          }
          else 
          {
             iFSum = iFSum + iCnt;
            
          }
      }
      System.out.println("Non factor sum is : "+iNSum);
       System.out.println("Factor sum is : "+iFSum);
   }
   
}

class Program64
{
  public static void main(String A[])
  {
      int iValue = 0;

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter number : ");
      iValue = sobj.nextInt();

      Number nobj = new Number();
      
      nobj.SumFactors(iValue); 
    

      
  }
}

