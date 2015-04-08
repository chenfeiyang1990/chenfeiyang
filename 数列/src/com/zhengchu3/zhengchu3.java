package com.zhengchu3;

import java.util.Scanner;

public class zhengchu3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=1;i<=N;i++)
			if(i%2==0)
				if(i%3==0)
				{
			     System.out.println(i);
				}
	}

}
