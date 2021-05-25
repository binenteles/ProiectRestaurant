package com.sda.alexjelescu.hibernate.interfaces;


public interface RepositoryInterface<T> {
    public void findById(T object, int id);

    public void save(T object);

    public void update(T object);

    public void delete(T object);


}
