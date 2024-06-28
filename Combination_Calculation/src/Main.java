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
		int	n, r, nFactor, rFact, difFact, dif, i, kombinasyon;
		System.out.print("Kümenin eleman sayisini giriniz (n): ");
		n = input.nextInt();
		System.out.print("Oluşturulacak gruplarin eleman sayisini giriniz (r): ");
		r = input.nextInt();
		input.close();

		if (n > 0 && r >= 0)
		{
			dif = (n - r);
			nFactor = 1;
			rFact = 1;
			difFact = 1;
			for (i = 2; i <= n; i++)
				nFactor *= i;
			for (i = 2; i <= r; i++)
				rFact *= i;
			for (i = 2; i <= dif; i++)
				difFact *= i;
			kombinasyon = (nFactor / (rFact * difFact));
			System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
		}
		else
			System.err.println("Geçersiz bir değer girdiniz !");
	}
}
