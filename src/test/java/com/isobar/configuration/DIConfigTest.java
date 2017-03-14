package com.isobar.configuration;

import static org.junit.Assert.*;

import org.junit.Test;

public class DIConfigTest {

	@Test
	public void testProductsManagement() {
		final DIConfig diConfig = new DIConfig();
	
		assertNotNull(diConfig.getBandServices());
	}
}
