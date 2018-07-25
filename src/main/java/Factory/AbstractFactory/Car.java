package Factory.AbstractFactory;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class Car implements Moveable {
    public void run() {
        System.out.println("car");
    }

    public void stop() {
        System.out.println("car stop");
    }
}
