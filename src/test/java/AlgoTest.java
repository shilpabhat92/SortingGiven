package test.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

/**
 * @author Shilpa Bhat
 * This test class has test cases to test 
 * all the sorting methods present in
 * SortAlgos.java.
 * Bubble sort, Selection sort,quick sort , insertion sort
 * merge sort, heap sort
 */

public class AlgoTest {
	Item [] data = new Item[5];
	Item [] res = new Item[5];

	/*
	 * This method initialized data array to be
	 * sorted before calling any test method.
	 * Also initialized the expected sorted array 
	 * after sorting happens.
	 */
	@Before
	public void setUpData() throws Exception {
		data[0]= new Item(5);
		data[1]= new Item(7);
		data[2]= new Item(1);
		data[3]= new Item(3);
		data[4]= new Item(9);

		res[0]= new Item(1);
		res[1]= new Item(3);
		res[2]= new Item(5);
		res[3]= new Item(7);
		res[4]= new Item(9);
	}

	/**
	 * BubbleSort test - [5,7,1,3,9]
	 * Test Sequence - 20 to 36
	 * Achieves node coverage,
	 * Achieves edge coverage
	 * Achieves branch coverage
	 */
	@Test
	public void testBubbleSortWithUnsorted() {
		SortAlgos.bubbleSort(data);		
		assertTests(res, data);
	}
	
	/**
	 * BubbleSort test - res - [ 1,3,5,7,9] (Sorted Array)
	 * Test Sequence - 20 to 29 -> 34
	 * Condition Coverage
	 */
	@Test
	public void testBubbleWithSorted() {
		SortAlgos.bubbleSort(res);		
		assertTests(res, res);
	}
	
	/**
	 * BubbleSort test- [100]
	 * Test Sequence - 20-26, 27, 36
	 * Edge coverage 
	 */
	@Test
	public void testBubbleSortWithOneElement() {
		Item[] data= new Item[1];
		Item[] res=new Item[1];
		data[0]=new Item(100);
		res[0]=new Item(100);
		SortAlgos.bubbleSort(res);		
		assertTests(res, data);
	}
	
	
	
	/**
	 * Test for null pointer exception
	 * BubbleSort - Empty Array
	 * Test Sequence - 20 -> 21 -> 22-> 36
	 * Condition Coverage. 
	 */
	@Test (expected = NullPointerException.class)
	public void testBubbleSortWithEmptyArray() {
		Item[] data=null;
		SortAlgos.bubbleSort(data);
	}
	
	/**
	 * BubbleSort test - All same numbers [3,3,3]
	 * Test Sequence - 20 to 28 -> 34
	 * Node Coverage
	 * Edge Coverage
	 */
	@Test
	public void testBubbleSortWithDuplicates() {
		Item[] data = new Item[3];
		data[0]= new Item(3);
		data[1] = new Item(3);
		data[2] = new Item(3);
		SortAlgos.bubbleSort(data);		
		assertTests(data, data);
	}
	
	/**
	 * test SelectionSort - Unsorted array
	 * [5,7,1,3,9]
	 */
	@Test
	public void testSelectionSortWithUnsortedArray() {
		SortAlgos.selectionSort(data);		
		
		assertTests(res, data);
	}
	
	/**
	 * SelectionSort test - duplicates
	 * [3,3,3]
	 */
	@Test
	public void testSelectionSortWithDuplicates() {
		Item[] data = new Item[3];
		data[0]= new Item(3);
		data[1] = new Item(3);
		data[2] = new Item(3);
		SortAlgos.selectionSort(data);		
		assertTests(data, data);
	}
	
	/** 
	 * Testing SelectionSort - Empty array
	 */
	@Test (expected = NullPointerException.class)
	public void testSelectionSortWithEmptyArray() {
		Item[] data=null;
		SortAlgos.selectionSort(data);
	}
	
	/**
	 *  InsertionSort -  Unsorted numbers 
	 *  [5,7,1,3,9]
	 */
	@Test
	public void testInsertionSortWithUnsortedArray() {
		SortAlgos.insertionSort(data);		
		assertTests(res, data);
	}

	/**
	 * Testing InsertionSort - duplicates
	 */
	@Test
	public void testInsertionSortWithDuplicates() {
		Item[] data = new Item[3];
		data[0]= new Item(3);
		data[1] = new Item(3);
		data[2] = new Item(3);
		SortAlgos.insertionSort(data);		
		assertTests(data, data);
	}


	/** 
	 * Testing InsertionSort - Empty array
	 */
	@Test (expected = NullPointerException.class)
	public void testInsertionSortWithEmptyArray() {
		
		Item[] data=null;
		SortAlgos.insertionSort(data);
	}

	/**
	 *  MergeSort - Unsorted 
	 *  [5,7,1,3,9] 
	 */
	@Test
	public void testMergeSortWithUnsortedArray() {
		SortAlgos.mergeSort(data);		
		assertTests(res, data);
	}
	
	/**
	 *  MergeSort - duplicates 
	 *  [3,3,3]
	 */
	@Test
	public void testMergeSortWithDuplicates() {
		Item[] data = new Item[3];
		data[0]= new Item(3);
		data[1] = new Item(3);
		data[2] = new Item(3);
		SortAlgos.mergeSort(data);		
		assertTests(data, data);
	}
	
	/**
	 * Testing MergeSort - Empty array
	 */
	@Test (expected = NullPointerException.class)
	public void testMergeSortWithEmptyArray() {
		Item[] data=null;
		SortAlgos.mergeSort(data);
	}
	
	/**
	 * Testing QuickSort - Array of Unsorted numbers 
	 * [5,7,1,3,9]
	 */
	@Test
	public void testQuickSortWithUnsortedArray() {
		SortAlgos.quickSort(data);		
		assertTests(res,data);
	}

	/**
	 * Testing QuickSort - duplicates 
	 */
	@Test
	public void testQuickSortWithDuplicates() {
		Item[] data = new Item[3];
		data[0]= new Item(3);
		data[1] = new Item(3);
		data[2] = new Item(3);
		SortAlgos.quickSort(data);		
		assertTests(data, data);
	}
	
	@Test
	/*
	 * Testing sorted array - [1,2,3,4,5]
	 */
	public void testQuickWithSortedArray() {
		data[0]= new Item(1);
		data[1]= new Item(2);
		data[2]= new Item(3);
		data[3]= new Item(4);
		data[4]= new Item(5);
	
		res[0]= new Item(1);
		res[1]= new Item(2);
		res[2]= new Item(3);
		res[3]= new Item(4);
		res[4]= new Item(5);
		SortAlgos.bubbleSort(data);		
		assertTests(res,data);
	}
	
	/** 
	 * Testing QuickSort - Empty array 
	 */
	@Test (expected = NullPointerException.class)
	public void testQuickSortWithEmptyArray() {
		Item[] data=null;
		SortAlgos.quickSort(data);
	}
	
	/** 
	 * Testing HeapSort -  Unsorted numbers 
	 * [5,7,1,3,9]
	 */
	@Test
	public void testHeapSortWithUnsortedArray() {
		SortAlgos.heapSort(data);		
		assertTests(res, data);
	}

	/**
	 * 
	 * Testing HeapSort - duplicates
	 * [3,3,3]
	 */
	@Test
	public void testHeapSortWithDuplicates() {
		Item[] data = new Item[3];
		data[0]= new Item(3);
		data[1] = new Item(3);
		data[2] = new Item(3);
		SortAlgos.heapSort(data);		
		assertTests(data, data);
	}
	
	/**
	 *  HeapSort - Empty array
	 */
	@Test (expected = NullPointerException.class)
	public void testHeapSortWithEmptyArray() {
		Item[] data=null;
		SortAlgos.heapSort(data);
	}
	
	/*
	 * Helper method to check if the actual array
	 * is same as expected array 
	 */
	public void assertTests(Item[] expected,Item[] actual) {
		for(int i=0;i<expected.length;i++) {
			assertTrue(expected[i].key==actual[i].key);
		}
	}
}