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
		int km, flightType,age;
		double price,total;

		price = 0.10;
		System.out.print("Mesafeyi km türünden giriniz: ");
		km = input.nextInt();
		System.out.print("Yaşinizi giriniz: ");
		age = input.nextInt();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		flightType = input.nextInt();

		if (km > 0 && age > 0 && (flightType == 1 || flightType == 2))
		{
			total = km * price;
			if (age < 12)
				total = total - (total * 0.50);
			else if (age >= 12 && age <= 24)
				total = total - (total * 0.10);
			else if (age > 65)
				total = total - (total * 0.30);
			if (flightType == 2)
				total = (total - (total * 0.20)) * 2;
			System.out.println("Toplam Tutar: " + total + " TL");
		}
		else
			System.err.println("Hatali Veri Girdiniz !");
		input.close();
	}
}
