package concrete;

import abstracts.UserService;
import abstracts.UserCheckService;
import entities.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;
	
	
	
	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) throws Exception {
		if(userCheckService.isRealPerson(user)) {
			System.out.println("User added: "+user.getFirstName()+" "+user.getLastName());
		}else {
			throw new Exception("User informations is not valid.");
		}
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted."+user.getFirstName()+" "+user.getLastName());
	}

	@Override
	public void update(User user) {
		System.out.println("User updated successfully");
	}

}
