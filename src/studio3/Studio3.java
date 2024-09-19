package studio3;

import java.util.Scanner;

public class Studio3  {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);{
			int lowerbound=2;
			System.out.println("Please select the upper bound for your range");
			int UpperBound=in.nextInt();

			System.out.println("Your range is:  " + lowerbound + " to " + UpperBound);


			boolean[]a = new boolean[UpperBound];
			System.out.println(a[UpperBound-2]);
			for (int i = 0; i < UpperBound+1; i++) {
				a[i] = true; 
				int b = i++; 
			for (int j = (i^2)+(b)){
			

			}




		}}}

