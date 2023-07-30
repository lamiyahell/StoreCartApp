package com.example.storecartapp.service;

import java.util.List;

public interface OrderService {
    List<Integer> addItems(List<Integer> itemsIDs);

    List<Integer> getItems();
}