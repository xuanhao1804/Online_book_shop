package com.kas.online_book_shop.service;

import java.util.List;

import com.kas.online_book_shop.dto.OrderDetailDTO;
import com.kas.online_book_shop.model.Order;

public interface CartService {
    public void addToCart(OrderDetailDTO orderDetailDTO);

    Order getCartByUser(Long userId);

    List<Order> getAllCart();
}
