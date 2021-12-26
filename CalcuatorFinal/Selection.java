
public class Selection 
{
	// Two methods 
	public void selection(int arr[]) // function to sort an array with selection sort 
	{
		
		int i, j, min;
		int n = arr.length;
		// two loops one nested to the other one 
		for (i = 0; i < n - 1; i++) // first outer loop for 5 passes n-1 passes and n= 6
		{
			min = i; // minimum element in unsorted array 

			for (j = i + 1; j < n; j++)  // to find out the min element for the array 
				if (arr[j] < arr[min])
					min = j;
// Swap the minimum element with the first element  
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	public void printArr(int a[]) //b
	//function to print the array 
	{
		int i;
		int n = a.length;
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	//////// Main Class///////////
	public static void main(String[] args) {
		int a[] = { 7, 4, 10, 8, 3, 1 }; // n=6 and no of passes requires are 5. 
		Selection mylist = new Selection();
		System.out.println("\nBefore sorting array element list ");
		mylist.printArr(a);
		mylist.selection(a);
		System.out.println("\nAfter sorting array element list  ");
		mylist.printArr(a);
		System.out.println();
	}
}