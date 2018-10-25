package com.cg.springmvcone.dao;

import java.util.List;

import com.cg.springmvcone.dto.Mobile;



public interface MobileDao {

		public void addMobile(Mobile mobile);
		public List<Mobile> showMobile();
		public void deleteMobile(int mobId);
		public Mobile searchMobile(int mobId);
}
