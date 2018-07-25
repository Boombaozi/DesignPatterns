package Factory.Factory1;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class Main {
    public static void main(String[] args) {



        VehicleFactory factory=new PlaneFactory();
           Moveable moveable=factory.get();
           moveable.run();
           moveable.stop();
    }
}
