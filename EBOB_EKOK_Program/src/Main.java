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
		int n1, n2, i, ebob, ekok,big,small;

		System.out.print("1. Sayi: ");
		n1 = input.nextInt();
		System.out.print("2. Sayi: ");
		n2 = input.nextInt();
		input.close();

		ebob  = 0;
		ekok = 0;
		if (n1 > n2)
		{
			big = n1;
			small = n2;
		}
		else
		{
			big = n2;
			small = n1;
		}
		//Ebob
		i = small;
		while (i > 1)
		{
			if (small % i == 0 && big % i == 0)
			{
				ebob = i;
				break;
			}
			i--;
		}
		//Ekok
		i = 2;
		while (i <= small)
		{
			if (small % i == 0 && big % i == 0)
			{
				ekok = i;
				break;
			}
			i++;
		}
		if (ebob > 0)
			System.out.println(n1 + ", " + n2 + " sayilarinin ebobu: " + ebob);
		else
			System.out.println(n1 + ", " + n2 + " sayilarinin ortak kati yoktur !");
		if (ekok > 0)
			System.out.println(n1 + ", " + n2 + " sayilarinin ekoku: " + ekok);
		else
			System.out.println(n1 + ", " + n2 + " sayilarinin ortak kati yoktur !");
	}
}
