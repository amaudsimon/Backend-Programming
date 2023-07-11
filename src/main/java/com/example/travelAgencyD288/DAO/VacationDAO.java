package com.example.travelAgencyD288.DAO;

import com.example.travelAgencyD288.Entity.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
public interface VacationDAO extends JpaRepository<Vacation, Long> {
}