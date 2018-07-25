package Factory.AbstractFactory;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class Plane implements Moveable {
    public void run() {
        System.out.println("Plane");
    }

    public void stop() {
        System.out.println("Plane stop");
    }
}
