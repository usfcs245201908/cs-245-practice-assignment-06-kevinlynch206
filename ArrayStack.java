public class ArrayStack<T> implements Stack<T> {

	private T[] arr;
	private int top = -1;

	public ArrayStack() {
		Object[] tempArray = new Object[10];
		arr = (T[]) tempArray;
	}

	//pop top
	public T pop() {
		if (empty()) {
			return null;
		}
		return arr[top--];
	}

	//peek top
	public T peek() {
		if (empty()) {
			return null;
		}
		return arr[top];
	}

	//add item
	public void push(T item) {
		if (top == arr.length - 1) {
			growArray();
		}
		arr[++top] = item;
	}

	//check if empty
	public boolean empty() {
		return top == -1;
	}


	//double size of array, copy elements
	private void growArray() {
		Object[] tempArray = new Object[arr.length * 2];
		T[] currArr = (T[]) tempArray;
		for (int i = 0; i < arr.length; i++) {
			currArr[i] = arr[i];
		}
		arr = currArr;
	}

}