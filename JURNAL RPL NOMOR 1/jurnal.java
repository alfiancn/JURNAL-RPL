
package javaapplication1;
import java.util.Scanner;

public class JavaApplication1{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Masukkan Angka : ");
		int x = scn.nextInt();
		long fibo[] = new long[x];
		fibo[0]=1;
		fibo[1]=2;
		
		for (int i=2 ; i<x; i++){
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		for (int i=0 ; i<x; i++){
			System.out.print(fibo[i]+" ");
		}
	}
}
