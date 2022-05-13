public class Book {
    private String nameBook;
    private int yearOfPublication;
    private Authors authors;

    public Book(Authors authors, String nameBook, int yearOfPublication) {
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;
        this.authors = authors;

    }

    public String getNameBook() {

        return this.nameBook;
    }

    public int getYearOfPublication() {

        return this.yearOfPublication;
    }

    public Authors getAuthors() {

        return this.authors;
    }

    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }
}






