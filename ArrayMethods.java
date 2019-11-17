//Jacob Gaylord
//jigaylord16@ole.augie.edu
//ArrayMethods.java
import java.util.Scanner;
public class ArrayMethods
{
	//Return:	The max value in arr (int)
  public static int max(int[] arr)
  {
   	int result=arr[0];
		for (int j=1; j< arr.length; ++j)
		  if (arr[j]>result) result =arr[j];
	  return result;
  }
  //Return:	The max value in arr (double)
  public static double doubleMax(double[] arr)
  {
   	double result=arr[0];
		for (int j=1; j< arr.length; ++j)
		  if (arr[j]>result) result =arr[j];
	  return result;
  }
	//Pre:	f has arr.length integers separated by white space
	//Post:	arr.length integers read from f and filled arr[0]..arr[arr.lnegth-1]
  public static void read(int[] arr, Scanner f)
  {
		for (int j=0; j< arr.length; ++j)
		arr[j]=f.nextInt();
  }
  //Pre:	f has arr.length doubles separated by white space
	//Post:	arr.length doubles read from f and filled arr[0]..arr[arr.lnegth-1]
  public static void doubleRead(double[] arr, Scanner f)
  {
		for (int j=0; j< arr.length; ++j)
		arr[j]=f.nextDouble();
  }
	//Post:	arr[0]..arr[arr.lnegth-1] printed on the screen all on 1 line separated by blanks (int)
  public static void print(int[] arr)
  {
		for (int j=0; j< arr.length; ++j)
		  System.out.print(arr[j]+ " ");
	  System.out.println();
  }
  //Post:	arr[0]..arr[arr.lnegth-1] printed on the screen all on 1 line separated by blanks (double)
  public static void doublePrint(double[] arr)
  {
  for (int j=0; j< arr.length; ++j)
    System.out.printf("%.2f ",arr[j]);
  System.out.println();
  }
}
