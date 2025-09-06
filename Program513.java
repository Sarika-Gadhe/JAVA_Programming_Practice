import java.util.*;

class Program513
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        str.replaceAll("  "," ");  // specify more than one value its fails, ex - "  "= 2 white space

        System.out.println(str);

        

    }
}