package com.sda.alexjelescu.hibernate.repository;


import com.sda.alexjelescu.hibernate.model.User;

public class UserRepository extends GenericRepository<User> {
    @Override
    public void findById(User object, int id) {
        super.findById(object, id);
    }

    @Override
    public void save(User object) {
        super.save(object);
    }

    @Override
    public void update(User object) {
        super.update(object);
    }

    @Override
    public void delete(User object) {
        super.delete(object);
    }
}
