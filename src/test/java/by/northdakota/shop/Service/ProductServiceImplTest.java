package by.northdakota.shop.Service;

import by.northdakota.shop.Dto.ProductDto;
import by.northdakota.shop.Entity.Product;
import by.northdakota.shop.Repository.ProductRepository;
import by.northdakota.shop.Util.ProductMapper;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductServiceImpl {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Mock
    private ProductMapper productMapper;

    @Test
    void testGetAllProducts(){

        Product p1 = Product.builder()
                .uuid(UUID.randomUUID())
                .title("title1")
                .description("description1")
                .price(11.11)
                .quantity(50)
                .article(100011L)
                .creationDate(LocalDateTime.now())
                .modificationDate(LocalDateTime.of(2025,1,27,19,55))
                .build();

        Product p2 = Product.builder()
                .uuid(UUID.randomUUID())
                .title("title2")
                .description("description2")
                .price(11.11)
                .quantity(42)
                .article(101011L)
                .creationDate(LocalDateTime.now())
                .modificationDate(LocalDateTime.of(2025,1,27,19,55))
                .build();

        ProductDto pDto1 = ProductDto.builder()
                .uuid(UUID.randomUUID())
                .title("title1")
                .description("description1")
                .price(11.11)
                .quantity(50)
                .article(100011L)
                .creationDate(LocalDateTime.now())
                .modificationDate(LocalDateTime.of(2025,1,27,19,55))
                .build();

        ProductDto pDto2 = ProductDto.builder()
                .uuid(UUID.randomUUID())
                .title("title2")
                .description("description2")
                .price(11.11)
                .quantity(42)
                .article(101011L)
                .creationDate(LocalDateTime.now())
                .modificationDate(LocalDateTime.of(2025,1,27,19,55))
                .build();

        List<ProductDto> productDtoList = List.of(pDto1, pDto2);

        Mockito.when(productRepository.findAll()).thenReturn(List.of(p1,p2));
        Mockito.when(productMapper.productToProductDto(p1)).thenReturn(pDto1);
        Mockito.when(productMapper.productToProductDto(p2)).thenReturn(pDto2);

        List<ProductDto> allProducts = productService.getAllProducts();

        assertEquals(productDtoList, allProducts);

    }
}
