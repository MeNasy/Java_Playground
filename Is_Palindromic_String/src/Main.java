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
												
import java.util.*;

public class Main
{
	static boolean isPalindromic(String str)
	{
		int	len, i = 0;

		i = 0;
		len = str.length() - 1;
		while (len >= str.length()/2)
		{
			if (str.charAt(len) != str.charAt(i))
				return (false);
			len--;
			i++;
		}
		return (true);
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String str;
		do
		{
			System.out.print("---------- Programi sonlandirmak için 'q' tuşlayiniz ! ----------\nKelime: ");
			str = input.nextLine();
			if (str.equals("q") || str.equals("Q"))
			{
				System.out.println("\t\tProgram sonlandirildi !");
				break ;
			}
			if (str == null || str.isEmpty())
			{
				System.err.println("Hiçbir değer girmediniz !");
				input.close();
				return ;
			}
			if (isPalindromic(str.toLowerCase()))
				System.out.println("============== "+str + " Polindromik bir ifadedir. ============");
			else
				System.out.println("============= "+str + " Polindromik bir ifade değildir ! ==========");
		}while(true);
		input.close();
	}
}
