package com.hkb.service.impl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hkb.entity.pojo.User;
import com.hkb.service.MemberService;
import com.spring4all.swagger.EnableSwagger2Doc;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@EnableSwagger2Doc
@Api("会员服务接口")
@RequestMapping("member")
public class MemberServiceImpl implements MemberService {

	@ApiOperation("根据用户名称获取用户")
	@GetMapping("/getMember")
	public User getMember(String name) {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		User user = new User();
		user.setName(name);
		user.setId(10);
		return user;
	}

	@ApiOperation("获取用户")
	@GetMapping("/getUserInfo")
	public User getUserInfo() {
		User user = new User();
		user.setName(Thread.currentThread().getName());
		user.setId(10);
		return user;
	}

	@ApiOperation("保存用户")
	@PostMapping("/insertUsers")
	public Integer insertUsers(@RequestBody List<User> list) {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (list != null && !list.isEmpty()) {
			System.out.println(list);
			return list.size();
		}
		return 0;
	}

	public static void main(String[] args) {

		class ListNode {
			int val;
			ListNode next;

			ListNode(int x) {
				val = x;
			}

			@Override
			public String toString() {
				return "ListNode [val=" + val + ", next=" + next + "]";
			}
			
		}
		ListNode l1 = new ListNode(2);
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(3);
		l12.next=l13;
		l1.next=l12;
		
		ListNode l2 = new ListNode(5);
		ListNode l22 = new ListNode(6);
		ListNode l23 = new ListNode(4);
		l22.next=l23;
		l2.next=l22;
		
				
		String str1 = "";
		String str2 = "";
		while (l1 != null) {
			str1 += l1.val;
			l1 = l1.next;
		}
		while (l2 != null) {
			str2 += l2.val;
			l2 = l2.next;
		}
		Integer result = Integer.parseInt(str1) + Integer.parseInt(str2);
		if (result > 0) {
			ListNode nodes = new ListNode(0);
			ListNode resultNode = nodes;
			char[] charArray = result.toString().toCharArray();
			int length = charArray.length;
			for (int i = length-1; i >=0; i--) {
				nodes.val = Integer.parseInt(String.valueOf(charArray[i]));
				if (i>0) {
					ListNode node = new ListNode(0);
					nodes.next = node;
					nodes = node;
				}
			}
		}
	}
}
