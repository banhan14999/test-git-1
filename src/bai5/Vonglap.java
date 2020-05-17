package bai5;
import java.util.Scanner;
public class Vonglap {
	static double cau1(int a) {
		double s=0;
		for(int i=1;i<=a;i++)
			s=s+ 1.0/i;
		return s;
	}
	static double cau2(int a) {
		double s=0;
		for(int i=1;i<=a;i++) 
			if(i%2==0) s=s-1.0/i;
			else s=s+1.0/i;		
		return s;
	}
	static double cau3(int a) {
		double s=0, tu=1.0;
		for(int i=1;i<=a; )/*i+=2)*/ {
			s=s+ tu/i;
			tu=-tu;
			i+=2;
		}
		return s;
	}
	/*static double cau32(int a){
		double s=0, tu=1.0, i=0;
		while(true) {
			double mau = 2*i+1;
			if(mau<=a) {
				s=s+ tu/mau; tu=-tu; i++;
			}
			else break;
		}
		return s;
	}*/
	static double cau4(int a) {
		double s=0, giaithua=1 ;
		for(int i=1;i<=a;i++) {
			giaithua= giaithua*i;
			s=s+ 1.0/giaithua;
		}
		return s;
	}
	public static void main(String[] args) {
		int n;
		Scanner kb=new Scanner(System.in);
		System.out.println("Nhap n= ");
		n=kb.nextInt();
		kb.close();
		System.out.format("S1= %.2f\n", cau1(n));
		System.out.format("S2= %.2f\n", cau2(n));
		System.out.format("S3= %.2f\n", cau3(n));
		System.out.format("S4= %.2f\n", cau4(n));
	}

}
