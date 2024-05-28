/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.andre.order.repository;

import com.andre.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Frans
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
