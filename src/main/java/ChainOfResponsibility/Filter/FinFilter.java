package ChainOfResponsibility.Filter;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class FinFilter implements Filter {
    public String doFilter(String str) {
        str="管理员："+str;

        return str;
    }
}
