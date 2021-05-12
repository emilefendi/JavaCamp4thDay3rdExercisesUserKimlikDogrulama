package abstracts;

import java.rmi.RemoteException;

import entities.User;

public interface UserCheckService {
	boolean isRealPerson(User user) throws RemoteException;

}
