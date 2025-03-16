// Base Class: Course
class Course {
    String courseName;
    int duration;

    // Constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " hours");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }


    void displayInfo() {
        System.out.println("Online Course: " + courseName + ", Duration: " + duration + " hours, Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse (extends OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // percentage

    // Constructor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }


    void displayInfo() {
        System.out.println("Paid Online Course: " + courseName + ", Duration: " + duration + " hours, Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No") + ", Fee: $" + fee + ", Discount: " + discount + "%");
    }
}


public class CourseSystem {
    public static void main(String[] args) {
        Course course = new Course("C Programming", 40);
        OnlineCourse onlineCourse = new OnlineCourse("Java Basics", 50, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Python", 60, "Coursera", true, 199.99, 20.0);


        Course[] courses = { course, onlineCourse, paidCourse };

        for (Course c : courses) {
            c.displayInfo();
        }
    }
}
