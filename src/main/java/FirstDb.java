import daoImpl.BookRepository;
import daoImpl.BorrowRepository;
import daoImpl.PersonRepository;


public class FirstDb {
    public static void main(String[] args) throws Exception {

        BookRepository bookRepository = new BookRepository();
        PersonRepository personRepository = new PersonRepository();
        BorrowRepository borrowRepository = new BorrowRepository();


        bookRepository.showAll();
        personRepository.showAll();
        borrowRepository.showAllBorrow();
    }

}
