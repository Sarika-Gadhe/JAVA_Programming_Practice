// import java.util.*;          //generic import
import java.util.Scanner;       // specific import

import MarvellousLB.MarvellousString;

class Program213
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