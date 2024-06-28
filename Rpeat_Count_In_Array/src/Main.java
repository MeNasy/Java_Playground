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
												
import java.util.ArrayList;

public class Main
{
	static boolean isHave(ArrayList <Integer> arry, int nb)
	{
		int	i;

		i = -1;
		while (++i < arry.size())
			if (arry.get(i) == nb)
				return (true);
		return (false);
	}

	static void findRpeat(int arry[], ArrayList<Integer>rpeatArry)
	{
		int	i, j;

		i = -1;
		while (++i < arry.length)
		{
			j = i;
			while (++j < arry.length)
				if (arry[i] == arry[j])
					if (isHave(rpeatArry, arry[i]) == false)
						rpeatArry.add(arry[i]);
		}
	}

	static int[] findCountRpeat(int srcArry[],  ArrayList<Integer>rpeatArry)
	{
		int	i, j, countRpeat;
		int	countRpeatArry[] = new int[rpeatArry.size()];

		i = -1;
		while (++i < rpeatArry.size())
		{
			j = -1;
			countRpeat = 0;
			while (++j < srcArry.length)
				if (rpeatArry.get(i) == srcArry[j])
					countRpeat++;
			countRpeatArry[i] = countRpeat;
		}
		return(countRpeatArry);
	}

	public static void main(String args[])
	{
		int	arry[] = {7,3,5,4,7,3,5,0,2,1,8,9,4,7,6,0};
		int	countRpeatArry[], i;
		ArrayList <Integer> rpeatArry = new ArrayList<>();


		findRpeat(arry, rpeatArry);
		countRpeatArry = findCountRpeat(arry, rpeatArry);
		i = -1;
		System.err.println("Tekrar Sayilari: ");
		while (++i < rpeatArry.size())
			if (countRpeatArry[i] > 0)
				System.out.println(rpeatArry.get(i) + " Sayisi " + countRpeatArry[i] + " kere tekrar edildi.");
	}
}
