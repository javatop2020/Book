

public class ReaderTest {
    public static void main(String[] args) {

        Reader[] reader = new Reader[1000];


        Book book = new Book("Петров.А.А","Агент");
        Book book2 = new Book("Петров.А.А","Агент 007");
        Book book3 = new Book("Иванов.А.А","Брест");

        reader[0] = new Reader("Петров.В.В", 123,"Экономика",1978,896788990);
        reader[1] = new Reader("Иванов.В.В",124,"География",1988,899323232);

        reader[0].takeBook(3);
        reader[0].takeBook(book,book2,book3);
        reader[0].returnBook(3);
        reader[0].returnBook(book,book2,book3);


    }
}
