package com.sda.alexjelescu.hibernate.repository;


import com.sda.alexjelescu.hibernate.model.Categories;

public class CategoriesRepository extends GenericRepository<Categories> {
    @Override
    public void findById(Categories object, int id) {
        super.findById(object, id);
    }

    @Override
    public void save(Categories object) {
        super.save(object);
    }

    @Override
    public void update(Categories object) {
        super.update(object);
    }

    @Override
    public void delete(Categories object) {
        super.delete(object);
    }
}
