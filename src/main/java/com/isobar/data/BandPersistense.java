package com.isobar.data;

import java.util.List;

import com.isobar.model.Band;

public class BandPersistense {
	
	public static List<Band> allBands;
	
	public static Band retriveBandById(String id) {
		Band foundBand = null;
		for (Band band : allBands) {
			if(band.getId().equals(id)) {
				foundBand = band;
				break;
			}
		}
		return foundBand;
	}
}
