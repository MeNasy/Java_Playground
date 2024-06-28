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
		int mat,fizik,kimya,turkce,tarih,muzik;
		double sonuc, dersSayisi;
		Scanner input = new Scanner(System.in);
		String check;

		dersSayisi = 6.0;
		System.out.print("Matematik notunuzu giriniz: ");
		mat = input.nextInt();
		System.out.print("Fizik notunuzu giriniz: ");
		fizik = input.nextInt();
		System.out.print("Kimya notunuzu giriniz: ");
		kimya = input.nextInt();
		System.out.print("Turkce notunuzu giriniz: ");
		turkce = input.nextInt();
		System.out.print("Tarih notunuzu giriniz: ");
		tarih = input.nextInt();
		System.out.print("Muzik notunuzu giriniz: ");
		muzik = input.nextInt();
		sonuc = (mat+fizik+kimya+turkce+tarih+muzik) / dersSayisi;
		System.out.println("Not ortalamasi: "+ sonuc);

		check = (sonuc > 60) ? "Sinifi Geçti": "Sinifta Kaldi";
		System.out.println(check);
		input.close();
	}
}
