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
		//Heron'un formülü
		// Alan= kare kok (s(s−a)(s−b)(s−c)
		//s = (k1+k2+k3)/2
		double k1,k2,k3;
		double alan, s;
		Scanner input = new Scanner(System.in);
		System.out.print("1.Kenari giriniz: ");
		k1 = input.nextInt();
		System.out.print("2.Kenari giriniz: ");
		k2 = input.nextInt();
		System.out.print("3.Kenari giriniz: ");
		k3 = input.nextInt();

		if (k1 < 0 || k2 < 0 || k3 < 0)
			System.err.println("Uzunluk değerleri negatif olamaz !\n     Lütfen tekrar deneyiniz.");
		else
		{
			s = (k1+k2+k3)/2;
			alan = Math.sqrt(s * (s - k1) * (s - k2) * (s - k3));
			System.out.println("Girmiş olduğunuz üçgenin alani: "+ alan);
		}
		input.close();
	}
}

