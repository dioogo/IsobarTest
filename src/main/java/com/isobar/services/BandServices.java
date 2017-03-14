package com.isobar.services;

import java.util.List;

import com.isobar.model.Band;

public interface BandServices {
	
	List<Band> retrieveAllBands();
	
	Band retrieveBandById(String id);

}
