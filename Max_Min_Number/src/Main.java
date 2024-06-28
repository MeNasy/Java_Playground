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
		int nbNUm, max,min,i, j, tmp;

		System.out.print("Kaç tane sayi gireceksiniz: ");
		nbNUm = input.nextInt();
		if (nbNUm <= 0)
		{
			System.err.println("Error: Geçersiz bir boyut girdiniz: ");
			System.exit(1);
		}
		int [] arry = new int[nbNUm];
		i = 0;
		while (i < nbNUm)
		{
			System.out.print((i +1) + ".Sayi: ");
			arry[i] = input.nextInt();
			i++;
		}
		i = 0;
		while (i < nbNUm)
		{
			j = 0;
			while (j < nbNUm - 1)
			{
				if (arry[j + 1] < arry[j])
				{
					tmp = arry[j];
					arry[j] = arry[j + 1];
					arry[j + 1] = tmp;
				}
				j++;
			}
			i++;
		}
		max = arry[nbNUm -1];
		min = arry[0];
		System.out.println("En büyük sayi: " + max);
		System.out.println("En küçük sayi: " + min);
		input.close();

				//ArrayList ile:
		/*Scanner input = new Scanner(System.in);
			ArrayList <Integer> arry = new ArrayList<>();
			int nbNUm, max,min,i, j, tmp;

			System.out.print("Kaç tane sayi gireceksiniz: ");
			nbNUm = input.nextInt();
			i = 0;
			while (i < nbNUm)
			{
				System.out.print((i +1) + ".Sayi: ");
				arry.add(input.nextInt());
				i++;
			}
			i = 0;
			while (i < nbNUm)
			{
				j = 0;
				while (j < nbNUm - 1)
				{
					if (arry.get(j+1) < arry.get(j))
					{
						tmp = arry.get(j);
						arry.set(j,arry.get(j +1));
						arry.set(j+1, tmp);
					}
					j++;
				}
				i++;
			}
			max = arry.get(nbNUm -1);
			min = arry.get(0);
			System.out.println("En büyük sayi: " + max);
			System.out.println("En küçük sayi: " + min);*/
	}

}
