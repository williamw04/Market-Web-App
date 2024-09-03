package edu.spring.boot.marketwebapp.repository;

import edu.spring.boot.marketwebapp.entities.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// CRUD operations: create, read, update, delete
@Repository
public interface MarketRepository extends JpaRepository<Market, Integer> {
    List<Market> findByCity(String city);

}
