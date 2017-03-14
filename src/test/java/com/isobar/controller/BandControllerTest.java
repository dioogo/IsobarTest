package com.isobar.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.isobar.model.Band;
import com.isobar.services.BandServices;



public class BandControllerTest {

	@Mock
	private BandServices bandServices;
	
	@InjectMocks
	private BandController controller;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testListAllBands() throws Exception {
		final Band b1 = new Band();
		b1.setName("band1");
		
		final Band b2 = new Band();
		b2.setName("band2");
		
		List<Band> listToReturn = new ArrayList<Band>();
		listToReturn.add(b1);
		listToReturn.add(b2);
		
		Mockito.when(bandServices.retrieveAllBands()).thenReturn(listToReturn);
		List<Band> retrievedList = controller.listAllBands();
		
		assertEquals(2, retrievedList.size());
		assertEquals("band1", retrievedList.get(0).getName());
		assertEquals("band2", retrievedList.get(1).getName());
	}
	
	@Test
	public void testRetrieveBand() throws Exception {
		
		final Band b1 = new Band();
		b1.setName("band1");
		
		Mockito.when(bandServices.retrieveBandById("123")).thenReturn(b1);
		Band retrievedBand = controller.retrieveBand("123");
		
		assertEquals("band1", retrievedBand.getName());
	}
	
	@Test
	public void testRetrieveBandWithInvalidId() throws Exception {
		
		final Band b1 = new Band();
		b1.setName("band1");
		
		Mockito.when(bandServices.retrieveBandById("123")).thenReturn(b1);
		Band retrievedBand = controller.retrieveBand("1234");
		
		assertNull(retrievedBand);
	}
	
	@Test
	public void testRetrieveBandWithNullId() throws Exception {
		
		final Band b1 = new Band();
		b1.setName("band1");
		
		Mockito.when(bandServices.retrieveBandById("123")).thenReturn(b1);
		Band retrievedBand = controller.retrieveBand(null);
		
		assertNull(retrievedBand);
	}
	
	@Test
	public void testRetrieveBandWithEmptyId() throws Exception {
		
		final Band b1 = new Band();
		b1.setName("band1");
		
		Mockito.when(bandServices.retrieveBandById("123")).thenReturn(b1);
		Band retrievedBand = controller.retrieveBand("");
		
		assertNull(retrievedBand);
	}
}
