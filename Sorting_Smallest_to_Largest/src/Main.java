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
		int a,b,c;
		//sayıları bir arry (liste) e atıp kolaylıkla sıralayabilirdik ama şuanda oraya daha parmak basılmadığı için es geçtim.
		//if koşullarıyla yapmış olduk.
		System.out.print("1.Sayi (a): ");
		a= input.nextInt();
		System.out.print("2.Sayi (b): ");
		b= input.nextInt();
		System.out.print("3.Sayi c): ");
		c= input.nextInt();

		if (a >= b && a >= c)
		{
			if (b >= c)
				System.out.println("c < b < a");
			else
				System.out.println("b < c < a");
		}
		else if (b >= a && b >= c)
		{
			if (a >= c)
				System.out.println("c < a < b");
			else
				System.out.println("a < c < b");
		}
		else if (c >= a && c >= b)
		{
			if (a >= b)
				System.out.println("b < a < c");
			else
				System.out.println("a < b < c");
		}
		input.close();
	}
}
