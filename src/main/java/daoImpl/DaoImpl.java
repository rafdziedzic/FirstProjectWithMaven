package daoImpl;

import dao.Dao;
import model.Book;
import model.Borrow;
import model.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class DaoImpl implements Dao {

    private List<Person> person = new LinkedList<Person>();
    private List<Book> books = new ArrayList<Book>();
    private List<Borrow> borrows = new ArrayList<Borrow>();

    public void add(Object object) {
        if (object instanceof Book) {
            books.add((Book) object);
        } else if (object instanceof Person) {
            person.add((Person) object);
        } else if (object instanceof Borrow) {
            borrows.add((Borrow) object);
        }
    }

    public void find(Object object) {
        if (object instanceof Book) {
            for (Book book : books) {
                if (book.getTitle().equals(((Book) object).getTitle())) {
                    System.out.println(object.toString());
                }
            }
        } else if (object instanceof Person) {
            for (Person person : person) {
                if (person.getSurname().equals(((Person) object).getSurname())) {
                    System.out.println(object.toString());
                }
            }
        } else if (object instanceof Borrow) {
            for (Borrow borrow : borrows) {
                if (borrow.getId() == ((Borrow) object).getId()) {
                    System.out.println(object.toString());
                }
            }
        }
    }

    public void add2(Object object, Class klasa) {

    }

    public void delete(Object object) {
        if (object instanceof Book) {
            for (Book book : books) {
                if (book.getTitle().equals(((Book) object).getTitle())) {
                    books.remove(object);
                }
            }
        }
    }

    public static void main(String[] args) {
        Book book = new Book(7, "ad", "dasfd", true);
        Person person = new Person(8, "da", "asdf");
        Borrow borrow = new Borrow(2, 6, 4);

        DaoImpl dao = new DaoImpl();
        dao.add(book);
        dao.add(person);
        dao.add(borrow);


        dao.find(book);
        dao.find(person);
        dao.find(borrow);

        System.out.println(dao.books.size());
        System.out.println(dao.person.size());
        dao.delete(book);
        System.out.println(dao.books.size());


    }

}
