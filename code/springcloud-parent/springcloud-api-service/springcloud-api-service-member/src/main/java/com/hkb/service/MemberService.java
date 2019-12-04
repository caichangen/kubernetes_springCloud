package com.hkb.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hkb.entity.pojo.User;

public interface MemberService {
	
	@RequestMapping("/getMember")	
	User getMember(@RequestParam("name") String name);
	
	@RequestMapping("/getUserInfo")
	User getUserInfo();
	
	@RequestMapping("/insertUsers")
	Integer insertUsers(@RequestBody List<User> list);
}
