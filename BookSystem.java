class Book{
    String title;
    int publicationYear;

    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo(){
        System.out.println(title+" book was published in "+publicationYear);
    }
}

class Author extends Book{
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }

    void displayInfo(){
        System.out.println(title+" book was published in "+publicationYear+" by "+name+". Bio: "+bio);
    }
}

public class BookSystem {
    public static void main(String[] args) {
        Book book1 = new Author("The Fault In Our Stars", 2014, "Robert", "Romantic book about a couple wanna be together but their fate was different.");
        book1.displayInfo();
    }
}
