package com.aliergul.coursecatalogservice.repository;

import com.aliergul.coursecatalogservice.entity.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatalogRepository extends JpaRepository<Catalog, Long> {
}
