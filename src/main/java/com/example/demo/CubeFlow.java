package com.example.demo;

import java.util.List;

import org.bson.types.ObjectId;

import lombok.Data;

//@Entity
@Data
public class CubeFlow {
	
	private ObjectId id;
	private String name;
	private List<Object> streamFlows;
	private List<Object> cubes;
}
