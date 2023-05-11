package com.oceantree.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oceantree.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
