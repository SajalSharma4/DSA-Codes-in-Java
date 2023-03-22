import java.util.Scanner;

public class ShellSort 
{
	private ShellSort(){} 
		
	public static void sort(int[] a, int n) 
	{
		int i,j,temp,h;
		
		Scanner in = new Scanner(System.in);	
		System.out.print("Enter maximum increment(odd value) : ");
		h=in.nextInt();
		
		while(h>=1)
		{
			for(i=h; i<n; i++)
			{
				temp=a[i];
				for(j=i-h; j>=0 && a[j]>temp; j=j-h)
					a[j+h]=a[j];
				a[j+h]=temp;
			}
			h=h-2; 
		}
		in.close();
	}
	
	public static void main(String[] args)
	{
		int i,n;
		int[] a = new int[20];
		Scanner in = new Scanner(System.in);	
		
		System.out.print("Enter the number of elements : ");
		n = in.nextInt();
	
		for(i=0; i<n; i++)
		{
			System.out.print("Enter element " + (i+1) + " : ");
			a[i] = in.nextInt();
		}
		
		sort(a,n);
		
		System.out.println("Sorted array is : ");
		for(i=0; i<n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		in.close();
	}
}