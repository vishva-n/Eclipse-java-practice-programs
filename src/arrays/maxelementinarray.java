package arrays;

public class maxelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,8,4,5};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
