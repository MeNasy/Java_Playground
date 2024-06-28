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
		int index, i;
		System.out.print("Sayi giriniz: ");
		index = input.nextInt();
		long [] tab = new long[index + 1];

		//94 koşulunu koymamdaki sebeb 94 ten sonraki değerler max long u aştığı için hatalı değer veriyor.
		if (index > 0 || index > 94)
		{
			tab[0] = 0;
			tab[1] = 1;
			i = 1;
			while (++i <= index)
				tab [i] = tab [i - 1] + tab [i - 2];
			i = -1;
			System.out.print(index + " Elemanli Fibonacci Serisi: ");
			while(++i <= index)
				System.out.print(tab[i]+ " ");
		}
		else
			System.err.println("Geçersiz bir sayi girdiniz. ");
		input.close();
	}
}
