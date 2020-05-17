package test_git;

import java.util.Scanner;
public class Bai1 {
int [][]a;
	
	void nhap() {
		int m,n;
		Scanner kb= new Scanner(System.in);
		System.out.print("Nhap so hang: ");
		m=kb.nextInt();
		System.out.print("Nhap so cot: ");
		n=kb.nextInt();
		a= new int[m][n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Nhap hang thu "+(i+1)+": ");
			for(int j=0;j<a[i].length;j++) {
				System.out.print(" a["+i+"]["+j+"] = ");
				a[i][j]=kb.nextInt();
			}
		}
	}
	void in() {
		for(int i=0;i<a.length;i++) {
			System.out.println();
			for(int j=0;j<a[i].length;j++)
				System.out.format("%4d",a[i][j]); //matran
		}
	}
	void tongHang() {
		for(int i=0;i<a.length;i++) {
			int d=0;
			for(int j=0;j<a[i].length;j++)
				d=d+a[i][j];
			System.out.println("\nTong hang "+ (i+1)+"= "+ d);
		}
	}
	void tongCot() {
		int m=a.length;
		int n=a[0].length;
		for(int j=0;j<n;j++) {
			int d=0;
			for(int i=0;i<m;i++)
				d=d+a[i][j];
			System.out.println("\nTong cot "+ (j+1)+"= "+ d);
		}
	}
	void demLeMt() {
		int d=0;
		for(int i=0;i<a.length;i++) 
			for(int j=0;j<a[i].length;j++)
				if(a[i][j]%2==1) d++;
		System.out.println("\nSo cac so le trong ma tran: "+d);
	}
	void timMinMt() {
		int min=a[0][0];
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				if(min>a[i][j]) min =a[i][j];
		System.out.println("Min trong ma tran: "+ min);
	}
	void inDongLeMax() {
		int b=0 , max=0;
		for(int i=0;i<a.length;i++) {
			int d=0;
			for(int j=0;j<a[i].length;j++) 
				if(a[i][j]%2==1) d++;
			if(max<d) {
				max=d;
				b=i;
			}
		}
		System.out.println("Hang "+(b+1) +" co nhieu so le nhat: ");
		for(int j=0;j<a[b].length;j++)
			System.out.print(a[b][j]+" ");	
	}
	void cotTongMax() {
		int m=a.length;
		int n=a[0].length;
		int max=0; int c=0;
		for(int i=0;i<m;i++) max=max + a[i][0];
		for(int j=1;j<n;j++) {
			int d=0;
			for(int i=0;i<m;i++)
				d=d+a[i][j];
			if(max<d) {
				max=d;
				c=j;
			}
		}
		System.out.println("\nCot "+(c+1)+" Co tong lon nhat: ");
		for(int i=0;i<m;i++)
			System.out.print(a[i][c]+" ");
	}
	void diemYenNgua() {
		int d=0;
		int m=a.length;
		System.out.print("\nCac diem yen ngua: ");
		for(int i=0;i<a.length;i++) {
			int min,max;
			for(int j=0;j<a[i].length;j++) {
				min=a[i][j]; max=a[i][j];
				int n=a[i].length;	
				for(int k=0;k<m;k++)
					if(min>a[i][k]) min=a[i][k];
				for(int l=0;l<n;l++)
					if(max<a[l][j]) max=a[l][j];
			if(max==a[i][j] && min==a[i][j]) {
				d++;
				System.out.print("a("+i+","+j+") ");
				}
			}
		}
		if(d==0) System.out.println("\nMa tran khong co diem yen ngua");
	}
	public static void main(String[] args) {
		//int[][]a= {{0,1,2,3,4},{5,6,7,8},{9,10,11,12,13,14,15}};
		Bai1 m2= new Bai1();
		m2.nhap();
		m2.in();
		m2.tongHang();
		m2.tongCot();
		m2.demLeMt();
		m2.timMinMt();
		m2.inDongLeMax();
		m2.cotTongMax();
		m2.diemYenNgua();
	}

}
