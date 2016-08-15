package com.dmitrysl.web.springbootangular2.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

	public String test() {
        return "Hello, World!";
    }

}
