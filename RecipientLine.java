
public class RecipientLine<T> implements RecipientLineInterface{
	int capacity, front, back, size;
	Recipient[] arr;
	
	public RecipientLine(int s) {
		arr=new Recipient[s];
		front=0;
		back=s-1;
		size=s;
		capacity=0;
	}
	
	public RecipientLine() {
		arr=new Recipient[0];
		size=0;
		front=0;
		back=0;
		capacity=0;
	}
	
	public boolean addNewRecipient(Recipient rc) throws RecipientException {
		if(arr.length==capacity)
			throw new RecipientException("The recipient queue is full");
		else {
		arr[back]=rc;
		back=(back+1)%arr.length;
		capacity++;
		return true;
		}
	}

	
	public Recipient recipientTurn() throws RecipientException {
		String message="Recipient queue is empty";
		if(arr.length==0)
			throw new RecipientException(message);
		else {
		Recipient FRONT=arr[front+1];
		arr[front]=null;
		front=(front+1)%arr.length;
		capacity--;
		return FRONT;
		}
	}


	public boolean recipientLineEmpty() {
		return (arr.length==0);
	}

	
	public Recipient[] toArrayRecipient() {
		Recipient[] display=new Recipient[capacity];
		for(int x=0; x<(size); x++)
			display[x]=arr[x];
		return display;
	}

}
