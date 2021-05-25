package com.sda.alexjelescu.hibernate.repository;


import com.sda.alexjelescu.hibernate.model.Products;

public class ProductsRepository extends GenericRepository<Products> {
    @Override
    public void findById(Products object, int id) {
        super.findById(object, id);
    }

    @Override
    public void save(Products object) {
        super.save(object);
    }

    @Override
    public void update(Products object) {
        super.update(object);
    }

    @Override
    public void delete(Products object) {
        super.delete(object);
    }
}
