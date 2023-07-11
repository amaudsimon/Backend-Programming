package com.example.travelAgencyD288.DAO;

import com.example.travelAgencyD288.Entity.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
public interface ExcursionDAO extends JpaRepository<Excursion, Long> {
}