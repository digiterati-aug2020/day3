package com.digiterati.proxy.zuul.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class PostFilter extends ZuulFilter {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PostFilter.class);

	@Override
	public Object run() throws ZuulException {
		LOGGER.info("inside post filter ==========================================");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "post";
	}

}
