package com.isobar.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.isobar.data.BandPersistense;
import com.isobar.model.Band;

public class BandServicesImplTest {
	
	private BandServicesImpl bandServices = new BandServicesImpl();
	
	@Before
	public void init() {
		BandPersistense.allBands = new ArrayList<Band>();
	}
	
	@Test
	public void retrieveAllBands() {
		final Band b1 = new Band();
		b1.setName("band1");
		
		final Band b2 = new Band();
		b2.setName("band2");
		
		BandPersistense.allBands.add(b1);
		BandPersistense.allBands.add(b2);
		
		List<Band> retrievedList = bandServices.retrieveAllBands();
		
		assertEquals(2, retrievedList.size());
		assertEquals("band1", retrievedList.get(0).getName());
		assertEquals("band2", retrievedList.get(1).getName());		
	}

	@Test
	public void testRetrieveBandByIdWithValidId() {
		
		final Band b1 = new Band();
		b1.setId("1");
		
		final Band b2 = new Band();
		b2.setId("2");
		
		final Band b3 = new Band();
		b3.setId("3");
		
		BandPersistense.allBands.add(b1);
		BandPersistense.allBands.add(b2);
		BandPersistense.allBands.add(b3);
		
		Band retrievedBand = BandPersistense.retriveBandById("2");
		
		assertEquals("2", retrievedBand.getId());
	}
	
	@Test
	public void testRetrieveBandByIdWithNotExistingId() {
		
		final Band b1 = new Band();
		b1.setId("1");
		
		final Band b2 = new Band();
		b2.setId("2");
		
		final Band b3 = new Band();
		b3.setId("3");
		
		BandPersistense.allBands.add(b1);
		BandPersistense.allBands.add(b2);
		BandPersistense.allBands.add(b3);
		
		Band retrievedBand = BandPersistense.retriveBandById("4");
		
		assertNull(retrievedBand);
	}
	
	@Test
	public void testRetrieveBandByIdWithNullList() {
		
		Band retrievedBand = BandPersistense.retriveBandById("4");
		
		assertNull(retrievedBand);
	}
}
