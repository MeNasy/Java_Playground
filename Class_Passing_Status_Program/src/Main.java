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
		Scanner input = new Scanner(System.in);
		int	mat, fizik,turkce,kimya, muzik, i;
		double ortalama, toplam;

		toplam = 0;
		i = 0;
		System.out.print("Matematik notu: ");
		mat = input.nextInt();
		System.out.print("Fizik notu: ");
		fizik = input.nextInt();
		System.out.print("Turkce notu: ");
		turkce = input.nextInt();
		System.out.print("Kimya notu: ");
		kimya = input.nextInt();
		System.out.print("Müzik notu: ");
		muzik = input.nextInt();

		if (mat >= 0 && mat <= 100)
		{
			toplam += mat;
			i++;
		}
		if (fizik >= 0 && fizik <= 100)
		{
			toplam += fizik;
			i++;
		}
		if (kimya >= 0 && kimya <= 100)
		{
			toplam += kimya;
			i++;
		}
		if (turkce >= 0 && turkce <= 100)
		{
			toplam += turkce;
			i++;
		}
		if (muzik >= 0 && muzik <= 100)
		{
			toplam += muzik;
			i++;
		}
		ortalama = toplam/i;

		System.out.println("Ortalamaniz: " + ortalama);
		if (ortalama >= 55)
			System.out.println("Geçtiniz.");
		else
			System.out.println("Kaldiniz !");
		input.close();
	}
}
