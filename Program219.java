//Input : HeLLo
//Output : #e##o
import java.util.Scanner;       

class NNumberX
{
    public int Arr[];

    public NNumberX(int iSize)
    {
        Arr = new int[iSize];             //Resource allocation //resource = Arr
    }

    public void Accept()
    {
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elemnts : ");
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            this.Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements of the array are : ");
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
           System.out.println(this.Arr[iCnt]);
        }
    }

    public int CountEven()
    {
        int iCnt = 0,iCount = 0;

         for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if((Arr[iCnt] % 2 )==0)
           {
             iCount++;
           }
          
        }
        return iCount;
    }   
}
class Program219
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
       
        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();
        
        NNumberX nobj = new NNumberX(iSize);

        nobj.Accept();

        nobj.Display();

        int iRet = 0;

        iRet = nobj.CountEven();

        System.out.println("Number  of even element are : "+iRet);
        
        sobj = null;


    }
}