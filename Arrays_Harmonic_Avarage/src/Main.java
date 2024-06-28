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

import java.util.Arrays;

public class Main
{
	static double harmonicAvrg(double[] array)
	{
		int		i;
		double	sum, result;

		i = -1;
		sum = 0;
		if (array == null)
		{
			System.err.println("The array must have at least one element !");
			return (0);
		}
		while (++i < array.length)
		{
			if (array[i] != 0)
				sum += (1 / array[i]);
		}
		result = array.length / sum;
		return (result);
	}
	public static void main(String[] args)
	{
		double[]	array = new double[15];
		int	i;

		i = -1;
		while (++i < 15)
			array[i] = Math.round(Math.random() * 100);
		System.out.println("Double Array: " + Arrays.toString(array));
		System.out.println("Harmonic Avarage: " + harmonicAvrg(array));
	}
}
