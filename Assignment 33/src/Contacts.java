// Cash Johnson 🚀
// 03162017
import java.util.*;
import java.io.*;

public class Contacts
{
    public List<Person> cont;

    public Contacts()
    {
        cont = new ArrayList<Person>();

    }

    public void addPerson(String na, String nu, String em)
    {
        cont.add(new Person(na, nu, em));

        sortContacts();

    }
    //insertion
    private void sortContacts()
    {
        Person temp;

        for (int i = 1; i < cont.size(); i++) 
        {
            for(int j = i; j > 0; j--)
            {
                if(cont.get(j).getName().compareTo(cont.get(j-1).getName()) == -1)//abc by name   
                {
                    temp = cont.get(j);
                    cont.remove(j);
                    cont.add(j, cont.get(j-1));
                    cont.add((j-1), temp);
                }
            }
        }
    }

    public Person getContact(String n)
    {
        int start = 0;
        int end = cont.size() - 1;

        while (start <= end) 
        {
            int m = (start + end) / 2;
            if (n.compareTo(cont.get(m).getName()) == 0) 
            {
                return cont.get(m);
            }

            if (n.compareTo(cont.get(m).getName()) == -1)
            {
                end = m - 1;
            }

            else 
            {
                start = m + 1;
            }
        }

        return null;
    }

    public void addFromFile(String file) throws IOException
    {
        Scanner fileScanner = new Scanner(new File(file));

        while(fileScanner.hasNext())
        {
            String line = fileScanner.nextLine();
            cont.add(new Person(grabName(line), grabNum(line), grabEmail(line)));

        }
        
        fileScanner.close();
        
        sortContacts();
    }
    
    private String grabName(String line)
    {
       return line.substring(0, line.indexOf(",") );
        
    }
    private String grabNum(String line)
    {
         return line.substring(line.indexOf(",") + 2, line.indexOf("," , line.indexOf(",") +2) -2);
    }
    private String grabEmail(String line)
    {
             return line.substring(line.indexOf("," , line.indexOf(",") +2) +2, line.length());
    }
    
    @Override
    public String toString()
    {
        String list = "";
        for(Person per: cont)
        {
            list += per.getName() + ", " + 
            		per.getNumber() + ", " + 
            		per.getEmail() + "\n";
        }
        
        return list;
    }
}
