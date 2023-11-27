package com.mubashiranoor.orderservice.service;


import com.mubashiranoor.orderservice.model.Order;
import com.mubashiranoor.orderservice.repository.OrderRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {


    private final OrderRepo orderRepo;

    private final WebClient webClient;


    public void placeOrder(Order order){
       List<String> skuCodes= order.getOrderLineItemsList().stream().map(item-> item.getSkuCode()).toList();
       boolean result = webClient.get().uri("http://localhost:8082/api/inventory",uriBuilder -> uriBuilder.path("/jlk").build()).retrieve().bodyToMono(Boolean.class).block();
       if(result){
        orderRepo.save(order);
        log.info("order saved");
       }
       else
       {
           throw new IllegalArgumentException("Out of Stock!");
       }

    }

}
