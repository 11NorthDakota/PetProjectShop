package by.northdakota.shop.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private Double price;
    @Column(name="quantity")
    private Integer quantity;
    @Column(name="article")
    private Long article;
    @Column(name="creationDate")
    private LocalDateTime creationDate;
    @Column(name="modificationDate")
    private LocalDateTime modificationDate;
}
