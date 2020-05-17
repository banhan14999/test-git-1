package bai6;
//import java.util.Scanner;
public class Vonglap {
	void in(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) 
				System.out.print(".  ");
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		//int n;
		/*Scanner kb= new Scanner(System.in);
		System.out.println("Nhap n: ");
		n=kb.nextInt();
		kb.close();*/
		Vonglap b1= new Vonglap();
		b1.in(20);
	}

}
