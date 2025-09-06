// abcdefg  hijk
// kjih gfedcba    - reverse


import java.util.*;

class Program529
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll(" \\s+"," ");  
        
       StringBuilder sb = new StringBuilder(str);

       sb.reverse();

       System.out.println(sb);

    }
}