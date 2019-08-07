package com.aa.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.aa.o2o.BaseTest;
import com.aa.o2o.entity.Area;

public class AreaDaoTest extends BaseTest{
	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void test1() {
		List<Area> areas = areaDao.queryArea();
		assertEquals(2, areas.size());
	}
}
