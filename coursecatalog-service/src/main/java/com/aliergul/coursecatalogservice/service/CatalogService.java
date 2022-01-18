package com.aliergul.coursecatalogservice.service;

import com.aliergul.coursecatalogservice.entity.Catalog;
import com.aliergul.coursecatalogservice.error.NotFoundRunTimeError;
import com.aliergul.coursecatalogservice.repository.ICatalogRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CatalogService  implements ICRUDProgress<Catalog> {

     private final ICatalogRepository repository;

    public CatalogService(ICatalogRepository repository) {
        this.repository = repository;
    }

    @Override
    public Catalog create(Catalog entity) {
        return repository.save(entity);
    }

    public Catalog update(Catalog entity, long catalogid) {
        Catalog catalog=getById(catalogid);
        catalog.setCatalogName(entity.getCatalogName());
        catalog.setCatalogDescription(entity.getCatalogDescription());
        repository.save(catalog);
        return catalog;
    }

    @Override
    public List<Catalog> getAllItem() {
        return repository.findAll();
    }

    @Override
    public Catalog getById(long id) {

        Optional<Catalog> inDB=repository.findById(id);
        if(!inDB.isPresent()){
            throw new NotFoundRunTimeError("Catalog Name not Found : "+ id);
        }
        return inDB.get();
    }

    @Override
    public void delete(long id) {
        Catalog catalog=getById(id);
        repository.delete(catalog);

    }
}
