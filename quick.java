import java.util.Arrays;
public class quick {
	static int quick(int[] a , int begin, int end)	{
		int pivot = (begin + end)/2;
		int tmp;
		while(begin < end) {
			while(a[end]>a[pivot] && begin <= end)end--;
			while(a[begin]<a[pivot] && begin <= end)begin++;
			tmp = a[end];
			a[end] = a[begin];
			a[begin] = tmp;
		}
		tmp = a[end];
		a[end]=a[pivot];
		a[pivot] = tmp;

		System.out.println(Arrays.toString(a));
		return pivot;
	}
	static void partition(int[]a, int begin, int end) {
		if(begin<end) {
			int p = quick(a, begin, end);
			partition(a, begin, p-1);
			partition(a, p+1, end);
		}
	}
	public static void main(String[]args) {
		int[] array = {1,5,3,8,2};
		int begin = 0 ;
		int end = 4;
		partition(array, begin, end);
	}
}
