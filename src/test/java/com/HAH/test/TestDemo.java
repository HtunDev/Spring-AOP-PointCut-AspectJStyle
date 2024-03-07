package com.HAH.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.HAH.admin.dao.AdminDao;
import com.HAH.configuration.AppConfig;
import com.HAH.member.dao.MemberDao;

@SpringJUnitConfig(classes = AppConfig.class)
public class TestDemo {
	
	@Autowired
	AdminDao adminDao;
	
	@Autowired
	MemberDao memberDao;
	
	@Test
	void demoTest() {
		adminDao.search();
		memberDao.searchData();
	}

}
