package Problem4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {

	@Test
	void SorterTest1() {
        System.out.println("Test1");
	    int size = 8;
	    int arr[] = {2, 4, 7, 10, 15, 19, 25, 31};
	    int sum = 21;
	    int first = Sorter.rec(0, size - 1, arr, size, sum);
	    if (first == -1) {
	        System.out.println("Not Found!\n");
	      }
	    else {
	        int second = sum - first;
	        System.out.println(first + ", " + second);
	      }
	}	


	@Test
	void SorterTest2() {
        System.out.println("----------------");
        System.out.println("Test2");
	    int size = 8;
	    int arr[] = {2, 4, 7, 10, 15, 19, 25, 31};
	    int sum = 5;
	    int first = Sorter.rec(0, size - 1, arr, size, sum);
	    if (first == -1) {
	        System.out.println("Not Found!\n");
	      }
	    else {
	        int second = sum - first;
	        System.out.println(first + ", " + second);
	      }
	}
}