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
	static boolean isPolindrom(int nb)
	{
		int	res,tmpNb;

		tmpNb = nb;
		res = 0;
		while (tmpNb != 0)
		{
			res = (res * 10) + (tmpNb %10);
			tmpNb /= 10;
		}
		if (res != nb)
			return(false);
		return(true);
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int nb;
		boolean check;

		System.out.print("Sayi: ");
		nb = input.nextInt();
		input.close();
		if (nb < 0)
			nb *= -1;
		check = isPolindrom(nb);
		if (check == true)
			System.out.println(nb + " Polindrom bir sayidir.");
		else
			System.out.println(nb + " Polindrom bir sayi değildir.");
	}
}
