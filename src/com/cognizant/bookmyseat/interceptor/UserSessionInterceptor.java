package com.cognizant.bookmyseat.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserSessionInterceptor extends HandlerInterceptorAdapter{
	
	private static final long MAX_INACTIVE_SESSION_TIME = 180;
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("Pre handle method - check handling start time");
        if (System.currentTimeMillis() - request.getSession().getLastAccessedTime() > MAX_INACTIVE_SESSION_TIME) {
        	System.out.println("Logging out, due to inactive session");
            response.sendRedirect(request.getContextPath()+"/loginPage");
        }
        return true;
    }
}
