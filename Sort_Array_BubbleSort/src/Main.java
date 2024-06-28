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
	static void sortArray(int array[])
	{
		int	i, j, tmp;

		i = 0;
		tmp = 0;
		while (i < array.length)
		{
			j = i +1;
			while (j < array.length)
			{
				if (array[j] < array[i])
				{
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
				j++;
			}
			i++;
		}
	}

	static void printArray(int array[])
	{
		int	i;

		i = -1;
		while (++i < array.length)
			System.out.print(array[i] + " ");
		System.out.println();
	}
	public static void main(String args[])
	{
		int	size, i;
		int array[];
		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin boyutu : ");
		size = input.nextInt();
		array = new int[size];
		i = -1;
		System.out.println("Dizinin elemanlarini giriniz : ");
		while (++i < size)
		{
			System.out.print((i+1) + ". Elemani : ");
			array[i] = input.nextInt();
		}
		System.out.print("\nUnsorted array : ");
		printArray(array);
		sortArray(array);
		System.out.print("Sorted array : ");
		printArray(array);
		input.close();
	}
}
