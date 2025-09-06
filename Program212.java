// import java.util.*;          //generic import
import java.util.Scanner;       // specific import

class MarvellousString
{
    public String str;

    public MarvellousString(String a)
    {
        this.str = a;
    }
    public int CountSmall()
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
class Program212
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter string : ");
        String data = sobj.nextLine();

        MarvellousString mobj = new MarvellousString(data);

        mobj.str = data;
        int iRet = 0;
       
        
        iRet = mobj.CountSmall();
        
        System.out.println("Number of small character are : "+iRet);

    }
}