package com.eccomercebelajar.eccomerceapi.repositories;

import com.eccomercebelajar.eccomerceapi.entities.OrderLogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersLog extends JpaRepository<OrderLogs, String> {
}
