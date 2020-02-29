
public class MyStack<T> implements StackInterface{
	private T[] arr;
	private int top, capacity;
	
	public MyStack(int size) {
		arr=(T[]) new Object[size];
		capacity=size;
		top=-1;
	}
	
	public MyStack() {
		arr=(T[]) new Object[0];
		capacity=0;
		top=0;
	}

	public boolean isEmpty() {
		return (size()==0);
	}


	public boolean isFull() {
		return (top==size()-1);
	}


	public Object pop() {
			if(top==0)
				return arr[0];
			else
				return arr[top--];
	}


	public int size() {
		return (arr.length);
	}


	public boolean push(Object e) {
		if(isFull())
			return false;
		else {
			arr[++top]=(T) e;
			return true;
		}
	}


	public Object[] toArray() {
		Object[] display=new Object[capacity];
		for(int x=0; x<capacity; x++)
			display[x]=arr[x];
		return display;
	}

}
