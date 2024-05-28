/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.andre.pembayaran.repository;

import com.andre.pembayaran.entity.Pembayaran;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Frans
 */
public interface PembayaranRepository extends JpaRepository<Pembayaran, Long>{
    
}
