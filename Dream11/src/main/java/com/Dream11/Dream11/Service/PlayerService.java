package com.Dream11.Dream11.Service;

import com.Dream11.Dream11.Exception.ResourceNotFound;
import com.Dream11.Dream11.Model.Player;

import java.util.List;

public interface PlayerService  {



     public Player  createPlayer(Player player);

     public String deletplayer(Integer id) throws ResourceNotFound;

     public  Player getplayer(Integer id) throws ResourceNotFound;

     public List<Player> getbyName(String name) throws  ResourceNotFound;


}
