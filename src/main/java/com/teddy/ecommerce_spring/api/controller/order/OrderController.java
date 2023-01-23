package com.teddy.ecommerce_spring.api.controller.order;

import com.teddy.ecommerce_spring.model.LocalUser;
import com.teddy.ecommerce_spring.model.WebOrder;
import com.teddy.ecommerce_spring.service.OrderService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<WebOrder> getOrders(@AuthenticationPrincipal LocalUser user) {
        return orderService.getOrders(user);
    }
}
