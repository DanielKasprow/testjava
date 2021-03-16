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
		
		int y=a&4;//pobieranie pierwszych 3 bitów
		y=y^4;//odwrócenie bitó
		int k=a&3;//pobieranie pierwszych 3 bitów
		a=a>>3;//czyszczenie pierwszych 3 bitów
		a=a<<3;
		a=a|y;//przypisanie odwróconych pierwszych 3 bitów
		//a=a>>2;//czyszczenie 2 bitów
		//a=a<<2;
		a=a|k;//przypisanie spowrotem pierwszych 2 bitów
		System.out.print("Liczba z przeciwnim 3 bitem: " + a);
		
	}
}
