import daoImpl.BookRepository;


public class FirstDb {
    public static void main(String[] args) throws Exception {

        BookRepository bookRepository = new BookRepository();
        // bookRepository.addNewBook();
        bookRepository.showAll();

    }
}
