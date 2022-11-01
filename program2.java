package oct31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class program2 {
static ArrayList<ArrayList<Integer>>check=new ArrayList<>();
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of Array ");
		int len=input.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=input.nextInt();
		}
		ArrayList<ArrayList<Integer>> output=new ArrayList<>();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				for(int k=j+1;k<len;k++) {
					if(i!=j&&i!=k&&j!=k) {
						if(arr[i]+arr[j]+arr[k]==0) {
							ArrayList temp=new ArrayList(List.of(arr[i],arr[j],arr[k]));
							Collections.sort(temp);
							if(!check(temp)) {
								output.add(new ArrayList(List.of(arr[i],arr[j],arr[k])));
							}
							check.add(temp);
						}
					}
				}
			}
		}
		//-1 0 1 2 -1 4
System.out.println(output);
	}
	private static boolean check(ArrayList temp) {
		return check.contains(temp);
	}
	

}
