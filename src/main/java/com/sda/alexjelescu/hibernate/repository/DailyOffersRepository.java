package com.sda.alexjelescu.hibernate.repository;


import com.sda.alexjelescu.hibernate.model.DailyOffers;

public class DailyOffersRepository extends GenericRepository<DailyOffers> {
    @Override
    public void findById(DailyOffers object, int id) {
        super.findById(object, id);
    }

    @Override
    public void save(DailyOffers object) {
        super.save(object);
    }

    @Override
    public void update(DailyOffers object) {
        super.update(object);
    }

    @Override
    public void delete(DailyOffers object) {
        super.delete(object);
    }
}
