package com.sda.alexjelescu.hibernate.ui;


import com.sda.alexjelescu.hibernate.model.AvailableTable;
import com.sda.alexjelescu.hibernate.model.BookTable;
import com.sda.alexjelescu.hibernate.model.User;
import com.sda.alexjelescu.hibernate.repository.AvailableTableRepository;
import com.sda.alexjelescu.hibernate.repository.BookTableRepository;
import com.sda.alexjelescu.hibernate.repository.UserRepository;

import javax.management.Query;
import java.util.List;


public class UI {

    UserRepository userRepository = new UserRepository();
    BookTableRepository bookTableRepository = new BookTableRepository();
    AvailableTableRepository availableTableRepository = new AvailableTableRepository();
    BookTable bookTable = new BookTable();

    public void viewProfileAndBonusBalance(User user) {

        List<User> users = userRepository.getAll(user);
        List<BookTable> bookTables;
        for (User user1 : users) {
            System.out.println("First Name: " + user1.getFirstName() + " Last Name: " + user1.getLastName() + "  Phone Number: " + user1.getPhoneNumber() + " Email: " + user1.getEmail() + " User Id: " + user1.getUserId());
            bookTables = bookTableRepository.findByColumn(bookTable, "fk_user_id", user1.getUserId().toString());
            // daca apar probleme la metoda toString trebuie sa schimbam tipul de date in Integer
            for (BookTable bookTable : bookTables) {
                System.out.println("Book Table Id: " + bookTable.getBookTableId() + "Book Table Info: " + bookTable.getTableInfo() + " Start booking: " + bookTable.getStartBook() + " End booking: " + bookTable.getEndBook());
            }
        }

    }

    public void bookTable() {
//                Trebuie sa facem metoda dupa modelul de mai jos  (pentru proprietati trebuie sa folosim metoda Scanner)
//        Account account = new Account();
//        account.setBankName("BCR");
//        account.setEmployee(employee);
//        account.setCards(cards);
//        repository.saveAccount(account);

    }

    public void dailyOffers() {

    }

    public void menu() {
// afisam mesaje sa se apese o anumita tasta, de exemplu "tasta 1" care sa arate profilul userului. Aici trebuie sa aratam toate optiunile disponibile

    }

    public void statistics() {

    }


}
