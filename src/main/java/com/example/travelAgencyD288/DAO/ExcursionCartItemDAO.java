package com.example.travelAgencyD288.DAO;

import com.example.travelAgencyD288.Entity.ExcursionCartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
public interface ExcursionCartItemDAO extends JpaRepository<ExcursionCartItem, Long> {
}
