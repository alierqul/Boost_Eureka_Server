package com.aliergul.coursapp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICRUDProgress<T> {
    T create(T entity);

    T update(T entity,String id);

    List<T> getAllItem();

    T getById(String id);

    void delete(String id);
}
