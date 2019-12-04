package com.hkb.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.hkb.fallback.FallbackService;
import com.hkb.service.MemberService;

@FeignClient(name="app-member" ,fallback=FallbackService.class,path="/member")
public interface MemberServiceFeign extends MemberService{
	
}
