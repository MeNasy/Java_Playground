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
	static int recursivePow(int base, int tmpBase, int pow)
	{

		if (pow == 1)
			return(base);
		return (recursivePow(base *= tmpBase,tmpBase, pow -= 1));
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int	base, pow, tmpBase;
		double result;
		boolean checkPow = false;

		result = 1;
		do
		{
			System.out.print("Taban degeri: ");
			base = input.nextInt();
			System.out.print("Us degeri: ");
			pow = input.nextInt();
			if ((base == 0 && pow == 0))
				System.err.println("Tanimsiz degerler girdiniz !");

		} while (base == 0 && pow == 0);
		if (pow < 0)
		{
			pow *= -1;
			checkPow = true;
		}
		else if (pow == 0)
			result = 1;
		if (pow != 0)
		{
			tmpBase = base;
			if (checkPow)
				result = (double)1 / recursivePow(base, tmpBase, pow);
			else
				result = recursivePow(base, tmpBase, pow);
		}
		System.out.println("\nSonuc: " + base + " ussu " + pow + " = " + result + "\n");
		input.close();
	}
}
