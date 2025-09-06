import java.util.*;

class Program522
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll(" \\s+"," ");  
        
        String tokens[] = str.split(" " );

        int i = 0;

        int imax = 0;
        String Maxstr = null;
        
        for(i = 0; i < tokens.length; i++)
        {
            if(imax < tokens[i].length())
            {
                imax = tokens[i].length();
                Maxstr = tokens[i];

            }

            
        }
        System.out.println("Maximum word is  : " +Maxstr+" Having length is "+imax);
       

        

    }
}