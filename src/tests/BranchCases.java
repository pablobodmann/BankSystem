package tests;



import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bank_classes.Branch;
import bank_classes.User;
import bankexceptions.UserNotFoundException;

public class BranchCases {
	Branch b;
	List<User> clerks, client;


	@Before
	public void setUp() throws Exception {
		 client = new ArrayList<User>();
		 clerks = new ArrayList<User>();		 	
		 b = new Branch("193022","Agência Centro",client, clerks);
	}



	@Test(expected = UserNotFoundException.class) 
	public void cant_get_inexistent_client() throws UserNotFoundException {
		String inexistent_user = "John Constantine";
		b.get_client(inexistent_user);
	}

}
