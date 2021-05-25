package com.sda.alexjelescu.hibernate;

import com.sda.alexjelescu.hibernate.model.*;
import com.sda.alexjelescu.hibernate.repository.*;
import com.sda.alexjelescu.hibernate.utils.SessionManager;

import javax.jws.soap.SOAPBinding;
import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        AvailableTableRepository availableTableRepository = new AvailableTableRepository();
        AvailableTable availableTable1 = new AvailableTable(4, Date.valueOf("2021-05-21"), Date.valueOf("2021-05-21"), "masa retrasa");
//        availableTableRepository.save(availableTable1);

        BookTableRepository bookTableRepository = new BookTableRepository();
        BookTable bookTable1 = new BookTable(4, Date.valueOf("2021-05-20"), Date.valueOf("2021-05-21"), "vedere la mare");
        bookTableRepository.save(bookTable1);

        CategoriesRepository categoriesRepository = new CategoriesRepository();
        Categories categories1 = new Categories("friptura de porc", "salata", "inghetata", "fanta");
        categoriesRepository.save(categories1);

        ProductsRepository productsRepository = new ProductsRepository();
        Products products1 = new Products("supa de pui", 300, 12);
        productsRepository.save(products1);

        UserRepository userRepository = new UserRepository();
        User user1 = new User("Nicolae", "Mitrea", "0760234567", "nicolae.mitrea@myemail.com");
        userRepository.save(user1);





        //SessionManager.shutDown();
    }



}
