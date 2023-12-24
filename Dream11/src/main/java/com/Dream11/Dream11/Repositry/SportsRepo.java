package com.Dream11.Dream11.Repositry;

import com.Dream11.Dream11.Model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SportsRepo  extends JpaRepository<Sport,Integer> {

       List<Sport> findAllBySportName(String SportName);
}
