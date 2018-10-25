package com.cg.springmvcone.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.springmvcone.dto.Mobile;
import com.cg.springmvcone.service.MobileService;

@Controller
public class MobileController {
	@Autowired
	MobileService mobileservice;
	@RequestMapping(value="/home")
public String getAllMobiles(@ModelAttribute("my") Mobile mob,Map<String,Object> model){
	List<String> myList=new ArrayList<String>();
	myList.add("android");
	myList.add("ios");
	myList.add("windows");
	model.put("cato", myList);
	return "addMobile";
}
	@RequestMapping(value="adddata",method=RequestMethod.POST)
	public String addMobiledata(@ModelAttribute("my") Mobile mobile){
		mobileservice.addMobile(mobile);
		//System.out.println(mobile.getMobileId()+" " +mobile.getMobileName() +" " +mobile.getMobilePrice()  +mobile.getOption());
		return "success";
	}
}
