import java.util.Random;

public class Car {
    String model;
    int year;
    Integer price;
    String color;
    int power;
    Integer fuel;
    private boolean status;
    private boolean broken;
    private double consumptionFuel;

    Car(String model, int year, Integer price, String color, int power, Integer fuel) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.fuel = fuel;
    }
    public void getInfo(){
        System.out.printf("Модель: %s, Год выпуска: %s, цена: %s, цвет: %s, мощность: %x ЛС,"+
        " топлива в баке: %s", model, year, price, color, power, fuel);
    }
    public void getStatus(){
        if (status) {
            System.out.println("Автомобиль заведен");
        }else{
            System.out.println("Автомобиль не заведен");
        }
    }
    public void getBroken(){
        if (broken) {
            System.out.println("Автомобиль сломан!");
        }else{
            System.out.println("Автомобиль исправен!");
        }
    }
    public void getConsumptionFuel(){
        fuelСonsumption();
        System.out.println("Расход" + consumptionFuel + " литров на 100 км");
    }
    public void setFuel(int liters){
        this.fuel = liters;
    }
    public void setPrice(int money){
        this.price = money;
    }

    public void start(){
        if (fuel != 0) {
            this.status = true;
            System.out.println("Автомобиль заведен");
        }else{
            System.out.println("Не заводится! Топливо кончилось");
        }
        
    }
    public void stop(){
        this.status = false;
        System.out.println("Автомобиль заглушен");
    }
    public void road(String address, Integer distance){
        autoBrokenStatus();
        if (status == false){
            System.out.println("Автомобиль не заведен! ");
            }else{
                if (broken) {
                    System.out.println("Автомобиль сломался! ");
                    stop();
                }else{
                    System.out.println("Едем по адресу: " + address);
                    fuelСonsumption();
                    if (fuel / ((consumptionFuel/100)) >= distance){
                        System.out.printf("Дистанция: %s, расход: %s, в баке %s ", distance, consumptionFuel, fuel);
                        autoBrokenStatus();
                        if (!broken) {
                            System.out.println("Вы успешно приехали! ");
                        }else{
                            System.out.println("Машина сломалась! ");
                            stop();
                        }
                        
                    }else{
                        System.out.printf("Дистанция: %s, расход: %s, в баке %s ", distance, consumptionFuel, fuel);
                        System.out.printf("Кончился бензин. Вы не доехали ");
                    }
                    
                }
            }
        
    }
    private void autoBrokenStatus(){
        Random random = new Random();
        int res = random.nextInt(0,3);
        if (res == 1) {
            broken = true;
        }else{
            broken = false;
        }
    }
    private void fuelСonsumption(){
        Random random = new Random();
        consumptionFuel = random.nextInt(2,31);
    }
    
}
