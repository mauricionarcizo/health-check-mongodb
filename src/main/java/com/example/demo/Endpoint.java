package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Endpoint {
	
	@Autowired
	private CubeFlowRepository repository;

	@GetMapping("cubeFlow")
	public List<CubeFlow> getCubeFlow() {
		return repository.findAll();
	}

}
