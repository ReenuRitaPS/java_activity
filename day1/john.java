import java.util.*;
import java.util.Scanner;
public class Main
{
public static void main(String[] args)  
{  
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
n=sc.nextInt(); 
if (n < 0)
{
    System.out.println("invalid  ");
    
}
//creates an array in the memory of length 10  
int[] arr = new int[10]; 
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
  

//reading array elements from the user   
arr[i]=sc.nextInt();  

 if(arr[i] < 0)
 {
     System.out.print("invalid input \n"); 
     break;
 }
}

 int c=sumprimearray(arr,n);

System.out.println("the sum is " + c);
  sumprimearray(arr,n);
 
 }
 
    public static int sumprimearray(int[] arr, int n)
    {
    	int sum=0;
    	for (int i = 0; i < n; i++) {
            int j = 2;
            int p = 1;
            if(arr[i]== 1)
            {
                p=0;
            }
            while (j < arr[i]) {
                if (arr[i] % j == 0) {
                    p = 0;
                    break;
                }
                j++;
            }
            if (p == 1) {
                sum= sum + arr[i];
            }
            
            
        }

        return sum;
    }
}
