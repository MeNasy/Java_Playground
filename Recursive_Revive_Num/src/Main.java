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
	static void	arriveNum(int num, int tmpNum, boolean checkNegative)
	{
		if (num == tmpNum)
		{
			System.out.print(num + " ");
			return;
		}
		if (num <= 0 || checkNegative)
		{
			System.out.print(num + " ");
			checkNegative = true;
			arriveNum(num += 5, tmpNum, checkNegative);
		}
		if (num > 0 && checkNegative == false)
		{
			System.out.print(num + " ");
			arriveNum(num -= 5, tmpNum, checkNegative);
		}
	}
	public static void main(String[] args)
	{
		int	num;
		boolean checkNegative = false;
		Scanner input = new Scanner(System.in);

		do
		{
			System.out.print("N Sayisi: ");
			num = input.nextInt();
			if (num < 1)
				System.err.println("Girdiğiniz N sayisi 0'dan buyuk plmalidir !");
		}while(num < 1);
		System.out.print("Cikti: " + num +" ");
		arriveNum(num - 5, num, checkNegative);
		input.close();
	}
}
