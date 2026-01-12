package sections2.advancedJava;

abstract  class Car {

    public  abstract void drive();

    public void  playMusic(){
        System.out.println("Play Songs");
    }

}

class WagorR extends Car{

    public void drive(){
        System.out.println("Driving...");
    }
}


public class M1AbstractDemo {
    public static void main(String[] args) {
        Car car = new WagorR();
        car.drive();
        car.playMusic();
    }
}
