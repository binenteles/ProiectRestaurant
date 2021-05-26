package com.sda.alexjelescu.hibernate;

import com.sda.alexjelescu.hibernate.model.*;
import com.sda.alexjelescu.hibernate.repository.*;
import com.sda.alexjelescu.hibernate.utils.SessionManager;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        CategoriesRepository categoriesRepository = new CategoriesRepository();
        Categories categories1 = new Categories("friptura de porc", "salata", "inghetata", "fanta");
        categoriesRepository.save(categories1);

        ProductsRepository productsRepository = new ProductsRepository();
        Products products1 = new Products("supa de pui", 300, 12, categories1);
        productsRepository.save(products1);


        Products products2 = new Products();
        products2.setProductName("Ciorba de vita");
        products2.setPrice(15);
        products2.setQuantity(400);
        productsRepository.save(products2);

        Set<Products> products = new HashSet<>();
        products.add(products1);
        products.add(products2);

        UserRepository userRepository = new UserRepository();
        User user1 = new User("Nicolae", "Mitrea", "0760234567", "nicolae.mitrea@myemail.com",products);

        userRepository.save(user1);

        User user2 = new User();
        user2.setFirstName("Andrei");
        user2.setLastName("Mihai");
        user2.setEmail("mihai.andrei@yahoo.com");
        user2.setPhoneNumber("0760345009");
        userRepository.save(user2);


        AvailableTableRepository availableTableRepository = new AvailableTableRepository();
        AvailableTable availableTable1 = new AvailableTable(4, Date.valueOf("2021-05-21"), Date.valueOf("2021-05-21"), "masa retrasa");
        availableTableRepository.save(availableTable1);
        AvailableTable availableTable2 = new AvailableTable();
        availableTable2.setSeats(2);
        availableTable2.setStartDate(Date.valueOf("2021-05-26"));
        availableTable2.setEndDate(Date.valueOf("2021-05-26"));
        availableTable2.setTableInfo("Masa centrala");
        availableTableRepository.save(availableTable2);

        BookTableRepository bookTableRepository = new BookTableRepository();
        BookTable bookTable1 = new BookTable(4, Date.valueOf("2021-05-20"), Date.valueOf("2021-05-21"), "vedere la mare", user2, availableTable2);
        bookTableRepository.save(bookTable1);

        Set<User> users = new HashSet<>();
        users.add(user1);



        DailyOffersRepository dailyOffersRepository = new DailyOffersRepository();
        DailyOffers dailyOffers1 = new DailyOffers(Date.valueOf("2021-05-26"), 10, products2);
        dailyOffersRepository.save(dailyOffers1);


        //SessionManager.shutDown();
    }


}
