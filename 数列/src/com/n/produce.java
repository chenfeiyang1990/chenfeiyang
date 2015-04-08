package com.n;

import java.util.Scanner;

public class produce {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=1;i<=N;i++)
		{
			if(i%2==0)
			{
				System.out.printf("%4d",i);
			}
		}
	}
}