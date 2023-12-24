package com.Dream11.Dream11.Repositry;

import com.Dream11.Dream11.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepo  extends JpaRepository<Player,Integer> {


      List<Player> findAllByPlayerName(String Name);

}
