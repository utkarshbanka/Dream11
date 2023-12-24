package com.Dream11.Dream11.Repositry;

import com.Dream11.Dream11.Model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepo  extends JpaRepository<Team,Integer> {

     List<Team> findAllByTeamName(String TeamName);
}
