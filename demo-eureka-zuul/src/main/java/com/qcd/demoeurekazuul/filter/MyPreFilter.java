package com.qcd.demoeurekazuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class MyPreFilter extends ZuulFilter {
    @Override //过滤器执行类型
    public String filterType() {
        return "pre";
    }

    //过滤器执行顺序
    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override    //执行过程
    public Object run() throws ZuulException {
        System.out.println("MyPreFilter");
        return null;
    }
}
