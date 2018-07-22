package ChainOfResponsibility.Filter;



import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class FilterChain implements  Filter{

    List<Filter> list=new ArrayList<Filter>();

    public FilterChain addFilter(Filter f){
        this.list.add(f);
        return this;
    }
    public String doFilter(String str){

        for(Filter f:list){
            str=f.doFilter(str);
        }
         return str;
    }
}
