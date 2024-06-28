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
		String	kullaniciAdi, sifre, defKullanici, defSifre, bufferSifre, newSifre;
		int select, i;

		System.out.print("Kullanici adi: ");
		kullaniciAdi = input.nextLine();
		System.out.print("Sifre: ");
		sifre = input.nextLine();

		defKullanici = "Menasy";
		defSifre = "Java101";
		bufferSifre = sifre;
		i = -1;
		if (!kullaniciAdi.equals(defKullanici) && !sifre.equals(defSifre))
			System.err.println("Kullanici adi ve şifre yanliş lütfen tekrar deneyiniz !");
		else if (!kullaniciAdi.equals(defKullanici))
			System.err.println("Kullanici adi yanliş lütfen tekrar deneyiniz !");
			else if (!sifre.equals(defSifre))
			{
				System.err.print("Şifre yanliş !\nŞifrenizi sifirlamak ister misiniz ?\n1-)Evet\n2-)Hayir\nSeçiniz: ");
				select = input.nextInt();
				input.nextLine();//nextInt ile int değeri alıyoruz fakat bir sonraki sattır alınmıyor
								//bu yuzden program karışıyor. Karışmaması için input.nextline() kulandım
				if (select == 1)
				{
					System.out.println("3 Deneme hakkiniz var lütfen dikkatli giriniz.");
					while (++i < 3)
					{
						System.out.print("Yeni şifreyi giriniz: ");
						newSifre = input.nextLine();
						if ((newSifre.equals(bufferSifre) || newSifre.equals(defSifre)) && i != 2)
						System.err.println("Şifre oluşturulamadi, lütfen başka şifre giriniz.");
						else if (!(newSifre.equals(bufferSifre) && !newSifre.equals(defSifre)))
						{
							System.out.println("Şifre oluşturuldu");
							defSifre = newSifre;
							break;
						}
						if (i == 2)
							System.err.println("Yeni şifre oluşturulamadi !");
					}
				}
				else
					System.out.println("Giriş sağlanamadi !");
			}
		else
			System.out.println("Başarili şekilde giriş yapildi.");
		input.close();
	}
}
