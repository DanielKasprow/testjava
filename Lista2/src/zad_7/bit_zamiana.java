package zad_7;

import java.util.Scanner;

public class bit_zamiana {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj liczbe: ");
		int a = sc.nextInt();
		sc.close();
		//int x =a>>2;
		//if((x&1)==1)
		//	a-=4;
		//else
		//	a+=4;
		
		int y=a&4;//pobieranie pierwszych 3 bit�w
		y=y^4;//odwr�cenie bit�
		int k=a&3;//pobieranie pierwszych 3 bit�w
		a=a>>3;//czyszczenie pierwszych 3 bit�w
		a=a<<3;
		a=a|y;//przypisanie odwr�conych pierwszych 3 bit�w
		//a=a>>2;//czyszczenie 2 bit�w
		//a=a<<2;
		a=a|k;//przypisanie spowrotem pierwszych 2 bit�w
		System.out.print("Liczba z przeciwnim 3 bitem: " + a);
		
	}
}
