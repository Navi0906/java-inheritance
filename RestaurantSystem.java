// Superclass: Person
class Person {
    String name;
    int id;

    // Constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties();
}

// Subclass: Chef
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println(name + " is a Chef, specializing in " + specialty + ". Prepares dishes.");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println(name + " is a Waiter, serves " + tablesAssigned + " tables.");
    }
}


public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Madhav", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Dhruv", 201, 5);

        chef.displayInfo();
        chef.performDuties();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
