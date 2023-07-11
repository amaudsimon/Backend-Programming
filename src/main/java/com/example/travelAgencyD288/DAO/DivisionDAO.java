package com.example.travelAgencyD288.DAO;

import com.example.travelAgencyD288.Entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
public interface DivisionDAO extends JpaRepository<Division, Long> {
}