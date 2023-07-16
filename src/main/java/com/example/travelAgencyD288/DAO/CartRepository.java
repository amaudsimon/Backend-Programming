package com.example.travelAgencyD288.DAO;

import com.example.travelAgencyD288.Entity.Cart;
import com.example.travelAgencyD288.Entity.Customer;
import com.example.travelAgencyD288.Entity.StatusType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface CartRepository extends JpaRepository<Cart, Long> {
    @Query("SELECT c.status FROM Cart c WHERE c.id = :cartId")
    StatusType findStatusById(@Param("cartId") Long cartId);

    @Query("SELECT c.orderTrackingNumber FROM Cart c WHERE c.id = :cartId")
    String findOrderTrackingNumberById(@Param("cartId") Long cartId);
}
