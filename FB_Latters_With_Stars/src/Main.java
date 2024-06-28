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
												
public class Main
{
	static void fillStr(String str[][])
	{
		for (int i = 0; i < str.length; i++)
		{
			for(int j = 0; j< str[i].length; j++)
			{
				if (((i == 0 && j < 7) || (i == 4 && j < 7) || j == 0) //F harfi şartları
					|| ((j == 9 || (j == 15 && i != 4 && i != 8 && i != 0)) || ((i == 8 || i == 0 || i == 4) && j > 9 && j != 15))) //B harfi şartları
					str[i][j] = "* ";
				else
					str[i][j] = "  ";
			}
		}
		for (String[] substr : str)
		{
			for (String s : substr)
				System.out.print(s);
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		String fenerBahce[][] = new String[9][16];
		fillStr(fenerBahce);
	}
}
