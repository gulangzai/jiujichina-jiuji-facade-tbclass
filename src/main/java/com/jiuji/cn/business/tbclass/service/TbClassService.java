package com.jiuji.cn.business.tbclass.service;

import java.util.List;

import com.lanbao.base.PageData;

public interface TbClassService {

	public List<PageData> queryAll() throws Exception ;

	public List<PageData> queryAllson(PageData pageData) throws Exception ;
	
}
