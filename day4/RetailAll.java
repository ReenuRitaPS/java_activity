import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class RetailAll {
    public static void main(String[] args)
    {
        // Creating an empty array list
        ArrayList<String> arr1 = new ArrayList<String>();
  
        Scanner sc = new Scanner(System.in);
         
        // add the values in Array List
        System.out.println("Enter the top 5 scorers of IPL Season 13: ");

        for(int i=0;i<5;i++)
        {
            String str1 = sc.nextLine();
        arr1.add(str1);
        }

        // Creating another array list
        ArrayList<String> arr2 = new ArrayList<String>();
  
        System.out.println("Enter the top 5 scorers of IPL Season 12: ");
          
          for(int i=0;i<5;i++)
        {
            String str2 = sc.nextLine();
        arr2.add(str2);
        }
        
  
        // Apply retainAll() method to boxes passing bags as parameter
        arr1.retainAll(arr2);
  
        // Displaying both the lists after operation
        System.out.println("Common best players in both the team are ");

          System.out.println(arr1);
          
        
    }
}