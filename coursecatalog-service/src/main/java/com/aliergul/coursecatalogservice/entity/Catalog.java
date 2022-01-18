package com.aliergul.coursecatalogservice.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Catalog implements Serializable {
    @Id
    @Column(name="catalog_id")
    private long catalogId;
    @Column(name="catalog_name")
    private String catalogName;
    @Column(name="catalog_description")
    private String CatalogDescription;
}
