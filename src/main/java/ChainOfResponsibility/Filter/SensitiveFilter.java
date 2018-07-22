package ChainOfResponsibility.Filter;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class SensitiveFilter implements Filter {
    public String doFilter(String str) {
       String r=str.replace("被就业","就业")
                .replace("敏感","");
        return r;
    }
}
