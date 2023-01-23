package com.teddy.ecommerce_spring.service;

import com.teddy.ecommerce_spring.model.LocalUser;
import com.teddy.ecommerce_spring.model.WebOrder;
import com.teddy.ecommerce_spring.model.dao.WebOrderDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private WebOrderDAO webOrderDAO;

    public OrderService(WebOrderDAO webOrderDAO) {
        this.webOrderDAO = webOrderDAO;
    }

    public List<WebOrder> getOrders(LocalUser user) {
        return webOrderDAO.findByUser(user);
    }
}
