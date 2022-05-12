public class Book {
    private String nameBook;
    private int yearOfPublication;
    private Authors authors;

    public Book(Authors authors, String nameBook, int yearOfPublication) {
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;


    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
}

class Authors {
    private String nameAuthors;
    private String surnameAuthors;

    public Authors(String nameAuthors, String surnameAuthors) {
        this.nameAuthors = nameAuthors;
        this.surnameAuthors = surnameAuthors;
    }

    public String getNameAuthors() {
        return this.nameAuthors;
    }

    public String getSurnameAuthors() {
        return this.surnameAuthors;
    }
}




