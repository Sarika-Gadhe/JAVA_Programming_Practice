// India is my contry

import java.util.*;

class Program508
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        char Arr[] = str.toCharArray();
        
        int iCount = 0, i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }

           
        }
         System.out.println("Numbers of words are : "+(iCount+1));

    }
}