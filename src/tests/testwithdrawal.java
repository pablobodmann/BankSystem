package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class testwithdrawal {

	@Test
	public void withdraw_value_test() {
		Date hoje=new Date(1,11,25);
		Withdrawal obj=new Withdrawal("AAAA", hoje, 1999, "BBBB");
		assertEquals(obj.get_value(),-1999);
	}

}
