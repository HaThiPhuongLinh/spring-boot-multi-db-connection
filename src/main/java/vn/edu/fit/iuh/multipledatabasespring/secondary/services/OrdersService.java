package vn.edu.fit.iuh.multipledatabasespring.secondary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.fit.iuh.multipledatabasespring.secondary.models.Orders;
import vn.edu.fit.iuh.multipledatabasespring.secondary.repositories.OrdersRepository;

import java.util.List;

@Service
public class OrdersService {
    @Autowired
    OrdersRepository ordersRepository;
    
    public List<Orders> findAll() {
        return ordersRepository.findAll();
    }
    
}