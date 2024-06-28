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
												
import	java.util.Scanner;

public class Main
{
	static	boolean	isPrime(int num, int tmpNum)
	{
		System.out.println(num);
		System.out.println("tmp:" + tmpNum);
		if (num % tmpNum == 0 && num != 2)
			return (false);
		if (tmpNum > 2)
			return(isPrime(num, tmpNum -= 1));
		else
			return(true);
	}
	public static void main(String[] args)
	{
		int	num, tmpNum;
		boolean checkPrime;
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.print("Sayi: ");
			num = input.nextInt();
			if (num < 0)
				System.err.println("Negatif sayilar asal sayi olamaz !");
		}while(num < 0);
		if (num == 0 || num == 1)
		{

			System.out.println(num + " Asal sayi degildir !");
			input.close();
			return ;
		}
		tmpNum = num -1;
		checkPrime = isPrime(num, tmpNum);
		if (checkPrime)
			System.out.println(num + " Asal sayidir !");
		else
			System.out.println(num + " Asal sayi degildir !");
		input.close();
	}
}
