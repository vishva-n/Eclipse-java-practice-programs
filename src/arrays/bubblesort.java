package arrays;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,40,30,20,10};
		int temp;
		for(int j=0;j<arr.length;j++)
		{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
		}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}