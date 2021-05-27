package com.sda.alexjelescu.hibernate.interfaces;


import java.util.List;

public interface RepositoryInterface<T> {
    public void findById(T object, int id);

    public void save(T object);

    public void update(T object);

    public void delete(T object);

    public List<T> getAll(T object);

    public List<T> findByColumn(T object, String column, String value);


}
