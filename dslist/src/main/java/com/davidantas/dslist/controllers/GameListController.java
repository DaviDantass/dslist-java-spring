package com.davidantas.dslist.controllers;

import com.davidantas.dslist.dto.GameListDTO;
import com.davidantas.dslist.dto.GameMinDTO;
import com.davidantas.dslist.dto.ReplacementDTO;
import com.davidantas.dslist.services.GameListService;
import com.davidantas.dslist.services.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    private final GameListService gameListService;
    private final GameService gameService;


    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceInde(), body.getDestinationIndex());
    }
}
