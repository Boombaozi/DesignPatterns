package ChainOfResponsibility.Filter2;


/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class HTMLFilter implements Filter {


    public void doFilter(Request request, Response response,FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr().replace('>',']')
                                                      .replace('<','[')
        );
        filterChain.doFilter(request, response,filterChain);
        response.setResponseStr(response.getResponseStr()+"HTTPFilter");
    }
}
