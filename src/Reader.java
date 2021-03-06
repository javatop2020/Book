public class Reader {

    String firstAndLastName;
    int readerId;
    String faculty;
    int dateOfBirth;
    int telephone;

    public Reader(String firstAndLastName, int readerId, String faculty, int dateOfBirth, int telephone) {
        this.firstAndLastName = firstAndLastName;
        this.readerId = readerId;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.telephone = telephone;
    }

    void takeBook(int book) {
        System.out.println(firstAndLastName + " взял " + book + " книги.");
    }

    void takeBook(Book... v) {
        System.out.println(firstAndLastName + " взял книги: " + v.toString());
    }

    void returnBook(int book) {
        System.out.println(firstAndLastName + " вернул " + book + " книги.");
    }

    void returnBook(Book ... v) {
        System.out.println(firstAndLastName + " вернул " + v);
    }

}
