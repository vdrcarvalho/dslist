package com.oceantree.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oceantree.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
