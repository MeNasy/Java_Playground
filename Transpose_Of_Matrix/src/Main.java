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
	/*
	 * 1 2 3		1 9 3 9
	 * 9 8 5		2 8 7 7
	 * 3 7 4		3 5 4 9 3x4
	 * 9 7 5 4x3
	 */

	static void showSubArray(int subArrays[][])
	{
		int	i, j;

		i = -1;
		while (++i < subArrays.length)
		{
			j = -1;
			System.out.print("[" + (i + 1) + "] = {" );
			while (++j < subArrays[i].length)
			{
				if (subArrays[i][j] != 0)
					System.out.print(subArrays[i][j] + ",");
			}
			System.out.println("}" );
		}
	}

	static void	dblToSngl(int dblArry[][], int singlArry[])
	{
		int	i,j,k;

		i = -1;
		j = -1;
		k = 0;
		while (++i < dblArry.length)
		{
			j = -1;
			while (++j < dblArry[i].length)
				singlArry[k++] =dblArry[i][j];
		}

	}
	public static void main (String args[])
	{
		int matrix[][] = {{1,2,3}, {9,8,5}, {3,7,4}, {9,7,5}}; //4x3
		int transposMatrix[][] = new int[matrix[0].length][matrix.length]; //3x4
		int arry[] = new int[matrix.length * matrix[0].length];
		int	i, j, k, line;

		line = matrix[0].length;
		dblToSngl(matrix, arry);
		i = -1;
		j = -1;
		while (++i < line)
		{
			k = i;
			j = -1;
			while (++j < matrix.length)
			{
				transposMatrix[i][j] = arry[k];
				k += line;
			}
		}
		System.out.println("Matrix: ");
		showSubArray(matrix);
		System.out.println("\nTranspose: ");
		showSubArray(transposMatrix);
	}
}
