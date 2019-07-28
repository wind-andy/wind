package com.wind.resolver;


import com.wind.system.vo.SysUserVo;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:对request中的userVo对像封装方法入参
 * Copyright (c) Department of Research and Development/Beijing
 * All Rights Reserved.
 *
 * Description:
 * Version1.0 2019/7/14 9:10 AM by 张振涛（zhangzt@cloud-young.com）创建
 */
@Component
public class CustomAugmentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().equals(SysUserVo.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) {
        if (methodParameter.getParameterType().equals(SysUserVo.class)){
            HttpServletRequest request = nativeWebRequest.getNativeRequest(HttpServletRequest.class);
            return request.getAttribute("user");
        }
        return null;
    }
}
