import java.util.ArrayList;
import java.util.Collections;
 import java.util.*;
import java.util.Scanner;
public class Swaplist {
 
    public static void main(String a[])
    {
 
        // Create the Array List
        ArrayList<String> ArrList = new ArrayList<String>();
         Scanner sc = new Scanner(System.in);
         
        // add the values in Array List
        System.out.println("Enter the Top 5 predicted teams names: ");

        for(int i=0;i<5;i++)
        {
            String ans = sc.nextLine();
        ArrList.add(ans);
        }


        // display Array List before swap
        System.out.println("Enter the two swap positions");
         int n=sc.nextInt();
         int p=sc.nextInt();
        
        // Swapping the elements at 1 and 2 indices
        Collections.swap(ArrList, n, p);
         System.out.println("The Final top 5 teams after the swap is:");
        System.out.println(ArrList);
    }
}
 