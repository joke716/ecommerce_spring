package com.teddy.ecommerce_spring.model.dao;

import com.teddy.ecommerce_spring.model.LocalUser;
import com.teddy.ecommerce_spring.model.WebOrder;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface WebOrderDAO extends ListCrudRepository<WebOrder, Long> {
    List<WebOrder> findByUser(LocalUser user);
}
