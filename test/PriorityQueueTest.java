import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PriorityQueueTest {

	/*
	 * Part 3: complete
	 */
	
	PriorityQueue pq;
	
	@Before
	public void setup(){
		pq = new PriorityQueue(20);
	}
	
	@Test
	public void insertTestMin() {
		// insert a few numbers then test pq.min()
		pq.insert(2);
		//Will add the number 2 to the priority queue.
		pq.insert(1);
		//Will add the number 1 to the priority queue.
		pq.insert(3);
		//Will add the number 3 to the priority queue.
		
		assertEquals("The min value in the priority queue is 1", 1, pq.min());
		//Will check if the expected result 1 matches the min value in the priority queue.
	}
	
	@Test
	public void insertTestSize() {
		// insert a few numbers then test pq.size()
		pq.insert(2);
		//Will add the number 2 to the priority queue.
		pq.insert(1);
		//Will add the number 1 to the priority queue.
		pq.insert(3);
		//Will add the number 3 to the priority queue.
		
		assertEquals("The size of the priority queue is 3", 3, pq.size());
		//Will check if the expected result 3 matches the size of the priority queue.
	}

	@Test
	public void removeMinTest() {
		// step 1: add a few numbers to pq
		
		pq.insert(2);
		//Will add the number 2 to the priority queue.
		pq.insert(1);
		//Will add the number 1 to the priority queue.
		pq.insert(3);
		//Will add the number 3 to the priority queue.
		
		// step 2: call pq.removeMin() a few times to check
		//         numbers are returned in ascending order 
		
		assertEquals("1 will be removed from the priority queue", 1, pq.removeMin());
		//Will check if the expected result 1 is returned when removing the min in the priority queue.
		assertEquals("2 will be removed from the priority queue", 2, pq.removeMin());
		//Will check if the expected result 2 is returned when removing the min in the priority queue.
		assertEquals("3 will be removed from the priority queue", 3, pq.removeMin());
		//Will check if the expected result 3 is returned when removing the min in the priority queue.
	}
	
	
	@Test(expected=PriorityQueueException.class)
	public void removeMinEmptyTest() {
		pq.removeMin();
	}
}	
