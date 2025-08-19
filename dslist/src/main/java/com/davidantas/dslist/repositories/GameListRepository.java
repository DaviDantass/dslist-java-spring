package com.davidantas.dslist.repositories;

import com.davidantas.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
