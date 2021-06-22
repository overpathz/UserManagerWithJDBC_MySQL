package com.pathz.UserManager.filters;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//@WebServlet("/users")
//public class AuthFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//
//        HttpSession httpSession = request.getSession(false);
//
//        if (httpSession == null || httpSession.getAttribute("user") == null) {
//            request.getRequestDispatcher("/login").forward(request, response);
//        } else {
//            filterChain.doFilter(request, response);
//        }
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
