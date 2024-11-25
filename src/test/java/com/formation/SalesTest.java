package com.formation;
import org.junit.Assert;
import org.junit.Test;

public class SalesTest {
	
	private int ca;

	@Test
	public void testCalculerSalaire() {
		Salesman s = new Salesman("Pierre", "Business", 45, "1995", 30000);
		Assert.assertEquals(0.0, s.calculerSalaire(),0);
	}
	
	@Test
	public void testCalculerSalaire1() {
		Salesman s = new Salesman("Pierre", "Business", 45, "1995", 30000);
		Assert.assertEquals( 6400, s.calculerSalaire(),0);
	}
	
	@Test
	public double testCalculerSalaire2() throws Exception{
		Salesman s = new Salesman("Pierre", "Business", 45, "1995", 30000);
		
		if( ca < 0) {
			throw new Exception("Le chiffre d'affaire ne peux pas etre négatif");
		}
		return this.ca * 0.2 + 400;
	}
	
}
