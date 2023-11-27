package com.mubashiranoor.orderservice.controller;

import com.mubashiranoor.orderservice.model.Order;
import com.mubashiranoor.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void placeOrder(@RequestBody Order order){
         orderService.placeOrder(order);

    }

}
