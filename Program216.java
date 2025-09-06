//Input : HeLLo
//Output : #e##o
import java.util.Scanner;       


class Program216
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
       
        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        int iCnt = 0,iCount = 0;

        System.out.println("Enter the elemnts : ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array are : ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           System.out.println(Arr[iCnt]);
        }
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if((Arr[iCnt] % 2 )==0)
           {
             iCount++;
           }
          
        }
         System.out.println("Even Number "+iCount);

        Arr = null;
        sobj = null;


    }
}