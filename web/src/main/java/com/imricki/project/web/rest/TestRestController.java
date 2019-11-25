package com.imricki.project.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imricki.project.domain.service.TestService;

@RestController
@RequestMapping(TestRestController.BASE_URL)
class TestRestController {

	@Autowired
	private TestService service;

	public static final String BASE_URL = "/api/v1/test";

	private final static Logger LOGGER = LoggerFactory.getLogger(TestRestController.class);

//	@ResponseBody
//	@RequestMapping(value = "/billingShift", method = RequestMethod.GET)
//	public ResponseEntity<?> billingWorker(@Valid @RequestBody ApiRequestWrapper request) {
//
//		BillingRestController.LOGGER.info("/billingWorker was called at web layer");
//
//		return new ResponseEntity<>(this.service.billingWorker(request), HttpStatus.OK);
//
//	}

}
