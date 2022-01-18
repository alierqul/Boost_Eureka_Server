package com.aliergul.coursecatalogservice.controller;

import com.aliergul.coursecatalogservice.entity.Catalog;
import com.aliergul.coursecatalogservice.service.CatalogService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CatalogController {

    private final CatalogService service;

    public CatalogController(CatalogService service) {
        this.service = service;
    }
    @GetMapping("/catalogs/{catalogid}")
    public Catalog getCatalog(@PathVariable("catalogid") long catalogid){
        return service.getById(catalogid);
    }
    @GetMapping("/catalogs")
    public List<Catalog> getAllCatalog(){
        return service.getAllItem();
    }

    @PostMapping("/catalogs")
    public Catalog addCatalog(@RequestBody Catalog catalog){
        return service.create(catalog);
    }

    @PutMapping("/catalogs/{catalogid}")
    public Catalog updateCatalog(@PathVariable("catalogid") long catalogid,@RequestBody Catalog catalog) {
        return service.update(catalog,catalogid);
    }

    @DeleteMapping("/catalogs/{catalogid}")
    public HttpStatus deleteCatalog(@PathVariable long id){
        service.delete(id);
        return HttpStatus.OK;
    }
}
