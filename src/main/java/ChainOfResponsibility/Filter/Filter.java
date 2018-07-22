package ChainOfResponsibility.Filter;

import ChainOfResponsibility.Filter2.Request;
import ChainOfResponsibility.Filter2.Response; /**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07-22 17
 **/
public interface Filter {
    String doFilter(String str);

}
