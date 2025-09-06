// import java.util.*;          //generic import
import java.util.Scanner;       // specific import

class MarvellousString
{
    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();

        int iCount = 0 ,iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class Program210
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter string : ");
        String str = sobj.nextLine();

        MarvellousString mobj = new MarvellousString();
        
        int iRet = mobj.CountSmall(str);
        
        System.out.println("Number of small character are : "+iRet);

    }
}