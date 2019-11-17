//Jacob Gaylord
//jigaylord16@ole.augie.edu
//Demo.java
import java.util.Scanner;
public class Demo
{
	public static void main(String[] args)
	{
   		double[][] arr=new double[3][3];
			Scanner f=new Scanner(System.in);
			for(int i=0;i<arr.length;++i)
			{
				System.out.printf("Enter 3 doubles seperated by WS: ");
					ArrayMethods.doubleRead(arr[i], f);
			}
			System.out.println("Your doubles are: ");
			for(int i=0;i<arr.length;++i)
	    {
	      	ArrayMethods.doublePrint(arr[i]);
	    }
			double maxValue=0.0;
			for(int i=0;i<arr.length;++i)
				for(int j=0;j<arr[i].length;++j)
					if(ArrayMethods.doubleMax(arr[i])>maxValue)
						maxValue=ArrayMethods.doubleMax(arr[i]);
			System.out.printf("Max value is %.2f\n", maxValue);
	}
}
