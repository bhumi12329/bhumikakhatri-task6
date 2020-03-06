package Collection;

import java.io.IOException;
import java.util.*;
import java.lang.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CustomArrayList {
	public static int n;
    
	class Data
	{
	    int roll; 
        String name; 
        int marks; 
        long phone; 
     
    	Data(int roll, String name, int marks, long phone) 
         { 
            
             this.roll = roll; 
             this.name = name; 
             this.marks = marks; 
             this.phone = phone; 
         } 
	}
    	 public static void main(String args[]) throws IOException
    	    { 
    		     Scanner sc=new Scanner(System.in);   
    	        System.out.println("Enter the no of data");
    	        n=sc.nextInt();
    	        int roll[] = new int[n]; 
    	        String name[] = new String[n];
    	        int marks[] = new int[n]; 
    	        long phone[] = new long[n];
    	        for(int i=0;i<n;i++)
    	        {
    	        System.out.println("enter the rollno");
    	        roll[i]=sc.nextInt();
    	        System.out.println("enter the Name");
    	        name[i]=sc.next();
    	        System.out.println("enter the marks");
    	        marks[i]=sc.nextInt();
    	        System.out.println("enter the phone");
    	        phone[i]=sc.nextLong();
    	        }
    	        CustomArrayList custom = new CustomArrayList(); 
    	        custom.addValues(roll, name, marks, phone); 
    	        
    	    }
	     
		public void addValues(int[] roll, String[] name, int[] marks, long[] phone) {
			ArrayList<Data> list=new ArrayList<>(10); 
			  
	        for (int i = 0; i < n; i++) 
	        { 
	            
	            list.add(new Data(roll[i], name[i], marks[i], 
	                                              phone[i])); 
	        } 
	  
	       
	        printValues(list); 
	        //list.remove(0);
	      //  System.out.println("After removing");
	       // printValues(list); 
	        
			
		}
		public void printValues(ArrayList<Data> list) {
			System.out.println("Print the data");
			 for (int i = 0; i < n; i++) 
		        { 
		            Data data = list.get(i); 
		            System.out.println(data.roll+" "+data.name+" "
		                               +data.marks+" "+data.phone); 
		        } 
			
		} 
	}
