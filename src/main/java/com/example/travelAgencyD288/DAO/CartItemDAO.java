package com.example.travelAgencyD288.DAO;

import com.example.travelAgencyD288.Entity.Cart;
import com.example.travelAgencyD288.Entity.CartItem;
import com.example.travelAgencyD288.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;


@Repository
@CrossOrigin
public interface CartItemDAO extends JpaRepository<CartItem, Long> {
    List<CartItem> findByCart(Cart cart);
}