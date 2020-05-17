package vidu6;
import java.util.Scanner;
public class Mang1chieu {
	int []a;
	void nhapMang() {
		Scanner kb = new Scanner(System.in);
		int n;
		System.out.print("Nhap so phan tu cua mang: ");
		n= kb.nextInt();
		a=new int [n]; //gan' gia tri mang
		for(int i=0;i<n;i++) {
			System.out.print("Nhap phan tu thu "+ (i+1)+": ");
			a[i]= kb.nextInt();
		}
	}
	void xuatMang() {
		System.out.print("\nMang : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
	}
//	void demPtLe() {
//		int d=0;
//		for(int i=0;i<a.length;i++)
//			if(a[i]%2==1) d++;
//		System.out.println("\nSo phan tu le trong mang : "+d);
//	}
	void demPtLe() {
		int d=0;
		for(int i:a)
			if(i%2==1) d++;
		System.out.println("\nSo phan tu le trong mang : "+d);
	}
	void tinhTong() {
		int s=0;
		for(int i:a)
			s+=i;
		System.out.println("\nTong pt trong mang : "+s);
	}
	void timMinMax() {
		int min=a[0], max=a[0];
		for(int i:a) {
			if(min>i) min=i;
			if(max<i) max=i;}
		System.out.println("\nSo lon nhat trong mang: "+max);
		System.out.println("\nSo nho nhat torng mang: "+min);
	}
	boolean timSoX() {
		Scanner kb = new Scanner(System.in);
		int x;
		System.out.print("\nNhap so x can tim: ");
		x= kb.nextInt();
		for(int i=0;i<a.length;i++)
			if(a[i]==x) return true;
		return false;
	}
	void daoMang() {
		int b=(a.length-1)/2;
		int c=a.length-1;
		for(int i=0;i<=b;i++) {
			int dao=a[i];
				a[i]=a[c];
				a[c]=dao;
			c--;
		}
	}
	void tim2SoTichMax() {
		int m=0,n=0;
		int max=a[0]*a[1];
		for(int i=1;i<a.length-1;i++)
			for(int j=i+1;j<a.length;j++)
				if(max<a[i]*a[j]) {
					max=a[i]*a[j];
					m=i;
					n=j;
				}
		System.out.print("\nHai so co tich lon nhat trong mang: ("+a[m]+","+a[n]+")");
	}
	boolean ktMangTang() {
		for(int i=0;i<a.length-1;i++)
			if(a[i]>a[i+1]) return false;
		return true;
	}
	boolean ktMangRangCua() {
		for(int i=1;i<a.length-1;i++)
			if(a[i]>a[i-1]&&a[i]<a[i+1]|| a[i]<a[i-1]&& a[i]>a[i+1])
				return false;
		return true;
	}
	public static void main(String[] args) {
	Mang1chieu m1=new Mang1chieu();
	m1.nhapMang();
	m1.xuatMang();
	m1.demPtLe();
	m1.tinhTong();
	m1.timMinMax();
	m1.tim2SoTichMax();
	if(m1.timSoX()) System.out.println("\nCo so can tim");
	else System.out.println("\nKhong co so can tim");
	m1.daoMang();
	m1.xuatMang();
	if(m1.ktMangTang()) System.out.println("\n Mang la mang tang");
	else System.out.println("\nKhong phai mang tang");
	if(m1.ktMangRangCua()) System.out.println("\nMang rang cua");
	else System.out.println("\nKhong phai mang rang cua");
	}
}
