package dao;

import model.Person;

public interface DaoBorrow {
    void addBorrow(String name, String surname, String bookTitle) throws Exception;

    void showAllBorrow() throws Exception;
}
