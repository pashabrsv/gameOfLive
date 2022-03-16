package myProject.gameOfLife.controller;

import myProject.gameOfLife.entity.Game;
import myProject.gameOfLife.service.GameService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/game")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public Game getOldGame() {
        return gameService.getOldGame();
    }

    @PostMapping
    public Game newGeneration(@RequestBody Game game) {
        return gameService.newGeneration(game);
    }
}
