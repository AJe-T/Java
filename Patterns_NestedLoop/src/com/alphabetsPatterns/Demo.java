package com.alphabetsPatterns;

public class Demo {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=5-i-1;j++) {
				System.out.print("@");
			}
			for(int k=i;k>=0; k--) {
				System.out.print((char)('E'-k)+" ");
			}
			System.out.println();
		}
	}
}
