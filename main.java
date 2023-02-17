import java.util.Random;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car("ВАЗ", 2010, 300, "черный", 97, 30);
        //car1.start();
        //car1.stop();
        //car1.getConsumptionFuel();
        //car1.road("Ленина", 160);
        car1.setFuel(40);
        car1.getInfo();
    }

}
