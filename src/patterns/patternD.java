package patterns;

public class patternD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int col=5;
		int sum=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(sum++ +" ");
			}
			System.out.println();
		}
		
	}

}
