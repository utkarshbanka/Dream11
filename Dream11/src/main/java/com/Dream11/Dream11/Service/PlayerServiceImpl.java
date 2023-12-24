package com.Dream11.Dream11.Service;

import com.Dream11.Dream11.Exception.ResourceNotFound;
import com.Dream11.Dream11.Model.Player;
import com.Dream11.Dream11.Repositry.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl  implements  PlayerService{



    private PlayerRepo playerRepo;


    @Autowired
    public PlayerServiceImpl(PlayerRepo playerRepo)
    {
        this.playerRepo = playerRepo;
    }

    @Override
    public Player createPlayer(Player player) {

         Player s = playerRepo.save(player);

           return s;
    }

    @Override
    public String deletplayer(Integer id) throws ResourceNotFound {

           Player s = playerRepo.findById(id).orElseThrow(()-> new ResourceNotFound("No Player found for this id"));

               playerRepo.delete(s);

        return "Player Deleted Successfully";
    }

    @Override
    public Player getplayer(Integer id) throws ResourceNotFound {


        return playerRepo.findById(id).orElseThrow(()->new ResourceNotFound("No Player Exit with this id"));
    }

    @Override
    public List<Player> getbyName(String name) throws ResourceNotFound {

        List<Player>  ans = playerRepo.findAllByPlayerName(name);
        return ans;
    }
}
