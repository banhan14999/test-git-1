package bai6;

public class Vonglap2 {
	public static void in(int a) {
			for(int i=1;i<=a;i+=2) {
				for(int j=a;j>=1;j--) 
					if(j>i) System.out.print(".");
					else System.out.print(".*");
				System.out.println();
			}
		}

	public static void main(String[] args) {
		int n=8;
		in(n);
	}

}
