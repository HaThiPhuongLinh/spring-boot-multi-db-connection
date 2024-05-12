package vn.edu.fit.iuh.multipledatabasespring.secondary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.fit.iuh.multipledatabasespring.secondary.models.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
}