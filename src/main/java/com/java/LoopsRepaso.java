package com.java;

public class LoopsRepaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;

		while (i < 5) {
			System.out.println("WHILE Value for i: " + i);
			i++;
		}

		i = 0;

		do {
			System.out.println("loop Do while - Value for i: " + i);
			i++;
		} while (i < 7);

		
		for( i=0; i<10; i++) {
			System.out.println("loop FOR i="+i);
		}
	}

}
