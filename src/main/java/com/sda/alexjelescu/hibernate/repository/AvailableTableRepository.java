package com.sda.alexjelescu.hibernate.repository;


import com.sda.alexjelescu.hibernate.model.AvailableTable;

public class AvailableTableRepository extends GenericRepository<AvailableTable> {
    @Override
    public void findById(AvailableTable object, int id) {
        super.findById(object, id);
    }

    @Override
    public void save(AvailableTable object) {
        super.save(object);
    }

    @Override
    public void update(AvailableTable object) {
        super.update(object);
    }

    @Override
    public void delete(AvailableTable object) {
        super.delete(object);
    }
}
