package com.Dream11.Dream11.Service;

import com.Dream11.Dream11.Model.Sport;
import com.Dream11.Dream11.Repositry.SportsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SprotsServiceImpl implements  SportsService{


    @Autowired
    private SportsRepo sportsRepo;

    @Override
    public Sport createSport(Sport sport) {


        return sportsRepo.save(sport);
    }

    @Override
    public List<Sport> sportName(String Name) {
        return sportsRepo.findAllBySportName(Name);
    }
}
