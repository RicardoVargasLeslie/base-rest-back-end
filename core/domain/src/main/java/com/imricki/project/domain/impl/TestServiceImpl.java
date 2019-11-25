package com.imricki.project.domain.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.project.domain.service.TestService;
import com.imricki.project.persistence.repo.Repo;

@Service
public class TestServiceImpl implements TestService {

	private final static Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

	@Autowired
	private Repo repo;
}
