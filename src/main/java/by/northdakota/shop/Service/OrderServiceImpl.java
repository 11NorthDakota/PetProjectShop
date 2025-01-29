package by.northdakota.shop.Service;

import by.northdakota.shop.Repository.OrderRepository;
import by.northdakota.shop.Repository.OrderedProductRepository;
import by.northdakota.shop.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    private final OrderedProductRepository orderedProductRepository;

    private final UserRepository userRepository;

    







}
