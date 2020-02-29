public class MyQueue<T> implements QueueInterface{
	private int size, front, back, capacity;
	private T[] arr;
	
	public MyQueue(int s) {
		arr=(T[])new Object[s];
		front=0;
		back=s-1;
		size=s;
		capacity=0;
	}
	
	public MyQueue() {
		size=0;
		front=0;
		back=0;
		arr=(T[])new Object[0];
		capacity=0;
	}
	
	public boolean isEmpty() {
		return(size()==0);
	}

	public boolean isFull() {
		return(size()==size-1);
	}

	public Object dequeue() {
		T Front=arr[front];
		arr[front]=null;
		front=(front+1)%arr.length;
		capacity--;
		return Front;
	}

	public int size() {
		return arr.length;
	}

	public boolean enqueue(Object e) {
		if(capacity==size)
			return false;
		else {
		arr[back]=(T) e;
		back=(back+1)%arr.length;
		capacity++;
		return true;
		}
	}

	public Object[] toArray() {
		Object[] display=new Object[size];
		return display;
	}

}