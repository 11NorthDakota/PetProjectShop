package by.northdakota.shop.Entity;

import lombok.Data;

@Data
public class ProductFilter {

    private String name;
    private Long count;
    private Double price;
    private boolean availability;

}
