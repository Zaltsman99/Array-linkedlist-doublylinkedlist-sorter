package Problem4;

public class Sorter {
	  public static int rec(int l, int r, int[] arr, int size, int sum) {
		    if (l <= r) {
		      if (arr[l] + arr[r] == sum) {
		        return arr[l];
		      }
		      else if (arr[l] + arr[r] < sum) {
		        return rec(l + 1, r, arr, size, sum);
		      }
		      else return rec(l, r - 1, arr, size, sum);
		    }
		    return - 1;
		  }
}