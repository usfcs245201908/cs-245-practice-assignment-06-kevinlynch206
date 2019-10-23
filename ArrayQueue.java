public class ArrayQueue<T> implements Queue<T>
{

    private int head = 0;
    private int tail = 0;
    private T[] arr;

    public ArrayQueue() {
        Object[] tempArr = new Object[10];
        arr = (T[]) tempArr;
    }


    //add item to end
    public void enqueue(T item) {
        if (tail == arr.length) {
            growArray();
        }
        arr[tail++] = item;
    }

    //remove first element, increment head
    public T dequeue() {
        if (empty()) {
            return null;
        }
        return arr[head++];
    }


    //create array of double size, copy over elements
    private void growArray() {
        Object[] tempArray = new Object[arr.length * 2];
        T[] array = (T[]) tempArray;
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        arr = array;
    }

    //check if empty
    public boolean empty() {
        return head == tail;
    }



}