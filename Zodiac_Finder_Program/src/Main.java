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
		int gun, ay;

		System.out.print("Doğum gününüz: ");
		gun = input.nextInt();
		System.out.print("Doğduğunuz ay: ");
		ay = input.nextInt();
		if (ay > 0 && ay <= 12 && gun > 0 && gun <= 31)
		{
			if (ay == 1)
			{
				if (gun <= 21)
					System.out.println("Burcunuz: Oğlak");
				else
					System.out.println("Burcunuz: Kova");
			}
			else if (ay == 2)
			{
				if (gun <= 19)
					System.out.println("Burcunuz: Oğlak");
				else
					System.out.println("Burcunuz: Balik");
			}
			else if (ay == 3)
			{
				if (gun <= 20)
					System.out.println("Burcunuz: Balik");
				else
					System.out.println("Burcunuz: Koç");
			}
			else if (ay == 4)
			{
				if (gun <= 20)
					System.out.println("Burcunuz: Koç");
				else
					System.out.println("Burcunuz: Boğa");
			}
			else if (ay == 5)
			{
				if (gun <= 21)
					System.out.println("Burcunuz: Boğa");
				else
					System.out.println("Burcunuz: Ikizler");
			}
			else if (ay == 6)
			{
				if (gun <= 22)
					System.out.println("Burcunuz: Ikizler");
				else
					System.out.println("Burcunuz: Yengeç");
			}
			else if (ay == 7)
			{
				if (gun <= 22)
					System.out.println("Burcunuz: Yengeç");
				else
					System.out.println("Burcunuz: Aslan");
			}
			else if (ay == 8)
			{
				if (gun <= 22)
					System.out.println("Burcunuz: Aslan");
				else
					System.out.println("Burcunuz: Başak");
			}
			else if (ay == 9)
			{
				if (gun <= 22)
					System.out.println("Burcunuz: Başak");
				else
					System.out.println("Burcunuz: Terazi");
			}
			else if (ay == 10)
			{
				if (gun <= 22)
					System.out.println("Burcunuz: Terazi");
				else
					System.out.println("Burcunuz: Akrep");
			}
			else if (ay == 11)
			{
				if (gun <= 22)
					System.out.println("Burcunuz: Akrep");
				else
					System.out.println("Burcunuz: Yay");
			}
			else if (ay == 12)
			{
				if (gun <= 21)
					System.out.println("Burcunuz: Yay");
				else
					System.out.println("Burcunuz: Oğlak");
			}
		}
		else
			System.err.println("Yanliş bir tarih değeri girdiniz !");
		input.close();
	}
}
