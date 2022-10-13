package com.food.ordering.system.order.service.dataaccess.restaurant.repository;

import com.food.ordering.system.domain.valueobject.RestaurantId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RestaurantJpaRepository extends JpaRepository<RestaurantId, UUID> {
}
