public class Main {
    public static void main(String[] args) {

        Authors stephenKing = new Authors("Стивен", "Кинг");

        Book theBookOfHorrors = new Book(stephenKing, "Книга ужасов", 2015);
        theBookOfHorrors.setYearOfPublication(2018);
        System.out.println(theBookOfHorrors.getNameBook() + " " + theBookOfHorrors.getYearOfPublication() + " " + stephenKing.getNameAuthors() + " " + stephenKing.getSurnameAuthors());

        Authors ransomRiggs = new Authors("Ренсом", "Риггз");

        Book libraryOfSouls = new Book(ransomRiggs, "Библиотека душ", 2016);
        System.out.println(libraryOfSouls.getNameBook() + " " + libraryOfSouls.getYearOfPublication() + " " + ransomRiggs.getNameAuthors() + " " + ransomRiggs.getSurnameAuthors());
    }
}