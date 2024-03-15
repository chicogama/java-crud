package dev.chico.javacrud.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.chico.javacrud.domain.Product.Product;
import dev.chico.javacrud.domain.Product.ProductRepository;
import dev.chico.javacrud.domain.Product.RequestProductDTO;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity getAlltProducts(){
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProductDTO data) {
        Product newProduct = new Product(data);

        System.out.println(data);
        repository.save(newProduct);
        return ResponseEntity.ok().build();
    }
    
}
