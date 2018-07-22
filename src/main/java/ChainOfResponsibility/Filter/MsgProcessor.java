package ChainOfResponsibility.Filter;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class MsgProcessor {

   private String msg;

  // Filter[] filters=new Filter[]{new HTMLFilter(),new SensitiveFilter()};
    private   FilterChain fc;

    public FilterChain getFc() {
        return fc;
    }

    public void setFc(FilterChain fc) {
        this.fc = fc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process(){

         return fc.doFilter(msg);
    }
}
