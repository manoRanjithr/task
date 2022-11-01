package oct31;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of Array ");
		int len=input.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=input.nextInt();
		}
		int output[]=new int[len];
	for(int j=0;j<len;j++) {
		int sum=1;
		for(int i=0;i<len;i++) {
			if(i!=j)
			    sum*=arr[i];
		}
		output[j]=sum;
	}
	System.out.println(Arrays.toString(output));
	}

}
