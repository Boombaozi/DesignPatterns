package Factory.cup;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
class Cup {
    private Cup(){
    }

    private static Cup cup;

    public static Cup cupFactory(){
        if(cup==null){
            cup=new Cup();
            return cup;
        }else {
            return cup;
        }
    }

    public  void d(String name){
        System.out.println(name+"喝水水");
    }
}
