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
												
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	static void nearestNum(double arry[], double foundNum)
	{
		int	i;

		i = 0;
		Arrays.sort(arry);
		while (i < arry.length)
		{
			if (foundNum <= arry[i])
				break ;
			i++;
		}
		if (i == 0)
			System.out.println("listede girilen sayidan küçük sayi yoktur : " + Math.round(foundNum));
		else
			System.out.println("Girilen sayidan küçük en yakin sayi : " + Math.round(arry[i -1]));
		if (i == 10)
			System.out.println("listede girilen sayidan büyük sayi yoktur : " + Math.round(foundNum));
		else
			System.out.println("Girilen sayidan büyük en yakin sayi : " + Math.round(arry[i]));
	}
	public static void main (String[] args)
	{
		int	i;
		double num;
		double	arry[] = new double[10];
		Scanner input = new Scanner(System.in);

		i = -1;
		while (++i < arry.length)
		arry[i] = Math.random() * 100;
		System.out.print("Sayi: ");
		num = input.nextDouble();
		nearestNum(arry , num);
		input.close();
	}
}
