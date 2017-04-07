import java.util.scanner;

public class jurnal1{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Masukkan Angka : ");
		int x = show.nextInt();
		long fibo[] = new long[];
		fibo[0]=0;
		fibo[1]=1;
		
		for (int i=2 ; i<x; i++){
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		for (int i=0 ; i<x; i++){
			System.out.print(fib[i]+" ");
		}
	}
}