package com.example.storecartapp.controller;

import com.example.storecartapp.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> itemsIDs) {
        return orderService.addItems(itemsIDs);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getItems();
    }
}