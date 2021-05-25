package com.sda.alexjelescu.hibernate.repository;


import com.sda.alexjelescu.hibernate.model.BookTable;

public class BookTableRepository extends GenericRepository<BookTable>{
    @Override
    public void findById(BookTable object, int id) {
        super.findById(object, id);
    }

    @Override
    public void save(BookTable object) {
        super.save(object);
    }

    @Override
    public void update(BookTable object) {
        super.update(object);
    }

    @Override
    public void delete(BookTable object) {
        super.delete(object);
    }
}
