package Factory.cup;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class Main {
    public static void main(String[] args) {
       Cup cup= Cup.cupFactory();
       Cup cup1=Cup.cupFactory();
        System.out.println(cup==cup1);

    }



}
