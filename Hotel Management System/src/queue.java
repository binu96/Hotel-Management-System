
public class queue {

	static String[] arr = new String[7]; // create the queue array
	static int rear = -1; // rear is the point we add elements
	static int front = 0; // front is the point we remove element
	static int numOfElements = 0; // num of elements in the array
	static int isFul = 0; // to check whether the queue is full or not
	static int isEmp = 0; // to check whether the queue is empty or not
	static String removedElement = null; // to get the removing item

	public void enqueue(String roomName) {

		isFull(); // calling the isFul method

		if (isFul == 0) { // it checks whether the queue is full or not

			if (rear == -1) { // if we are adding the first element to the queue

				arr[++rear] = roomName;// add that element to the first space
										// (rear = 0 => arr[0])
				numOfElements++;// incrementing number of elements
				front++;// increment front

			} else { // if we adding 2nd, 3rd or any element other than the
						// first
						// one

				for (int i = front; i > 0; i--) { // loop until i greater to
													// 0
					arr[i] = arr[i - 1]; // we are assigning the front element
											// to the next space in the queue
				}

				arr[0] = roomName; // we are adding the value to the root
				front++; // increment root
				numOfElements++; // increment numOfElements

				full(); // calling the method full

			}

		}
	}

	public void dequeue() { // de queue method to delete from the queue

		isEmpty(); // callig the method isEmpty

		if (isEmp == 1) { // number of elements isn't zero
			
			removedElement = arr[front - 1]; // assigning the removed item to
												// the front value of the array
			System.out.println(removedElement);
			arr[front - 1] = null; // remove the element of the array
			front--; // decrease the value of front by 1
			numOfElements--; // decrease the value of numOfElements by 1

		}
	}

	public void full() { // to check whether the queue full or not
		isFull(); // calling the method is full

		if (isFul == 1) { // checking whether the is ful variable equals to 1
			System.out.println("--------------------------------------------------------------");
			System.out.println(arr[front - 1] + " is removed from the queue.");
			dequeue(); // calling the method de queue

		}
	}

	public void isFull() { // checking the array is full

		if (numOfElements == arr.length) { // if the queue is full

			System.out.println("Storage is full!!");// print error message
			isFul = 1;// assign isFul to 1

		} else {

			isFul = 0; // if the queue isnt full, assign 0 to isFul

		}

	}

	public void isEmpty() { // checking the array is empty

		if (numOfElements == 0) { // if the queue is empty

			isEmp = 0;

		} else {

			isEmp = 1;

		}
	}

}
