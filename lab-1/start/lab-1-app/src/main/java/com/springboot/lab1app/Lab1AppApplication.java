package com.springboot.lab1app;

import com.springboot.lab1app.model.Player;
import com.springboot.lab1app.model.Team;
import com.springboot.lab1app.persistence.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Lab1AppApplication {

	@Autowired
	TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab1AppApplication.class, args);
	}

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Set<Player> set = new HashSet<>();
		set.add(new Player("Big Easy", "Showman"));
		set.add(new Player("Buckets", "Guard"));
		set.add(new Player("Dizzy", "Guard"));

		Team team = new Team("team3","location3",set);
		list.add(team);

		team = new Team("team4","location4",null);
		list.add(team);

		teamRepository.saveAll(list);
	}

}
