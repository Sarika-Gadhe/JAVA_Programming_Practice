import java.util.*;

class Program519
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll(" \\s+"," ");  
        
        String tokens[] = str.split(" " );

        System.out.println("Number of words are : "+tokens.length);

        

    }
}