// Cash Johnson 😈 
// 03162017

import java.io.IOException;
import java.util.*;

public class Runner
{
   public static void main(String[] args) throws IOException
   {
       
       Contacts cB = new Contacts();
       cB.addFromFile("people.txt");
       System.out.println(cB);
       
    }
}
