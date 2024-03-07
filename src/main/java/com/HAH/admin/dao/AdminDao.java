package com.HAH.admin.dao;

import org.springframework.stereotype.Repository;

import com.HAH.aspect.AdminAnnotation;

@AdminAnnotation
@Repository
public class AdminDao {

	public void search() {
		System.out.println("Search operation for adminDao");
	}
	
	public void save() {
		System.out.println("Save operation for adminDao");
	}
}
