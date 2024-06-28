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
		int	num, i, j;
		System.out.print("Bir sayi girininz (tek sayi): ");
		num = input.nextInt();
		input.close();

		i = 0;
		if (num % 2 != 0)
		{
			while (i < num)
			{
				j = i;
				while (j++ < num)
					System.out.print(" ");
				j = 0;
				while (j <= i)
				{
					System.out.print("* ");
					j++;
				}
				i++;
				System.out.println();
			}
			i = num;
			while (i >= 0)
			{
				j = i;
				while (j++ < num)
					System.out.print(" ");
				j = 0;
				while (j <= i)
				{
					System.out.print("* ");
					j++;
				}
				i--;
				System.out.println();
			}
		}
		else
			System.err.println("Girdiğiniz sayi tek sayi olmali !");

	}
}
