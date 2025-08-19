package com.davidantas.dslist.services;

import com.davidantas.dslist.dto.GameDTO;
import com.davidantas.dslist.dto.GameMinDTO;
import com.davidantas.dslist.entities.Game;
import com.davidantas.dslist.repositories.GameRepository;
import com.davidantas.dslist.services.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game game = gameRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Game not found with id " + id));
        return new GameDTO(game);
    }

}
