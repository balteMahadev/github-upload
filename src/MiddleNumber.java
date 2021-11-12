

import java.util.Scanner;

public class MiddleNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the numbers:");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++)
		{
			int element = arr[i];
			int number = element;
			int lastnum = element / 10;
			int midnum = lastnum % 10;
			if(number>99 && number<1000)
			{
				if(midnum % 3 == 0 && midnum!=0)
				{
					System.out.println(number+" it's Middle number is "+midnum+" is divisible by 3");
				}
			}
			else {
				System.out.println("Invalid number:");
				
			}
		}
		
	}

}
