/*
 ███▄ ▄███▓▓█████  ███▄    █  ▄▄▄        ██████▓██   ██▓
▓██▒▀█▀ ██▒▓█   ▀  ██ ▀█   █ ▒████▄    ▒██    ▒ ▒██  ██▒
▓██    ▓██░▒███   ▓██  ▀█ ██▒▒██  ▀█▄  ░ ▓██▄    ▒██ ██░
▒██    ▒██ ▒▓█  ▄ ▓██▒  ▐▌██▒░██▄▄▄▄██   ▒   ██▒ ░ ▐██▓░
▒██▒   ░██▒░▒████▒▒██░   ▓██░ ▓█   ▓██▒▒██████▒▒ ░ ██▒▓░
░ ▒░   ░  ░░░ ▒░ ░░ ▒░   ▒ ▒  ▒▒   ▓▒█░▒ ▒▓▒ ▒ ░  ██▒▒▒
░  ░      ░ ░ ░  ░░ ░░   ░ ▒░  ▒   ▒▒ ░░ ░▒  ░ ░▓██ ░▒░
░      ░      ░      ░   ░ ░   ░   ▒   ░  ░  ░  ▒ ▒ ░░
       ░      ░  ░         ░       ░  ░      ░  ░ ░
                                                ░ ░*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		double	money, kdv;
		Scanner input = new Scanner(System.in);

		kdv = 0;
		System.out.print("KDV' si hesaplanacak para mikatrini giriniz: ");
		money = input.nextFloat();

		if (money > 0 && money <= 1000)
			kdv = 0.18;
		else if (money > 1000)
			kdv = 0.08;
		else
			System.out.println("Negatif Değerler kabul edilemez, Lütfen tekrar deneyin");
		System.out.println("KDV Orani = "+ kdv);
		System.out.println("KDV'siz Fiyat = "+ money);
		System.out.println("KDV'li Fiyat ="+ (money + (money * kdv)));
		System.out.println("KDV tutari = "+ (money * kdv));
		input.close();
	}
}
