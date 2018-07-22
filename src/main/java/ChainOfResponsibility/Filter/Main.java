package ChainOfResponsibility.Filter;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class Main {
    public static void main(String[] args) {
        String msg="大家好:),<script>,敏感，被就业，网络授课啊啊啊，哈哈哈";



        //设置消息处理类
        MsgProcessor mp= new MsgProcessor();
        mp.setMsg(msg);

        //处理链
        FilterChain filterChain =new FilterChain();

        //加入想要的filter
        filterChain.addFilter(new HTMLFilter())
                   .addFilter(new SensitiveFilter());
        //处理链
        FilterChain filterChain2 =new FilterChain();

        //加入想要的filter
        filterChain2.addFilter(new FinFilter());


        filterChain.addFilter(filterChain2);

        //放入
        mp.setFc(filterChain);


        String result=mp.process();
        System.out.println(result);

    }
}
