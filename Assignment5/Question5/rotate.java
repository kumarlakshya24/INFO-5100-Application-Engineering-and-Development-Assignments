package Assignment5;
/**
 * @author Lakshya
 *
 */
public class rotate {
	public void rotateMatrix(int[][] m)
	{
		transpose(m);
		swap(m);
	}
	
	private void transpose(int[][] m) {
		int len = m.length;
		for (int i = 0; i < len; i++)
		{
			int k = m[i].length;
			for(int j = i; j < k; j++)
			{
				int temp = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = temp;
			}
		}
		
	}

	private void swap(int[][] m) {
		int len = m.length;
		for(int i = 0;  i < len; i++)
	{
            int l = 0;
            int r = m[i].length - 1;
            while(l < r)
            {
                int temp = m[i][r];
                m[i][r] = m[i][l];
                m[i][l] = temp;
                l++;
                r--;
            }
	}
		
    }
	
}
