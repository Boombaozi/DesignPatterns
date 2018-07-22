package ChainOfResponsibility.Filter2;


/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class SensitiveFilter implements Filter {


    public void doFilter(Request request, Response response,FilterChain filterChain) {

        request.setRequestStr(request.getRequestStr().replace("被就业","就业")
                                                     .replace("敏感",""));

        filterChain.doFilter(request, response, filterChain);

        response.setResponseStr(response.getResponseStr()+"SensitiveFilter");

    }

}
