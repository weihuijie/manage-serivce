package com.x.manage.common.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: whj
 * @date: 2021/10/26
 *
 * @description: 请求拦截器
*/
@Slf4j
public class RequestInterceptor implements HandlerInterceptor {

    /**
     * Controller方法处理之前
     * 若返回false，则中断执行，注意：不会进入afterCompletion
     */
    @Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
        // 请求日志
        String uri = request.getRequestURI();
        log.info("接受到请求：" + uri);
        return true;
    }

    /**
     * Controller方法处理完之后，DispatcherServlet进行视图的渲染之前，也就是说在这个方法中可以对ModelAndView进行操作
     *  postHandle虽然post打头，但post、get方法都能处理
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * DispatcherServlet进行视图的渲染之后,多用于清理资源
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
