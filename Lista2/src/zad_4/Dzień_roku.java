package zad_4;

import java.util.Scanner;

public class Dzieñ_roku {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("podaj dzien poczatkowy: ");
		int d1 = sc.nextInt();

		System.out.print("podaj miesiac poczatkowy: ");
		int m1 = sc.nextInt();
		
		System.out.print("podaj rok poczatkowy: ");
		int r1 = sc.nextInt();
		
		System.out.print("podaj dzien koncowy: ");
		int d2 = sc.nextInt();
		
		System.out.print("podaj miesiac koncowy: ");
		int m2 = sc.nextInt();
		
		System.out.print("podaj rok koncowy: ");
		int r2 = sc.nextInt();
		
		sc.close();
		
		int przed[]= {0,31,59,90,120,151,181,212,243,273,304,334};
		int po[]= {365,334,306,275,245,214,184,153,122,92,61,31};

		int PelneLata=(r2-r1-1)*365;
		if(PelneLata<0)PelneLata=0;
		
		int przestepne=0;
		int r3=r1+1;
		int rokniepelny=0;
		if(r1==r2)
		{
			rokniepelny+=(przed[m2-1]+d2)-(przed[m1-1]+d1);
			if((r1%4==0 && r1%100!=0) || r1%400==0)
			{
				if(m1>2) rokniepelny--;
				if(m2>2) rokniepelny++;
			}
		}
		else
		{
		while(r3<r2)
		{
			if((r3%4==0 && r3%100!=0) || r3%400==0) przestepne++;
			r3++;
		}
		PelneLata+=przestepne;
		
		rokniepelny += po[m1-1] - d1;
		if(((r1%4==0 && r1%100!=0) || r1%400==0)&&m1<3) rokniepelny++;

		rokniepelny += przed[m2-1] + d2;
		if(((r2%4==0 && r2%100!=0) || r2%400==0)&&(m2>2||(m2==2&&d2==29))) rokniepelny++;
		}
		
		System.out.println("Ilosc dni: " + (PelneLata+rokniepelny));
		
		
	}
}
