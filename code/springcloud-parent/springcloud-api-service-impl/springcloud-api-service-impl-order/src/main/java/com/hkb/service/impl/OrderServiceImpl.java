package com.hkb.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hkb.entity.pojo.User;
import com.hkb.feign.MemberServiceFeign;
import com.hkb.service.OrderService;
import com.spring4all.swagger.EnableSwagger2Doc;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController()
@EnableSwagger2Doc
@Api("订单服务接口")
@RequestMapping("order")
public class OrderServiceImpl implements OrderService{

		@Autowired
		private MemberServiceFeign memberServiceFeign;
		
		@ApiOperation(value = "根据名称获取会员信息接口", nickname = "根据name获取用户相关信息")
		@ApiImplicitParam(name = "name", value = "用户名称", required = true, dataType = "String")
		@GetMapping("/orderToMember")
		public ResponseEntity<?> orderToMember(@RequestParam("name")String name) {
			User user = memberServiceFeign.getMember(name);
			System.out.println("orderToMember:" + "当前线程池名称:" + Thread.currentThread().getName());
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
		
		@ApiOperation(value = "获取会员信息接口", nickname = "根据userName获取用户相关信息")
		@GetMapping("/orderToUserInfo")
		public ResponseEntity<?> orderToUserInfoHystrix() {
			List<User> list = new ArrayList<User>();
			User user = new User();
			user.setId(51);
			user.setName("测试1");
			list.add(user);
			User user2 = new User();
			user2.setId(565);
			user2.setName("测试5");
			list.add(user2);
			System.out.println("orderToUserInfo:" + "当前线程池名称:" + Thread.currentThread().getName());
			int i = memberServiceFeign.insertUsers(list);
			System.out.println("数量 : "+i);
			//return new ResponseEntity<User>(memberServiceFeign.getUserInfo(),HttpStatus.OK);
			return new ResponseEntity<Integer>(i,HttpStatus.OK);
		}
		
		/*@RequestMapping("error")
		public ResponseEntity<?> error(){
			return new ResponseEntity<String>("系统出错",HttpStatus.INTERNAL_SERVER_ERROR);
		}*/
}


