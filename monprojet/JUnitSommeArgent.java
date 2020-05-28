package monprojet;

import org.junit.*;

/*
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
*/


class JUnitSommeArgent {
	SommeArgent m12CHF;
	SommeArgent m14CHF;
	SommeArgent m14USD;
	static int count = 0;

	@BeforeEach
	public void createCommonSommeArgent() {
		m12CHF = new SommeArgent(12, "CHF");
		m14CHF= new SommeArgent(14, "CHF");
		m14USD= new SommeArgent(14, "USD");
		count++;
		System.out.println("BEFORE test number : " + count);

	}

	@AfterEach
	public void printAfterTest() {
		System.out.println("AFTER test number : " + count);
	}

	@Test
	public void testEquals() {
		SommeArgent expected = new SommeArgent(26, "CHF");
		SommeArgent result = m12CHF.add(m14CHF); 
		Assert.assertTrue(expected.equals(result));		
	}
	
	
	@Test
	public void testEqualsMethod() {
		Assert.assertEquals(m12CHF, m12CHF);
		Assert.assertTrue(!m12CHF.equals(m14CHF));
		Assert.assertTrue(!m14USD.equals(m14CHF));	
	}
	
	/*
	 * 7) On teste le retour de la méthode equals, elle doit nous retourner false en comparant un objet 14 CHF et un objet 14 USD
	 * 8) Ok
	 * 9) ??
	 * 10) Ok
	 * 11) Exception / Throw
	*/
}
