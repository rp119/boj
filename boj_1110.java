package com.boj;

import java.io.*;
import java.util.*;

public class boj_1110 {
	public static void main(String Args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[] = new int[100];

		num[0] = Integer.parseInt(br.readLine());
		int one = 0, one2 = 0, ten = 0, count = 0;

		for (int i = 0; i < 99; i++) {
			one = num[i] % 10;
			ten = num[i] / 10;

			if (one + ten >= 10) {
				one2 = one + ten - 10;
			} else {
				one2 = one + ten;
			}

			num[i + 1] = one * 10 + one2;
			if (num[i + 1] == num[0]) {
				count = i + 1;
				System.out.println(count);
				break;
			}
		}
	}
}
