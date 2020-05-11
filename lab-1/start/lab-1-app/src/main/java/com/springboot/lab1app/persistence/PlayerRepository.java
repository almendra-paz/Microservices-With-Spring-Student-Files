package com.springboot.lab1app.persistence;

import com.springboot.lab1app.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player,Long> {
}
