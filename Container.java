
public class Container implements ContainerInterface {
	private int top, capacity;
	DonationPackage[] arr;
	
	public Container(int size) {
		arr=new DonationPackage[size];
		capacity=size;
		top=-1;
	}
	
	public Container() {
		arr=new DonationPackage[0];
		top=0;
	}
	
	public boolean loadContainer(DonationPackage dPackage) throws ContainerException {
		if(top==(capacity-1))
			throw new ContainerException("This stack is full");
		else {
			arr[++top]=dPackage;
			return true;
		}
			
	}

	
	public DonationPackage removePackageFromContainer() throws ContainerException {
		if(arr.length==-1)
			throw new ContainerException("This stack is empty");
		else {
			if(top==0)
				return arr[0];
			else
				return arr[top--];
		}
	}

	
	public DonationPackage[] toArrayPackage() {
		DonationPackage[] display=new DonationPackage[capacity];
		for(int x=0; x<capacity; x++)
			display[x]=arr[x];
		return display;
	}

}
