package bai6;

public class Vonglap3 {
	public static void cau8(int m, int n) {
		int k=0;
		for(int i=1; i<=m;i++) {
			for(int j=1;j<=n;j++) 
			System.out.format("%3d", ++k);
		System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=10, m=7;
		cau8(m,n);
	}

}
