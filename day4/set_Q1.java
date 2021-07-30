import java.io.*;
import java.util.*;

public class set_Q1
{
    public static void main(String[] args)
    {
		HashSet<String> set = new HashSet<String>();      
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        for(int i = 0; i < no; i++)
		{
            String str = scan.next();
            set.add(str);
        }
		
		System.out.println("No. of distinct players: " +set.size());
		
	}
}
