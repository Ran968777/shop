package com.aa.o2o.dao;

import java.util.List;

import com.aa.o2o.entity.Area;

public interface AreaDao {
	/**
	 * 列出区域列表
	 * @return
	 */
	List<Area> queryArea();
}
