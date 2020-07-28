package com.boj;
import java.util.Arrays;
import java.util.Scanner;

public class boj_2309 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	    Integer a[] = new Integer[9];
	    int sum = 0;
	    int i, j, one = 0, two = 0;
	    
	    for(i=0; i<9; i++) {
	    	a[i] = sc.nextInt();
	    	sum += a[i];
	    }

		Arrays.sort(a);
	    
		for(i=0; i<9; i++) {
			for(j=0; j<9; j++) {
				if(i==j)
					continue;
				else if(sum - a[i] - a[j] == 100){
					one = i;
					two = j;
				}
			}
		}

		for(i=0;i<9;i++) {
			if(i==one || i==two) {
				continue;
			}
			System.out.println(a[i]);
		}
	}
}
