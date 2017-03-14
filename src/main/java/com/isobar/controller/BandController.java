package com.isobar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isobar.model.Band;
import com.isobar.services.BandServices;

@Controller
@RequestMapping(value = "rest/bands/")
public class BandController {
	
	@Autowired
	private BandServices bandServices;
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<Band> listAllBands() throws Exception {
		return bandServices.retrieveAllBands();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Band retrieveBand(@PathVariable("id") String id) throws Exception {
		return bandServices.retrieveBandById(id);
	}
}
