public class VolunteerLine implements VolunteerLineInterface{
	private int size, front, back, capacity;
	Volunteer[] arr;
	
	public VolunteerLine(int s) {
		arr=new Volunteer[s];
		front=0;
		back=s-1;
		size=s;
		capacity=0;
	}
	
	public VolunteerLine() {
		size=0;
		front=0;
		back=0;
		arr=new Volunteer[0];
		capacity=0;
	}
	
	public boolean addNewVolunteer(Volunteer v) throws VolunteerException {
		String message="Volunteer queue is full";
		if(arr.length==capacity)
			throw new VolunteerException(message);
		else {
			arr[back]=v;
			back=(back+1)%arr.length;
			capacity++;
			return true;
		}
			
	}

	public Volunteer volunteerTurn() throws VolunteerException {
		String message="Volunteer queue is empty";
		if(arr.length==0)
			throw new VolunteerException(message);
		else {
		Volunteer Front=arr[front];
		arr[front]=null;
		front=(front+1)%arr.length;
		capacity--;
		return Front;
		}
	}

	public boolean volunteerLineEmpty() {
		return (arr.length==0);
	}

	public Volunteer[] toArrayVolunteer() {
		Volunteer[] display=new Volunteer[size];
		return display;
	}

}