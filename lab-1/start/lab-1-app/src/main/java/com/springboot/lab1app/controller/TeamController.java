package com.springboot.lab1app.controller;

import com.springboot.lab1app.model.Team;
import com.springboot.lab1app.persistence.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @RequestMapping("/teams")
    private Iterable<Team> getTeams(){
        return teamRepository.findAll();
    }

    @RequestMapping("/teams/{id}")
    private Team getTeam(@PathVariable Long id){
        return teamRepository.findById(id).get();
    }

}
