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
		double	armut ,elma,domates,muz,patlican, toplam;
		double	armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
		Scanner input = new Scanner(System.in);

		armutKg = 2.14;
		elmaKg = 3.67;
		domatesKg = 1.11;
		muzKg = 0.95;
		patlicanKg = 5;

		System.out.print("Armut Kaç Kilo ? : ");
		armut = input.nextDouble();
		System.out.print("Elma Kaç Kilo ? :");
		elma = input.nextDouble();
		System.out.print("Domates Kaç Kilo ? : ");
		domates = input.nextDouble();
		System.out.print("Muz Kaç Kilo ? : ");
		muz = input.nextDouble();
		System.out.print("Patlican Kaç Kilo ? : ");
		patlican = input.nextDouble();

		if (armut < 0 || elma < 0 || domates < 0
			|| muz < 0 || patlican < 0)
				System.err.println("Negatif değer kabul edilemez !");
		else
		{
			toplam = armut*armutKg + elma*elmaKg + muz*muzKg
				+ domates*domatesKg + patlican*patlicanKg;
			System.out.println("Toplam Tutar : "+toplam);
		}
		input.close();
	}
}
