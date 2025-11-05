
public class Sort {

	/*
	 * Part 4: complete method
	 */
	/**
	 * Sorts an array using a priority queue.
	 * 
	 * The effect of calling this method is that the input 'arr' array is
	 * updated in-place, rather than creating a new array holding the sorted value.
	 * 
	 * TODO Where N is the number of elements in the array the complexity is:
	 *
	 * O(?)
	 * 
	 * Because: TODO
	 * 
	 * @param arr the array to be sorted in-place
	 */
	public static void sort(int[] arr){	

		PriorityQueue pq = new PriorityQueue(10);
		//Creates a new priority queue which will later temporarily hold the values in the array.
		
		for (int i : arr) {
			pq.insert(i);
		}
		//The loop will repeat for each element in the array. It will add each element from the array to the priority queue.
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = pq.removeMin();
		}
		//The loop will repeat for the length of the array. It will now add the element back into the array from the priority queue starting from the min value.
		
	}
	
	public static void main(String[] args){
		int[] arr = {53,3,5,2,4,67};
		Sort.sort(arr);
		// should be printed in order
		System.out.println(arr[0]);
		System.out.println(arr[1]);	
		System.out.println(arr[2]);
		System.out.println(arr[3]);	
		System.out.println(arr[4]);	
		System.out.println(arr[5]);	
	}
	
}
