package daoImpl;

import dao.DaoBook;
import model.DbConfiguration;

import java.sql.ResultSet;


public class BookRepository implements DaoBook {
    DbConfiguration dbConfiguration = new DbConfiguration();
    ResultSet resultSet;


    public void showAll() throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From book");

        while (resultSet.next()) {
            System.out.println("title: " + (resultSet.getString(2)) + " autor: " + (resultSet.getString(3)));
        }
    }

    public void addNewBook() throws Exception {
        dbConfiguration.dbExecuteUpdateQuery("INSERT INTO `library`.`book` (`idBook`, `title`, `autor`) VALUES ('1'," +
                " 'GOT', 'R.R.Martin')");
    }


}
