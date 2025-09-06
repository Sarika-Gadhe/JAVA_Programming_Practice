// demo hello pune demo code hello india ppa lb
/*

        Hashmap
-----------------------------
    Key     Value
-----------------------------
    demo    2
    hello   3
    pune    1
    code    1
    india   1
    ppa     1
    lb      1

    Accept string
    Remove extra whitespace using trim
    Remove in between white space using replaceAll
    Tokenise the string using split
    create hashmp with string as key and int as value
    Travel Tokens array and update hashmap
    Travel hashmap and display result
 */

import java.util.*;

class Program524
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll(" \\s+"," ");  
        
        String tokens[] = str.split(" " );

        HashMap <String, Integer> hobj = new HashMap <String,Integer>();

        for(String s : tokens)
        {
            if(hobj.containsKey(s))
            {
                hobj.put(s,hobj.get(s)+1);
            }
            else
            {
                hobj.put(s,1);
            }
        }

        for(String s : hobj.keySet())
        {
            System.out.println(s+" : "+hobj.get(s));
        }

            
       

        

    }
}