package com.example.travelAgencyD288.DAO;

import com.example.travelAgencyD288.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
public interface CustomerDAO extends JpaRepository<Customer, Long> {
}