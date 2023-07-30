package com.example.storecartapp.service;

import com.example.storecartapp.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> itemsIDs) {
        return cart.addItems(itemsIDs);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}