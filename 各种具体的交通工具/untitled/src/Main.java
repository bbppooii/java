// Vehicle 类，表示交通工具的基本特征和行为
class Vehicle {
    private double power;
    private int capacity;
    private double weight;

    public Vehicle(double power, int capacity, double weight) {
        this.power = power;
        this.capacity = capacity;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Vehicle started.");
    }

    public void steer() {
        System.out.println("Vehicle steering.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Car 类，表示汽车，继承自 Vehicle 类，并包含汽车特有的属性和行为
class Car extends Vehicle {
    private double length;
    private double width;

    public Car(double power, int capacity, double weight, double length, double width) {
        super(power, capacity, weight);
        this.length = length;
        this.width = width;
    }

    public void accelerate() {
        System.out.println("Car accelerating.");
    }

    public void brake() {
        System.out.println("Car braking.");
    }
}

// Airplane 类，表示飞机，继承自 Vehicle 类，并包含飞机特有的属性和行为
class Airplane extends Vehicle {
    private double wingspan;

    public Airplane(double power, int capacity, double weight, double wingspan) {
        super(power, capacity, weight);
        this.wingspan = wingspan;
    }

    public void takeOff() {
        System.out.println("Airplane taking off.");
    }

    public void land() {
        System.out.println("Airplane landing.");
    }
}

// Ship 类，表示轮船，继承自 Vehicle 类，并包含轮船特有的属性和行为
class Ship extends Vehicle {
    private double displacement;

    public Ship(double power, int capacity, double weight, double displacement) {
        super(power, capacity, weight);
        this.displacement = displacement;
    }

    public void sail() {
        System.out.println("Ship sailing.");
    }

    public void anchor() {
        System.out.println("Ship anchoring.");
    }
}

// Train 类，表示火车，继承自 Vehicle 类，并包含火车特有的属性和行为
class Train extends Vehicle {
    private int carriageCount;

    public Train(double power, int capacity, double weight, int carriageCount) {
        super(power, capacity, weight);
        this.carriageCount = carriageCount;
    }

    public void depart() {
        System.out.println("Train departing.");
    }

    public void stopAtStation() {
        System.out.println("Train stopping at station.");
    }
}

// 测试类
