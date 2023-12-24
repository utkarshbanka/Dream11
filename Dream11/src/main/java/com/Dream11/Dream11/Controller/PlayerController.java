package com.Dream11.Dream11.Controller;

import com.Dream11.Dream11.Model.Player;
import com.Dream11.Dream11.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player/v1")
public class PlayerController {


     private  PlayerService playerService;


     @Autowired
     PlayerController(PlayerService playerService)
     {
         this.playerService = playerService;
     }
     @PostMapping("/save")
    public ResponseEntity<Player>  saveplayer(@RequestBody Player player)
     {
           Player s = playerService.createPlayer(player);
           return  new ResponseEntity<Player>(s, HttpStatus.CREATED);
     }

     @GetMapping("/player/{playerName}")
      public  ResponseEntity<List<Player>> playerName(@PathVariable("playerName") String playerName)
     {
          List<Player>  s= playerService.getbyName(playerName);
          return new ResponseEntity<List<Player>>(s,HttpStatus.OK);
     }


     @GetMapping("/player/{playerId}")
     public  ResponseEntity<Player>  playerId(@PathVariable("playerId")Integer playerId)
     {
         Player s = playerService.getplayer(playerId);
         return  new ResponseEntity<Player>(s,HttpStatus.OK);
     }

     @DeleteMapping("/player/del/{playerId}")
     public  ResponseEntity<String> PlayerDelet(@PathVariable("playerId")Integer playerId)
     {
           playerService.deletplayer(playerId);
           return ResponseEntity.ok("Player Deleted Successfully");
     }
}

