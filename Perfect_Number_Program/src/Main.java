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
		int nb,total,i;

		System.out.print("Bir sayı giriniz: ");
		nb = input.nextInt();
		// nb/2 yapmamdaki sebep: bir sayının yarısından sonraki sayılar onun çarpanı olamaz.
		// bu yuzden kontrol etmeye ve ekstra işlem yapmaya gerek yok.
		i = 1;
		total = 0;
		while (i <= nb/2)
		{
			if (nb % i == 0)
				total += i;
			i++;
		}
		if (total == nb)
			System.out.println(nb + " Mükemmel sayidir.");
		else
			System.out.println(nb + " Mükemmel sayi değildir.");
		input.close();
	}
}
