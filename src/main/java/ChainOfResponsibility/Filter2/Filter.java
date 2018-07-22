package ChainOfResponsibility.Filter2;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public interface Filter {

    void doFilter(Request request,Response response,FilterChain filterChain);
}
