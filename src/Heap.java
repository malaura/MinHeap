public class Heap {
	int[] Heap = new int[20];
	int counter = 0;
	

	public void display() {
		for(int i = 0; i < counter; i++)
			System.out.print(Heap[i]+" ");
		System.out.println();
	}

	/**
	 * Non recursive public insert method. 
	 * @param v Value to be inserted. 
	 */
	public void insert(String v) {
		//new element inserted at the end of the list.
		Heap[counter] = Integer.parseInt(v);
		counter++;
		bubbleUp(counter-1);
		System.out.println(v + " was inserted successfully!");

	}
	
	/**
	 * private bubbleUp method (bubbles up)
	 * @param index int value where bubble up starts
	 */
	private void bubbleUp (int index) {
		while (index > 0 && isLess(index, (index-1)/2)) {
			int temp = Heap[index];
			Heap[index] = Heap[ (index-1)/2];
			Heap[ (index-1)/2] = temp;
			index = (index-1)/2;
		}
	}
	
	/**
	 * public method finds minimum value 
	 * @return Heap[0] int minimum value of heap  
	 */
	public int findMin() {
		//new element inserted at the end of the list.
		System.out.println("Min value is " + Heap[0]);
		return Heap[0];
	}
	
	/**
	 * public remove Minimum value method 
	 * @return min int returns minimum value
	 */
	public int removeMin() {
		//new element inserted at the end of the list.
		int min = Heap[0];
		counter += -1;
		Heap[0] = Heap[counter];
		bubbleDown(0);
		Heap[counter] = 0;
		System.out.println(min + " was removed successfully!");	
		return min;
	}
	
	/**
	 * private bubbleDown method (bubbles down)
	 * @param index int value where bubble down starts
	 */
	private void bubbleDown(int index) {
		while (2 * index + 1 < counter - 1) {
			int minIndex = isLess(2 * index + 1, 2 * index + 2 ) ? 2 * index + 1: 2 * index + 2;
			if  (!isLess (minIndex, index)) {
				return;
				}
			//less lines of code per function this way
			swap(minIndex, index);
			index = minIndex;
			}
		if (2 * index+1 == counter - 1) {
			if (isLess(counter - 1, index)) {
				swap(counter - 1, index);
			}
		}
	}
	
	
	
	/**
	 * private swap method, swap values in the array
	 * @param index1, index2 int valued to be swapped
	 */
	private void swap(int index1, int index2) {
		int temp = Heap[index1];
		Heap[index1] = Heap[index2];
		Heap[index2] = temp;
	}

	
	/**
	 * private isLess method, compares if one element is greater than the other
	 * @param index1, index2 int valued to be compared
	 * @return boolean, true if index1 is less than index2 false otherwise
	 */
	private boolean isLess (int index1, int index2) {
		return Heap[index1] < Heap[index2];
	}
	

}