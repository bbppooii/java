public class Text {
    public static void main(String[] args) {
        Car car = new Car(150.5, 5, 1800.0, 4.5, 2.0);
        Airplane airplane = new Airplane(2500.0, 150, 45000.0, 50.0);
        Ship ship = new Ship(3000.0, 2000, 120000.0, 8000.0);
        Train train = new Train(1800.0, 800, 90000.0, 15);

        car.start();
        car.accelerate();
        car.steer();
        car.brake();
        car.stop();

        airplane.start();
        airplane.takeOff();
        airplane.steer();
        airplane.land();
        airplane.stop();

        ship.start();
        ship.sail();
        ship.steer();
        ship.anchor();
        ship.stop();

        train.start();
        train.depart();
        train.steer();
        train.stopAtStation();
        train.stop();
    }
}
