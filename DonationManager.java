
public class DonationManager implements DonationManageInterface{
	
	
	public boolean managerLoadContainer(DonationPackage dPackage) throws ContainerException {
		if(dPackage.isFu)
		return false;
	}


	public boolean managerQueueVolunteer(Volunteer v) throws VolunteerException {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean managerQueueRecipient(Recipient r) throws RecipientException {
		// TODO Auto-generated method stub
		return false;
	}


	public int donatePackage() throws VolunteerException, ContainerException, RecipientException {
		// TODO Auto-generated method stub
		return 0;
	}


	public DonationPackage[] managerArrayPackage() {
		// TODO Auto-generated method stub
		return null;
	}


	public Volunteer[] managerArrayVolunteer() {
		// TODO Auto-generated method stub
		return null;
	}


	public Recipient[] managerArrayRecipient() {
		// TODO Auto-generated method stub
		return null;
	}

}
