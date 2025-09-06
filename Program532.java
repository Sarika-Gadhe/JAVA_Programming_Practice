// abcdefg  hijk
// gfedcba kjih    - inplace reverse


import java.util.*;

class Program532
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll(" \\s+"," ");  
        
       String tokens[] = str.split(" ");

       StringBuilder sb = null;

       StringBuilder newstr = new StringBuilder();


       for(String s : tokens)
       {
            sb = new StringBuilder(s);
            (newstr.append(sb.reverse())).append(" ");    //newstr = newstr + sb.reverse();
            // newstr.append(" ");            
       }

       String finalstr = new String(newstr);
       System.out.println(finalstr);

    }
}