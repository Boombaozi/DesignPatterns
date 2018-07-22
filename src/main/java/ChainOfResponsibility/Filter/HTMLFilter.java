package ChainOfResponsibility.Filter;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class HTMLFilter implements Filter {

    public String doFilter(String str) {
        String r=str.replace('<','[')
                .replace('>',']');
        return r;
    }
}
