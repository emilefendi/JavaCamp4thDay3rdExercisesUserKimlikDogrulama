package concrete;

import java.rmi.RemoteException;

import abstracts.UserCheckService;
import entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean isRealPerson(User user) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
