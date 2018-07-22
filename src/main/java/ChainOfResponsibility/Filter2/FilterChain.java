package ChainOfResponsibility.Filter2;



import ChainOfResponsibility.Filter2.Filter;

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

    int index=0;

    public FilterChain addFilter(Filter f){
        this.list.add(f);
        return this;
    }

    public void doFilter(Request request,Response response,FilterChain filterChain){
        System.out.println(index);
       if(index==list.size()){
           System.out.println("返回");
           return;
       }

       Filter f= list.get(index);
       index++;
       f.doFilter(request,response,filterChain);

    }
}
