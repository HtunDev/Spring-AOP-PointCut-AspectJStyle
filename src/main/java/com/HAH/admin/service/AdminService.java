package com.HAH.admin.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService {

	public void doOperation() {
		System.out.println("Do operation for admin service");
	}
	
	public void doForAccount() {
		System.out.println("Do operation for admin service's account");
	}
}
