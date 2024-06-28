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
												
import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int randNum, userNum, right;
		boolean wrongNum = true;

		userNum = 0;
		right = 5;
		randNum = rand.nextInt(100);
		System.out.println(randNum);
		System.out.println("0 - 100 Arasindaki sayiyi bulmaniz lazim !\nSayiyi bulmak için 5 hakkiniz var. Haklarinizi dikkatli kullanin !");
		System.out.println("************************** Haydi Başlayalim ! ***************************");
		while(true)
		{
			if (right > 0)
			{
				System.out.print("Tahmininiz: ");
				userNum = input.nextInt();
			}
			else
			{
				System.out.println("    ================================================== ");
				System.out.println("  ===========     Deneme hakkiniz bitti !     =========\n ============      Oyunu kaybettiniz !     =============");
				System.out.println("==============      Gizli sayi: " + randNum + "        ================");
				break ;
			}
			if (userNum < 0 || userNum > 99)
			{
				if (wrongNum)
					System.out.println("\tGirdiğiniz sayi 0 - 100 arasinda olmalidir !\n\tBir daha yanliş girerseniz hakkinizdan düşülecektir !");
				else
					System.out.println("\tGirdiğiniz sayi 0 - 100 arasinda olmalidir !\n\tKalan hakkiniz: " + --right);
				if (right == 1)
					System.out.println("-------- Son " + right + " hakkiniz kaldi. Iyi değerlendirin ! --------");
				wrongNum = false;
				continue ;
			}
			else if (userNum >=0 && userNum < 100)
			{
				if (userNum == randNum)
				{
					System.out.println("         =====================================================");
					System.out.println("========= Tebrikler! sayiyi " + (6 - right) + " denemede doğru tahmin ettiniz ! ============");
					System.out.println("=========                  Gizli sayi: " + randNum + "                     ============");
					System.out.println("         =====================================================");
					break ;
				}
				else
				{
					if (userNum > randNum)
						System.out.println("\t"+userNum + " Sayisi gizli sayidan büyüktür. Kalan hakkiniz: " + --right);
					else
						System.out.println("\t"+userNum + " Sayisi gizli sayidan küçüktür. Kalan hakkiniz: " + --right);
				}
			}
			if (right == 1)
				System.out.println("-------- Son " + right + " hakkiniz kaldi. Iyi değerlendirin ! --------");
		}
		input.close();
	}
}
