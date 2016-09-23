

import java.io.*;


class ReverseSentence {

  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter a sentence: ");
    System.out.flush();        
    inputLine = keyboard.readLine();

	String s;
	s=inputLine;
	
	int idx[] = new int[20];
     idx[0]=-1;
     	 
	int count=1;
	for (int i=0;i<s.length();i++){
	
	if (s.charAt(i)==' '){
	idx[count]=i;
	
	System.out.println(idx[count]);
	count++;
	}

	}
	
	 idx[count]=s.length();
	System.out.println(count);
	String str=new String();
	for (int i=count-1;i>=0;i--)
	{
    str=str+s.substring(idx[i]+1,idx[i+1])+" ";
	
	
  }
	
	
	System.out.print(str);
	
	
  }
}