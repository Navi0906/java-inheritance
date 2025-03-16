// Superclass: Person
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher, teaches: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student, in Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is a Staff member, works in: " + department + " department");
    }
}


public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Madhav", 16, "10th Grade");
        Staff st = new Staff("Dhruv", 35, "Administration");

        t.displayDetails();
        t.displayRole();

        s.displayDetails();
        s.displayRole();

        st.displayDetails();
        st.displayRole();
    }
}
