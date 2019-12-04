package com.hkb.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hkb.entity.pojo.User;
import com.hkb.feign.MemberServiceFeign;
import com.hkb.handler.MessageCenterException;

@Component
public class FallbackService implements MemberServiceFeign{

	@Override
	public User getMember(String name) {
		return null;
	}

	@Override
	public User getUserInfo() {
		System.out.println("orderToUserInfo:" + "当前线程池名称:" + Thread.currentThread().getName());
		throw new MessageCenterException("系统忙,请稍后重试!");
	}

	@Override
	public Integer insertUsers(List<User> list) {
		throw new MessageCenterException("系统忙,请稍后重试!");
	}


}
