import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearcherTest {

	@Test
	public final void testBinarySearch() {
		int[] test1 = {13,2,7,12,15,4,11,6,10,9,3,1,14,5,8};
	//	int[] test1 = {0,1,2,3,4,5};
		QuickSorter.quickSort(test1, 0, 14);
		for(int elem : test1) {
			System.out.println(elem);
		}
		assertEquals (0, BinarySearcher.binarySearch(test1, 0, 14, 1));
		assertEquals (14, BinarySearcher.binarySearch(test1, 0, 14, 15));
		assertEquals (5, BinarySearcher.binarySearch(test1, 0, 14, 6));
	}

}
