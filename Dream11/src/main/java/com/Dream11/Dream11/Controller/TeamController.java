package com.Dream11.Dream11.Controller;

import com.Dream11.Dream11.Model.Team;
import com.Dream11.Dream11.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team/v1")
public class TeamController  {

    @Autowired
    private TeamService teamService;

    @PostMapping("/team/create")
    ResponseEntity<Team> createTeam(@RequestBody Team team){

        Team s = teamService.creatteam(team);
        return  new ResponseEntity<Team>(s, HttpStatus.CREATED);
    }


    @GetMapping("/team/name/{teamName}")
    ResponseEntity<List<Team>> getteambyName(@PathVariable("teamName") String Name)
    {
        List<Team> s = teamService.getteam(Name);
        return  new ResponseEntity<List<Team>>(s,HttpStatus.OK);
    }

    @GetMapping("/team/{teamId}")
    ResponseEntity<Team> getTeam(@PathVariable("teamId") Integer teamId)
    {
        Team s = teamService.getteam(teamId);
        return new ResponseEntity<Team>(s,HttpStatus.OK);
    }

    @DeleteMapping("/team/{teamId}")
    ResponseEntity<String> DeletTeam(@PathVariable("teamId")Integer teamId)
    {
          teamService.deletteam(teamId);
          return ResponseEntity.ok("Deleted Successfully");
    }

}
