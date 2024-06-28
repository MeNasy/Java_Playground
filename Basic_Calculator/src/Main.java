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
		int	n1,n2,operation;
		Scanner input = new Scanner(System.in);

		System.out.print("1. Sayi: ");
		n1 = input.nextInt();
		System.out.print("2. Sayi: ");
		n2 = input.nextInt();
		System.out.println("1-)Toplama\n2-)Çikarma\n3-)Çarpma\n4-)Bölme");
		System.out.print("Yapacağiniz işlemi seçiniz: ");
		operation = input.nextInt();
		if (operation == 4 && n2 == 0)
			System.err.println("Bölmede taban sifir olamaz !");
		else
		{
			switch (operation)
			{
				case 1:
					System.out.println(n1 + " + " + n2 +" = " + (n1+n2));
					break;
				case 2:
					System.out.println(n1 + " - " + n2 +" = " + (n1-n2));
					break;
				case 3:
					System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
					break;
				case 4:
					System.out.println(n1 + " / " + n2 + " = " + ((double)n1/(double)n2));
					break;
				default:
					System.err.println("Hatali tuşlama yaptiniz !");
			}
		}
		input.close();
	}
}
