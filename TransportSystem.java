// Superclass
class Vehicle {
    int maxSpeed;
    String fuelType;

    // Constructor
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("This is a vehicle with a max speed of " + maxSpeed + " km/h and runs on " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    void displayInfo() {
        System.out.println("This Car has a max speed of " + maxSpeed + " km/h, runs on " + fuelType + ", and has a seat capacity of " + seatCapacity);
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    void displayInfo() {
        System.out.println("This Truck has a max speed of " + maxSpeed + " km/h, runs on " + fuelType + ", and can carry " + loadCapacity + " tons.");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    void displayInfo() {
        System.out.println("This Motorcycle has a max speed of " + maxSpeed + " km/h, runs on " + fuelType + ", and has a sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class to test polymorphism
public class TransportSystem {
    public static void main(String[] args) {
        // Array of Vehicle type storing different subclasses
        Vehicle[] vehicles = {
                new Car(200, "Petrol", 5),
                new Truck(120, "Diesel", 15),
                new Motorcycle(180, "Petrol", false)
        };

        // Loop through the array and call displayInfo() (Polymorphism)
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
