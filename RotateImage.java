//Left or Right Rotate nxn matrix , here test case n=3
import java.util.*;
import java.io.*;
import java.lang.*;

class RotateImage{

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    
    int n=3;
	
	int arr[][] = new int[n][n]; 
	

	
	System.out.println("Input your nxn matrix: ");
	
	for(int i=0; i<n ;i++)
	{   
        for (int j=0; j<n ;j++)
		{arr[i][j] = sc.nextInt();}
		
	}

	System.out.println("PRINTING INPUT");
	
		for(int i=0; i<n ;i++)
	{   
        for (int j=0; j<n ;j++)
		{System.out.print(arr[i][j]+" ");}
		System.out.print("\n");
	}
	
	System.out.println("Press 1 for right rotate and -1 for left rotate");
	
	int inputnum=sc.nextInt();
	
	if (inputnum==-1)
	{
		arr=reverse_cols(arr,n);
		arr=transpose_mat(arr,n);
	}
	else if (inputnum==1)
	{
		arr=transpose_mat(arr,n);
		arr=reverse_cols(arr,n);
		
	}
	else
	{System.out.println("WRONG INPUT!!");
    }
	
	
	System.out.println("PRINTING ROTATED OUTPUT");
	
		for(int i=0; i<n ;i++)
	{   
        for (int j=0; j<n ;j++)
		{System.out.print(arr[i][j]+" ");}
		System.out.print("\n");
	}
	
  }

  
   public static int[][] reverse_cols(int[][] array, int n) {
    
	int temp[] = new int[n]; 
	
	
	    for(int j=0; j<=n/2; j++)
		   {
			for (int i=0; i<n ;i++)
			{				
	        temp[i]=array[i][n-1-j];
            array[i][n-1-j]=array[i][j];
            array[i][j]=temp[i];
            }
		   }  
    return array;
   }
   
   public static int[][] transpose_mat(int[][] array, int n) {
    
	int temp_mat[][] = new int[n][n]; 
	
	
	    for(int i=0; i<n; i++)
		   {
			for (int j=0; j<n ;j++)
			{				
	        temp_mat[j][i]=array[i][j];
            
			}
		   } 
	
	
	
	
  
    return temp_mat;
   }
  
}