package com.Dream11.Dream11.Controller;

import com.Dream11.Dream11.Model.Sport;
import com.Dream11.Dream11.Service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sports/v1")
public class SportsController {


    @Autowired
    private SportsService sportsService;



    @PostMapping("/create")
    ResponseEntity<Sport> createSport(@RequestBody Sport sport){

        Sport s = sportsService.createSport(sport);
        return  new ResponseEntity<Sport>(s, HttpStatus.CREATED);
    }

    @GetMapping("/get/Name/{SportsName}")
    ResponseEntity<List<Sport>> getSportByName(@PathVariable("SportsName") String SportName)
    {
        List<Sport> s = sportsService.sportName(SportName);
        return  new ResponseEntity<List<Sport>>(s,HttpStatus.OK);
    }

}
