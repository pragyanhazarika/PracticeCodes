
import java.util.*;
import java.io.*;
import java.lang.*;

class ReverseArray {

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    double arr[] = new double[100]; 
	String temp=new String();
	int flag = 0;
	int size = 0;
	
	System.out.println("Input your values in order, input a non numeric value to end the program: ");
	for(int i=0; flag==0 ;i++)
	{   
        
		
		temp = sc.next();
		
		if(isNumerical(temp))
		{
			arr[i] = Double.parseDouble(temp);
		}
		else if(isNumerical(temp) == false || i>100)
		{
			size = i-1;
			flag=1;
		}

	}

    //keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    //keyboard	
	for(int i = 0; i<=size; i++)
	{
		System.out.print(arr[i] + ", ");
	}
	
    System.out.println("");
    System.out.println("ALMOST DONE!");
	
	
    //System.out.flush();        
    //inputLine = keyboard.readLine();

     //System.out.println(inputLine);
    
	
    //char temp;	
	int n;
	n=size;
    double temp1;

         for(int i=0; i<=n/2; i++){
			    temp1=arr[n-i];
                arr[n-i]=arr[i];
               arr[i]=temp1;
              
         }
	
	
	for(int i = 0; i<=size; i++)
	{
		System.out.print(arr[i] + ", ");
	}
	
    System.out.println("");
    System.out.println("DONE!");
	
	}
  
	public static boolean isNumerical(String s) {
		boolean isNumeric = false;
		try
		{
			double d = Double.parseDouble(s);
 
			// s is a valid integer
 
			isNumeric = true;
		}
		catch (NumberFormatException ex)
		{
			// s is not an integer
		}
 
		return isNumeric;
	}
}