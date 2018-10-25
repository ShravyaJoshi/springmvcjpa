package com.cg.springmvcone.service;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import org.springframework.transaction.annotation.Transactional;

import com.cg.springmvcone.dao.MobileDao;
//import com.cg.springmvcone.dao.Service;
import com.cg.springmvcone.dto.Mobile;
@Service("mobileservice")
@Transactional
public class MobileServiceImpl implements MobileService{
@Autowired
MobileDao mobiledao;
	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		mobiledao.addMobile(mobile);
	}

	@Override
	public List<Mobile> showMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public Mobile searchMobile(int mobId) {
		// TODO Auto-generated method stub
		return null;
	}

}
