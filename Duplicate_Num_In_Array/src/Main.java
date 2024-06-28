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
	public static void main (String[] args)
	{
		int	nums[] = {4,73,7,10,47,73,73,34,1907,47,1907,5,1907,47};
		int	i, j;
		boolean checkRpeat ;
		ArrayList <Integer> duplicate = new ArrayList<>(); // arrayler ile yapsaydım dizide ne kadar yer açacağımı
		//anlayabilmek için bir tane daha fonksiyon yazmak zorunda kalacaktım.
		//ArrayListler dinamik olduğu için bu işlem en kolay bu yolla yapıldı.
		i = -1;
		while (++i < nums.length)
		{
			j = i;
			checkRpeat = true;
			while (++j < nums.length)
			{
				if (nums[i] == nums[j] && checkRpeat)
				{
					checkRpeat = false;
					if (isHave(duplicate, nums[i]) == false)
						duplicate.add(nums[i]);
				}
			}
		}
		i = -1;
		System.out.print("Tekrar eden sayilar: ");
		while (++i < duplicate.size())
			System.out.print(duplicate.get(i) + " ");
		System.out.println();
	}
}
