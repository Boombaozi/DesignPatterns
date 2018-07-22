package ChainOfResponsibility.Filter2;

import ChainOfResponsibility.Filter2.FilterChain;
import ChainOfResponsibility.Filter2.*;
import ChainOfResponsibility.Filter2.HTMLFilter;
import ChainOfResponsibility.Filter2.SensitiveFilter;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class Main {
    public static void main(String[] args) {
        String msg="大家好:),<script>,敏感，被就业，网络授课啊啊啊，哈哈哈";
        Request request=new Request();
        request.setRequestStr(msg);
        Response response=new Response();
        response.setResponseStr("response");

        //处理链
        FilterChain filterChain =new FilterChain();

        //加入想要的filter
        filterChain.addFilter(new HTMLFilter())
                   .addFilter(new SensitiveFilter());


        filterChain.doFilter(request,response,filterChain);

        System.out.println(request.getRequestStr()+"  "+response.getResponseStr());



    }
}
