package com.isobar.services;

import java.util.List;

import com.isobar.data.BandPersistense;
import com.isobar.model.Band;

public class BandServicesImpl implements BandServices {

	@Override
	public List<Band> retrieveAllBands() {
		return BandPersistense.allBands;
	}

	@Override
	public Band retrieveBandById(String id) {
		return BandPersistense.retriveBandById(id);
	}
}
