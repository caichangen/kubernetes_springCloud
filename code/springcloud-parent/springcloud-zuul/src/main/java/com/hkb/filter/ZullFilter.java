package com.hkb.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class ZullFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
		
		return null;
	}

	@Override
	public boolean shouldFilter() {

		return true;
	}

	@Override
	public int filterOrder() {

		return 0;
	}

	@Override
	public String filterType() {

		return null;
	}

}
