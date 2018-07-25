package Factory.Factory1;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/
public class CarFactory extends VehicleFactory {

    public Moveable get() {
        return new Car();
    }
}
