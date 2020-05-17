package bai6;

public class Vonglap1 {
		void in(int a) {
			for(int i=1;i<=a;i++) {
				for(int j=a;j>=1;j--) 
					if(j>i) System.out.print("   ");
					else System.out.print(" * ");
				System.out.println();
			}
		}
	public static void main(String[] args) {
		Vonglap1 b1= new Vonglap1();
		b1.in(5);
	}

}
