class Management {
    String name;
    int id;
    int salary;

    //Constructor
    Management(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println(name+" is an employee!!");
    }

}
//Subclass
class Manager extends Management{
    int teamSize;
    Manager(String name, int id, int salary, int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }

    void displayDetails(){
        System.out.println(name+" is a manager with team size of "+teamSize+" and salary of Rs."+salary);
    }
}
//Subclass
class Developer extends Management{
    String programmingLanguage;

    Developer(String name, int id, int salary, String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails(){
        System.out.println(name+" is a Developer with skill in "+programmingLanguage+" and salary of Rs."+salary);
    }
}
//Subclass
class Intern extends Management {

    Intern(String name, int id, int salary){
        super(name,id,salary);
    }

    void displayDetails(){
        System.out.println(name+" is an Intern with salary of Rs."+salary);
    }
}

public class ManagementSystem{
    public static void main(String[] args) {
        Management p1 = new Manager("Naman", 25, 1200000, 5 );
        Management p2 = new Developer("Madhav", 28, 2300000, "Python");
        Management p3 = new Intern("Dhruv",30, 450000);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}



