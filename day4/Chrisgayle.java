import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class Chrisgayle {
    public static void main(String[] args)
    {     
    	int count=0;
    	int count2=0;
        // Creating an empty array list
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
         
        // add the values in Array List
        System.out.println("Enter the number of matches chris gayle played ");

        int n=sc.nextInt();
         System.out.println("Enter the score in each game : ");
        for(int i=0;i<n;i++)
        {
        	int p=sc.nextInt();
        	ar1.add(p);
        }

        for(int i=0;i<n;i++)
        { 
        if((100>ar1.get(i) ) && (ar1.get(i)>=50 ))
        {
        	count++;
        }
        else if(ar1.get(i)>=100)
        {
        	count2++;
        }
        else
        {
        	System.out.println("No half century and century");
        }
    }
System.out.println("Number of 50's "+ count);
System.out.println("Number of 100's "+count2);
}
}