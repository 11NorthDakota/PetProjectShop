package by.northdakota.shop.Controller;

import by.northdakota.shop.Entity.Product;
import by.northdakota.shop.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("/all")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable UUID id){
        return productRepository.findById(id);
    }

    @PostMapping
    public UUID saveProduct(@RequestBody Product product){
        productRepository.save(product);
        return product.getUuid();
    }

    @GetMapping("/delete/{id}")
    public void deleteProduct(@PathVariable UUID id){
        productRepository.deleteById(id);
    }

}
