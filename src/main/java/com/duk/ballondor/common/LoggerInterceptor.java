package com.duk.ballondor.common;

import java.util.Collections;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggerInterceptor extends HandlerInterceptorAdapter{
	
	@SuppressWarnings("rawtypes")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		log.debug("=========================================LoggerInterceptor START =========================================");
		log.debug("URL [{}]," + request.getRequestURI());
		
		Enumeration paramNames = request.getParameterNames();
		while(paramNames.hasMoreElements()) {
			
			String key   = (String)paramNames.nextElement();
			String value = request.getParameter(key); 
			log.debug("RequestParameter Data => " + key + " : " + value + "");
		}
				
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
	
		log.debug("=========================================LoggerInterceptor END =========================================");
	}
}
