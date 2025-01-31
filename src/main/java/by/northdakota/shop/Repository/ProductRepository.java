package by.northdakota.shop.Repository;

import by.northdakota.shop.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
