package com.aliergul.coursecatalogservice.service;

import com.aliergul.coursecatalogservice.entity.Catalog;

import java.util.List;

public interface ICRUDProgress<T> {
    T create(T entity);

    T update(Catalog entity, long id);

    List<T> getAllItem();

    T getById(long id);

    void delete(long id);
}
