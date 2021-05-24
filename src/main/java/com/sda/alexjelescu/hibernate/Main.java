package com.sda.alexjelescu.hibernate;

import com.sda.alexjelescu.hibernate.model.AvailableTable;
import com.sda.alexjelescu.hibernate.model.BookTable;
import com.sda.alexjelescu.hibernate.model.User;
import com.sda.alexjelescu.hibernate.repository.AvailableTableRepository;
import com.sda.alexjelescu.hibernate.repository.BookTableRepository;
import com.sda.alexjelescu.hibernate.repository.UserRepository;
import com.sda.alexjelescu.hibernate.utils.SessionManager;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        AvailableTableRepository availableTableRepository = new AvailableTableRepository();
        AvailableTable availableTable1 = new AvailableTable(4, Date.valueOf("2021-05-21"), Date.valueOf("2021-05-21"), "masa retrasa");
        availableTableRepository.save(availableTable1);

        BookTableRepository bookTableRepository = new BookTableRepository();
        BookTable bookTable1 = new BookTable(4, Date.valueOf("2021-05-20"), Date.valueOf("2021-05-21"), "vedere la mare");
        bookTableRepository.save(bookTable1);

        UserRepository userRepository = new UserRepository();
        User user1 = new User("Nicolae", "Mitrea", "0760234567", "nicolae.mitrea@myemail.com");
        userRepository.save(user1);

        System.out.println(availableTable1.getEndDate());

        //SessionManager.shutDown();
    }



}
